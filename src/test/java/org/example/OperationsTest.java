package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationsTest {
    @Test
    void plusNumbers() {
        assertEquals(Operations.plus(2, 2), 4);
    }

    @Test
    void minusNumbers() {
        assertEquals(Operations.minus(2, 2), 0);
    }

    @Test
    void divNumbers() {
        assertEquals(Operations.div(2, 2), 1);
    }

    @Test
    void mulNumbers() {
        assertEquals(Operations.mul(2, 2), 4);
    }
}
