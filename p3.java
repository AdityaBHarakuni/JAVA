package practice.string;
public class p3 {
    public static void main(String[] args) {
        String mainStr = "apple banana apple cherry apple";
        String subStr = "apple";
        System.out.println("Occurrences: " + countOccurrences(mainStr, subStr));
    }

    public static int countOccurrences(String main, String sub) {
        if (main == null || sub == null || sub.isEmpty()) return 0;
        int count = 0, index = 0;
        while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }
}
