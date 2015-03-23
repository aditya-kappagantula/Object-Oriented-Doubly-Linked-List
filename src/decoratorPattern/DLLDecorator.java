package decoratorPattern;

import java.util.Iterator;

import doublyLinkedList.DoublyLinkedList;

public abstract class DLLDecorator<E> extends DoublyLinkedList<E> {
	public abstract Object[] toArray();

	public abstract String toString();

	public abstract Iterator<E> iterator();

	public abstract int size();
}