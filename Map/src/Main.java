import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create a dictionary have some words
        Map<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("name", "tên");
        dictionary.put("description", "mô tả");
        dictionary.put("student", "học sinh");
        Scanner scanner = new Scanner(System.in);
        // create var checkExist to check if user want to exit
        boolean checkExit = Boolean.FALSE;
        while (!checkExit) {
            // get request
            System.out.println("--------------------------------");
            System.out.println("Choose your request:");
            System.out.println("1. All dictionary");
            System.out.println("2. Translation");
            System.out.println("3. Add new word");
            System.out.println("4. Delete old word");
            System.out.println("5. Exit");
            System.out.println("--------------------------------");
            int request = scanner.nextInt();
            scanner.nextLine();
            switch (request) {
                // show all word in dictionary if request is 1
                case 1:
                    showAllDictionary(dictionary);
                    System.out.println("--------------------------------");
                    break;
                // translate word if request is 2
                case 2:
                    System.out.println("Choose word that you want to translate");
                    showAllDictionary(dictionary);
                    System.out.println("   --------------------------   ");
                    String word = scanner.nextLine();
                    if (dictionary.containsKey(word)) {
                        System.out.println("The word '"+ word + "' means '" + dictionary.get(word) + "'");
                    }
                    else {
                        System.out.println("Don't have this word");
                    }
                    System.out.println("--------------------------------");
                    break;
                // add new word if request is 3
                case 3:
                    System.out.println("Type your word");
                    String wordKey = scanner.nextLine();
                    System.out.println("Meaning of the word '" + wordKey + "':");
                    String wordValue = scanner.nextLine();
                    dictionary.put(wordKey, wordValue);
                    System.out.println("Add success!!! \n   --------------------------   \nDictionary after adding: ");
                    showAllDictionary(dictionary);
                    System.out.println("--------------------------------");
                    break;
                // delete old word from dictionary if request is 4
                case 4:
                    System.out.println("Choose word that you want to delete");
                    showAllDictionary(dictionary);
                    System.out.println("   --------------------------   ");
                    String wordKeyDelete = scanner.nextLine();
                    if (dictionary.containsKey(wordKeyDelete)) {
                        dictionary.remove(wordKeyDelete);
                        System.out.println("Delete success!!! \n   --------------------------   \nDictionary after deleting:");
                        showAllDictionary(dictionary);
                    }
                    else {
                        System.out.println("Don't have this word!");
                    }
                    System.out.println("--------------------------------");
                    break;
                // exit if request is 5
                case 5:
                    checkExit = Boolean.TRUE;
                    break;
                // other request is not valid
                default:
                    System.out.println("Please entry number from 1 to 5");
            }

        }
    }

    // show all words in dictionary
    public static void showAllDictionary(Map < String, String > dictionary){
        for (Map.Entry<String, String> set :
                dictionary.entrySet()) {

            // Printing all elements of a Map
            System.out.println(set.getKey() + " : "
                    + set.getValue());
        }
    }
}