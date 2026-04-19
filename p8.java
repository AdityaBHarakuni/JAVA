package practice.string;
public class p8{
    public static void main(String[] args) {
        String mainStr = "java is fun, java is powerful, java is everywhere";
        String subStr = "java";
        
        int result = countOccurrences(mainStr, subStr);
        System.out.println("Main String: " + mainStr);
        System.out.println("Substring '" + subStr + "' appears " + result + " times.");
    }

    public static int countOccurrences(String main, String sub) {
        if (main == null || sub == null || sub.isEmpty()) return 0;
        
        int count = 0;
        int index = 0;
        while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length(); // Move index forward to find next occurrence
        }
        return count;
    }
}
