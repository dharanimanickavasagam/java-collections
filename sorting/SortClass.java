package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// In-order to sort something against natural ordering, implement Comparator 
// To sort the below list in the basis of StringLength, use the below startegy

class StringLengthComparator implements Comparator<String> {

	// compares 2 things at a time
	@Override
	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 == len2)
			return 0;

		else if (len1 > len2)
			return 1;

		else
			return -1;
	}
}

public class SortClass {

	public static void main(String[] args) {

		// Sorting Strings
		ArrayList<String> list = new ArrayList<>();
		list.add("cat");
		list.add("lion");
		list.add("snake");
		list.add("elephant");
		list.add("tiger");
		list.add("mongoose");

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(9);
		list1.add(3);
		list1.add(4);
		list1.add(2);

		sortFunction(list);
		sortFunction(list1);

		Collections.sort(list,new StringLengthComparator());
		System.out.println(list);
	}

	private static void sortFunction(List<?> lists) {
		List list = (List<?>) lists;
		Collections.sort(list);
		for (Object i : list) {
			System.out.println(i);
		}
		System.out.println("------------------------------");
	}

}
