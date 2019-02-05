package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class AlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// makes lexical comparisons
		// alternative to Collections.sort() in natural ordering

		// remove the below commented line to sort in natural order
		// return s1.compareTo(s2);

		// to sort in descending order
		return s2.compareTo(s1);
	}
}

public class AlphabeticalSort {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("cat");
		list.add("lion");
		list.add("snake");
		list.add("elephant");
		list.add("tiger");
		list.add("mongoose");

		/*
		 * System.out.println("Natural ordering "); Collections.sort(list); for
		 * (String item : list) { System.out.println(item); }
		 */

		System.out.println("Sorting against natural ordering using Collections");
		Collections.sort(list, new AlphabeticalComparator());
		System.out.println(list);

		System.out.println("\nSorting in natural order ");
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println(list);
	}

}
