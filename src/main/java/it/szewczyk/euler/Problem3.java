package it.szewczyk.euler;

public class Problem3 {

    public static long solution(long number) {
        long maxPrime = 1;
        for (long i = 2; i < Math.sqrt(number) / 2; i++) {
            if (canDevide(number, i) && isPrime(i)) {
                maxPrime = i;
            }
        }

        if (maxPrime == 1) {
            throw new RuntimeException("There is no prime factor!");
        }

        return maxPrime;
    }

    static boolean isPrime(long number) {
        for (long i = 2; i < number / 2; i++) {
            if (canDevide(number, i)) {
                return false;
            }
        }
        return true;
    }

    static boolean canDevide(long number, long factor) {
        return number % factor == 0;
    }
}
