package com.arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class ColorManager2 {
    public static void main(String[] args) {
        // Create an ArrayList object to store colors
        ArrayList<String> colors = new ArrayList<>();

        // 1. Adding different colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Display the original list
        System.out.println("Original Color List: " + colors);

        // 2. Getting the nth element to delete from user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the color to remove (0 to " + (colors.size() - 1) + "): ");
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            // 3. Delete nth element using remove(int index)
            try {
                String removedColor = colors.remove(n);
                System.out.println("Removed Color: " + removedColor);
                
                // Display the updated list
                System.out.println("Updated Color List: " + colors);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error: The index " + n + " is out of range.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        
        scanner.close();
    }
}
