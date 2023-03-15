import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> language = new HashSet<String>();
        Set<String> tempLanguage = new HashSet<String>();
        language.add("Java");
        language.add("Python");
        language.add("Java");
        language.add("PHP");
        // add language into tempLanguage
        tempLanguage.addAll(language);
        System.out.println("Number of element of language: " + language.size());
        System.out.println("Element of tempLanguage: " + tempLanguage);
        System.out.println("Do language have Java? " + tempLanguage.contains("Java"));
        System.out.println("Do language have C++? " + tempLanguage.contains("C++"));
    }
}