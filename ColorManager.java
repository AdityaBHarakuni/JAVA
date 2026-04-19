package com.arraylist;
import java.util.ArrayList;

public class ColorManager {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> colors = new ArrayList<>();

        // 1. Add different colors
        colors.add("Red");
        colors.add("Green"); // 2nd element (index 1)
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Original List: " + colors);

        // 2. Remove the 2nd element (index 1)
        // Since we need to remove "Blue" later, we remove the index first
        colors.remove(1); 
        System.out.println("After removing 2nd element: " + colors);

        // 3. Remove the color "Blue"
        colors.remove("Blue");
        System.out.println("Final List: " + colors);
    }
}
