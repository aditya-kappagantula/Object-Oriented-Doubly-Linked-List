package doublyLinkedList;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

import nullObjectPattern.INode;
import nullObjectPattern.NullNode;
import strategyPattern.AddNormal;
import strategyPattern.IAddBehaviour;

public class DoublyLinkedList<E> extends AbstractList<E> {
	private IAddBehaviour<E> anAddBehaviour;
	private INode<E> head;
	private INode<E> tail;

	public void setAddBehaviour(IAddBehaviour<E> addBehaviour) {
		this.anAddBehaviour = addBehaviour;
	}

	public DoublyLinkedList() {
		this.head = new NullNode<E>();
		this.tail = new NullNode<E>();
		this.anAddBehaviour = new AddNormal<E>();
	}

	public DoublyLinkedList(IAddBehaviour<E> aBehaviour) {
		this.head = new NullNode<E>();
		this.tail = new NullNode<E>();
		this.anAddBehaviour = aBehaviour;
	}

	@Override
	public boolean add(E data) {
		head = anAddBehaviour.addCommand(data, head);
		return true;
	}

	public ArrayList<E> print() {
		ArrayList<E> list = new ArrayList<E>();
		if (head.isNull()) {
			return list;
		}
		INode<E> aTemporaryNode = head;
		while (!head.isNull()) {
			list.add(head.getData());
			head = head.getNext();
		}
		head = aTemporaryNode;
		return list;
	}

	private class DLLIterator<E> implements Iterator<E> {
		private INode<E> head;

		public DLLIterator(INode<E> aNode) {
			this.head = aNode;
		}

		public boolean hasNext() {
			return !head.isNull();
		}

		public E next() {
			E data = (E) head.getData();
			head = head.getNext();
			return data;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
		}
	}

	@Override
	public Iterator<E> iterator() {
		Iterator<E> aDLLIterator = new DLLIterator<E>(this.head);
		return aDLLIterator;
	}

	@Override
	public int size() {
		int size = 0;
		while (!head.isNull()) {
			head = head.getNext();
			size++;
		}
		return size;
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
