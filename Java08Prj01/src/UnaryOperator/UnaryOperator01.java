package UnaryOperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * Created by sugan_000 on 3/1/2016.
 */
public class UnaryOperator01 {

    public static void main(String []agrs) {
        UnaryOperator01 unaryOperator01 = new UnaryOperator01();
        List<Integer> integerList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("same value"+unaryOperator01.applyFunction(x -> x, integerList));
        System.out.println("multiplied value"+unaryOperator01.applyFunction(x -> x * 5, integerList));
    }

    public List<Integer> applyFunction(UnaryOperator<Integer> unaryOperator, List<Integer> integerList) {
        List<Integer> returnList = new ArrayList<>();
        integerList.forEach(x -> returnList.add(unaryOperator.apply(x)));
        return returnList;
    }
}
