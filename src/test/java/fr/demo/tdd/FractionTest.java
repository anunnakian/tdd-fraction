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

    @Test
    void test_add_zero() {
        Fraction fraction = Fraction.of(3, 1);

        Fraction result = fraction.add(Fraction.of(0, 5));

        Assertions.assertEquals(3, result.getNumerator());
        Assertions.assertEquals(1, result.getDenominator());
    }

    @Test
    void test_add_fraction_different_divisor() {
        Fraction fraction = Fraction.of(3, 1);

        Fraction result = fraction.add(Fraction.of(3, 2));

        Assertions.assertEquals(9, result.getNumerator());
        Assertions.assertEquals(2, result.getDenominator());
    }

    @Test
    void test_add_fraction_common_gcd() {
        Fraction fraction = Fraction.of(6, 4);

        Fraction result = fraction.add(Fraction.of(12, 16));

        Assertions.assertEquals(9, result.getNumerator());
        Assertions.assertEquals(4, result.getDenominator());
    }
}