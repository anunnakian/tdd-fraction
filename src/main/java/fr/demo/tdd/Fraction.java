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

    private Fraction normalize(int factor) {
        return Fraction.of(this.numerator * factor, this.denominator * factor);
    }

    private Fraction simplify() {
        var divisor = gcd(this.numerator, this.denominator);
        return Fraction.of(this.numerator / divisor, this.denominator / divisor);
    }

    public Fraction add(Fraction fraction) {
        Fraction result;
        if (haveSameDenominator(fraction)) {
            result = Fraction.of(
                    numerator + fraction.numerator,
                    denominator);
            return result.simplify();
        } else {
            Fraction a = this.normalize(fraction.getDenominator());
            Fraction b = fraction.normalize(this.denominator);
            return a.add(b);
        }
    }

    private boolean haveSameDenominator(Fraction fraction) {
        return fraction.denominator == this.denominator;
    }
}
