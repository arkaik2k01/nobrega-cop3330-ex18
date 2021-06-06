package BASE;

/*
Exercise 18 - Temperature Converter
You’ll often need to determine which part of a program is run based on user input or other events.

Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit. Prompt for the starting temperature.
The program should prompt for the type of conversion and then perform the conversion.
The formulas are
C = (F − 32) × 5 / 9
and
F = (C × 9 / 5) + 32

Example Output
Press C to convert from Fahrenheit to Celsius.
Press F to convert from Celsius to Fahrenheit.
Your choice: C
Please enter the temperature in Fahrenheit: 32
The temperature in Celsius is 0.

Constraints
Ensure that you allow upper or lowercase values for C and F.
Use as few output statements as possible and avoid repeating output strings.
Challenges
Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Break the program into functions that perform the computations.
Implement this program as a GUI program that automatically updates the values when any value changes.
Modify the program so it also supports the Kelvin scale.

 */

import java.util.Scanner;

public class App
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App prog = new App();

        //Input
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");
        String choice = in.next();
        //Input catcher. Make sure only C or F is entered
        while (!(choice.equalsIgnoreCase("C")) && !(choice.equalsIgnoreCase("F"))) {
            System.out.print("Nonvalid. Your choice: ");
            choice = in.next();
        }
        System.out.print("Please enter your temperature in " + ((choice.equalsIgnoreCase("C")) ? ("Fahrenheit") : ("Celsius")) + ": ");
        int temp = in.nextInt();

        //Output
        System.out.println("The temperature in " + ((choice.equalsIgnoreCase("C")) ? ("Celsius") : ("Fahrenheit")) + " is: " +
                ((choice.equalsIgnoreCase("C")) ? (prog.fahToCel(temp)) : (prog.celToFah(temp))));
    }

    private double celToFah(int cel)
    {
        return (cel * 9 / 5) + 32;    //F = (C × 9 / 5) + 32
    }

    private double fahToCel(int fah)
    {
        return (fah - 32) * 5 / 9;     //C = (F − 32) × 5 / 9
    }
}
