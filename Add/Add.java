package Add;

public class Add {
    public int[] addition(int[] a, int[] b) {
        if (a == null || b == null) {
            System.out.println("Input arrays must not be null.");
        }
        int[] sum = new int[Math.max(a.length, b.length)];
        for (int i = 0; i < a.length; i++) {
            sum[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            sum[i] += b[i];
        }
        return sum;
    }
}