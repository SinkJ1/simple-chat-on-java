import java.io.*;
import java.net.Socket;
import java.util.Date;

public class Client {

    private static Long id = 0L;


    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("localhost", 8080);
            System.out.println("connect to server");
            ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));


            read(ois).start();
            write(oos, consoleInput).start();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }


    }

    private static Thread write(ObjectOutputStream oos, BufferedReader consoleInput) {

        return new Thread(() -> {

        });
    }

    public static Thread read(ObjectInputStream ois) {
        return new Thread(() -> {

            try {
                Message message = (Message) ois.readObject();
                System.out.println(message.getMessage());

            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        });
    }


}
