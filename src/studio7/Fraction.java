package studio7;

public class Fraction {
private int numerator;
private int denominator;

public Fraction(int initNumerator, int initDenominator) {
	numerator = initNumerator;
	denominator = initDenominator;
}
public Fraction addedTo(Fraction frac) {
	int commonDenom = this.denominator * frac.denominator;
	int commonNum = (this.numerator * frac.denominator) + (frac.numerator * this.denominator);
	Fraction sum = new Fraction(commonNum,commonDenom);
	return sum;
}
public Fraction productTo(Fraction frac) {
	return new Fraction((this.numerator * frac.numerator),(this.denominator * frac.denominator));
	
}

}
