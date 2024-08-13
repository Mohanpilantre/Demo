import java.util.Scanner;

public class Factor {
	//Notes If  ans is only one number if you enter then check once if condition
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number which you want ");
		int number = scan.nextInt();
		for(int i = 1;i<=number ;i++) {
			if(number%i==0) {
				System.out.println(i);
			}
		}
	}
}
