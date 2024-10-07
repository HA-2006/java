public class Student {
    private int grade;

    // Constructor
    public Student() {
        this.grade = 0; // Default grade
    }

    // Method to set the grade with validation
    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Error: Invalid grade. Grade must be between 0 and 100.");
        }
    }

    // Method to get the grade
    public int getGrade() {
        return this.grade;
    }

    public static void main(String[] args) {
        Student student = new Student();

        // Test Case 1: Valid Grade Test
        System.out.println("Test Case 1: Valid Grade Test");
        student.setGrade(85);
        System.out.println("Expected: 85, Actual: " + student.getGrade());
        System.out.println();

        // Test Case 2: Invalid High Grade Test
        System.out.println("Test Case 2: Invalid High Grade Test");
        student.setGrade(110);
        System.out.println("Expected: 85, Actual: " + student.getGrade());
        System.out.println();

        // Test Case 3: Invalid Low Grade Test
        System.out.println("Test Case 3: Invalid Low Grade Test");
        student.setGrade(-10);
        System.out.println("Expected: 85, Actual: " + student.getGrade());
        System.out.println();

        // Test Case 4: Edge Case Low Grade Test
        System.out.println("Test Case 4: Edge Case Low Grade Test");
        student.setGrade(0);
        System.out.println("Expected: 0, Actual: " + student.getGrade());
        System.out.println();

        // Test Case 5: Edge Case High Grade Test
        System.out.println("Test Case 5: Edge Case High Grade Test");
        student.setGrade(100);
        System.out.println("Expected: 100, Actual: " + student.getGrade());
        System.out.println();
    }
}
