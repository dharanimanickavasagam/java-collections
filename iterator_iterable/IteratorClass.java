package iterator_iterable;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorClass {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(4);
		list.add(3);
		list.add(87);
		list.add(2);

		// java 5 and later
		for (int item : list) {
			System.out.println(item);
		}

		System.out.println("************");
		// pre java5 method
		// still used in some parts
		//
		Iterator<Integer> item = list.iterator();

		while (item.hasNext()) {
			int val = item.next();
			if (val == 4) {
				item.remove();
				continue;
			}
			System.out.println(val);
		}

	}
}
