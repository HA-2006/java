public class EventAttendees {

    public static void main(String[] args) {
        // Test Case 1
        String[] names1 = {"Alice", "Bob", "Charlotte", "David", "Eve"};
        printNamesAndStats(names1);

        // Test Case 2
        String[] names2 = {"Tom", "Sam", "Jim", "Tim", "Kim"};
        printNamesAndStats(names2);

        // Test Case 3
        String[] names3 = {"Ann", "Elizabeth", "Joe", "Alex", "Zoe"};
        printNamesAndStats(names3);

        // Test Case 4
        String[] names4 = {"alice", "Bob", "CHARLOTTE", "david", "EVE"};
        printNamesAndStats(names4);

        // Test Case 5
        String[] names5 = {"A", "B", "C", "D", "E"};
        printNamesAndStats(names5);
    }

    public static void printNamesAndStats(String[] names) {
        String longestName = findLongestName(names);
        String shortestName = findShortestName(names);

        System.out.print("Names in Reverse Order: ");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.print(names[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Longest Name: " + longestName);
        System.out.println("Shortest Name: " + shortestName);
        System.out.println();
    }

    public static String findLongestName(String[] names) {
        String longest = names[0];
        for (String name : names) {
            if (name.length() > longest.length()) {
                longest = name;
            }
        }
        return longest;
    }

    public static String findShortestName(String[] names) {
        String shortest = names[0];
        for (String name : names) {
            if (name.length() < shortest.length()) {
                shortest = name;
            }
        }
        return shortest;
    }
}
