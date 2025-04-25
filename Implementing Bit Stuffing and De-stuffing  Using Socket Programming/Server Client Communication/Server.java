import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1234);
        System.out.println("Server is connected in the port number: "+ss.getLocalPort());
        System.out.println("\nServer is waiting");
        System.out.println("Waiting for the Client.\n");

        Socket s = ss.accept();
        String str = "";

        System.out.println("Client request is accepted at port number: "+s.getLocalPort());
        System.out.println("Server's communication port is: "+ss.getLocalPort());

        DataInputStream input = new DataInputStream(s.getInputStream());

        while(!str.equals("stop")){
            str = input.readUTF();
            System.out.println("Client Says: "+str);
        }

        s.close();
        input.close();
    }
}