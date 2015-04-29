/*SERVER CLASS*/
import java.net.*;
import java.io.*;
public class Server
{
            public static void main(String args[])throws IOException
            {
                        byte b[]=new byte[3072];
                        DatagramSocket dsoc=new DatagramSocket(1000);
                        FileOutputStream f=new FileOutputStream("D:/abc.txt");
                        while(true)
                        {
                                    DatagramPacket dp=new DatagramPacket(b,b.length);
                                    System.out.println("server waiting to recieve packet");
                                    dsoc.receive(dp);
                                    System.out.println(new String(dp.getData(),0,dp.getLength()));  
                                    f.write(dp.getData(), 0, dp.getLength());

                        }
            }
}