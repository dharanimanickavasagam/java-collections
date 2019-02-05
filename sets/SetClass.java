package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {
	public static void main(String[] args) {
		// Set stores unique elements

		// Does not maintain any order
		// does not allow duplicates
		HashSet<String> hset = new HashSet<>();

		// Maintains order
		// Doubly linked list
		LinkedHashSet<String> lset = new LinkedHashSet<>();

		// Sorts on the basis of Natural order
		TreeSet<String> tset = new TreeSet<>();

		System.out.println("Calling HashSet");
		testSets(hset);

		System.out.println("Calling LinkedHashSet");
		testSets(lset);

		System.out.println("Calling TreeSet");
		testSets(tset);
	}

	private static void testSets(Set<String> set) {
		set.add("dog");
		set.add("cat");
		set.add("snake");
		set.add("bear");

		// Adding duplicates
		set.add("cat");

		for (String key : set) {
			System.out.println(key);
		}
		System.out.println("---------------------------------------");
	}
}
