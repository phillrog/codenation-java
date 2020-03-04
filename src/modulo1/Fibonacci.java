package modulo1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
    private static List<BigInteger> principalList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(fibonacci(350));
        System.out.println(isFibonacci(75025));
    }

    // @Desafio("Fibonacci")
    public static List<BigInteger> fibonacci(int numSequence) {
        List<BigInteger> fibonacci = Arrays.asList(BigInteger.ZERO,BigInteger.ONE);
        principalList.add(BigInteger.ZERO);

        fibonacciStorage(0, numSequence, fibonacci);

        return principalList;
    }

    // @Desafio("isFibonacci")
    public static Boolean isFibonacci(int number) {
        return principalList.contains(BigInteger.valueOf(number));
    }

    public static void fibonacciStorage(int counter, int sequence, List<BigInteger> list) {

        if (++counter <= sequence) {
            Integer idx =  counter % 2;
            BigInteger numValue = list.get(idx) ;

            numValue = numValue.add(list.get((counter + 1) % 2));

            list.set(idx, numValue);

            principalList.add(numValue);

            fibonacciStorage(counter, sequence, list);
        }
    }
}
