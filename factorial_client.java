import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class factorial_client {
     public static void main(String[] args) throws Exception {
        String serverip ="Localhost";
        int serverport = 999;

        Socket client =new Socket(serverip,serverport);
        DataInputStream is= new DataInputStream(client.getInputStream());
        DataOutputStream os =new DataOutputStream(client.getOutputStream());
        // Number mes=7;
        os.writeInt(3);
        os.flush();

        int line=is.readInt();
        System.out.println(line);
        client.close();
    }
}
