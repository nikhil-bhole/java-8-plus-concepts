package streams_concepts;

import java.util.Arrays;
import java.util.List;

public class SumAll {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, -9, 9, 9, 3, -15, 88,5);

        int sum = numbers.stream().reduce(0,Integer::sum);

        System.out.println(sum);

        Integer _sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(_sum);
    }
}
