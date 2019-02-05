package iterator_iterable;

import java.util.Iterator;
import java.util.LinkedList;

public class UrlLib implements Iterable<String> {
	private LinkedList<String> urls = new LinkedList<>();

	public UrlLib() {
		urls.add("http://www.caveofprogramming.com");
		urls.add("http://www.facebook.com/caveofprogramming");
		urls.add("http://news.bbc.co.uk");
	}

	public void display() {
		Iterator<String> item = urls.iterator();
		while (item.hasNext()) {
			System.out.println(item.next());
		}
	}

	@Override
	public Iterator<String> iterator() {

		return urls.iterator();
	}
}
