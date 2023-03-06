package lambdas;

public class Squares {
    public static void main(String[] args) {
        SquareIt squareIt = n -> n * n ;
        int square = squareIt.square(5);
        System.out.println(square);
    }
}

@FunctionalInterface
interface SquareIt {
    int square(int n);
}
