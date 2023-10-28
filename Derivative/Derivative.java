package Derivative;

public class Derivative {
    public int[] printDervivative(int[] a) {
        if (a == null) {
            System.out.println("Input array must not be null.");
        }
        int[] derivative = new int[a.length - 1];

        for (int i = 1; i <= a.length - 1; i++) {
            derivative[i - 1] = a[i] * i;
        }

        return derivative;
    }
}
