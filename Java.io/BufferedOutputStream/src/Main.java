import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = null;
        BufferedOutputStream bout = null;
        try {
            fout = new FileOutputStream("F:\\GMO-Z.com RUNSYSTEM\\JavaCore\\BufferedOutputStream\\output.txt");
            bout = new BufferedOutputStream(fout);
            String s = "This is used to test for BufferedOutputStream!!!";
            byte b[] = s.getBytes();
            bout.write(b);
            bout.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            bout.close();
            fout.close();
        }
        System.out.println("success!");
    }
}