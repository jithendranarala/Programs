package HashMapPrac1;

import java.util.HashMap;

public class HashMapPrac1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		System.out.println(hm.size());
		hm.put(1, "Jithendra");
		hm.put(1, "Narala");
		System.out.println(hm.size());
		hm.put(1, "Jithendra");
		hm.put(2, "Narala");
		System.out.println(hm.size());
		System.out.println(hm.values());
		System.out.println(hm.keySet());
		System.out.println(hm.entrySet());

	}

}
