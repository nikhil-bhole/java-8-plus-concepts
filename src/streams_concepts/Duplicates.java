package streams_concepts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Duplicates {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 99, 6, 7, 8, 9, 10, 7);

        List<Integer> duplicates = numbers.stream().distinct().filter(i -> Collections.frequency(numbers, i) > 1).toList();

        System.out.println(duplicates);

    }
}
