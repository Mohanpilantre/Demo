import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number wich you want :");
		int number = scan.nextInt();
		int temp = number;
		int result = 0;
		while (number > 0) {
			int last = number % 10;
			number = number / 10;
			result = (result * 10) + last;

		}
		System.out.println("Reverse Number is :" + result);
	}

}
