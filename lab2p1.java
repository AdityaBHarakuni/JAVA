package stringhandling;
public class p1 {
    public static void main(String[] args) {
        // 1. Creation and Basic Operations
        String str = "  Welcome to AIET Mangalore  ";
        System.out.println("Original String: '" + str + "'");

        // 2. Length and Character Access
        System.out.println("Length: " + str.length());
        System.out.println("Char at index 13: " + str.charAt(13));

        // 3. String Comparison
        String other = "welcome to aiet mangalore";
        System.out.println("Equals Ignore Case: " + str.trim().equalsIgnoreCase(other));

        // 4. Searching
        System.out.println("Index of 'AIET': " + str.indexOf("AIET"));

        // 5. Substring
        System.out.println("Substring (13-17): " + str.substring(13, 17));

        // 6. Modification & 7. Whitespace Handling
        String modified = str.trim().replace("Mangalore", "Moodbidri");
        System.out.println("Modified & Trimmed: " + modified);

        // 8. Concatenation
        System.out.println("Concatenation: ".concat(modified).concat(" Campus"));

        // 9. Splitting
        String[] words = modified.split(" ");
        System.out.print("Split words: ");
        for (String w : words) System.out.print("[" + w + "] ");

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("AIET");
        sb.reverse();
        System.out.println("\nStringBuilder Reverse: " + sb);

        // 11. String Formatting
        String formatted = String.format("\nCollege: %s, Year: %d", "AIET", 2024);
        System.out.println(formatted);

        // 12. Email Validation
        String email = "student@aiet.org.in";
        boolean isValid = email.contains("@") && email.startsWith("student") && email.endsWith(".in");
        System.out.println("Is Email Valid? " + isValid);
    }
}
