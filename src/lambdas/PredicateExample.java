package lambdas;

import java.util.function.Predicate;

public class PredicateExample {

    //Predicate is a functional interface
    //Used to implement conditional checks
    //present in java.util.function package
    //contains 1 abstract method "test()"

    public static void main(String[] args) {
        Predicate<Integer> isLessThan = i -> (i < 18);

        System.out.println(isLessThan.test(89)); //false


    }
}
