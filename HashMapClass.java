package src;

import java.util.HashMap;

public class HashMapClass {
	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();

		// do not allow duplicate entries
		// so reassigns to latest value !
		hmap.put(1, "Dharani");
		hmap.put(2, "Achu");
		hmap.put(2, "Karthik");

		for (int i = 1; i <= hmap.size(); i++) {
			System.out.println(hmap.get(i));
		}
		System.out.println("Looping with keySet");
		for (int key : hmap.keySet()) {
			System.out.println(hmap.get(key));
		}

		System.out.println("\nPrinting keys and values");
		HashMap<String, String> hmap1 = new HashMap<>();
		hmap1.put("Dharani", "Karthik");
		hmap1.put("Karthik", "Angel");

		for (String key : hmap1.keySet()) {
			System.out.println("Key is " + key + " and Value is " + hmap1.get(key));
		}

	}
}
