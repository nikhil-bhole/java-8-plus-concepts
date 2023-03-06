package streams_concepts;

import java.util.Arrays;
import java.util.List;

public class MinMax {
    
  public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 12, -9, 515, 9, 3, -15, 88,-515);

        Integer max = numbers.stream().max(Integer::compare).get();
        System.out.println(max);

        Integer min = numbers.stream().min(Integer::compare).get();
        System.out.println(min);
    }
}
