package decoratorPattern;

import java.util.Iterator;

import doublyLinkedList.DoublyLinkedList;

public class OnProbationDecorator<E> extends DoublyLinkedList<E> {
	private DoublyLinkedList<E> aDLL;

	public OnProbationDecorator(DoublyLinkedList<E> aDLL) {
		this.aDLL = aDLL;
	}

	public boolean hasNext() {
		return true;
	}

	public E next() {
		return null;
	}

	@Override
	public Iterator<E> iterator() {
		return new OnProbationFilter<E>(aDLL.iterator());
	}

	@Override
	public int size() {
		int count = 0;
		Iterator<E> i = this.iterator();
		while (i.hasNext()) {
			count++;
		}
		return count;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		Object[] listObjects = new Object[size()];
		int count = 0;
		Iterator<E> i = this.iterator();
		while (i.hasNext()) {
			listObjects[count] = i.next();
			count++;
		}
		return listObjects;
	}

	@Override
	public String toString() {
		String stringObjects = "";
		Iterator<E> i = this.iterator();
		while (i.hasNext()) {
			stringObjects += i.next().toString();
		}
		return stringObjects;
	}
}
