package io.github.bluething.test.tdd.dollar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DollarTest {
    @Test
    public void dollarMultiplyByPositiveValueReturnNewValueMultipliedByInput() {
        Dollar dollar = new Dollar(5);
        Dollar multipliedDollar = dollar.multiplyBy(5);
        Assertions.assertEquals(25, multipliedDollar.getAmount());
    }
}
