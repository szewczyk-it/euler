package it.szewczyk.euler;

public class Problem2 {

    public static long solution(long number) {
        long sum = 0;
        long curr = 2;
        long prev = 1;
        long tmp;
        do {
            if (curr % 2 == 0) {
                sum += curr;
            }
            tmp = curr;
            curr = curr + prev;
            prev = tmp;
        } while (curr < number);
        return sum;
    }
}
