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
            str = DStuffed(str);
            System.out.println("Client Says: "+str);
        }

        s.close();
        input.close();
    }

    static String DStuffed(String s) {
    int count = 0;
    StringBuilder ans = new StringBuilder();
    StringBuilder bit = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == '1') {
            count++;
        } else {
            count = 0;
        }

        bit.append(c);

        if (count == 5) {
            i++; 
            count = 0;
        }

        if (bit.length() == 8) {
            int cat = 0;
            for (int j = 0; j < 8; j++) {
                if (bit.charAt(j) == '1') {
                    cat += (1 << (7 - j)); 
                }
            }
            ans.append((char) cat);
            bit.setLength(0); 
        }
    }

    return ans.toString();
}
}