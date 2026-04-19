package com.arraylist;
import java.util.ArrayList;
import java.util.List;

public class ColorList {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Original ArrayList: " + colors);

        // Extract the 1st and 2nd elements (indices 0 and 1)
        // subList(fromIndex, toIndex) - toIndex is exclusive
        List<String> subList = colors.subList(0, 2);

        System.out.println("Extracted subList (1st and 2nd elements): " + subList);
    }
}
