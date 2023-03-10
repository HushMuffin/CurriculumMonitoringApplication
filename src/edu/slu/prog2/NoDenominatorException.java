package edu.slu.prog2;

import javax.swing.*;

/**
 * The NoDenominatorException class is an exception for when the user inputs no denominator
 */
public class NoDenominatorException extends RuntimeException {
    public NoDenominatorException() {
        JOptionPane.showMessageDialog(null,
                "<html><h1 style='font-family: Calibri; font-size: 18pt;'>" +
                        "No Input Detected. Denominator automatically set to 1.",
                "Fraction Arithmetic Program",
                JOptionPane.ERROR_MESSAGE);
    } // end of NoDenominatorException constructor
} // end of NoDenominatorException class