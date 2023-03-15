import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = null;
        f = new File("text2.txt");
        String[] strs = {"test1.txt", "test2.txt"};
        f.delete();
        System.out.println(f.getAbsolutePath());
        try{
            // iterate over each element of the string
            for(String s:strs )
            {
                // create a new File
                f= new File(s);
                // set bool true if File f can executable
                boolean bool = f.canExecute();
                // get absolute path
                String a = f.getAbsolutePath();
                // prints
                System.out.print(a);
                System.out.println(" la executable: "+ bool);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}