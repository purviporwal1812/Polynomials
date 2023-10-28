package Mult;

public class Mult {
    public int[] multiply(int a[], int b[]) {
        if (a == null || b == null) {
            System.out.println("Input arrays must not be null.");
        }
        int[] prod = new int[(a.length + b.length) - 1];
        for (int i = 0; i < a.length + b.length - 1; i++) {
            prod[i] = 0;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                prod[i + j] += a[i] * b[j];
            }
        }

        return prod;
    }
}
