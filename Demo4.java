import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {

/////////String palindrome //////////////////////
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String name = scan.nextLine();
		String result = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			result = result + name.charAt(i);

		}
		if (name.equals(result)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("!Not Palindrom");
		}

	}

}
