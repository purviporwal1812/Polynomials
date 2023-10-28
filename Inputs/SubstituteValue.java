package Inputs;

import java.util.Scanner;

public class SubstituteValue {
    public int enterValueForX() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for x: ");
        return sc.nextInt();
    }
}
