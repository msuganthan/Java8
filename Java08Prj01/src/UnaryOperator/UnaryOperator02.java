package UnaryOperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * Created by sugan_000 on 3/1/2016.
 */
public class UnaryOperator02 {

    public static void main(String []agrs) {
        UnaryOperator02 unaryOperator02 = new UnaryOperator02();
        List<Integer> integerList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("=====================================================================");
        System.out.println("same value"+unaryOperator02.applyFunction(x -> x, integerList));
        System.out.println("multiplied value"+unaryOperator02.applyFunction(x -> x * 5, integerList));
        System.out.println("=====================================================================");
        List<Double> doubleList = Arrays.asList(0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
        System.out.println("same value"+unaryOperator02.applyFunction(x -> x, doubleList));
        System.out.println("multiplied value"+unaryOperator02.applyFunction(x -> x * 5, doubleList));

    }

    public <X> List<X> applyFunction(UnaryOperator<X> unaryOperator, List<X> integerList) {
        List<X> returnList = new ArrayList<>();
        integerList.forEach(x -> returnList.add(unaryOperator.apply(x)));
        return returnList;
    }

    public <X> List<X> applyAndThenFunction(UnaryOperator<X> u1, UnaryOperator<X> u2, List<X> integerList) {
        List<X> returnList = new ArrayList<>();
        integerList.forEach(x -> returnList.add(u1.andThen(u2).apply(x)));
        return returnList;
    }

    public <X> List<X> applyComposeFunction(UnaryOperator<X> u1, UnaryOperator<X> u2, List<X> integerList) {
        List<X> returnList = new ArrayList<>();
        integerList.forEach(x -> returnList.add(u1.compose(u2).apply(x)));
        return returnList;
    }
}
