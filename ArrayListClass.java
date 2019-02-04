package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListClass {
	public static void main(String[] args) {

		// String array
		ArrayList<String> array = new ArrayList<>();
		array.add("dharani");
		array.add("katheek");
		array.add("achu");
		array.add("angel");

		System.out.println("Printing array elements ");
		for (String item : array) {
			System.out.println(item);
		}
		System.out.println(array.get(2));

		// Integer array
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		System.out.println("Enter numeric values ");
		while (true) {
			int input = new Scanner(System.in).nextInt();
			if (input == 0) {
				break;
			}
			array1.add(input);
		}

		System.out.println("Printing array elements ");
		for (Integer item : array1) {
			System.out.println(item);
		}

		System.out.println("*******************************");

		printAnyArray(array);
		printAnyArray(array1);

		// very slow if removing the first index values as it is going to
		// re-assign all values a step back

		System.out.println("Removing array elements");
		array.remove(2);
		System.out.println(array);

		// Length of the array
		System.out.println("Size of the arraylist is " + array.size());

		// Collection classes are grouped by interfaces
		// List is an interface, you cannot create new List()
		// ArrayList is an implementation class that implements List interface
		// Uses Polymorphism

		List<String> list = new ArrayList<String>();

	}

	public static void printAnyArray(ArrayList<?> arrayList) {
		for (Object item : arrayList) {
			System.out.println(item);
		}
		System.out.println("--------------");
	}
}
