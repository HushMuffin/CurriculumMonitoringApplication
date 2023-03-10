package edu.slu.prog2;

/**
 * Exception object in case a Fraction object's denominator is set to zero.
 */
class ZeroDenominatorException extends RuntimeException {
    ZeroDenominatorException() {
        super("Error: You can't define a fraction whose denominator is zero!");
    }
}
