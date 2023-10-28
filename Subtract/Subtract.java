package Subtract;

public class Subtract {
    public int[] subtraction(int[] a, int[] b) {
        if (a == null || b == null) {
            System.out.println("Input arrays must not be null.");
        }
        int[] diff = new int[Math.max(a.length, b.length)];
        for (int i = 0; i < a.length; i++) {
            diff[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            diff[i] -= b[i];
        }

        return diff;
    }
}