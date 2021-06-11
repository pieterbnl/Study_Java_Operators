package com.pbe;

/** Class to demonstrate the use of Operators in various variations.
 @author Pieter Beernink
 @version 1.0
 @since 1.0
 */

public class Main {

    public static void main(String[] args) {

        // Setting some initial variables
        int a, b, c, d, e, sum1, sum2;
        double f, g, h, i, j;

        // *********************
        // ARITHMETIC OPERATIONS
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

        // Increment and decrement operators
        System.out.println("Increment and decrement operators");
        a = 2; // setting a
        a = a + 1; // adding 1
        System.out.println("a + 1 = " + a);
        a++; // incrementing a with 1 by use of increment operator
        System.out.println("a + 1 again = " + a);
        a--; // decrementing a with 1 by use of decrement operator
        System.out.println("a - 1 = " + a);

        // Combining assignment operators
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

    }
}