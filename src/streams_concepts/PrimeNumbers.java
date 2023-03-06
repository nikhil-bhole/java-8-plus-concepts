package streams_concepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> _prime = numbers.stream().filter(PrimeNumbers::isPrime).toList();
        System.out.println(_prime);
    }

    static boolean isPrime(int n) {
        return IntStream.range(2,n).noneMatch(i -> n % i == 0);
    }
}
