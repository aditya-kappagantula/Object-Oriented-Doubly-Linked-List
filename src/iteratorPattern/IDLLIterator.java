package iteratorPattern;

import nullObjectPattern.INode;

public interface IDLLIterator<E> {
	public boolean hasNext();
	public INode<E> next();
}
