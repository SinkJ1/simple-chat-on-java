import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Server {

    public static final int PORT = 8080;
    public static Map<Long, Connection> connectionMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        System.out.println("server start");
        ServerSocket server = new ServerSocket(PORT);
        System.out.println("server started");
        try {
            while (true) {
                Socket socket = server.accept();
                try {
                    Connection connection = new Connection(socket);
                    connectionMap.put(connection.getId(), connection);
                } catch (IOException e) {
                    socket.close();
                }
            }
        } finally {
            server.close();
        }
    }

}
