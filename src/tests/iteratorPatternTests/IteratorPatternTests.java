package tests.iteratorPatternTests;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.Test;

import strategyPattern.AddOrderedByFirstName;
import student.Student;
import doublyLinkedList.DoublyLinkedList;

public class IteratorPatternTests {
	@Test
	public void testIteratorPattern() {
		Student firstStudent = new Student("A", "A", 818289362, 1.1);
		Student secondStudent = new Student("B", "B", 817382121, 3.5);
		DoublyLinkedList<Student> aDLL = new DoublyLinkedList<Student>(
				new AddOrderedByFirstName<Student>());
		aDLL.add(firstStudent);
		aDLL.add(secondStudent);
		Iterator<Student> anIterator = aDLL.iterator();
		if (anIterator.hasNext()) {
			Student aStudent = anIterator.next();
			assertEquals("A", aStudent.getFirstName());
			assertEquals("A", aStudent.getLastName());
			assertEquals(818289362, aStudent.getREDId());
			assertEquals(1.1, aStudent.getGPA(), 0.000001);
		}
		if (anIterator.hasNext()) {
			Student aStudent = anIterator.next();
			assertEquals("B", aStudent.getFirstName());
			assertEquals("B", aStudent.getLastName());
			assertEquals(817382121, aStudent.getREDId());
			assertEquals(3.5, aStudent.getGPA(), 0.000001);
		}
	}
}
