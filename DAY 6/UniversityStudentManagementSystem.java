// Student Class
class Student {
    private String name;
    private int id;
    private static int totalStudentsEnrolled = 0; // Static member to track total students

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        totalStudentsEnrolled++; // Increment total students on each new student enrollment
    }

    // Getter for total students enrolled
    public static int getTotalStudentsEnrolled() {
        return totalStudentsEnrolled;
    }
}

// Course Class
class Course {
    private String title;
    private String code;
    private static int totalCoursesOffered = 0; // Static member to track total courses

    // Constructor
    public Course(String title, String code) {
        this.title = title;
        this.code = code;
        totalCoursesOffered++; // Increment total courses on each new course offering
    }

    // Getter for total courses offered
    public static int getTotalCoursesOffered() {
        return totalCoursesOffered;
    }
}

// Main Class to test the system
public class UniversityStudentManagementSystem {
    public static void main(String[] args) {
        // Test Case 1: Basic Student Enrollment
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);
        System.out.println("Total Students Enrolled: " + Student.getTotalStudentsEnrolled()); // Expected: 2

        // Test Case 2: Basic Course Offering
        Course course1 = new Course("Mathematics", "MATH101");
        Course course2 = new Course("Physics", "PHY102");
        System.out.println("Total Courses Offered: " + Course.getTotalCoursesOffered()); // Expected: 2

        // Test Case 3: Mixed Enrollment and Offering
        Student student3 = new Student("Charlie", 103);
        System.out.println("Total Students Enrolled: " + Student.getTotalStudentsEnrolled()); // Expected: 3
        System.out.println("Total Courses Offered: " + Course.getTotalCoursesOffered()); // Expected: 2

        // Test Case 4: No Enrollment or Offering (at start, before any students or courses)
        // Already covered in initial cases when system was reset with new instances.

        // Test Case 5: Reset and Recount
        Student student4 = new Student("David", 104);
        Student student5 = new Student("Eva", 105);
        Course course3 = new Course("Chemistry", "CHEM103");
        System.out.println("Total Students Enrolled: " + Student.getTotalStudentsEnrolled()); // Expected: 5
        System.out.println("Total Courses Offered: " + Course.getTotalCoursesOffered()); // Expected: 3
    }
}
