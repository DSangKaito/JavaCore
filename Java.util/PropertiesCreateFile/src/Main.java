import java.io.FileWriter;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception {
        // create properties object
        Properties properties = new Properties();
        // add property into properties object
        properties.setProperty("user", "admin");
        properties.setProperty("password", "admin123");
        // write properties to a file
        properties.store(new FileWriter("info.properties"), "Comment here");
    }
}