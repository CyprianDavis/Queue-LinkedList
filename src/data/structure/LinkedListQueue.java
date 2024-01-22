package data.structure;

import java.util.LinkedList;
/**
 * 
 * @author CYPRIAN DAVIS
 *
 * @param <T>
 */

public class LinkedListQueue<T> implements Queue<T> {
	private LinkedList<T> list = new LinkedList<T>();

	@Override
	/**Adds an emelemt e at the end of the queue*/
	public void enqueue(T e) {
		// TODO Auto-generated method stub
		list.addLast(e);
		
	}

	@Override
	/**Removes and returns the first element from the list */
	public T dequeue() {
		// TODO Auto-generated method stub
		return list.removeFirst();
	}

	@Override
	/**Returns but doesnot remove the first element in the queue*/
	public T first() {
		// TODO Auto-generated method stub
		return list.getFirst();
	}

	@Override
	/**return the number of elements in the list*/
	public int size() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	/**Returns the boolean indicating whether the list ie empty*/
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return list.isEmpty();
	}

}
