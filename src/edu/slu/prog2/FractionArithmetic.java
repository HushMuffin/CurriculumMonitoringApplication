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
 * General Algorithm: TODO: Katelyn put the general algorithm here after the whole code is finalized and completed.
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
import java.awt.*;
import java.awt.event.*;

public class FractionArithmetic extends JFrame {

    // Declare the objects for FractionArithmeticCalculator.
    /**
     * Holds the first fraction label.
     */
    private JLabel firstL;

    /**
     * Holds the second fraction label.
     */
    private JLabel secondL;

    /**
     * Holds the result label.
     */
    private JLabel resultL;

    /**
     * Holds the first fraction text field.
     */
    private JTextField firstTF;

    /**
     * Holds the second fraction text field.
     */
    private JTextField secondTF;

    /**
     * Holds the result text field.
     */
    private JTextField resultTF;

    /**
     * Holds the addition button.
     */
    private RoundRectangleButton addB;

    /**
     * Holds the subtraction button.
     */
    private RoundRectangleButton subtractB;

    /**
     * Holds the multiplication button.
     */
    private RoundRectangleButton multiplyB;

    /**
     * Holds the division button.
     */
    private RoundRectangleButton divideB;

    /**
     * Holds the reduce button for the first fraction.
     */
    private RoundRectangleButton reduceF;

    /**
     * Holds the reduce button for the second fraction.
     */
    private RoundRectangleButton reduceS;

    /**
     * Holds the clear button.
     */
    private RoundRectangleButton clearB;

    /**
     * Holds the exit button.
     */
    private RoundRectangleButton exitB;

    /**
     * Holds the handler of addition button.
     */
    private AddButtonHandler addHandler;

    /**
     * Holds the handler of subtraction button.
     */
    private SubtractButtonHandler subtractHandler;

    /**
     * Holds the handler of multiplication button.
     */
    private MultiplyButtonHandler multiplyHandler;

    /**
     * Holds the handler of division button.
     */
    private DivideButtonHandler divideHandler;

    /**
     * Holds the handler of reduce button of the first fraction.
     */
    private ReduceFirstButtonHandler reduceFHandler;

    /**
     * Holds the handler of reduce button of the second fraction.
     */
    private ReduceSecondButtonHandler reduceSHandler;

    /**
     * Holds the handler of clear button.
     */
    private ClearButtonHandler clearHandler;

    /**
     * Holds the handler of exit button.
     */
    private ExitButtonHandler ebHandler;

    /**
     * Holds the default width.
     */
    private static int WIDTH = 400;

    /**
     * Holds the height width.
     */
    private static int HEIGHT = 300;
    /**
     * Holds the colors used in the GUI of the program.
     */
    static Color pink = new Color(255, 175, 204);
    static Color peach = new Color(255, 229, 212);
    static Color darkPurple = new Color(105, 79, 93);
    static Color lightBlue = new Color(184, 193, 236);
    static Color navy = new Color(58, 79, 122);
    static Color purple = new Color(205, 180, 219);
    /**
     * Constructor that creates the main window of the fraction arithmetic calculator application.
     * It initializes all the GUI components (labels, text fields, buttons) and sets their
     * properties, event handlers, and layout.
     */
    public FractionArithmetic(){
        //TODO: Kaetlyn do the design for the HEADER
        firstL = new JLabel("Enter the First Fraction: ", SwingConstants.RIGHT);
        firstL.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 13));

        secondL = new JLabel("Enter the Second Fraction: ", SwingConstants.RIGHT);
        secondL.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 13));

        resultL = new JLabel("Result: ", SwingConstants.RIGHT);
        resultL.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 13));

        firstTF = new JTextField(10);
        secondTF = new JTextField(10);
        resultTF = new JTextField(10);
        resultTF.setEnabled(false);

        addB = new RoundRectangleButton("Add");
        buttonDesign(addB);
        addHandler = new AddButtonHandler();
        addB.addActionListener(addHandler);

        subtractB = new RoundRectangleButton("Subtract");
        buttonDesign(subtractB);
        subtractHandler = new SubtractButtonHandler();
        subtractB.addActionListener(subtractHandler);

        multiplyB = new RoundRectangleButton("Multiply");
        buttonDesign(multiplyB);
        multiplyHandler = new MultiplyButtonHandler();
        multiplyB.addActionListener(multiplyHandler);

        divideB = new RoundRectangleButton("Divide");
        buttonDesign(divideB);
        divideHandler = new DivideButtonHandler();
        divideB.addActionListener(divideHandler);

        reduceF = new RoundRectangleButton("Reduce First Fraction");
        buttonDesign(reduceF);
        reduceFHandler = new ReduceFirstButtonHandler();
        reduceF.addActionListener(reduceFHandler);

        reduceS = new RoundRectangleButton("Reduce Second Fraction");
        buttonDesign(reduceS);
        reduceSHandler = new ReduceSecondButtonHandler();
        reduceS.addActionListener(reduceSHandler);


        //TODO: Charles add constructor clear along with the ClearButtonHandler class on this new GUI that was pushed
        // clearB = ;

        //TODO: Charles add constructor exitB along with the ExitButtonHandler class on this new GUI that was pushed
        // exitB = ;

        //TODO: Nash, Marius, and Lourdene design the GUI for better visualization of results

        setTitle("Fraction Arithmetic Calculator");
        Container pane = getContentPane();

        pane.setLayout(new GridLayout(7,2));
        pane.add(firstL);
        pane.add(firstTF);
        pane.add(secondL);
        pane.add(secondTF);
        pane.add(resultL);
        pane.add(resultTF);
        pane.add(addB);
        pane.add(subtractB);
        pane.add(multiplyB);
        pane.add(divideB);
        pane.add(reduceF);
        pane.add(reduceS);
        pane.add(clearB);
        pane.add(exitB);

        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    } // end of FractionArithmeticCalculator constructor

     /**
      * A class that handles the addition of two mixed fractions and displays the result.
      */
     /*
        Algorithm:
        1. Declare and initialize variables for the input string entry, an array of String fdata,
           a MixedFraction object first, and three integers firstWholeNumber, firstNumerator, and
           firstDenominator.
        2. Try to get the input string from the first text field and split it into an array
           of strings using the regular expression /|\s+.
        3. Check the length of the array to determine whether the input represents a whole number,
           a proper fraction, or a mixed fraction. Assign the appropriate values to the firstWholeNumber,
           firstNumerator, and firstDenominator variables.
        4. Create a new MixedFraction object first using the extracted values.
        5. If the input is not a valid fraction (e.g., if a decimal number is entered), show a warning
           message using a JOptionPane and return from the method.
        6. If the denominator of the fraction is zero, show a warning message using a JOptionPane.
        7. Otherwise, reduce the fraction using the reduceFraction method of the MixedFraction class
           and display the result in the result text field using the toString method of theMixedFraction class.
      */
    private class AddButtonHandler implements ActionListener {
        /**
         * Method to handle the action of getting the sum of the two fractions.
         *
         * @param e the event to be processed
         */
        public void actionPerformed(ActionEvent e) {
            String fEntry = "", sEntry="";
            String[] fdata = new String[3];
            String[] sdata = new String[3];
            MixedFraction first = null, second = null, result = null;
            int firstWholeNumber = 0, firstNumerator=0, firstDenominator=0, secondWholeNumber = 0 ,
                    secondNumerator=0, secondDenominator=0;

            try {
                fEntry = firstTF.getText();
                fdata = fEntry.split("/|\\s+");
                if (fdata.length == 1) { // handle whole numbers without a fraction
                    firstWholeNumber = Integer.parseInt(fdata[0]);
                    firstNumerator = 0;
                    firstDenominator = 1;
                } else if (fdata.length == 2) {
                    firstWholeNumber = 0;
                    firstNumerator = Integer.parseInt(fdata[0]);
                    firstDenominator = Integer.parseInt(fdata[1]);
                } else {
                    firstWholeNumber = Integer.parseInt(fdata[0]);
                    firstNumerator = Integer.parseInt(fdata[1]);
                    firstDenominator = Integer.parseInt(fdata[2]);
                }

                first = new MixedFraction(firstWholeNumber, firstNumerator, firstDenominator);

                sEntry = secondTF.getText();
                sdata = sEntry.split("/|\\s+");
                if (sdata.length == 1) { // handle whole numbers without a fraction
                    secondWholeNumber = Integer.parseInt(sdata[0]);
                    secondNumerator = 0;
                    secondDenominator = 1;
                } else if (sdata.length == 2) {
                    secondWholeNumber = 0;
                    secondNumerator = Integer.parseInt(sdata[0]);
                    secondDenominator = Integer.parseInt(sdata[1]);
                } else {
                    secondWholeNumber = Integer.parseInt(sdata[0]);
                    secondNumerator = Integer.parseInt(sdata[1]);
                    secondDenominator = Integer.parseInt(sdata[2]);
                }

                second = new MixedFraction(secondWholeNumber, secondNumerator, secondDenominator);
            } catch ( NumberFormatException x ){
                // Show warning panel if decimal number is entered
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter a " +
                                "valid fraction.",
                        "Warning!",
                        JOptionPane.ERROR_MESSAGE);

                return;
            }

            if (firstDenominator == 0) {
                JOptionPane.showMessageDialog(null,
                        "<html><h1 style='font-family: Calibri; font-size: 18pt;'>" +
                                "Please enter a valid number! Denominator cannot be zero for the first fraction.",
                        "Warning!",
                        JOptionPane.ERROR_MESSAGE);
            } else if (secondDenominator == 0) {
                JOptionPane.showMessageDialog(null,
                        "<html><h1 style='font-family: Calibri; font-size: 18pt;'>" +
                                "Please enter a valid number! Denominator cannot be zero for the second fraction.",
                        "Warning!",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                result = first.add(second);
                showResult(result);
            }
        } // end of actionPerformed method
    }// end of AddButtonHandler class

    /**
     * A class that handles the subtraction of two mixed fractions and displays the results.
     */
    /*
        Algorithm:
        1. Get the input for the first mixed fraction from the user.
        2. Parse the input into the whole number, numerator, and denominator
           parts and create a MixedFraction object with them.
        3. Get the input for the second mixed fraction from the user.
        4. Parse the input into the whole number, numerator, and denominator
           parts and create a MixedFraction object with them.
        5. Check for zero denominators. If either denominator is zero, show a warning message.
        6. Subtract the second mixed fraction from the first and store the result in a new MixedFraction object.
        7. Show the result in the output area using the showResult method.
     */
    private class SubtractButtonHandler implements ActionListener {

        /*
         * Method to handle the action of getting the difference of the two fractions.
         *
         * @param e the event to be processed
         */
        public void actionPerformed(ActionEvent e) { // gets the input and perform subtraction
            String entry = "", secondEntry = "";
            String[] fdata = new String[3];
            String[] sdata = new String[3];
            MixedFraction first = null;
            MixedFraction second = null;
            MixedFraction result = null;

            int firstWholeNumber = 0, firstNumerator = 0, firstDenominator = 0, secondWholeNumber = 0,
                    secondNumerator = 0, secondDenominator = 0;

            try {
                entry = firstTF.getText();
                fdata = entry.split("/|\\s+");
                if (fdata.length == 1) {
                    firstWholeNumber = Integer.parseInt(fdata[0]);
                    firstNumerator = 0;
                    firstDenominator = 1;
                } else if (fdata.length == 2) {
                    firstWholeNumber = 0;
                    firstNumerator = Integer.parseInt(fdata[0]);
                    firstDenominator = Integer.parseInt(fdata[1]);
                } else {
                    firstWholeNumber = Integer.parseInt(fdata[0]);
                    firstNumerator = Integer.parseInt(fdata[1]);
                    firstDenominator = Integer.parseInt(fdata[2]);
                }

                first = new MixedFraction(firstWholeNumber, firstNumerator, firstDenominator);

                secondEntry = secondTF.getText();
                sdata = secondEntry.split("/|\\s+");
                if (sdata.length == 1) {
                    secondWholeNumber = Integer.parseInt(sdata[0]);
                    secondNumerator = 0;
                    secondDenominator = 1;
                } else if (sdata.length == 2) {
                    secondWholeNumber = 0;
                    secondNumerator = Integer.parseInt(sdata[0]);
                    secondDenominator = Integer.parseInt(sdata[1]);
                } else {
                    secondWholeNumber = Integer.parseInt(sdata[0]);
                    secondNumerator = Integer.parseInt(sdata[1]);
                    secondDenominator = Integer.parseInt(sdata[2]);
                }
                second = new MixedFraction(secondWholeNumber, secondNumerator, secondDenominator);
            } catch (NumberFormatException x) {
                // Show warning panel if decimal number is entered
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter a " +
                                "valid fraction.",
                        "Warning!",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (firstDenominator == 0) {
                JOptionPane.showMessageDialog(null,
                        "<html><h1 style='font-family: Calibri; font-size: 18pt;'>" +
                                "Please enter a valid number! Denominator cannot be zero for the first fraction.",
                        "Warning!",
                        JOptionPane.ERROR_MESSAGE);
            } else if (secondDenominator == 0) {
                JOptionPane.showMessageDialog(null,
                        "<html><h1 style='font-family: Calibri; font-size: 18pt;'>" +
                                "Please enter a valid number! Denominator cannot be zero for the second fraction.",
                        "Warning!",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                result = first.subtract(second);
                showResult(result);
            }
        } // end of actionPerformed method
    } // end of SubtractButtonHandler class

    /**
     * A class that handles the multiplication of two mixed fractions and displays the result.
     */
    /*
        Algorithm:
        1. Get the input for the first mixed fraction from the text field.
        2. Parse the input into the whole number, numerator, and denominator
        parts and create a MixedFraction object with them.
        3. Get the input for the second mixed fraction from the text field.
        4. Parse the input into the whole number, numerator, and denominator
        parts and create a MixedFraction object with them.
        5. If either denominator is zero, show a warning message.
        6. Multiply the two mixed fractions using the multiplyBy method of the
        MixedFraction class and store the result in a new MixedFraction object.
        7. Show the result in the output area using the showResult method.
     */
    private class MultiplyButtonHandler implements ActionListener{

        /**
         * Method to handle the action of getting the product of the two fractions.
         *
         * @param e the event to be processed
         */
        public void actionPerformed(ActionEvent e) {// code for getting input and performing multiplication
            String entry = "", secondEntry="";
            String[] fdata = new String[3];
            String[] sdata = new String[3];
            MixedFraction first = null;
            MixedFraction second = null;
            MixedFraction result = null;

            int firstWholeNumber = 0, firstNumerator=0, firstDenominator=0, secondWholeNumber = 0,
                    secondNumerator=0, secondDenominator=0;

            try {
                entry = firstTF.getText();
                fdata = entry.split("/|\\s+");
                if(fdata.length == 1) {
                    firstWholeNumber = Integer.parseInt(fdata[0]);
                    firstNumerator = 0;
                    firstDenominator = 1;
                } else if(fdata.length == 2) {
                    firstWholeNumber = 0;
                    firstNumerator = Integer.parseInt(fdata[0]);
                    firstDenominator = Integer.parseInt(fdata[1]);
                } else {
                    firstWholeNumber = Integer.parseInt(fdata[0]);
                    firstNumerator = Integer.parseInt(fdata[1]);
                    firstDenominator = Integer.parseInt(fdata[2]);
                }

                first = new MixedFraction(firstWholeNumber, firstNumerator, firstDenominator);

                secondEntry = secondTF.getText();
                sdata = secondEntry.split("/|\\s+");
                if(sdata.length == 1) {
                    secondWholeNumber = Integer.parseInt(sdata[0]);
                    secondNumerator = 0;
                    secondDenominator = 1;
                } else if(sdata.length == 2) {
                    secondWholeNumber = 0;
                    secondNumerator = Integer.parseInt(sdata[0]);
                    secondDenominator = Integer.parseInt(sdata[1]);
                } else {
                    secondWholeNumber = Integer.parseInt(sdata[0]);
                    secondNumerator = Integer.parseInt(sdata[1]);
                    secondDenominator = Integer.parseInt(sdata[2]);
                }
                second = new MixedFraction(secondWholeNumber, secondNumerator, secondDenominator);
            } catch ( NumberFormatException x ){
                // Show warning panel if decimal number is entered
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter a " +
                                "valid fraction.",
                        "Warning!",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (firstDenominator == 0) {
                JOptionPane.showMessageDialog(null,
                        "<html><h1 style='font-family: Calibri; font-size: 18pt;'>" +
                                "Please enter a valid number! Denominator cannot be zero for the first fraction.",
                        "Warning!",
                        JOptionPane.ERROR_MESSAGE);
            } else if (secondDenominator == 0) {
                JOptionPane.showMessageDialog(null,
                        "<html><h1 style='font-family: Calibri; font-size: 18pt;'>" +
                                "Please enter a valid number! Denominator cannot be zero for the second fraction.",
                        "Warning!",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                result = first.multiplyBy(second);
                showResult(result);
            }
        } // end of actionPerformed method
    } // end of MultiplyButtonHandler class

    /**
     * Private class that implements the ActionListener interface to handle the action of dividing two fractions.
     */
    /*
        Algorithm:
        1. Initialize variables and objects:
            entry, secondEntry (strings to hold the user input for the two fractions)
            fdata, sdata (arrays of strings to hold the parsed input for the two fractions)
            first, second, result (MixedFraction objects to hold the two fractions
                and their quotient, respectively)
            firstWholeNumber, firstNumerator, firstDenominator, secondWholeNumber,
            secondNumerator, secondDenominator (integers to hold the values of the
                whole number, numerator, and denominator of the two fractions)
        2. Get user input for the two fractions from the text fields firstTF and secondTF.
        3. Parse the input strings using the split method to separate the whole number,
           numerator, and denominator, and store them in the corresponding integer variables.
        4. Create MixedFraction objects for the two fractions using the values
           of the three integers obtained from parsing the input strings.
        5. Check for division by zero errors by checking if either of the two denominators is zero.
           If so, display an error message using JOptionPane.showMessageDialog().
        6. If there are no division by zero errors, divide the first fraction by the second fraction
           using the divideBy() method of the MixedFraction class and store the result in the result variable.
        7. Pass the result variable to the showResult() method to display the quotient in the result text field.
    */
    private class DivideButtonHandler implements ActionListener{

        /**
         * Method to handle the action of getting the quotient of the two fractions.
         *
         * @param e the event to be processed
         */
        public void actionPerformed(ActionEvent e) {
            String entry = "", secondEntry="";
            String[] fdata = new String[3];
            String[] sdata = new String[3];
            MixedFraction first = null;
            MixedFraction second = null;
            MixedFraction result = null;

            int firstWholeNumber = 0, firstNumerator=0, firstDenominator=0, secondWholeNumber = 0,
                    secondNumerator=0, secondDenominator=0;

            try {
                entry = firstTF.getText();
                fdata = entry.split("/|\\s+");
                if(fdata.length == 1) {
                    firstWholeNumber = Integer.parseInt(fdata[0]);
                    firstNumerator = 0;
                    firstDenominator = 1;
                } else if(fdata.length == 2) {
                    firstWholeNumber = 0;
                    firstNumerator = Integer.parseInt(fdata[0]);
                    firstDenominator = Integer.parseInt(fdata[1]);
                } else {
                    firstWholeNumber = Integer.parseInt(fdata[0]);
                    firstNumerator = Integer.parseInt(fdata[1]);
                    firstDenominator = Integer.parseInt(fdata[2]);
                }

                first = new MixedFraction(firstWholeNumber, firstNumerator, firstDenominator);

                secondEntry = secondTF.getText();
                sdata = secondEntry.split("/|\\s+");
                if(sdata.length == 1) {
                    secondWholeNumber = Integer.parseInt(sdata[0]);
                    secondNumerator = 0;
                    secondDenominator = 1;
                } else if(sdata.length == 2) {
                    secondWholeNumber = 0;
                    secondNumerator = Integer.parseInt(sdata[0]);
                    secondDenominator = Integer.parseInt(sdata[1]);
                } else {
                    secondWholeNumber = Integer.parseInt(sdata[0]);
                    secondNumerator = Integer.parseInt(sdata[1]);
                    secondDenominator = Integer.parseInt(sdata[2]);
                }
                second = new MixedFraction(secondWholeNumber, secondNumerator, secondDenominator);
            } catch ( NumberFormatException x ){
                // Show warning panel if decimal number is entered
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter a " +
                                "valid fraction.",
                        "Warning!",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (firstDenominator == 0) {
                JOptionPane.showMessageDialog(null,
                        "<html><h1 style='font-family: Calibri; font-size: 18pt;'>" +
                                "Please enter a valid number! Denominator cannot be zero for the first fraction.",
                        "Warning!",
                        JOptionPane.ERROR_MESSAGE);
            } else if (secondDenominator == 0) {
                JOptionPane.showMessageDialog(null,
                        "<html><h1 style='font-family: Calibri; font-size: 18pt;'>" +
                                "Please enter a valid number! Denominator cannot be zero for the second fraction.",
                        "Warning!",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                result = first.divideBy(second);
                showResult(result);
            }
        } // end of actionPerformed method
    } // end of DivideButtonHandler class

    /**
     * Private class that implements the ActionListener interface. It is responsible for handling
     * the action of reducing the first fraction entered on the graphical user interface (GUI).
     */
    /*
        Algorithm:
        1. Declare and initialize variables for the input string entry, an array of String fdata,
           a MixedFraction object first, and three integers firstWholeNumber, firstNumerator, and
           firstDenominator.
        2. Try to get the input string from the first text field and split it into an array
           of strings using the regular expression /|\s+.
        3. Check the length of the array to determine whether the input represents a whole number,
           a proper fraction, or a mixed fraction. Assign the appropriate values to the firstWholeNumber,
           firstNumerator, and firstDenominator variables.
        4. Create a new MixedFraction object first using the extracted values.
        5. If the input is not a valid fraction (e.g., if a decimal number is entered), show a warning
           message using a JOptionPane and return from the method.
        6. If the denominator of the fraction is zero, show a warning message using a JOptionPane.
        7. Otherwise, reduce the fraction using the reduceFraction method of the MixedFraction class
           and display the result in the result text field using the toString method of the
           MixedFraction class.
     */
    private class ReduceFirstButtonHandler implements ActionListener{

        /**
         * Method to handle the action of reducing the first fraction its lowest terms.
         *
         * @param e the event to be processed
         */
        public void actionPerformed(ActionEvent e) {
            String entry = "";
            String[] fdata = new String[3];
            MixedFraction first = null;
            int firstWholeNumber = 0, firstNumerator=0, firstDenominator=0;

            try {
                entry = firstTF.getText();
                fdata = entry.split("/|\\s+");
                if(fdata.length == 1) {
                    firstWholeNumber = Integer.parseInt(fdata[0]);
                    firstNumerator = 0;
                    firstDenominator = 1;
                } else if(fdata.length == 2) {
                    firstWholeNumber = 0;
                    firstNumerator = Integer.parseInt(fdata[0]);
                    firstDenominator = Integer.parseInt(fdata[1]);
                } else {
                    firstWholeNumber = Integer.parseInt(fdata[0]);
                    firstNumerator = Integer.parseInt(fdata[1]);
                    firstDenominator = Integer.parseInt(fdata[2]);
                }

                first = new MixedFraction(firstWholeNumber, firstNumerator, firstDenominator);
            } catch ( NumberFormatException x ){
                // Show warning panel if decimal number is entered
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter a " + "valid fraction.", "Warning!",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (firstDenominator == 0) {
                JOptionPane.showMessageDialog(null,
                        "<html><h1 style='font-family: Calibri; font-size: 18pt;'>" +
                                "Please enter a valid number! Denominator cannot be zero for the first fraction.",
                        "Warning!",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                first.reduceFraction();
                showResult(first);
            }
        } // end of actionPerformed method
    } // end of ReduceFirstButtonHandler class

    /**
     * Private class that implements the ActionListener interface. It is responsible for handling
     * the action of reducing the second fraction entered on the graphical user interface (GUI).
     */
    /*
        Algorithm:
        1. Declare and initialize variables for the input string entry, an array of String sdata,
           a MixedFraction object second, and three integers secondWholeNumber, secondNumerator, and
           secondDenominator.
        2. Try to get the input string from the second text field and split it into an array
           of strings using the regular expression /|\s+.
        3. Check the length of the array to determine whether the input represents a whole number,
           a proper fraction, or a mixed fraction. Assign the appropriate values to the secondWholeNumber,
           secondNumerator, and secondDenominator variables.
        4. Create a new MixedFraction object second using the extracted values.
        5. If the input is not a valid fraction (e.g., if a decimal number is entered), show a warning
           message using a JOptionPane and return from the method.
        6. If the denominator of the fraction is zero, show a warning message using a JOptionPane.
        7. Otherwise, reduce the fraction using the reduceFraction method of the MixedFraction class
           and display the result in the result text field using the toString method of the
           MixedFraction class.
     */
    private class ReduceSecondButtonHandler implements ActionListener{

        /**
         * Method to handle the action of reducing the second fraction its lowest terms.
         *
         * @param e the event to be processed
         */
        public void actionPerformed(ActionEvent e) {
            String entry = "";
            String[] sdata = new String[3];
            MixedFraction second = null;
            int secondWholeNumber = 0, secondNumerator =0, secondDenominator =0;

            try {
                entry = secondTF.getText();
                sdata = entry.split("/|\\s+");
                if(sdata.length == 1) {
                    secondWholeNumber = Integer.parseInt(sdata[0]);
                    secondNumerator = 0;
                    secondDenominator = 1;
                } else if(sdata.length == 2) {
                    secondWholeNumber = 0;
                    secondNumerator = Integer.parseInt(sdata[0]);
                    secondDenominator = Integer.parseInt(sdata[1]);
                } else {
                    secondWholeNumber = Integer.parseInt(sdata[0]);
                    secondNumerator = Integer.parseInt(sdata[1]);
                    secondDenominator = Integer.parseInt(sdata[2]);
                }

                second = new MixedFraction(secondWholeNumber, secondNumerator, secondDenominator);
            } catch ( NumberFormatException x ){
                // Show warning panel if decimal number is entered
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter a " +
                                "valid fraction.",
                        "Warning!",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (secondDenominator == 0) {
                JOptionPane.showMessageDialog(null,
                        "<html><h1 style='font-family: Calibri; font-size: 18pt;'>" +
                                "Please enter a valid number! Denominator cannot be zero for the second fraction.",
                        "Warning!",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                second.reduceFraction();
                showResult(second);
            }
        } // end of actionPerformed method
    } // end of ReduceSecondButtonHandler class

    //TODO: Charles add codes in this class on this new GUI that was pushed
    /*TODO: Charles put a javadoc comment of the description of the class and a
            multi-line comment that shows the algorithm.
     */
    private class ClearButtonHandler implements ActionListener{

        /**
         * Method to handle the action of resetting the three text fields in the GUI to empty strings.
         *
         * @param e the event to be processed
         */
        /*
            Algorithm:
            1. Set the text of the first text field to an empty string.
            2. Set the text of the second text field to an empty string.
            3. Set the text of the result text field to an empty string.
         */
        public void actionPerformed(ActionEvent e){
            //TODO: Charles add codes here
        } // end of actionPerformed method
    } // end of ClearButtonHandler class

    //TODO: Charles put a javadoc comment of the description of the class
    private class ExitButtonHandler implements ActionListener {

        /**
         * Method to handle the action of closing the program when the user clicks on the "Exit" button.
         *
         * @param e the event to be processed
         */
        /*
            Algorithm:
            1. Call the showExit method.
            2. Terminate the program and close all its windows.
         */
        public void actionPerformed(ActionEvent e){
            showExit();
            System.exit(0);
        } // end of actionPerformed method
    } // end of ExitButtonHandler class

    /**
     Algorithm:
     1. Set the font of the button to "Helvetica" with a bold style and size of 13.
     2. Set the background color of the button to a pink color.
     3. Set the foreground color of the button to a navy color.
     4. Add a mouse listener to the button.
     5. In the mouseEntered method of the mouse listener:
       a. Set the cursor to a hand cursor.
       b. Set the background color of the button to purple to indicate that the button can be clicked.
     6. In the mouseExited method of the mouse listener:
       a. Set the background color of the button back to pink.
       b. Set the foreground color of the button back to navy to indicate that the button is no longer being hovered over.
     7. End of method.
     */
    private static void buttonDesign(RoundRectangleButton button) {
        button.setFont(new Font("Helvetica", Font.BOLD, 13));
        button.setBackground(pink);
        button.setForeground(navy);
        button.addMouseListener(new MouseAdapter() {

            /**
             * Method that changes the cursor to a hand cursor and sets the background
             * color of the button to purple to indicate that the button can be clicked.
             *
             * @param e the event to be processed
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                button.setBackground(purple); // set a new color when mouse hovers over the button
            }

            /**
             * Method that sets the background color of the button back to pink and the
             * foreground color back to navy to indicate that the button is no longer being
             * hovered over.
             *
             * @param e the event to be processed
             */
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                button.setBackground(pink);
                button.setForeground(navy);// set back the original color when the mouse leaves the button
            }
        });
    } // end of buttonDesign method
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
                        "Welcome! This program shows the computation result of the addition, <br> " +
                        "subtraction, multiplication, and division of a fraction. <br><br>" +
                        "You are required to enter the values of two fractions or mixed fractions and <br>" +
                        "buttons are provided from which you can choose to perform arithmetic operations <br>" +
                        "such as add, subtract, multiply and divide the fractions. You can also choose to <br>" +
                        "reduce a specific fraction, clear the input box, and quit from the application program.",
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
    } // end of showIntroduction method

    /**
     * This method is responsible for displaying the result of dividing two mixed fractions
     * */
    /*
        Algorithm:
        1. Convert the MixedFraction object result to a decimal value using the toDouble() method and
           assign the value to decimalResult.
        2. Format decimalResult to 2 decimal places and assign the value to formattedResult using
           the String.format() method.
        3. Check the components of result MixedFraction object using if-else statements:
            If the denominator is equal to 1, format the result as a whole number and
                assign the value to stringResult using the String.format() method.
            Else if the numerator is equal to 0, format result as a whole number and
                assign the value to stringResult using the String.format() method.
            Else if the whole number is equal to 0, format result as a fraction and
                assign the value to stringResult using the String.format() method.
            Else, format result as a mixed fraction and assign the value to stringResult
                using the String.format() method.
        4. Set the text of resultTF text field to stringResult concatenated with " ~ " and
                formattedResult using the setText() method.
    */
    private void showResult(MixedFraction result) {
        double decimalResult = result.toDouble();
        String formattedResult = String.format("%.2f", decimalResult);
        String stringResult;

        if (result.getDenominator() == 1) {
            stringResult = String.format("%d", result.getNumerator() + result.getWhole());
        } else if (result.getNumerator() == 0) {
            stringResult = String.format("%d", result.getWhole());
        } else if (result.getWhole() == 0) {
            stringResult = String.format("%d/%d", result.getNumerator(), result.getDenominator());
        } else {
            stringResult = String.format("%d %d/%d", result.getWhole(), result.getNumerator(), result.getDenominator());
        }

        resultTF.setText(stringResult + " ~ " + formattedResult);
    } // end of showResult method

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
                        "Thank you for using the program!",
                "Fraction Arithmetic Program",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    } // end of showExit method

    /**
     Below is the method that initializes the calculator object and shows the introduction to the user.
     */
    /*
        Algorithm:
        1. Define a public static method named "main" that takes a String array "args" as an argument.
        2. Call the method "showIntroduction" within the "main" method.
        3. Instantiate a new object of the class "FractionArithmetic" and assign it to
           a variable named "calculatorObject".
    */
    public static void main(String[] args){
        showIntroduction();
        FractionArithmetic calculatorObject = new FractionArithmetic();
    } // end of main method
} // end of FractionArithmeticCalculator class
