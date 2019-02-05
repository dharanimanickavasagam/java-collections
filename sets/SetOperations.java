package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOperations {

	public static void main(String[] args) {

		Set<String> hset = new HashSet<String>();
		Set<String> lset = new LinkedHashSet<String>();
		Set<String> tset = new TreeSet<String>();

		hset.add("dharani");
		hset.add("karthik");
		hset.add("achu");
		hset.add("kochu");
		hset.add("nachu");

		// Printing elements of the hashset
		System.out.println("Printing hashset : " + hset);

		// adding dupes does nothing
		hset.add("achu");
		System.out.println("Printing hashset : " + hset);

		// another way to print the elements of the hashset
		for (String element : hset) {
			System.out.println(element);
		}

		// presence of a string in the set
		if (hset.contains("dharani")) {
			System.out.println("The searched Element is found ");
		}

		if (hset.isEmpty()) {
			System.out.println("Set is empty");
		}

		System.out.println("hset : " + hset);
		System.out.println("lset : " + lset);

		// Merging the set tset and hset
		tset.add("dog");
		tset.add("cat");
		tset.add("achu");
		tset.add("fox");
		tset.add("tiger");
		hset.addAll(tset);
		System.out.println("tset : " + tset);
		System.out.println("Actual Merged hset : " + hset);

		// retains the elements of the collection within retainAll
		hset.retainAll(tset);
		System.out.println("Retained hset : " + hset);

		// set converted to array
		hset.toArray();
		System.out.printf("hset : ");
		int count = 1;
		for (String element : hset) {
			System.out.printf(element);
			if (count != hset.size()) {
				System.out.printf(",");
			}
			count++;
		}

		lset.add("dharu");
		lset.add("cat");
		lset.add("jackal");
		lset.add("karthik");
		System.out.println("\nlset : " + lset);
		System.out.println("hset : " + hset);
		lset.removeAll(hset);
		System.out.println("lset : " + lset);
	}

}
