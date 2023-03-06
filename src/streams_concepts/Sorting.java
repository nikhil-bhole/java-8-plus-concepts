package streams_concepts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Sorting {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 12, -9, 9, 9, 3, -15, 88,5);

        //Collections.sort(numbers);

        //System.out.println(numbers);

        numbers.stream().sorted().forEach(System.out::println);

    }

}
