package com.pbe;

import org.w3c.dom.ls.LSOutput;

/** Class to demonstrate the use of Operators in various variations.
 @author Pieter Beernink
 @version 1.0
 @since 1.0
 */

public class Main {

    public static void main(String[] args) {

        // Setting some initial variables
        int a, b, c, d, sum1, sum2;
        boolean a1, b1, c1, d1, e1, f1, g1;
        double f, g, h, i;

        // *********************
        // ARITHMETIC OPERATIONS
        // Used in mathematical expressions, as used in algebra
        // *********************

        // Addition
        System.out.println("Addition");
        a = 1;
        b = 5;
        c = -5;
        d = 1;
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(c + " + " + d + " = " + (c + d));
        System.out.println();

        // Subtraction
        System.out.println("Subtraction");
        a = 1;
        b = 5;
        c = 6;
        d = 10;
        System.out.println(c + " - " + b + " = " + (c - b));
        System.out.println(c + " - " + d + " = " + (c - d));
        System.out.println();

        // Multiplication
        System.out.println("Multiplication");
        a = 3;
        b = 4;
        c = -2;
        d = -2;
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(c + " * " + d + " = " + (c * d));
        System.out.println();

        // Division
        f = 1.1;
        g = 2.2;
        System.out.println("Division");
        System.out.println(a + " / " + b + " = " + (a / b)); // when the division operator is applied to int, there will be no fractional component
        System.out.println(g + " / " + f + " = " + (g / f));
        System.out.println();

        // Modulus; returns the remainder of a division operator
        a = 10;
        b = 3;
        f = 1.1;
        g = 2.2;
        System.out.println("Modulus");
        System.out.println(a + " mod " + b + " = " + (a % b));
        System.out.println(g + " mod " + f + " = " + (g % f));
        System.out.println();

        // Arithmetic compound assignment operators
        System.out.println("Arithmetic compound assignment operators");
        a = 2;
        a = a + 2;
        System.out.println("a + 2 = " + a);

        a = 2; // reset a to 2
        a += 2; // now adding 2 by use of compound assignment
        System.out.println("a + 2 = " + a);

        a = 2; // reset a to 2
        a = a % 2; // standard modulus
        System.out.println("a mod 2 = " + a);

        a = 2; // reset a to 2
        a %= 2; // modulus as compound assignment
        System.out.println("a mod 2 = " + a);
        System.out.println();

        // Increment and decrement operators
        System.out.println("Increment and decrement operators");
        a = 2; // setting a
        a = a + 1; // adding 1
        System.out.println("a + 1 = " + a);
        a++; // incrementing a with 1 by use of increment operator
        System.out.println("a + 1 again = " + a);
        a--; // decrementing a with 1 by use of decrement operator
        System.out.println("a - 1 = " + a);
        System.out.println();

        // Combining assignment operators; note that parentheses raise the precedence of the operations that are inside them
        // This is sometimes needed, but not always. THey can also be used simply to improve readability.
        System.out.println("Combining assignment operators");
        a = 3;
        b = 4;
        c = 10;
        d = 3;

        a += 2; // a = 3 + 2 = 5;
        b *= c; // b = 4 * 10 = 40;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sum1 = (((a * b) / c) % d); // sum1 = 5 * 40 = 200 / 10 = 20 mod 3 = 2
        System.out.println("sum = " + sum1);
        System.out.println();

        // *********************
        // BITWISE OPERATIONS
        // Operates on a bit string, a bit array of a binary numeral at the level of its individual bits
        // *********************

        // t.b.d.


        // *********************
        // RELATIONAL OPERATORS; Determine the relationship that one operand has to the other.
        // *********************




        // *********************
        // LOGICAL OPERATORS
        // Used to determine the logic between variables of values.
        // *********************

        System.out.println("Logical comparison resulting in boolean value");
        a = 2;
        b = 4;
        a1 = a < b;
        System.out.println("a < b = " + a1);
        System.out.println();

        System.out.println("Chain of assignments");
        a = 10;
        b = 20;
        c = 30;
        a = b = c = 50;
        System.out.println("Value a now is " + a);
        System.out.println();

        a1 = true; // assignment
        b1 = false; // assignment
        c1 = a1 & b1; // logical AND
        d1 = a1 | b1; // logical OR
        e1 = a1 ^ b1; // logical XOR (exclusive OR)
        f1 = !a1; // logical unary NOT
        g1 = (a1 & !b1) | (!a1 & b1); // combination of logical AND, OR and NOT

        System.out.println("Various relational comparisons");
        System.out.println("a1 = " + a1);
        System.out.println("b1 = " + b1);
        System.out.println("a1 & b1 = " + c1);
        System.out.println("a1 | b1 = " + d1);
        System.out.println("a1 ^ b1 = " + e1);
        System.out.println("!a1 = " + f1);
        System.out.println("(!a1 & !b1) | (!a1 & b1) = " + g1);

        System.out.println("a1 &= b1 = " + (a1 &= b1)); ; // AND assignment
        System.out.println("a1 != b1 = " + (a1 |= b1)); ; // OR assignment
        System.out.println();

        // Short-circuit logical operator; Java will evaluate right-hand operand when outcome of the expression can be determined by left operand alone.
        System.out.println("Short circuit logical operator");
        a = 5;
        b = 60;
        if (a != 0 && b / a > 10) System.out.println("Right hand operand is not considered as long as a != 0");
        System.out.println();

        // Ternary operator; consists of form "expression1 ? expression2 : expression 3" whereas exp2 gets executed if exp1 is true, and expr3 if not true
        System.out.println("Ternary operator");
        a = 10;
        b = 10;
        String outcome;
        outcome = (a!=b) ? "a is not equal to b" : "a is equal to b";
        System.out.println(outcome);
        System.out.println();
    }
}