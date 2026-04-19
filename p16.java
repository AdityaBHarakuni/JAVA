package practice.string;
public class p16 {
    public static void main(String[] args) {
        String input = "Java is fun to learn";
        System.out.println("Word count: " + countWords(input));
    }

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        // Split by one or more spaces
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
