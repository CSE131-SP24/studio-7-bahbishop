package studio7;

public class Die {
private int n;

public Die(int initN) {
	n = initN;
}
public int roll() {
	return (int)(Math.random()* n) + 1;
}

public static void main(String[] args) {
	Die d1 = new Die(6);
	for (int i = 6; i > 0; i--) {
		System.out.println(d1.roll());
	}
}
}
