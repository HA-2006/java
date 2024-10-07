import java.util.Scanner;

// Student class to represent a student with name, homework grade, and final exam grade
class Student {
    private String name;
    private double homeworkGrade;
    private double finalExamGrade;

    // Constructor to initialize the student's details
    public Student(String name, double homeworkGrade, double finalExamGrade) {
        this.name = name;
        this.homeworkGrade = homeworkGrade;
        this.finalExamGrade = finalExamGrade;
    }

    // Method to get the student's name
    public String getName() {
        return name;
    }

    // Method to get the homework grade
    public double getHomeworkGrade() {
        return homeworkGrade;
    }

    // Method to get the final exam grade
    public double getFinalExamGrade() {
        return finalExamGrade;
    }

    // Method to calculate the average grade
    public double calculateAverageGrade() {
        return (homeworkGrade + finalExamGrade) / 2;
    }
}

// GradeManager class to handle user input and manage student grades
public class GradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Homework Grade: ");
        double homeworkGrade = scanner.nextDouble();
        
        System.out.print("Final Exam Grade: ");
        double finalExamGrade = scanner.nextDouble();

        // Create a Student object
        Student student = new Student(name, homeworkGrade, finalExamGrade);

        // Calculate the average grade
        double averageGrade = student.calculateAverageGrade();

        // Display the results
        System.out.printf("Student Name: %s%n", student.getName());
        System.out.printf("Homework Grade: %.1f%n", student.getHomeworkGrade());
        System.out.printf("Final Exam Grade: %.1f%n", student.getFinalExamGrade());
        System.out.printf("Average Grade: %.1f%n", averageGrade);

        scanner.close();
    }
}
