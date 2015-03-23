package strategyPattern;

import nullObjectPattern.INode;

public interface IAddBehaviour<E> {
	public INode<E> addCommand(E data, INode<E> head);
}
