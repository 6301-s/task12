import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a Name");
            System.out.println("2. Display Names");
            System.out.println("3. Search for a Name");
            System.out.println("4. Remove a Name");
            System.out.println("5. Sort Names");
            System.out.println("6. Count Names");
            System.out.println("7. Clear Names");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter a name to add: ");
                    String name = scanner.nextLine();
                    names.add(name);
                    break;
                case 2:
                    displayNames(names);
                    break;
                case 3:
                    System.out.print("Enter a name to search for: ");
                    String searchName = scanner.nextLine();
                    searchForName(names, searchName);
                    break;
                case 4:
                    System.out.print("Enter a name to remove: ");
                    String removeName = scanner.nextLine();
                    removeName(names, removeName);
                    break;
                case 5:
                    sortNames(names);
                    break;
                case 6:
                    countNames(names);
                    break;
                case 7:
                    clearNames(names);
                    break;
                case 8:
                    scanner.close();
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayNames(ArrayList<String> names) {
        System.out.println("List of Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    private static void searchForName(ArrayList<String> names, String searchName) {
        if (names.contains(searchName)) {
            System.out.println(searchName + " is found in the list.");
        } else {
            System.out.println(searchName + " is not in the list.");
        }
    }

    private static void removeName(ArrayList<String> names, String removeName) {
        if (names.remove(removeName)) {
            System.out.println(removeName + " has been removed from the list.");
        } else {
            System.out.println(removeName + " is not in the list.");
        }
    }

    private static void sortNames(ArrayList<String> names) {
        Collections.sort(names);
        System.out.println("Names have been sorted.");
    }

    private static void countNames(ArrayList<String> names) {
        System.out.println("Number of names in the list: " + names.size());
    }

    private static void clearNames(ArrayList<String> names) {
        names.clear();
        System.out.println("All names have been cleared.");
    }
}
