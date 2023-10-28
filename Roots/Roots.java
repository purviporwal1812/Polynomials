package Roots;

public class Roots {

    public void findAndPrintRoots(int[] coefficients) {
        if (coefficients == null) {
            System.out.println("Input array must not be null.");
        }
        if (coefficients.length != 3) {
            System.out.println("This is not a quadratic equation. It should have three coefficients.");
            return;
        }

        int a = coefficients[0];
        int b = coefficients[1];
        int c = coefficients[2];

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Two real roots: Root 1 = " + root1 + ", Root 2 = " + root2);
        } else if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("One real root: Root = " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            System.out
                    .println("Complex roots: Root 1 = " + realPart + " + i" + imaginaryPart + " , Root 2 = " + realPart
                            + " - i" + imaginaryPart);
        }
    }
}
