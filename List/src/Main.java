import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new LinkedList<>();
        // add first student
        Student student = new Student("Duc Sang",22,Gender.MALE);
        studentList.add(student);
        Scanner scanner = new Scanner(System.in);
        boolean checkExit = Boolean.FALSE;
        while (!checkExit) {
            // get request
            System.out.println("--------------------------------");
            System.out.println("Choose your request:\n1: Add new student\n2: Delete student\n3: Get all student\n4: Exit");
            System.out.println("--------------------------------");
            int request = scanner.nextInt();
            switch (request) {
                // add student if request is 1
                case 1:
                    studentList.add(getNewStudent());
                    System.out.println("Success add student");
                    System.out.println("--------------------------------");
                    break;
                // delete student if request is 2
                case 2:
                    // show student for user choose student is deleted
                    getAllStudent(studentList);
                    System.out.println("Choose student that you want to delete");
                    int studentNumber = scanner.nextInt();
                    // check student validity
                    if ((studentNumber <= studentList.size()) && (studentNumber > 0)) {
                        studentList.remove(studentNumber-1);
                    } else System.out.println("Don't have student");
                    System.out.println("--------------------------------");
                    break;
                // show all student if request is 3
                case 3:
                    getAllStudent(studentList);
                    break;
                // exit if request is 4
                case 4:
                    checkExit = Boolean.TRUE;
                    break;
                // other request is not valid
                default: System.out.println("Please entry number from 1 to 3");
            }
        }
    }

    // get new student from keyboard
    public static Student getNewStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Detail of student:");
        System.out.println("Student's name:");
        String name = sc.nextLine();
        System.out.println("Student's age:");
        Integer age = sc.nextInt();
        sc.nextLine();
        System.out.println("Student's gender:");
        String tempGender = sc.nextLine();
        Gender gender;
        if ("male".equals(tempGender)) gender = Gender.MALE;
        else if ("female".equals(tempGender)) gender = Gender.FEMALE;
        else gender = Gender.ORTHER;
        return new Student(name, age, gender);
    }

    // show all students in the list
    public static void getAllStudent(List<Student> studentList){
        int temp = 1;
        for (Student student : studentList){
            System.out.println("  ----------------------------  ");
            System.out.println("Student no " + temp++);
            System.out.println(student.toString());
            System.out.println("  ----------------------------  ");
        }
    }
}