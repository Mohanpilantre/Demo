public class FibonicchiSerise {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int c = a + b;
		System.out.println(a);
		System.out.println(b);
		while (c < 60) {
			System.out.println(c);
			a = b;
			b = c;
			c = a + b;
		}
	}
}
