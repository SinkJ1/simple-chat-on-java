import java.io.*;
import java.net.Socket;

public class Connection extends Thread {

    private Socket socket;
    private ObjectInputStream ois;
    private ObjectOutputStream ous;

    public Connection(Socket socket) throws IOException {
        this.socket = socket;
        ois = new ObjectInputStream(socket.getInputStream());
        ous = new ObjectOutputStream(socket.getOutputStream());
        start();
    }

    @Override
    public void run() {
        Message message;
        try {
            message = (Message) ois.readObject();
            while (true) {
                Server.connectionMap.get(message.getRecipientId()).send(message);
                Server.connectionMap.get(message.getSenderId()).send(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void send(Message message) {
        try {
            ous.writeObject(message);
            ous.flush();
        } catch (IOException ignored) {
        }
    }

}
