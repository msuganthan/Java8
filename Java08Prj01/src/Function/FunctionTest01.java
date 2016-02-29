package Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created by sugan_000 on 2/29/2016.
 */
public class FunctionTest01 {

    public static void main(String[] args) {

        FunctionTest01 functionTest01 = new FunctionTest01();
        List<Integer> integerList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("================================================================");
        System.out.println("Double list"+functionTest01.applyFunction(x -> new Double(x), integerList));
        System.out.println("Double list"+functionTest01.applyFunction(x -> new Double(x*5), integerList));
    }

    public  List<Double> applyFunction(Function<Integer, Double> function, List<Integer> list) {
        List<Double> doubleList = new ArrayList<>();
        for(Integer integer : list) {
            doubleList.add(function.apply(integer));
        }
        return doubleList;
    }

}
