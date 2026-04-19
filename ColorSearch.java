package com.arraylist;
import java.util.ArrayList;

public class ColorSearch {
    public static void main(String[] args) {
        // Create an ArrayList of Strings to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add different colors to the list
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");

        // Display the list
        System.out.println("Color List: " + colors);

        // Search for the color "Red"
        if (colors.contains("Red")) {
            System.out.println("The color \"Red\" is available in the list.");
        } else {
            System.out.println("The color \"Red\" is not available in the list.");
        }
    }
}
