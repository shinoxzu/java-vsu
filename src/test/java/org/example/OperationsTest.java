package org.example;

import org.junit.jupiter.api.Test;

public class OperationsTest {
    @Test
    void plusNumbers() {
        var operations = new Operations();
        var result = operations.plus(2, 2);

        assert result == 4;
    }

    @Test
    void minusNumbers() {
        var operations = new Operations();
        var result = operations.minus(2, 2);

        assert result == 0;
    }

    @Test
    void divNumbers() {
        var operations = new Operations();
        var result = operations.div(2, 2);

        assert result == 1;
    }

    @Test
    void mulNumbers() {
        var operations = new Operations();
        var result = operations.mul(2, 2);

        assert result == 4;
    }
}
