import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // creating an instance of the FileReader class
            FileReader fileReader = new FileReader("Test.txt");
            // create an instance of the BufferedReader and pass the FileReader instance to it.
            BufferedReader bufferReader = new BufferedReader(fileReader);
            // declaring an empty string by passing null value
            String fileData = null;
            // use while loop to read and print data from buffered reader
            while ((fileData = bufferReader.readLine()) != null)
            {
                System.out.println(fileData);
            }
            // closing the BufferedReader object
            bufferReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}