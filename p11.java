package practice.string;
public class p11 {
    public static void main(String[] args) {
        String input = "  Welcome   to  AIET  Moodbidri  ";
        String result = removeWhitespace(input);
        
        System.out.println("Original: [" + input + "]");
        System.out.println("Modified: [" + result + "]");
    }

    public static String removeWhitespace(String str) {
        if (str == null) return null;
        
        // \\s matches all whitespace (spaces, tabs, newlines)
        return str.replaceAll("\\s", "");
    }
}
