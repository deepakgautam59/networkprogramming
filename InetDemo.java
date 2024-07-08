import java.net.Inet4Address;
import java.util.Arrays;
import java.net.InetAddress;
public class InetDemo{
    public static void main(String args[]) throws Exception{
        InetAddress ip = Inet4Address.getByName("www.google.com");
        InetAddress ip1[]=InetAddress.getAllByName("www.google.com");
        byte addr[] = {72, 3, 2, 12};
        System.out.println("ip : "+ip);
        System.out.println("\n ip1: "+ip1);
        InetAddress ip2 = InetAddress.getByAddress(addr);
        System.out.println("\n ip2: "+ip2);
        System.out.println("\n address: "+Arrays.toString(ip.getAddress()));
        System.out.println("\n Host address: "+ip.getHostAddress());
        System.out.println("\n is Any local address: "+ip.isAnyLocalAddress());
        System.out.println("\n is linkLocalAddress: "+ip.isLinkLocalAddress());
        System.out.println("\n is LoopBackAddress: "+ip.isLoopbackAddress());
        System.out.println("\n is MC Global: "+ip.isMCGlobal());
        System.out.println("\n isMCLinkLocal: "+ip.isMCLinkLocal());
        System.out.println("\n isMCNodeLocal: "+ip.isMCNodeLocal());
        System.out.println("\n isMcOrgLocal: "+ip.isMCOrgLocal());
        System.out.println("\n isMcSiteLocal: "+ip.isMCSiteLocal());
        System.out.println("\n isMultiCastAddress: "+ip.isMulticastAddress());
        System.out.println("\n isSiteLocalAddress: "+ip.isSiteLocalAddress());
        System.out.println("\n hasCode: "+ip.hashCode());
        System.out.println("\n is ip1==ip2:  "+ip.equals(ip2));
    }
}
