package Chapter3_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIteration {

	public static void main(String[] args) {
		HashMap<Integer,String> map;
		map = new HashMap<Integer,String>();
		
		map.put(1, "Jithendra");
		map.put(2, "Reddy");
		map.put(3, "Narala");
		
		System.out.println(map.size());
		System.out.println("While loop");
		
		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry me = itr.next();
			System.out.println("Key is : " + me.getKey() + " Value is :  " + me.getValue());
		}
		System.out.println("For loop");
		for (Map.Entry me2 : map.entrySet()) {
			System.out.println("Key is : " + me2.getKey() + " Value is :  " + me2.getValue());
		}
		
		
	}

}
