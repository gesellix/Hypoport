import java.net.MalformedURLException;
import java.net.URL;

public class UrlCheck {
    public static void main(String[] args) throws MalformedURLException {
        System.out.println(new URL("http://www.hypoport.de").equals(new URL("http://62.50.36.1")));
    }
}
