package io.github.bluething.test.tdd.dollar;

public class Dollar {
    private final long amount;
    public Dollar(long amount) {
        this.amount = amount;
    }

    public Dollar multiplyBy(int i) {
        return new Dollar(amount * i);
    }

    public long getAmount() {
        return amount;
    }
}
