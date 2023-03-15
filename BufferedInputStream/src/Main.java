import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        try {
            // Create FileInputStream
            FileInputStream file = new FileInputStream("F:\\GMO-Z.com RUNSYSTEM\\JavaCore\\BufferedInputStream\\input.txt");
            // Create BufferedInputStream
            BufferedInputStream input = new BufferedInputStream(file);
            // Read first byte
            int i = input.read();
            while (i != -1) {
                System.out.print((char) i);
                // Read next byte
                i = input.read();
            }
            input.close();
        }
        catch (Exception e) {
            System.err.println(e.getStackTrace());
        }
    }
}