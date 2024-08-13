import java.util.Scanner;

public class Multithreading extends Thread {

	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number ");
		int number = scan.nextInt();
		for (int i = 1; i <= 10; i++) {
			int result = number * i;
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(number + " X " + i + " = " + result);
		}
	}

	public static void main(String[] args) {
		Multithreading multithreading = new Multithreading();
		multithreading.start();

	}
}
