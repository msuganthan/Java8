package Lambdas;

/**
 * Created by sugan_000 on 2/28/2016.
 */
public class MathOperationTest {

    interface MathOperation {
        int operation(int a, int b);
    }

    public static void main(String[] args) {

        //Strategy pattern
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        System.out.println(operate(1, 2, addition));
        System.out.println(operate(1, 2, subtraction));
        System.out.println(operate(1, 2, multiplication));
        System.out.println(operate(1, 2, division));
    }

    public static int operate(int a, int b, MathOperation math) {
        return math.operation(a, b);
    }
}
