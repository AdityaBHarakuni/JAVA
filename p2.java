package practice.string;
public class p2 {
    public static void main(String[] args) {
        String testStr = "   ";
        if (isNullOrEmpty(testStr)) {
            System.out.println("The string is null or contains only whitespace.");
        } else {
            System.out.println("The string has content.");
        }
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}
