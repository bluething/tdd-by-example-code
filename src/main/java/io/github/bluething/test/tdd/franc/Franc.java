package io.github.bluething.test.tdd.franc;

public class Franc {
    private final long amount;
    public Franc(long amount) {
        this.amount = amount;
    }

    public Franc multiplyBy(int i) {
        return new Franc(amount * i);
    }

    @Override
    public boolean equals(Object obj) {
        long amount = ((Franc)obj).amount;
        return this.amount == amount;
    }
}
