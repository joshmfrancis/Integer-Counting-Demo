/*
 * File: MyUtility.java
 * Author: Joshua Francis
 * Concentration: SD
 * Date: 10/25/2022
 * Java class description: This class is a helper class to the main class (Also
 * in this package). It is used to create a MyUtility Object which has a method
 * called concat that takes in a string and an int, and outputs a formatted 
 * string with "*" for each value and "|" for every 5th value. 
*/

// Package 
package LAB03;

// Class 
public class MyUtility {

    // Variables 
    String string = "";
    int count = 0;
    String output = "";

    // Constructor 
    public MyUtility() {
        this.string = "";
        this.count = 0;
    }

    // Methods Used 
    // Modified Code From LAB02 
    public void concat(String string, int count) {
        // Resets the Output Each Call Of The Method 
        output = "";

        // Counter for the Number of Occurences of "|" for 5 
        int counter = 0;
        // Logic to Determine the Amount of "*" to Print and "|" to Print 
        for (int a = 0; a < count; a++) {
            counter++;
            // If the counter reaches 5, print out "|" instead of "*" 
            if (counter == 5) {
                // Print out "|" and Reset the Counter to 0 for use in the For Loop to get Other Values of 5 
                output += "|";
                counter = 0;
            } else {
                // Add "*" to Print  
                output += string;
            }
        }
    }

    // toString Method to get the Value Printed Instead of the Memory Location 
    public String toString() {
        String print = (output);
        return print;
    }

}
