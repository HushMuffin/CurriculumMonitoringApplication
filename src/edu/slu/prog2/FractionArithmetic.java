/**
 * 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 * <p>
 * Team Number: 6
 * Members:
 * Ang, Julienne - 2232357
 * Angobung, Charles Jacob - 2232594
 * Bacasen, Kaetlyn Ann - 2212033
 * Dacanay, Kurt Jonas - 2232981
 * Nonato, Marius Glenn - 2232731
 * Santos, Lourdene Eira - 2233120
 * <p>
 * CLASS CODE & Schedule: 9301 CS 122 7:30 - 8:30 & 9:00 - 10:30 TF
 * Date of Programming: March-1-2023
 * Activity Name: Midterm Project 1
 * <p>
 * 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 * <p>
 * Problem Description:
 * Create a program that facilitates addition, subtraction, multiplication and division of mixed numbers
 * (similar with the first activity) but this time all the inputs/outputs may involve fractions, mixed
 * fractions or combination.
 * <p>
 * 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 * <p>
 * Inputs:
 * integer number for menu choice
 * whole number of a mixed fraction
 * numerator of a fraction
 * denominator of a fraction
 * <p>
 * Outputs:
 * sum of two fractions
 * difference of two fractions
 * product of two fractions
 * quotient of two fractions
 * fraction in its lowest terms
 * <p>
 * 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 * <p>
 * The FractionArithmetic Class is the main class that is the super class for the
 * Fraction and MixedFraction subclasses.
 * <p>
 * General Algorithm: TODO: Kaetlyn put the general algorithm here after the whole code is finalized and completed.
 * 1.
 * <p>
 * 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 * <p>
 *  Authors:
 *  @author Ang, Julienne
 *  @author Angobung, Charles Jacob
 *  @author Bacasen, Kaetlyn Ann
 *  @author Dacanay, Kurt Jonas
 *  @author Nonato, Marius Glenn
 *  @author Santos, Lourdene Eira
 */
package edu.slu.prog2;

import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.Scanner;

//TODO: Sfter the whole code is finalized and completed, Kaetlyn put additional Single-line comments for ALL classes that explains some lines of code
public class FractionArithmetic {

    // Declare the local variables for FractionArithmetic class.
    static Scanner keyboard;
    static MixedFraction fraction1 = null;
    static MixedFraction fraction2 = null;

    public FractionArithmetic() {}

    /**
     * Main method to invoke a method to run the application program.
     */
    /*
       Algorithm:
       1. Invoke the run method.
     */
    public static void main(String[] args) {
        run();
    } // end of main method

    /**
     * Method to execute the application program.
     */
    /*
        Algorithm:
        1. Invoke the showIntroduction method to display a brief introduction to the program.
        2. Invoke the requestMixedFraction method twice to prompt the user to enter two mixed
           fractions and store the results in the variables fraction1 and fraction2.
        3. Set the variables choiceLowerLimit and choiceUpperLimit to the lower and upper limits,
           respectively, of the menu choices.
        4. Enter a do-while loop that repeatedly displays the menu of choices by calling the showChoices
           method and prompts the user to enter a choice.
        5. Pass the user's choice as an argument to the arithmeticRoutines method, which performs the
           corresponding arithmetic operation on the two fractions and displays the result.
        6. If the user chooses option 7, call the showExit method to display a closing statement
           and exit the program.
        7. Repeat steps 4-6 until the user chooses the "Exit" option (i.e., enters the value choiceUpperLimit).
        8. Terminate the program.
     */
    public static void run() {
        showIntroduction();
        fraction1 = requestMixedFraction(1);
        fraction2 = requestMixedFraction(2);
        byte choiceLowerLimit = 1;
        byte choiceUpperLimit = 8;

        int myPick;
        do {
            myPick = showChoices();
            arithmeticRoutines(myPick);

            if (myPick == 7){
                showExit();
            }
        } while(myPick != choiceUpperLimit);
        System.exit(0);
    } // end of run method

    /**
     * Method to print an introduction statement that displays information about the purpose
     * of the program and guidelines for the user.
     */
    /*
       Algorithm:
       1. Print an introduction statement of the program.
     */
    public static void showIntroduction() {
        JOptionPane pane = new JOptionPane(
                "<html><h1 style='font-family: Calibri; font-size: 18pt;'>" +
                        "Welcome! This program shows the computation result of the addition, subtraction, <br>" +
                        "multiplication, division, and the simplification of a fraction. <br><br>" +
                        "You will be asked to enter the values of the whole number, numerator, and denominator <br> " +
                        "of both fractions and then a menu will be shown from which you can choose to <br> " +
                        "enter value for fraction 1, for fraction 2, add, subtract, multiply, divide <br> " +
                        "the fractions, reduce, and quit from the program.",
                JOptionPane.INFORMATION_MESSAGE,
                JOptionPane.DEFAULT_OPTION);

        JDialog dialog = pane.createDialog("Fraction Arithmetic Program");
        dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        dialog.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        dialog.setVisible(true);

        pane = new JOptionPane(
                "<html><h1 style='font-family: Calibri; font-size: 18pt;'> " +
                        "Please enter the two fractions first.",
                JOptionPane.INFORMATION_MESSAGE,
                JOptionPane.DEFAULT_OPTION);

        dialog = pane.createDialog("Fraction Arithmetic Program");
        dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        dialog.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        dialog.setVisible(true);
    } // end of showIntroduction method

    /**
     * Initializes and declares a Mixed Fraction object based on the data acquired.
     *
     * @param pick determines whether it is the 1st or 2nd Mixed Fraction
     * @return a Mixed Fraction
     */
    private static MixedFraction requestMixedFraction(int pick) {
        MixedFraction fraction = null;
        int wholeNumber = 0, numerator = 0, denominator;

        try {
            wholeNumber = requestFractionData("whole number part", pick);
            numerator = requestFractionData("numerator", pick);
            denominator = requestFractionData("denominator", pick);
            fraction = new MixedFraction(wholeNumber, numerator, denominator);
        } catch (NoWholeNumberException noWholeNumber) { // if no whole number is entered

            try {
                numerator = requestFractionData("numerator", pick);
                denominator = requestFractionData("denominator", pick);
                fraction = new MixedFraction(0, numerator, denominator);
            } catch (NoNumeratorException noNumerator) {
                fraction = new MixedFraction();
                fraction.setWholePart(wholeNumber);
            } catch (NoDenominatorException noDenominator) {
                fraction = new MixedFraction();
                fraction.setWholePart(numerator);
            } finally {
                return fraction;
            }
        } catch (NoNumeratorException noNumerator) {
            fraction = new MixedFraction();
            fraction.setWholePart(wholeNumber);
        } catch (NoDenominatorException noDenominator) {
            fraction = new MixedFraction();
            fraction.setWholePart(wholeNumber + numerator);
        } finally {
            return fraction;
        }
    } // end of requestMixedFraction method

    //TODO: Nash check requestFraction Data.
    /**
     * This method asks for the specific part of a Fraction.
     *
     * @param part specific part of the Fraction that is being asked of the user
     * @param fractionNumber determines if it is the 1st or 2nd Fraction
     * @return an integer for the respective part of the Fraction
     */
    private static int requestFractionData(String part, int fractionNumber) {
        int input = 0;

        try {
            String inputPane = JOptionPane.showInputDialog(null,
                    "<html><h1 style='font-family: Calibri; font-size: 18pt; '>Enter " + part + " of Fraction " + fractionNumber + " : ", "Fraction " + fractionNumber,
                    JOptionPane.QUESTION_MESSAGE);

            // Terminates the program when the user clicked cancel or X button
            if (inputPane == null) {
                System.exit(0);
            }

            input = Integer.parseInt(inputPane);
            if (part.equalsIgnoreCase("denominator") && input == 0) {
                JOptionPane.showMessageDialog(null, "<html><h1 style='font-family: Calibri; font-size: 18pt;'>" + "Please enter a valid number! Denominator cannot be zero.", "Fraction Arithmetic Program", JOptionPane.INFORMATION_MESSAGE);
                input = requestFractionData(part, fractionNumber);
            }

            return input;
        } catch (Exception exc) {
            if (part.equalsIgnoreCase("whole number part")) {
                throw new NoWholeNumberException();
            } else if (part.equalsIgnoreCase("numerator")) {
                throw new NoNumeratorException();
            } else {
                throw new NoDenominatorException();
            }
        }
    } // end of requestFractionData method

    //TODO: Julienne check showChoices method.
    /**
     * Method to display the available choices for the user to pick from.
     *
     * @return answer user input choice in the main menu
     */
     /*
        Algorithm:
        1. Initialize the answer variable to 0.
        2. Display all the available program choices shown in a main menu.
        3. Implement a do-while loop statement to repeatedly prompt the user for input until
           a valid input is obtained.
        4. Within the loop, use a try-catch block to catch NumberFormatExceptions that may be
           thrown when attempting to parse the user's input.
        5. If the user clicks the cancel button or the X button, terminate the program.
        6. Otherwise, parse the user's input into an integer and assign it to the answer variable.
        7. If the user's input is outside the range of valid options (1-7), continue the loop.
        8. Once a valid input has been obtained, return the answer variable.
     */
    public static int showChoices() {
        int answer = 0;
        do {
            try {
                String inputPane = JOptionPane.showInputDialog(null,
                        "<html><h1 style='font-family: Calibri; font-size: 20pt;'> Fraction 1: " +
                                fraction1.toString() +
                                "<html><h1 style='font-family: Calibri; font-size: 20pt;'> Fraction 2: " +
                                fraction2.toString() +
                                "<html><h1 style='font-family: Calibri; font-size: 16pt; display: flex'> <br>" +
                                "What do you want to do?" +
                                "<ol style='font-family: Calibri; font-size: 16pt;'>" +
                                "<li>Add fractions</li>         " +
                                "<li>Subtract fractions</li>    " +
                                "<li>Multiply fractions</li>    " +
                                "<li>Divide fractions</li>      " +
                                "<li>Reduce fractions</li>      " +
                                "<li>Change Fraction</li>       " +
                                "<li>Quit</li>                  " +
                                "</ol>                          ",
                        "Main Menu",
                        JOptionPane.QUESTION_MESSAGE);

                // Terminates the program when the user clicked cancel or X button
                if (inputPane == null) {
                    System.exit(0);
                }

                answer = Integer.parseInt(inputPane);
            } catch (NumberFormatException var3) {
                JOptionPane.showMessageDialog(null,
                        "<html><h1 style='font-family: Calibri; font-size: 18pt;'> " +
                                "Invalid input. Please select a valid option.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } while (answer < 1 || answer > 7);

        return answer;
    } // end of showChoices method

    /**
     * Method to perform the different arithmetics depending on what the user wants.
     *
     * @param choice user input choice from the main menu
     */
    /*
        Algorithm:
        1. Declare a string variable operation to hold the name of the arithmetic operation.
        2. Use a switch statement to check the value of the choice parameter and the program
           will do the following:
           a. If choice is 1, set operation to "Sum", calculate the sum of fraction1 and
              fraction2 using the add method of the MixedFraction class, and pass the result
              to the formatFinalResult method along with choice, operation, and 0 as the last
              parameter.
           b. If choice is 2, set operation to "Difference", calculate the difference of
              fraction1 and fraction2 using the subtract method of the MixedFraction class, and
              pass the result to the formatFinalResult method along with choice, operation, and
              0 as the last parameter.
           c. If choice is 3, set operation to "Product", calculate the product of fraction1 and
              fraction2 using the multiplyBy method of the MixedFraction class, and pass the result
              to the formatFinalResult method along with choice, operation, and 0 as the last parameter.
           d. If choice is 4, set operation to "Quotient", calculate the quotient of fraction1 and
              fraction2 using the divideBy method of the MixedFraction class, and pass the result to
              the formatFinalResult method along with choice, operation, and 0 as the last parameter.
           e. If choice is 5, set operation to "Reduced Form", prompt the user to choose between fraction1
              and fraction2 using the pickFraction method, call the reduceFraction method to reduce the
              chosen fraction to its lowest terms, and pass the result to the formatFinalResult method
              along with choice, operation, and the value of the pick variable as the last parameter.
           f. If choice is 6, prompt the user to choose between fraction1 and fraction2 using the
              pickFraction method, call the requestMixedFraction method to get a new mixed fraction from
              the user, and update either fraction1 or fraction2 depending on the user's choice.
           g. If choice is 7, implement break statement.
        3. The formatFinalResult method is responsible for formatting and displaying the final result to the user. The result of each arithmetic operation is passed to this method along with the choice parameter, which is used to determine the appropriate output message.
     */
    public static void arithmeticRoutines(int choice){
        String operation;

        switch (choice){
            case 1: //TODO: Julienne check add and subtract arithmetic operations or routines
                operation="Sum";
                MixedFraction sum = fraction1.add(fraction2);
                formatFinalResult(sum,choice,operation,0);
                break;
            case 2:
                operation="Difference";
                MixedFraction difference = fraction1.subtract(fraction2);
                formatFinalResult(difference,choice,operation,0);
                break;
            case 3: //TODO: Marius check multiplyBy and divideBy arithmetic operations or routines.
                operation="Product";
                MixedFraction product = fraction1.multiplyBy(fraction2);
                formatFinalResult(product,choice,operation,0);
                break;
            case 4:
                operation="Quotient";
                MixedFraction quotient = fraction1.divideBy(fraction2);
                formatFinalResult(quotient,choice,operation,0);
                break;
            case 5:
                operation="Reduced Form";

                int pick = pickFraction();
                if (pick == 1){
                    MixedFraction lowestTerm = reduceFraction(fraction1);
                    formatFinalResult(lowestTerm,choice,operation,pick);
                }else{
                    MixedFraction lowestTerm = reduceFraction(fraction2);
                    formatFinalResult(lowestTerm,choice,operation,pick);
                }
                break;
            case 6:
                int choose = pickFraction();

                if (choose == 1){
                    fraction1= requestMixedFraction(choose);
                } else{
                    fraction2= requestMixedFraction(choose);
                }
                break;
            case 7:
                break;
        }
    } // end of arithmeticRoutines method

    //TODO: Nash and Kaetlyn check pickFraction method.
    /**
     * Method to let the user pick which fraction to modify between fraction 1 and fraction 2.
     *
     * @return pick Fraction picked by the user
     */
    /*
        Algorithm:
        1. Declare an integer variable pick and initialize it to 0.
        2. Start a while loop with the condition pick > 2 || pick < 1.
        3. Inside the while loop, use JOptionPane.showInputDialog to display a message
           asking the user to select a fraction.
        4. Store the user's input in the pick variable.
        5. Check if pick is greater than 2 or less than 1 using an if statement.
        6 If pick is greater than 2 or less than 1, display an error message using
          JOptionPane.showMessageDialog.
        7 Repeat the loop until the user enters a valid input.
        8 Return the pick variable.
     */
    public static int pickFraction() {
        int pick = 0;

        while (pick > 2 || pick < 1) {
            pick = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html><h1 style='font-family: Calibri; font-size: 18pt;'> Fraction 1: " +
                            fraction1.toString() +
                            "<br> Fraction 2: " + fraction2.toString() + "<br><br>" +
                            "Press 1 to Select Fraction 1 <br> Press 2 to Select Fraction 2",
                    "Choose Fraction",
                    JOptionPane.INFORMATION_MESSAGE));

            if (pick > 2 || pick < 1) {
                JOptionPane.showMessageDialog(null,
                        "<html><h1 style='font-family: Calibri; font-size: 18pt;'>" +
                                "Please pick either 1 or 2 only."
                        , "Choose Fraction",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
        return pick;
    } // end of pickFraction method

    /**
     * Method to format the final results into how it will be displayed on the JOptionPane.
     *
     * @param result result from executing the arithmetic operations
     * @param choice user input choice from the main menu
     * @param operation arithmetic operation performed
     * @param pickFraction Fraction picked by the user
     */
    /*
        Algorithm:
        1. If choice is less than 5, create a DecimalFormat object to format
           the decimal output to two decimal places.
        2. Display a message dialog using JOptionPane.
        3. If choice is equal to 5, check the value of pickFraction and the program does the following:
           - If pickFraction is equal to 1, format the final result of fraction 1.
           - If pickFraction is not equal to 1, format the final result of fraction 2.
     */

    //TODO: ALL Check the formatResult method
    public static void formatFinalResult(MixedFraction result, int choice, String operation, int pickFraction){
        if (choice<5){
            DecimalFormat format = new DecimalFormat("##.00");
            JOptionPane.showMessageDialog(null,
                    "<html><h1 style='font-family: Calibri; font-size: 18pt;'>" +
                            operation + " of " + fraction1.toString() + " and " + fraction2.toString() +" : "+
                            "<html><h6 style='font-family: Calibri; font-size: 18pt; color: green;'>" + result +
                            "<html><h6 style='font-family: Calibri; font-size: 18pt; color: black;'><br><br>" +
                            "Decimal Form: " + "<html><h6 style='font-family: Calibri; font-size: 18pt; color: green;'>"
                            + format.format(result.toDouble()),
                    "Results",
                    JOptionPane.INFORMATION_MESSAGE);
        }else if (choice==5){
            if (pickFraction==1){
                JOptionPane.showMessageDialog(null,
                        "<html><h1 style='font-family: Calibri; font-size: 18pt;'>" +
                                operation + " of " + fraction1.toString() + " : " +
                                "<html><h6 style='font-family: Calibri; font-size: 18pt; color: green;'>" + result,
                        "Results",
                        JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,
                        "<html><h1 style='font-family: Calibri; font-size: 18pt;'>" +
                                operation + " of " + fraction2.toString() + " : " +
                                "<html><h6 style='font-family: Calibri; font-size: 18pt; color: green;'>" + result,
                        "Results",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    } // end of formatFinalResult method

    /**
     * Method to reduce a fraction to the lowest terms.
     *
     * @param fractionToBeReduced fraction that will be reduced to the lowest terms
     * @return fractionToBeReduced
     */
    /*
       Algorithm:
       1. Reduce the original value of the fraction to the lowest terms.
       2. Return the fraction that was reduced.
     */
    public static MixedFraction reduceFraction(MixedFraction fractionToBeReduced) {
        fractionToBeReduced.reduceFraction();
        return fractionToBeReduced;
    } // end of reduce method

    /**
     * Method to display the program closing statement.
     */
    /*
       Algorithm:
       1. Print the program closing statement.
       2. Terminate the program.
     */
    private static void showExit() {
        JOptionPane.showMessageDialog(null,
                "<html><h1 style='font-family: Calibri; font-size: 18pt;'>" +
                        "THANK YOU for using the Program!",
                "Fraction Arithmetic Program",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    } // end of showExit method

    /*
       Algorithm:
       1. Declare "keyboard" as a new scanner for FractionArithmetic class.
     */
    static {
        keyboard = new Scanner(System.in);
    }
} // end of FractionArithmetic class