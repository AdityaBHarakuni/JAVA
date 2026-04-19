package practice.string;
public class p14 {
    public static void main(String[] args) {
        System.out.println("Is '12345' numeric? " + isNumeric("12345"));
        System.out.println("Is '12a45' numeric? " + isNumeric("12a45"));
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) return false;
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
