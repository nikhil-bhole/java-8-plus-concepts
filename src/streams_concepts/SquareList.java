package streams_concepts;

import java.util.Arrays;
import java.util.List;

public class SquareList {
    
  public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, -9, 9, 3, -15, 88);

        List<Integer> squares = numbers.stream().map(e -> e * e).toList();
        System.out.println(squares);
  }
}
