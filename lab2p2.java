package stringhandling;
public class p2 {
    public static void main(String[] args) {
        int iterations = 10000;
        String text = "AIET";

        // Testing StringBuffer
        long startTime = System.nanoTime();
        StringBuffer sbuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbuffer.append(text);
        }
        long bufferTime = System.nanoTime() - startTime;

        // Testing StringBuilder
        startTime = System.nanoTime();
        StringBuilder sbuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sbuilder.append(text);
        }
        long builderTime = System.nanoTime() - startTime;

        System.out.println("Time taken by StringBuffer: " + bufferTime + " ns");
        System.out.println("Time taken by StringBuilder: " + builderTime + " ns");
    }
}
