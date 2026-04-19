package practice.string;
public class p12 {
    public static void main(String[] args) {
        String input = "hello java programming world";
        System.out.println("Original: " + input);
        System.out.println("Capitalized: " + capitalizeWords(input));
    }

    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) return str;
        
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1))
                      .append(" ");
            }
        }
        return result.toString().trim();
    }
}
