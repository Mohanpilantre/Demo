public class Demo2 {

	public static void main(String[] args) {
		
		String name ="Mohan pilantre";
		int count =0;
		for(int i=0;i<name.length();i++) {
			char ch =name.charAt(i);
			if(ch >= 97 && ch <= 122 || ch >= 65 && ch <= 90) {
				count++;
			}
		}
		System.out.println(count);
	}
}
