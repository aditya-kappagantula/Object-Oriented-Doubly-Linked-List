package strategyPattern;

import nullObjectPattern.INode;

public class AddNormal<E> implements IAddBehaviour<E> {
	public INode<E> addCommand(E data, INode<E> head) {
		head = head.insert(data, head);
		return head;
	}
}
