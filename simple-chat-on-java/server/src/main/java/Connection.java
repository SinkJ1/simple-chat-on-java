
import java.io.*;
import java.net.Socket;
import java.util.UUID;

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

        String[] auth = new String[]{"SignIn", "Registration"};
        Menu authMenu = new Menu(auth);

        String uuid = UUID.randomUUID().toString();
        System.out.println("uuid = " + uuid);

        try {
            while (true) {
                send(authMenu);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void send(Menu menu) {
        try {
            ous.writeObject(menu);
            ous.flush();
        } catch (IOException ignored) {
        }
    }



}
