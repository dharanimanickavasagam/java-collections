package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClass {
	public static void main(String[] args) {

		// Map is an interface of collection classes
		// main component of java collection

		// HashMap stores the keys and values in some order
		HashMap<Integer, String> hmap = new HashMap<>();

		// LinkedHashMap doubly links the key,value pair with the next entry
		// So the order is maintained
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();

		// SortedMap is an interface extending Map implementing class TreeMap
		// It follows natural ordering - Red Black Tree implementation

		TreeMap<Integer, String> tmap = new TreeMap<>();

		System.out.println("Calling Hashmap");
		testMap(hmap);

		System.out.println("Calling linkedhashmap");
		testMap(lmap);

		System.out.println("Calling treemap");
		testMap(tmap);
	}

	private static void testMap(Map<Integer, String> map) {
		map.put(9, "fox");
		map.put(4, "cat");
		map.put(8, "dog");
		map.put(1, "giraffe");
		map.put(0, "swan");
		map.put(8, "rest");
		map.put(6, "snake");

		for (int key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println("=================================================");

	}
}
