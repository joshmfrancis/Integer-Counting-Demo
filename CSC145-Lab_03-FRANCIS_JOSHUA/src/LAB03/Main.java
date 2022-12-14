/*
 * File: Main.java
 * Author: Joshua Francis
 * Concentration: SD
 * Date: 10/25/2022
 * Java class description: This class holds the main method which is designated 
 * as the driver class for this Lab. This program prompts the user to input an 
 * arbitrary number of integers between -50 and 50. The program then takes the 
 * input, creates an array, then outputs the number of values of each array with
 * "*" and "|" every 5th count. This is displayed alongside the value. This 
 * class uses another class called utility (Also in the main package) to help it
 * achieve the output. 
*/

// Package 
package LAB03;

// Imports 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Variables 
        int minVal = -50;
        int maxVal = 50;
        final int THRESHOLD = 0;
        int length = maxVal - minVal + 1;
        int index;

        // Creates a new Array for the Inputs 
        int[] array = new int[length];

        // Creates a Scanner Object for the Input From the User 
        Scanner scan = new Scanner(System.in);

        // Printing out for the User to Read 
        System.out.println("Enter an arbitrary number of integers in the range of -50 to 50.");
        System.out.println("Enter in an integer outside of the range of -50 to 50 to exit the writing stage:");

        // Part #1 + #5: 
        // Takes in Input From the User and Modifies it to Work With any min/max Values 
        index = (scan.nextInt()) - minVal;
        // While Loop to add 1 to the Index and Repeats for all Inputted Values if the User Inputs it in the Range of the Internal Index 
        while (index >= 0 && index < length) {
            array[index]++;
            // Prepares Input for Next Loop 
            index = (scan.nextInt()) - minVal;
        }

        System.out.println(); // Spacing 

        // Part #4: 
        // Creates an Object MyUtility 
        MyUtility asterisk = new MyUtility();

        // For Loop to run Through all of the Values In The Index 
        for (int i = 0; i < array.length; i++) {
            // If Loop to Denote the Values as Above the Threshold to Print 
            if (array[i] > THRESHOLD) {
                // Passes in the Value "*" and the int at the Index From the For Loop Above to the Method concat1 That Processes the Input for Printing 
                asterisk.concat("*", (array[i]));
                // Prints the Result of the Method to the Console 
                System.out.println("[" + (i + minVal) + "]\t" + asterisk);
            }
        }

    }

}