import java.net.InetAddress;

public class InetDemo3 {
    public static void main(String[] args) {
        try{
            InetAddress ibiblio = InetAddress.getByName("www.ibiblio.org");
            InetAddress helios = InetAddress.getByName("helios.ibiblio.org");
            if (ibiblio.equals(helios)) {
                System.out.println("www.ibiblio.org is the same as helios.ibiblio.org");
 
            }
            else{
                System.out.println("www.ibiblio.org is not same as helios.ibiblio.org");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
