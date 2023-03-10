package edu.slu.prog2;

import javax.swing.*;

/**
 * The NoWholeNumberException class <br>
 * Exception for when the user doesn't input a whole number
 */
public class NoWholeNumberException extends RuntimeException{
    public NoWholeNumberException() {
        JOptionPane.showMessageDialog(null,
                "<html><h1 style='font-family: Calibri; font-size: 18pt;'>" +
                        "No Input Detected. Whole number part automatically set to 0.",
                "Fraction Arithmetic Program",
                JOptionPane.ERROR_MESSAGE);
    } // end of NoWholeNumberException constructor
} // end of NoWholeNumberException class