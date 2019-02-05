package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person {
	int id;
	String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return id + " : " + name;
	}
}

public class CustomSort {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();

		Person p1 = new Person(3, "Tiger");
		Person p2 = new Person(4, "Lion");
		Person p3 = new Person(1, "Zebra");
		Person p4 = new Person(2, "Yak");

		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);

		System.out.println(list);

		System.out.println("\nSorting by ID");
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getId() == o2.getId())
					return 0;

				else if (o1.getId() > o2.getId())
					return 1;

				else
					return -1;
			}
		});

		System.out.println(list);

		System.out.println("\nSorting by Name");
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		System.out.println(list);
	}
}
