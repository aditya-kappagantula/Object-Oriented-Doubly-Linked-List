package nullObjectPattern;

public interface INode<E> {
	public boolean isNull();
	public E getData();
	public INode<E> getNext();
	public INode<E> getPrevious();
	public void setData(E item);
	public void setNext(INode<E> node);
	public void setPrevious(INode<E> node);
	public INode<E> insert(E data,INode<E> head);
}
