package Inputs;

import java.util.Scanner;

public class Inputs {

    public int[] enterCoefficients() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coefficients for the polynomial:");
        System.out.print("Enter the degree of the polynomial: ");
        int degree = sc.nextInt();
        int[] coefficients = new int[degree + 1];

        for (int i = 0; i <= degree; i++) {
            System.out.print("Enter the coefficient of x^" + i + ": ");
            coefficients[i] = sc.nextInt();
        }
        return coefficients;
    }
}
