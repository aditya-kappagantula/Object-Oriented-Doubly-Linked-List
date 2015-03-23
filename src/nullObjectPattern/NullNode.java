package nullObjectPattern;

public class NullNode<E> implements INode<E> {
	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public E getData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public INode<E> getNext() {
		// TODO Auto-generated method stub
		return new NullNode<E>();
	}

	@Override
	public INode<E> getPrevious() {
		// TODO Auto-generated method stub
		return new NullNode<E>();
	}

	@Override
	public void setData(E item) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setNext(INode<E> node) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setPrevious(INode<E> node) {
		// TODO Auto-generated method stub
	}

	public INode<E> insert(E data, INode<E> head) {
		INode<E> aNode = new Node<E>();
		aNode.setData(data);
		head = aNode;
		return head;
	}
}
