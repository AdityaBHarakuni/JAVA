package practice.string;
public class p13 {
    public static void main(String[] args) {
        String text = "This is a very long sentence for testing.";
        System.out.println(truncate(text, 20));
    }

    public static String truncate(String str, int length) {
        if (str != null && str.length() > length) {
            return str.substring(0, length) + "...";
        }
        return str;
    }
}
