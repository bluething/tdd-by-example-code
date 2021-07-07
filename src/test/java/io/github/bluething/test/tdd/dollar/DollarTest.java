package io.github.bluething.test.tdd.dollar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DollarTest {
    @Test
    public void dollarMultiplyByPositiveValueReturnNewValueMultipliedByInput() {
        Dollar dollar = new Dollar(5);
        Assertions.assertEquals(new Dollar(25), dollar.multiplyBy(5));
    }

    @Test
    public void dollarMultiplyByPositiveValueTheOldValueDoesntChanged() {
        Dollar dollar = new Dollar(5);
        Dollar multipledDollar = dollar.multiplyBy(5);
        Assertions.assertEquals(new Dollar(5), dollar);
    }

    @Test
    public void dollarEqualsGivenAnotherDollarWithSameValueMustReturnTrue() {
        Dollar dollar = new Dollar(5);
        Dollar otherDollar = new Dollar(5);
        Assertions.assertTrue(dollar.equals(otherDollar));
        Dollar thirdDollar = new Dollar(6);
        Assertions.assertFalse(dollar.equals(thirdDollar));
    }
}
