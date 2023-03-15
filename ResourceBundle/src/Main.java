import java.util.Locale;
import java.util.ResourceBundle;
import static java.util.Locale.US;

public class Main {
    public static void main(String[] args) {
        Locale locale = new Locale("en","US");
        ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", locale);
        System.out.println("Message in " + US + ":" + bundle.getString("greeting"));

        // changing the default locale to Vietnamese
        locale = new Locale("vi","VN");
        bundle = ResourceBundle.getBundle("MessageBundle", locale);
        System.out.println("Message in " + Locale.getDefault() + ":" + bundle.getString("greeting"));
    }
}