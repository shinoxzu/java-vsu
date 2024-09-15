package org.example;

public class Operations implements BaseOperations {

    @Override
    public int plus(int n1, int n2) {
        return n1 + n2;
    }

    @Override
    public int minus(int n1, int n2) {
        return n1 - n2;
    }

    @Override
    public int mul(int n1, int n2) {
        return n1 * n2;
    }

    @Override
    public int div(int n1, int n2) {
        return n1 / n2;
    }
}
