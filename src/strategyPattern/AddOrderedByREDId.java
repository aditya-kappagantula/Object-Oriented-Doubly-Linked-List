package strategyPattern;

import nullObjectPattern.INode;
import nullObjectPattern.Node;
import student.Student;

public class AddOrderedByREDId<E> implements IAddBehaviour<E> {
	public INode<E> addCommand(E data, INode<E> head) {
		INode<E> aNode = new Node<E>();
		aNode.setData(data);
		INode<E> aTemporaryNode = head;
		int redId = ((Student) data).getREDId();
		if (head.isNull()) {
			head = head.insert(data, head);
		} else {
			if (head.getPrevious().isNull()
					&& ((Student) head.getData()).getREDId() > redId) {
				if (((Student) head.getData()).getREDId() > redId) {
					aNode.setNext(head);
					head.setPrevious(aNode);
					head = aNode;
				}
			} else {
				while (!head.getNext().isNull()
						&& ((Student) head.getData()).getREDId() < redId) {
					head = head.getNext();
				}
				if (head.getNext().isNull() && head.getPrevious().isNull()) {
					aNode.setPrevious(head);
					head.setNext(aNode);
					head = aTemporaryNode;
				} else if (head.getNext().isNull()
						&& ((Student) head.getData()).getREDId() < redId) {
					aNode.setPrevious(head);
					head.setNext(aNode);
					head = aTemporaryNode;
				} else if (head.getNext().isNull()
						&& ((Student) head.getData()).getREDId() > redId) {
					aNode.setNext(head);
					aNode.setPrevious(head.getPrevious());
					head.getPrevious().setNext(aNode);
					head.setPrevious(aNode);
					head = aTemporaryNode;
				} else {
					aNode.setNext(head);
					aNode.setPrevious(head.getPrevious());
					head.getPrevious().setNext(aNode);
					head.setPrevious(aNode);
					head = aTemporaryNode;
				}
			}
		}
		return head;
	}
}
