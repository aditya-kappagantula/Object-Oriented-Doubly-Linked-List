package tests.decoratorPatternTests;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.Test;

import student.Student;
import decoratorPattern.OnProbationDecorator;
import doublyLinkedList.DoublyLinkedList;

public class DecoratorPatternTests {
	@Test
	public void testDecoratorPattern() {
		Student firstStudent = new Student("A", "A", 818289362, 1.1);
		Student secondStudent = new Student("B", "B", 817382121, 3.5);
		Student thirdStudent = new Student("C", "C", 817382122, 1.3);
		Student fourthStudent = new Student("D", "D", 828387473, 2.0);
		Student fifthStudent = new Student("E", "E", 828387473, 4);
		DoublyLinkedList<Student> aDLL = new DoublyLinkedList<Student>();
		aDLL.add(firstStudent);
		aDLL.add(secondStudent);
		aDLL.add(thirdStudent);
		aDLL.add(fourthStudent);
		aDLL.add(fifthStudent);
		aDLL = new OnProbationDecorator<Student>(aDLL);
		Iterator<Student> anIterator = aDLL.iterator();
		int count = 0;
		while (anIterator.hasNext()) {
			if (count == 0) {
				assertEquals(anIterator.next().getFirstName(), "A");
			}
			if (count == 1) {
				assertEquals(anIterator.next().getFirstName(), "C");
			}
			if (count == 2) {
				assertEquals(anIterator.next().getFirstName(), "D");
			}
			count++;
		}
	}
}
