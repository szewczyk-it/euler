package it.szewczyk.euler;

public class Problem1 {

    public static long solution(long number) {

        long sum = 0;
        for (long i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
