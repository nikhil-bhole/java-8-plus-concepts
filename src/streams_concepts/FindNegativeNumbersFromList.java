package streams_concepts;

import java.util.Arrays;
import java.util.List;

public class FindNegativeNumbersFromList {

    static List<Integer> findNegatives(List<Integer> numbers) {
        return numbers.stream().filter(e -> e < 0).toList();
    }

    static List<Integer> findNegativesWithString(List<Integer> numbers) {
        return numbers.stream().filter(e -> Integer.toString(e).contains("-")).toList();
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, -9, 9, 3, -15, 88);
        System.out.println(findNegatives(numbers));
        System.out.println(findNegativesWithString(numbers));
    }
}
