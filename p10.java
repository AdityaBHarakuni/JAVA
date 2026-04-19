package practice.string;
public class p10 {
    public static void main(String[] args) {
        String test = "A man, a plan, a canal: Panama";
        
        if (isPalindrome(test)) {
            System.out.println("'" + test + "' is a palindrome.");
        } else {
            System.out.println("'" + test + "' is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        
        // Remove all non-alphanumeric characters and convert to lowercase
        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }
}
