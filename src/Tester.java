/**
 * @author Mirco Forcella
 * Tester class for class ArithmeticOperators
 */
public class Tester {
    public static void main(String[] args) {
        ArithmeticOperators operators = new ArithmeticOperators();
        System.out.println(operators.sum(59,979));
        System.out.println(operators.sub(3334,586));
        System.out.println(operators.mul(22,44));
        System.out.printf("%.2f", operators.div(321,13));
    }
}
