public class NumberSeriseProblems {
	public static void main(String[] args) {

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("@");
//			}
//			System.out.println();
//
//		}
//		/////////2 4 8 16 32.....n 
//		int start = 2;
//		for (int i = 0; i <= 10; i++) {
//			System.out.println(start); //2  4  8  16 
//			start = start *2; //2*2 = 4  4*2 =8 8*2 = 16
//		}

		// 3, 6, 9, 12,....n
//		int a=0;
//		for(int i=1; i<=10;i++) {
//			a=3*i;
//			System.out.println(a);
//		}
		//// 5, 10, 15, 20, ....n
//		int c=0;
//		for(int i=1 ;i<=10;i++) {
//			c=5*i;
//			System.out.println(c);
//			
//		}
		// 1, 1, 2, 3, 5 , 8 ....n
//		int a = 1;
//		int b = 1;
//		System.out.println(a);
//		System.out.println(b);
//		int c = a + b;
//		while (c < 50) {
//			System.out.println(c);
//			a = b;
//			b = c;
//			c = a + b;
//		}
		// : 7, 14, 21, 28 ....n
//		int a=0;
//		for(int i=1; i<=10;i++) {
//			a=7*i;
//			System.out.println(a);
//		}

		// : 0, 2, 4, 6, ....n
//		for(int i=0;i<=10;i=i+2) {
//			System.out.println(i);
//		}

		// 4, 9, 16, 25, ....n
//		int a = 0;
//		for (int i = 2; i <= 10; i++) {
//			a = i * i;
//			System.out.println(a);
//		}

		// 2, 3, 5, 7, 11, _
//		int a = 2;
//		int b = 3;
//		System.out.println(a);
//		System.out.println(b);
//		int c = (a + b);
//		while (c < 50) {
//			System.out.println(c);
//			a = b;
//			b = c;
//			c = (a + b) - 1;
//		}

		// 1, 4, 9, 16,
//		for (int i = 1; i <= 10; i++) {
//			int a = i * i;
//			System.out.println(a);
//		}

		/////
//		2,4,8,16.......n
//		int result =2;
//		for(int i=0;i<=20;i++) {
//			System.out.println(result);
//			 result = result*2;
//		}

		// prime number !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//		int temp = 0;
//		for(int i=1; i<=50; i++) {
//			for(int j=2; j<=i-1; j++) {
//				if (i%j == 0) {
//					temp = temp + 1;
//				}
//			}
//			if (temp == 0){
//				System.out.print(" " + i);
//			}
//			else {
//				temp = 0;
//			}
//		}

		// 2,4,6,8.....
//		for(int i=2;i<=50;i=i+2) {
//			System.out.println(i);
//		}

		// 5,10,20,40......
//		for(int i=5;i<=50;i=i*2) {
//			System.out.println(i);
//		}

		// 1,4,9,16,25.......
//		for(int i=1;i<=10;i++) {
//			int number=i*i;
//			System.out.println(number);
//		}

		// 2,3,5,7,11....
//		int temp = 0;
//		for (int i = 2; i <= 50; i++) {
//			for (int j = 2; j < i - 1; j++) {
//				if (i % j == 0) {
//					temp = temp + i;
//				}
//			}
//			if (temp == 0) {
//				System.out.println(i);
//			} else {
//				temp = 0;
//			}
//		}

		//10,7,4,1
//		for(int i=10;i>=0;i=i-3) {
//			System.out.println(i);
//		}
		
		//2,6,12,20,30,42
//		int di = 4;
//		int term =2;
//		System.out.print(" "+term);
//		for(int i=1;i<10;i++) {
//			term = term+di;
//			
//			System.out.print(" "+term);
//		 di =di+2;
//		}
		//5, 15, 35, 65....
//		int di =10;
//		int tem = 5;
//		System.out.print(" "+tem);
//		for(int i=1 ;i<=10;i++) {
//			tem = tem+di;
//			System.out.print(" "+tem);
//			di =di+10;
//		}
		// 3 9 27 81 243...
//		for(int i=3;i<500;i=i*3) {
//			System.out.print(" "+i);
//		}
	}
}
