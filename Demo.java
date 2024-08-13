import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

//		String name ="Java Developer";
//		int count =0;
//		for(int i=0;i<name.length();i++) {//0 1 2 3 4 5 
//			char ch = name.charAt(i);//java 
//			if(ch==' ') {//j==' ' =f a==' '=f v==' ' =f a==' '=f == = t
//				count++; // 1
//				
//			}
//		}
//		System.out.println(count);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String name = scan.nextLine();
		int numberCount = 0;
		int charater = 0;
		int vowel = 0;
		int space = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8'
					|| ch == '9' || ch == '0') {
				numberCount++;
			}
			if (ch >= 97 && ch <= 122 || ch >= 65 && ch <= 90) {
				charater++;
			}
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				vowel++;
			}
			if (ch == ' ') {
				space++;
			}
		}
		System.out.println("Number count " + numberCount);
		System.out.println("Charactor count" + charater);
		System.out.println("vowel is " + vowel);
		System.out.println("space  is " + space);
	}
}
