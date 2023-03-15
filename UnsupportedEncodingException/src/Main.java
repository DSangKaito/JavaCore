import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // Custom input string
        String str = "GeeksforGeeks";
        // Declaring a byte array
        byte[] bytes;

        bytes = str.getBytes("UTF");

        // Now here we are trying printing
        // given string and corresponding output string
        System.out.println("Given  String : " + str);
        System.out.println("Output bytes   : " + bytes);
    }
}