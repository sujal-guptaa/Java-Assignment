package Stream_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class filter_primeNumber {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 5, 2, 1, 9, 16));

        List<Integer> primes = numbers.stream()
                .filter(n -> isPrime(n))
                .toList();

        System.out.println("Prime Numbers: " + primes);
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}