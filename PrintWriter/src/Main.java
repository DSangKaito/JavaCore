import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("F:\\GMO-Z.com RUNSYSTEM\\JavaCore\\PrintWriter\\test.txt");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.write("Print this message to file!!!");
        printWriter.flush();
        printWriter.close();
    }
}