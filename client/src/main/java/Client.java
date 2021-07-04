import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        try (Socket clientSocket = new Socket("localhost", 4004);) {
            try (ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
                 ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
                 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ) {

                System.out.println("Input message");

                String word = reader.readLine();

                oos.writeObject(new Message());
                oos.flush();
            }
        } catch (IOException e) {
            System.err.println(e);
        }

    }

}
