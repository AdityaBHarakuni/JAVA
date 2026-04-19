package practice.string;
import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isNullOrEmpty(input)) {
            System.out.println("The string is null or contains only whitespace.");
        } else {
            System.out.println("The string has content: " + input);
        }
        sc.close();
    }

    public static boolean isNullOrEmpty(String str) {
        // Returns true if string is null or after trimming it's empty
        return str == null || str.trim().isEmpty();
    }
}
