package Print;

public class Print {
    public void printPolynomial(int[] ans) {
        for (int i = ans.length - 1; i >= 0; i--) {
            System.out.print(ans[i]);
            if (i > 0) {
                System.out.print("x^" + i);
            }
            if (i > 0) {
                System.out.print(" + ");
            }
        }
        System.out.println("\n");

    }
}
