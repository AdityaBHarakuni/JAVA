package practice.string;
public class p9 {
    public static void main(String[] args) {
        String original = "AIET Mangalore";
        String reversed = reverseString(original);
        
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseString(String str) {
        if (str == null) return null;
        
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
