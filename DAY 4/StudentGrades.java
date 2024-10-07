public class StudentGrades {

    public static void main(String[] args) {
        // Test Case 1: Average Calculation with Uniform Scores
        int[][] scores1 = {
            {80, 80, 80, 80},
            {80, 80, 80, 80},
            {80, 80, 80, 80}
        };
        printAverages(scores1);

        // Test Case 2: Average Calculation with Varying Student Scores
        int[][] scores2 = {
            {85, 78, 90, 88},
            {76, 85, 83, 80},
            {91, 89, 92, 94}
        };
        printAverages(scores2);

        // Test Case 3: Empty Array
        int[][] scores3 = {};
        printAverages(scores3);

        // Test Case 4: Single Student with Various Scores
        int[][] scores4 = {
            {70, 85, 90, 75}
        };
        printAverages(scores4);

        // Test Case 5: Large Dataset
        int[][] scores5 = {
            {75, 80, 85, 90},
            {82, 88, 76, 90},
            {90, 92, 87, 85},
            {78, 85, 80, 88},
            {85, 79, 91, 84}
        };
        printAverages(scores5);
    }

    public static void printAverages(int[][] scores) {
        if (scores.length == 0) {
            System.out.println("Average scores for each student:");
            System.out.println("Average scores for each subject:");
            return;
        }

        // Calculate and print average scores for each student
        System.out.println("Average scores for each student:");
        for (int i = 0; i < scores.length; i++) {
            double avgStudent = calculateAverageForStudent(scores[i]);
            System.out.println("Student " + (i + 1) + ": " + avgStudent);
        }

        // Calculate and print average scores for each subject
        System.out.println("Average scores for each subject:");
        int numSubjects = scores[0].length;
        for (int j = 0; j < numSubjects; j++) {
            double avgSubject = calculateAverageForSubject(scores, j);
            switch (j) {
                case 0:
                    System.out.println("Math: " + avgSubject);
                    break;
                case 1:
                    System.out.println("Science: " + avgSubject);
                    break;
                case 2:
                    System.out.println("English: " + avgSubject);
                    break;
                case 3:
                    System.out.println("History: " + avgSubject);
                    break;
            }
        }
        System.out.println();
    }

    public static double calculateAverageForStudent(int[] studentScores) {
        double sum = 0;
        for (int score : studentScores) {
            sum += score;
        }
        return sum / studentScores.length;
    }

    public static double calculateAverageForSubject(int[][] scores, int subjectIndex) {
        double sum = 0;
        for (int[] studentScores : scores) {
            sum += studentScores[subjectIndex];
        }
        return sum / scores.length;
    }
}
