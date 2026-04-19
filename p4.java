package practice.string;
public class p4 {
    public static void main(String[] args) {
        String input = "Hello AIET";
        System.out.println("Reversed: " + reverseString(input));
    }

    public static String reverseString(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }
}
