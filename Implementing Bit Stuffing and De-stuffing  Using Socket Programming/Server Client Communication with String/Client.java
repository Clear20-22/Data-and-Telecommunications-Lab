import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;

public class Client {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket s = new Socket("localhost",1234);

        System.out.println("Client connected at server port: "+s.getPort());
        System.out.println("Clients communication port: "+s.getLocalPort());
        System.out.println("Client is connected.");
        System.out.println("Enter the messages that you want to send and send \"stop\" to close the connection:");

        DataOutputStream output = new DataOutputStream(s.getOutputStream());
        BufferedReader read = new BufferedReader(new FileReader("input.txt"));

        String str = "";

        while((str = read.readLine()) != null){
            output.writeUTF(Stuffed(str));
            Thread.sleep(500);
        }
        output.writeUTF("stop");
        read.close();
        output.close();
        s.close();
    }

    static String Stuffed(String s){
    StringBuilder ans = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
        int n = s.charAt(i);
        StringBuilder bit = new StringBuilder();

        for (int j = 7; j >= 0; j--) {
            bit.append((n >> j) & 1);
        }

        ans.append(bit);
    }

    int len = ans.length();
    int count = 0;

    StringBuilder fin = new StringBuilder();

    for(int i=0;i<len;i++){
        if(count < 5){
            if(ans.charAt(i) == '1')
            count ++;
            else count = 0;
            fin.append(ans.charAt(i));
        } else {
            count = 0;
            fin.append('0');
            fin.append(ans.charAt(i));
        }
    }

    return fin.toString();
} 
}
