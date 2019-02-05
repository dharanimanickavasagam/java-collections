package custom;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class CustomClass {

	public static void main(String[] args) {

		Person p1 = new Person(0, "Bob");
		Person p2 = new Person(1, "Sue");
		Person p3 = new Person(2, "Mike");
		Person p4 = new Person(1, "Sue");

		Map<Person, Integer> hmap = new LinkedHashMap<Person, Integer>();
		hmap.put(p1, 1);
		hmap.put(p2, 2);
		hmap.put(p3, 3);
		hmap.put(p4, 1);

		// Keys are unique they will not get repeated
		// There is no order maintained in the hashmaps

		for (Person element : hmap.keySet()) {
			System.out.println(element + " => " + hmap.get(element));
		}

		// Sets allows to hold duplicate entries
		System.out.println("============================================================\nSets");
		Set<Person> hset = new LinkedHashSet<Person>();
		hset.add(p1);
		hset.add(p2);
		hset.add(p3);
		hset.add(p4);

		for (Person element : hset) {
			System.out.println(element);
		}

	}

}
