package fr.demo.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FractionTest {

    @Test
    void test_add_fraction_same_denominator() {
        Fraction fraction = Fraction.of(3, 1);

        Fraction result = fraction.add(Fraction.of(4, 1));

        Assertions.assertEquals(7, result.getNumerator());
        Assertions.assertEquals(1, result.getDenominator());
    }
}