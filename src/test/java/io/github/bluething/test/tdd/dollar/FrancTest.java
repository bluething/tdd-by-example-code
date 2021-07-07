package io.github.bluething.test.tdd.dollar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FrancTest {
    @Test
    public void francMultiplyByPositiveValueReturnNewValueMultipliedByInput() {
        Franc franc = new Franc(5);
        Assertions.assertEquals(new Franc(25), franc.multiplyBy(5));
    }
}
