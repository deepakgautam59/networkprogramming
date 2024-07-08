import java.net.MalformedURLException;
import java.net.URL;
import java.net.*;
public class relative {
 public static void main(String args[]){
try {
URL baseURL = new
URL("https://www.javatpoint.com/");
 URL relativeURL = new URL(baseURL,"/java-tutorial");
 System.out.println(relativeURL.toString());
 } catch (MalformedURLException e) {
 e.printStackTrace();
 }
}
}