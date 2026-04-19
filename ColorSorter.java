package com.arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class ColorSorter {
    public static void main(String[] args) {
        // 1. Create an ArrayList object to store color names (Strings)
        ArrayList<String> colorList = new ArrayList<>();

        // 2. Add different colors to the ArrayList
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Yellow");
        colorList.add("Orange");

        // 3. Print the list before sorting
        System.out.println("Colors before sorting: " + colorList);

        // 4. Sort the ArrayList using Collections.sort()
        Collections.sort(colorList);

        // 5. Print the list after sorting (Alphabetical order)
        System.out.println("Colors after sorting: " + colorList);
    }
}
