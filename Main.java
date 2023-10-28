import java.util.Scanner;
import Add.Add;
import Derivative.Derivative;
import Mult.Mult;
import Print.Print;
import Roots.Roots;
import Subs.Subs;
import Subtract.Subtract;
import Inputs.Inputs;
import Inputs.SubstituteValue;

public class Main {
    public static void main(String[] args) {
        Add a1 = new Add();
        Subtract sub1 = new Subtract();
        Mult m1 = new Mult();
        Roots r1 = new Roots();
        Derivative d1 = new Derivative();
        Inputs i1 = new Inputs();
        Inputs i2 = new Inputs();
        Inputs i3 = new Inputs();
        SubstituteValue v1 = new SubstituteValue();
        Print p1 = new Print();
        Subs s1 = new Subs();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Polynomial Operations Menu:");
            System.out.println("1. Find roots of quadratic equation");
            System.out.println("2. Perform polynomial addition");

            System.out.println("3. Perform polynomial subtraction");
            System.out.println("4. Perform polynomial multiplication");

            System.out.println("5. Substitute a value for x");
            System.out.println("6. Perform polynomial derivation");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    r1.findAndPrintRoots(i3.enterCoefficients());
                    break;
                case 2:
                    int[] sum = a1.addition(i1.enterCoefficients(), i2.enterCoefficients());
                    p1.printPolynomial(sum);

                    break;
                case 3:
                    int[] sub = sub1.subtraction(i1.enterCoefficients(), i2.enterCoefficients());
                    p1.printPolynomial(sub);

                    break;
                case 4:
                    int[] prod = m1.multiply(i1.enterCoefficients(), i2.enterCoefficients());
                    p1.printPolynomial(prod);
                    break;
                case 5:
                    int x = v1.enterValueForX();
                    int value = s1.evaluatePolynomial(i1.enterCoefficients(), x);
                    System.out.println(value);
                    break;
                case 6:
                    int[] der = d1.printDervivative(i1.enterCoefficients());
                    p1.printPolynomial(der);
                    break;
                case 7:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
