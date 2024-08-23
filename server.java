import java.io.*;
import java.net.*;

public class server {
 public static void main(String[] args)throws Exception {

     ServerSocket port =new ServerSocket(9999);

     Socket client=port.accept();

     DataInputStream input =new DataInputStream(client.getInputStream());
     DataOutputStream output = new DataOutputStream(client.getOutputStream());

     String receivedMes =input.readUTF();
     System.out.println(receivedMes);
     String srv_mess ="Hello client";

     output.writeUTF("servar says: "+ srv_mess);
     output.flush();

     client.close();
 }
    
}