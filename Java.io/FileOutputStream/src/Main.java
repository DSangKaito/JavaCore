import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("F:\\GMO-Z.com RUNSYSTEM\\JavaCore\\FileOutputStream\\testout.txt");
            String string = "This string for test FileOutputStream!!!";
            byte bytes[] = string.getBytes();
            fout.write(bytes);
            fout.close();
            System.out.println("success example for FileOutputStream!!!");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            // close file output stream
            fout.close();
        }
    }
}