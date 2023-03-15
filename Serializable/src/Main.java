import java.io.*;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(new File("src/customer.dat").toPath()));
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("kai");
        customer.setAddress("ha noi");

        System.out.println("Customer before serialization:");
        System.out.println(customer);
        oos.writeObject(customer);
        oos.close();
        System.out.println("Read customer from customer.dat:");
        ReadObject();
    }
    public static void ReadObject() throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(new File("src/customer.dat").toPath()));
        System.out.println("Customer after deserialization:");
        Customer customer = (Customer) ois.readObject();
        System.out.println(customer);
        ois.close();
    }
}