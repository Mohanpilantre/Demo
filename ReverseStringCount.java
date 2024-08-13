import java.util.Scanner;

public class ReverseStringCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		for (int i = name.length() - 1; i >= 0; i--) {
			char ch = name.charAt(i);
		}
		System.out.print(name.length());
	}

}
