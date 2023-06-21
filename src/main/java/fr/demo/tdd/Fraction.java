package fr.demo.tdd;

public class Fraction {
    private final int numerator;
    private final int denominator;

    private Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static Fraction of(int numerator, int denominator) {
        return new Fraction(numerator, denominator);
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction add(Fraction fraction) {
        var denominator = 0;
        if (fraction.denominator == this.denominator) {
            denominator = this.denominator;
        }
        return Fraction.of(
                numerator + fraction.numerator,
                denominator);
    }
}
