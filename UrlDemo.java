import java.net.*;
import java.net.URL;
import java.io.*;

public class UrlDemo{
    public static void main(String[] args) {
        try{
            URL url = new URL("https://reonix.com");
            System.out.println("Url is :"+url.toString());
            System.out.println("Protocol is :"+url.getProtocol());
           System.out.println("Authority is :"+ url.getAuthority());
            System.out.println("File name is : "+url.getFile());
            System.out.println("Host is : "+url.getHost());

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}