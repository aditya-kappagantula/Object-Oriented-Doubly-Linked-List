package nullObjectPattern;


public class Node<E> implements INode<E> {
	private E data;
	private INode<E> next = new NullNode<E>();
	private INode<E> previous = new NullNode<E>();

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public INode<E> getNext() {
		return next;
	}

	public void setNext(INode<E> next) {
		this.next = next;
	}

	public INode<E> getPrevious() {
		return previous;
	}

	public void setPrevious(INode<E> previous) {
		this.previous = previous;
	}

	public INode<E> insert(E data, INode<E> head) {
		INode<E> aNode = new Node<E>();
		aNode.setData(data);
		INode<E> aTemporaryNode = head;
		while (!head.getNext().isNull()) {
			head = head.getNext();
		}
		head.setNext(aNode);
		aNode.setPrevious(head);
		head = aTemporaryNode;
		return head;
	}

	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return false;
	}
}