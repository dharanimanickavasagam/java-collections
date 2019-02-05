package iterator_iterable;

public class IterableClass {
	public static void main(String[] args) {
		UrlLib urllib = new UrlLib();

		// Using Iterator to display the lists
		urllib.display();

		// using Iterable
		System.out.println("\nUsing Iterable");
		for (String url : urllib) {
			System.out.println(url);
		}
	}

}
