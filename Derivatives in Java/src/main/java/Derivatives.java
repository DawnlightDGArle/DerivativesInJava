import java.util.Scanner;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;

class Derivatives {
    public static void main (String [] args) {
        DerivativeStructure x = new DerivativeStructure(1, 3, 0, 1);

        //x --> x^2.
        System.out.println(x.getValue());

        //Linear combination: y = 4x^2 + 2x
        DerivativeStructure x2 = x.pow(2);

        Scanner scan = new Scanner(System.in);
        System.out.println("Input function:");
        String function = scan.nextLine();

        DerivativeStructure y = new DerivativeStructure(4.0, x2, 2.0, x);
        System.out.println("y    = " + y.getValue());
        System.out.println("y'   = " + y.getPartialDerivative(1));
        System.out.println("y''  = " + y.getPartialDerivative(2));
        System.out.println("y''' = " + y.getPartialDerivative(3));
    }
}
