package it.szewczyk.euler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void solution() {
        assertEquals(29, Problem3.solution(13195));

        System.out.println(Problem3.solution(600851475143L));
    }

    @Test
    void isPrime() {
        assertTrue(Problem3.isPrime(29));
        assertFalse(Problem3.isPrime(9));
    }

    @Test
    void canDevide() {
        assertTrue(Problem3.canDevide(4, 2));
        assertFalse(Problem3.canDevide(3, 2));
    }
}