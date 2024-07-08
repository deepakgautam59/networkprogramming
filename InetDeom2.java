import java.net.InetAddress;


public class InetDeom2 {
   public static void main(String[] args)  {
   try{
    InetAddress address = InetAddress.getByName("www.google.com");
    boolean reachable = address.isReachable(5000);
    System.out.println("Is reachable: "+reachable);
   }
   catch (Exception e){
    e.printStackTrace();
   }
   

   } 
}
