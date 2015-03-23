package tests.nullPatternTests;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import nullObjectPattern.INode;
import nullObjectPattern.Node;
import nullObjectPattern.NullNode;

import org.junit.Test;

import student.Student;
import doublyLinkedList.DoublyLinkedList;

public class NullObjectTest {
	@Test
	public void nullNodeTest() {
		DoublyLinkedList<Student> aDLL = new DoublyLinkedList<Student>();
		Iterator<Student> anIterator = aDLL.iterator();
		assertEquals(anIterator.hasNext(), false);
		INode<Student> aNullNode = new NullNode<Student>();
		assertEquals(aNullNode.isNull(), true);
		INode<Student> aNode = new Node<Student>();
		assertEquals(aNode.isNull(), false);
	}
}
