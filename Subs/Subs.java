package Subs;

public class Subs {
    public int evaluatePolynomial(int[] coefficients, int x) {
        if (coefficients == null) {
            System.out.println("Input array must not be null.");
        }
        int result = 0;
        int power = 1;
        for (int coefficient : coefficients) {
            result += coefficient * power;
            power *= x;
        }
        return result;
    }
}
