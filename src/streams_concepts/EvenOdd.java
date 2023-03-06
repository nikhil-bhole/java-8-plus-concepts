package streams_concepts;

import java.util.Arrays;
import java.util.List;

public class EvenOdd {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> even = numbers.stream().filter(e -> e % 2 == 0).toList();

        System.out.println("Even: " + even);

        List<Integer> odd = numbers.stream().filter(e -> e % 2 != 0).toList();
        System.out.println("Odd: " + odd);
    }
}
