package it.szewczyk.euler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem2Test {

    @Test
    void solution() {
        assertEquals(10, Problem2.solution(10));
        assertEquals(44, Problem2.solution(100));

        System.out.println(Problem2.solution(4000000));
    }
}