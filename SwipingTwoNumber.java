
public class SwipingTwoNumber {

	public static void main(String[] args) {

		int a = 99;
		int b = 88;
		System.out.println(a + " a is " + b + " b is");
		///////// Without using 3rd variable //////////////
//		a=a+b; //187
//		b=a-b; //187-88 = 99
//		a=a-b; // 187-99 = 88
//		System.out.println(a + " a is " + b + " b is");
		//////////////////////////////////////////////////////////////
		// With Using 3rd Variable

		int c = a + b;
		a = c - a;
		b = c - b;
		System.out.println(a + " a is " + b + " b is");

	}

}
