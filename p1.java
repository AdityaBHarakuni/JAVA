package practice.string;
import java.util.Arrays;

public class p1{
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("Strings created: " + str1 + " and " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1: " + str1.charAt(1));

        // 3. String Comparison
        System.out.println("Comparison (str1 equals str2): " + str1.equals(str2));
        System.out.println("Case-insensitive comparison: " + str1.equalsIgnoreCase("HELLO"));

        // 4. String Searching
        String searchStr = "Java Programming";
        System.out.println("Index of 'Pro': " + searchStr.indexOf("Pro"));
        System.out.println("Contains 'Java': " + searchStr.contains("Java"));

        // 5. Substring Operations
        System.out.println("Substring (index 0 to 4): " + searchStr.substring(0, 4));

        // 6. String Modification
        System.out.println("Replace 'Java' with 'Python': " + searchStr.replace("Java", "Python"));
        System.out.println("Uppercase: " + str1.toUpperCase());

        // 7. Whitespace Handling
        String spacedStr = "   Trim Me   ";
        System.out.println("Trimmed String: '" + spacedStr.trim() + "'");

        // 8. String Concatenation
        String combined = str1.concat(" ").concat(str2);
        System.out.println("Concatenated String: " + combined);

        // 9. String Splitting
        String csv = "Apple,Banana,Cherry";
        String[] fruits = csv.split(",");
        System.out.println("Split result: " + Arrays.toString(fruits));

        // 10. StringBuilder Demo (Mutable strings)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.reverse();
        System.out.println("StringBuilder Reverse: " + sb.toString());

        // 11. String Formatting
        String formatted = String.format("Name: %s, Score: %d", "Alice", 95);
        System.out.println("Formatted String: " + formatted);

        // 12. Validate Email with contains(), startsWith(), endsWith()
        validateEmail("user@example.com");
        validateEmail("invalid-email.com");
    }

    public static void validateEmail(String email) {
        System.out.println("\nValidating: " + email);
        boolean hasAt = email.contains("@");
        boolean validStart = !email.startsWith("@");
        boolean validEnd = email.endsWith(".com") || email.endsWith(".org");

        if (hasAt && validStart && validEnd) {
            System.out.println("Status: Valid email format.");
        } else {
            System.out.println("Status: Invalid email format.");
        }
    }
}
