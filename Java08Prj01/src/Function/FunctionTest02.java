package Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created by sugan_000 on 2/29/2016.
 */
public class FunctionTest02 {

    public static void main(String[] args) {

        FunctionTest02 functionTest01 = new FunctionTest02();
        List<Integer> integerList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("================================================================");
        System.out.println("Double list"+functionTest01.applyFunction(x -> new Double(x), integerList));
        System.out.println("Double list"+functionTest01.applyFunction(x -> new Double(x*5), integerList));
        System.out.println("Double And Then"+functionTest01.applyAndThenFunction(x -> new Double(x) + new Double(x),
                                                                x -> new Double(x) * new Double(x), integerList));
        System.out.println("Double Compose"+functionTest01.applyComposeFunction(x -> new Double(x) + new Double(x),
                x -> new Double(x) * new Double(x), integerList));

        System.out.println("================================================================");
        System.out.println("Double list"+functionTest01.applyFunction(x -> new Float(x), integerList));
        System.out.println("Double list"+functionTest01.applyFunction(x -> new Float(x*5), integerList));
        System.out.println("Float And Then"+functionTest01.applyAndThenFunction(x -> new Float(x) + new Float(x),
                x -> new Float(x) * new Float(x), integerList));
        System.out.println("Float Compose"+functionTest01.applyComposeFunction(x -> new Float(x) + new Float(x),
                x -> new Float(x) * new Float(x), integerList));

    }

    public <X,Y>  List<Y> applyFunction(Function<X, Y> function, List<X> list) {
        List<Y> returnList = new ArrayList<>();
        for(X x : list) {
            returnList.add(function.apply(x));
        }
        return returnList;
    }

    public <X,Y>  List<Y> applyAndThenFunction(Function<X, Y> f1, Function<Y, Y> f2, List<X> list) {
        List<Y> returnList = new ArrayList<>();
        for(X x : list) {
            returnList.add(f1.andThen(f2).apply(x));
        }
        return returnList;
    }

    public <X,Y>  List<Y> applyComposeFunction(Function<X, Y> f1, Function<Y, Y> f2, List<X> list) {
        List<Y> returnList = new ArrayList<>();
        for(X x : list) {
            returnList.add(f2.compose(f1).apply(x));
        }
        return returnList;
    }

}
