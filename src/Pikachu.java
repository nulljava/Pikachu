/* David Huang
 * August 24th, 2022
 * Printing a Pikachu, using escape sequences to craft.
 */
public class Pikachu {

	public static void sec(String[] args) {
		System.out.println("\tPikachu welcomes you to the world of Pokemon!");
		System.out.println("\t\t\t\t(\\__/)");
		System.out.println("\t\t\t\t(o^.^)");
		System.out.println("\t\t\t      z(_(\")(\")");
	}
	public static void third(String[] args) {
			int x=15;
			sentence(x, 42);
			
			int y = x - 5;
			sentence(y, x + y);
	}
	public static void sentence(int num1, int num2) {
		System.out.println(num1 + " " + num2);
	}
	public static int m1() {
		return 1;
	}
	public static int m2() {
		int x = m1() + 3;
		return x;
	}
	public static int m3() {
		int x = m2();
		x = x + m1();
		return x;
	}
	public static void main(String[] args) {
		int num = m1();
		num = num + m2();
		num = num + m3();
		System.out.println(num);
	}
}

