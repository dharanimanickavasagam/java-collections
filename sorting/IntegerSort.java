package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortIntegers implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 == o2)
			return 0;

		// else if (o1 > o2 ) return 1
		// does natural sorting
		else if (o1 < o2)
			return 1;
		else
			return -1;
	}
}

public class IntegerSort {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(9);
		list1.add(13);
		list1.add(4);
		list1.add(2);

		/*
		 * System.out.println("natural ordering "); Collections.sort(list1); for
		 * (Integer i : list1) { System.out.println(i);
		 */

		System.out.println("Sorting against natural ordering ");
		Collections.sort(list1, new SortIntegers());
		System.out.println(list1);

		System.out.println("Sorting in natural order ");
		Collections.sort(list1, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 == o2)
					return 0;
				else if (o1 > o2)
					return 1;
				else
					return -1;
			}
		});
		System.out.println(list1);
	}

}
