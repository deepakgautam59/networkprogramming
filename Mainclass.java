import java.net.URL;
import java.net.URLConnection;

public class  Mainclass {
    public static void main(String[] args){
        try{
            URL u = new URL("https://www.youtube.com/");
            URLConnection conn = u.openConnection();
            byte[] content = (byte[])conn.getContent(new Class[]{byte[].class});
            // Object o = u.getContent();
            // System.out.println("I got a"+o.getClass().getName());
            System.out.println(new String (content));

        }
        catch (Exception ex){
            System.err.println(ex);
        }
    }
}
