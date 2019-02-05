package queues;

import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;

public class Queue {
	public static void main(String[] args) {
		// (head) <- oooooooooooooooooooooooooooooooo <- (tail)
		// FIFO algorithm

		// ABQ can have a max capacity but not LinkedList
		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(3);
		queue.add(6);
		queue.add(7);
		queue.add(5);

		System.out.println(queue);
		System.out.println("Size : " + queue.size());
		System.out.println("Head : " + queue.element() + "\n");

		try {
			queue.add(0);
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("\nLooping through queue ");
		for (int item : queue) {
			System.out.println(item);
		}

		System.out.println("\nRemoved " + queue.remove());
		System.out.println("Removed " + queue.remove());
		System.out.println("Removed " + queue.remove());

		try {
			queue.remove();
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}

		//////////////// METHOD 2 //////////////////
		System.out.println("-------------------------------------");
		ArrayBlockingQueue<String> q = new ArrayBlockingQueue<>(3);
		q.offer("dharani");
		q.offer("achu");
		q.offer("karthik");

		System.out.println("Head : " + q.peek());
		if (q.offer("Paul") == false) {
			System.out.println("I will not be there ");
		}

		System.out.println("\nLooping ");
		for (String i : q) {
			System.out.println(i);
		}

		System.out.println("\nRemoved " + q.poll());
		System.out.println("Removed " + q.poll());
		System.out.println("Removed " + q.poll());
		System.out.println("Removed " + q.poll());

		System.out.println(q);
	}

}
