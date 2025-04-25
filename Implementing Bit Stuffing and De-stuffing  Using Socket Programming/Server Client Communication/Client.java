import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",1234);

        System.out.println("Client connected at server port: "+s.getPort());
        System.out.println("Clients communication port: "+s.getLocalPort());
        System.out.println("Client is connected.");
        System.out.println("Enter the messages that you want to send and send \"stop\" to close the connection:");

        DataOutputStream output = new DataOutputStream(s.getOutputStream());
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String str = "";



        while(!str.equals("stop")){
            str = read.readLine();
            output.writeUTF(str);
        }

        read.close();
        output.close();
        s.close();
    }
    
}
