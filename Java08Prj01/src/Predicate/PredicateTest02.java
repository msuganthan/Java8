package Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by sugan_000 on 2/29/2016.
 */
public class PredicateTest02 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<String> stringList = Arrays.asList("aa", "bb", "cc", "dd");
        List<Object> objectList = Arrays.asList(new String("aa"), new StringBuffer("bb"));
        System.out.println("===========================================================");
        System.out.println("integerList ->-> "+testPredicate((x) -> true, integerList ));
        System.out.println("even integerList ->-> "+testPredicate((x) -> x % 2 == 0, integerList ));
        System.out.println("odd integerList ->-> "+testPredicate((x) -> x % 2 != 0, integerList ));
        System.out.println("===========================================================");
        System.out.println("stringList ->-> "+testPredicate((x) -> true, stringList ));
        System.out.println("stringList ->-> "+testPredicate((x) -> x.contains("aa"), stringList ));
        System.out.println("===========================================================");
        System.out.println("objectList ->-> "+testPredicate((x) -> true, objectList ));
        System.out.println("objectList ->-> "+testPredicate((x) -> x instanceof StringBuffer, objectList ));
        System.out.println("===========================================================");
        System.out.println("negate integerList ->-> "+testPredicateNegate((x) -> true, integerList ));
        System.out.println("negate even integerList ->-> "+testPredicateNegate((x) -> x % 2 == 0, integerList ));
        System.out.println("negate odd integerList ->-> "+testPredicateNegate((x) -> x % 2 != 0, integerList ));
        System.out.println("===========================================================");
        System.out.println("or and integerList ->-> "+testPredicateOrAnd((x) -> x % 2 == 0, (x) -> x % 2 != 0 , integerList ));

    }

    public static <T> List<T> testPredicate(Predicate<T> predicate, List<T> list) {
        List<T> returnList = new ArrayList<>();
        for(T integer : list) {
            if(predicate.test(integer)) {
                returnList.add(integer);
            }
        }
        return returnList;
    }

    public static <T> List<T> testPredicateNegate(Predicate<T> predicate, List<T> list) {
        List<T> returnList = new ArrayList<>();
        for(T integer : list) {
            if(predicate.negate().test(integer)) {
                returnList.add(integer);
            }
        }
        return returnList;
    }

    public static <T> List<T> testPredicateOrAnd(Predicate<T> p1, Predicate<T> p2, List<T> list) {
        List<T> returnList = new ArrayList<>();
        for(T integer : list) {
            if(p1.or(p2).test(integer)) { //if(p1.and(p2).test(integer)) {
                returnList.add(integer);
            }
        }
        return returnList;
    }


}
