package Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by sugan_000 on 2/29/2016.
 */
public class PredicateTest01 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("returnList ->-> "+testPredicate((x) -> true, integerList ));
        System.out.println("even returnList ->-> "+testPredicate((x) -> x % 2 == 0, integerList ));
        System.out.println("odd returnList ->-> "+testPredicate((x) -> x % 2 != 0, integerList ));
    }

    public static List<Integer> testPredicate(Predicate<Integer> predicate, List<Integer> integerList) {
        List<Integer> returnList = new ArrayList<>();
        for(Integer integer : integerList) {
            if(predicate.test(integer)) {
                returnList.add(integer);
            }
        }
        return returnList;
    }

}
