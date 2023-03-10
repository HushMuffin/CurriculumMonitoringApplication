package edu.slu.prog2;

import javax.swing.*;

/**
 * The NoNumeratorException class is an exception for when the user inputs no numerator
 */
public class NoNumeratorException extends RuntimeException {
    public NoNumeratorException() {
        JOptionPane.showMessageDialog(null,
                "<html><h1 style='font-family: Calibri; font-size: 18pt;'>" +
                        "No Input Detected. Fraction part set to 0/1.",
                "Fraction Arithmetic Program",
                JOptionPane.ERROR_MESSAGE);
    } // end of NoNumeratorException constructor
} // end of NoNumeratorException class