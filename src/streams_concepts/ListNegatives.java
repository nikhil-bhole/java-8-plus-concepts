package streams_concepts;

import java.util.Arrays;
import java.util.List;

public class ListNegatives {
    
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 12, -9, 9, 3, -15, 88);

        List<Integer> negatives = numbers.stream().filter(e -> e < 0).toList();
        System.out.println(negatives);

        List<Integer> _negatives = numbers.stream().filter(e -> Integer.toString(e).contains("-")).toList();
        System.out.println(_negatives);
    }
    
}
