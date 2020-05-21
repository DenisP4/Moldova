package chisinau;

import java.util.HashMap;
import java.util.Map.Entry;

public class cahul {
	public static void main(String[] args) {
		
		System.out.println("Hello");
		System.out.println("Hi");
		//dorina

		System.out.println("mii somn");
		
		// nou
		System.out.println(" Viorica ..");

		System.out.println("Buna Seara ! ");
		

		// Please review this  and add the iterator
		HashMap<String, Boolean> map = new HashMap<>();

		map.put("Roses", true);
		map.put("Tulips", true);
		map.put("Peonies", true);
		map.put("Iris", false);
		map.put(null, null);
		map.put(null, false);

		System.out.println(map.entrySet()); // all keys and values
		System.out.println(map.values());
		System.out.println(map.keySet());// keys
		System.out.println(map.size()); // 4
		System.out.println();

		for (Entry<String, Boolean> bouquet : map.entrySet()) {
			System.out.println(bouquet.getKey() + ": " + bouquet.getValue());
			
			System.out.println("Good job Viorica");

		}
	}

}
