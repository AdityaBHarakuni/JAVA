package practice.string;
public class p6 {
    public static void main(String[] args) {
        String input = " J a v a   P r o g r a m ";
        System.out.println("Cleaned: " + removeWhitespace(input));
    }

    public static String removeWhitespace(String str) {
        if (str == null) return null;
        return str.replaceAll("\\s+", "");
    }
}
