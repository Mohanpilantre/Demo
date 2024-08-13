import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Demo3 {

	//Map scynchronize 
	public static void main(String[] args) {
		
		try {
			Map<Integer,String> map = new HashMap<Integer,String>();
			map.put(1, "Mohan");
			map.put(2, "Ram");
			map.put(3, "Suyog");
			System.out.println(map);
			
			Map<Integer, String> sMap = Collections.synchronizedMap(map);
			System.out.println(sMap);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
