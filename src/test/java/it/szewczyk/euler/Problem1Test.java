package it.szewczyk.euler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem1Test {

    @Test
    void solution() {
        assertEquals(23, Problem1.solution(10));

        System.out.println(Problem1.solution(1000));
    }
}