package practice.string;
public class p5 {
    public static void main(String[] args) {
        String input = "Race Car!";
        if (isPalindrome(input)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }
}
