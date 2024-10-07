public class StudentScores {

    public static void main(String[] args) {
        // Test Case 1
        int[] scores1 = {85, 92, 78, 90, 88};
        printScoresAndStats(scores1);

        // Test Case 2
        int[] scores2 = {70, 80, 90, 100, 60};
        printScoresAndStats(scores2);

        // Test Case 3
        int[] scores3 = {55, 65, 75, 85, 95};
        printScoresAndStats(scores3);

        // Test Case 4
        int[] scores4 = {100, 100, 100, 100, 100};
        printScoresAndStats(scores4);

        // Test Case 5
        int[] scores5 = {45, 55, 65, 35, 25};
        printScoresAndStats(scores5);
    }

    public static void printScoresAndStats(int[] scores) {
        double average = calculateAverage(scores);
        int highest = findHighestScore(scores);
        int lowest = findLowestScore(scores);

        System.out.print("Scores: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println();
    }

    public static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    public static int findHighestScore(int[] scores) {
        int highest = scores[0];
        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
        }
        return highest;
    }

    public static int findLowestScore(int[] scores) {
        int lowest = scores[0];
        for (int score : scores) {
            if (score < lowest) {
                lowest = score;
            }
        }
        return lowest;
    }
}
