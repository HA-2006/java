import java.util.Arrays;
import java.util.List;

public class StudentGreetings {

    public static void main(String[] args) {
        // Test Case 1: All Students Greeted
        List<String> students1 = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        greetStudents(students1);

        // Test Case 2: Empty List Handling
        List<String> students2 = Arrays.asList();
        greetStudents(students2);

        // Test Case 3: Single Student Case
        List<String> students3 = Arrays.asList("John");
        greetStudents(students3);

        // Test Case 4: Special Characters
        List<String> students4 = Arrays.asList("Anna-Maria", "Joe123", "Sam@Home");
        greetStudents(students4);

        // Test Case 5: Performance Test
        List<String> students5 = generateLargeListOfStudents(1000);
        greetStudents(students5);
    }

    public static void greetStudents(List<String> students) {
        for (String student : students) {
            System.out.println("Hello, " + student + "!");
        }
    }

    public static List<String> generateLargeListOfStudents(int count) {
        String[] students = new String[count];
        for (int i = 0; i < count; i++) {
            students[i] = "Student" + (i + 1);
        }
        return Arrays.asList(students);
    }
}
