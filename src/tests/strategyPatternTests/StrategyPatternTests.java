package tests.strategyPatternTests;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.Test;

import strategyPattern.AddNormal;
import strategyPattern.AddOrderedByFirstName;
import strategyPattern.AddOrderedByGPA;
import strategyPattern.AddOrderedByLastName;
import strategyPattern.AddOrderedByREDId;
import student.Student;
import doublyLinkedList.DoublyLinkedList;

public class StrategyPatternTests {
	@Test
	public void testAddOrderedByFirstName() {
		Student firstStudent = new Student("A", "A", 818289362, 1.1);
		Student secondStudent = new Student("B", "B", 817382121, 3.5);
		Student thirdStudent = new Student("C", "C", 817382122, 1.3);
		Student fourthStudent = new Student("D", "D", 828387473, 2.0);
		Student fifthStudent = new Student("E", "E", 828387473, 4);
		DoublyLinkedList<Student> aDLL = new DoublyLinkedList<Student>(
				new AddOrderedByFirstName<Student>());
		aDLL.add(secondStudent);
		aDLL.add(fifthStudent);
		aDLL.add(thirdStudent);
		aDLL.add(firstStudent);
		aDLL.add(fourthStudent);
		Iterator<Student> anIterator = aDLL.iterator();
		int count = 0;
		while (anIterator.hasNext()) {
			if (count == 0) {
				assertEquals(anIterator.next().getFirstName(), "A");
			}
			if (count == 1) {
				assertEquals(anIterator.next().getFirstName(), "B");
			}
			if (count == 2) {
				assertEquals(anIterator.next().getFirstName(), "C");
			}
			if (count == 3) {
				assertEquals(anIterator.next().getFirstName(), "D");
			}
			if (count == 4) {
				assertEquals(anIterator.next().getFirstName(), "E");
			}
			count++;
		}
	}

	@Test
	public void testAddOrderedByGPA() {
		Student firstStudent = new Student("A", "A", 818289362, 1.1);
		Student secondStudent = new Student("B", "B", 817382121, 3.5);
		Student thirdStudent = new Student("C", "C", 817382122, 1.3);
		Student fourthStudent = new Student("D", "D", 828387473, 2.0);
		Student fifthStudent = new Student("E", "E", 828387473, 4);
		DoublyLinkedList<Student> aDLL = new DoublyLinkedList<Student>(
				new AddOrderedByGPA<Student>());
		aDLL.add(secondStudent);
		aDLL.add(fifthStudent);
		aDLL.add(thirdStudent);
		aDLL.add(firstStudent);
		aDLL.add(fourthStudent);
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
			if (count == 3) {
				assertEquals(anIterator.next().getFirstName(), "B");
			}
			if (count == 4) {
				assertEquals(anIterator.next().getFirstName(), "E");
			}
			count++;
		}
	}

	@Test
	public void testAddOrderedByREDId() {
		Student firstStudent = new Student("A", "A", 818289362, 1.1);
		Student secondStudent = new Student("B", "B", 817382121, 3.5);
		Student thirdStudent = new Student("C", "C", 817382122, 1.3);
		Student fourthStudent = new Student("D", "D", 828387473, 2.0);
		Student fifthStudent = new Student("E", "E", 828387474, 4);
		DoublyLinkedList<Student> aDLL = new DoublyLinkedList<Student>(
				new AddOrderedByREDId<Student>());
		aDLL.add(secondStudent);
		aDLL.add(fifthStudent);
		aDLL.add(thirdStudent);
		aDLL.add(firstStudent);
		aDLL.add(fourthStudent);
		Iterator<Student> anIterator = aDLL.iterator();
		int count = 0;
		while (anIterator.hasNext()) {
			if (count == 0) {
				assertEquals(anIterator.next().getFirstName(), "B");
			}
			if (count == 1) {
				assertEquals(anIterator.next().getFirstName(), "C");
			}
			if (count == 2) {
				assertEquals(anIterator.next().getFirstName(), "A");
			}
			if (count == 3) {
				assertEquals(anIterator.next().getFirstName(), "D");
			}
			if (count == 4) {
				assertEquals(anIterator.next().getFirstName(), "E");
			}
			count++;
		}
	}

	@Test
	public void testAddOrderedByLastName() {
		Student firstStudent = new Student("A", "A", 818289362, 1.1);
		Student secondStudent = new Student("B", "B", 817382121, 3.5);
		Student thirdStudent = new Student("C", "C", 817382122, 1.3);
		Student fourthStudent = new Student("D", "D", 828387473, 2.0);
		Student fifthStudent = new Student("E", "E", 828387474, 4);
		DoublyLinkedList<Student> aDLL = new DoublyLinkedList<Student>(
				new AddOrderedByLastName<Student>());
		aDLL.add(secondStudent);
		aDLL.add(fifthStudent);
		aDLL.add(thirdStudent);
		aDLL.add(firstStudent);
		aDLL.add(fourthStudent);
		Iterator<Student> anIterator = aDLL.iterator();
		int count = 0;
		while (anIterator.hasNext()) {
			if (count == 0) {
				assertEquals(anIterator.next().getLastName(), "A");
			}
			if (count == 1) {
				assertEquals(anIterator.next().getLastName(), "B");
			}
			if (count == 2) {
				assertEquals(anIterator.next().getLastName(), "C");
			}
			if (count == 3) {
				assertEquals(anIterator.next().getLastName(), "D");
			}
			if (count == 4) {
				assertEquals(anIterator.next().getLastName(), "E");
			}
			count++;
		}
	}

	@Test
	public void testAddOrderedByNormal() {
		Student firstStudent = new Student("A", "A", 818289362, 1.1);
		Student secondStudent = new Student("B", "B", 817382121, 3.5);
		Student thirdStudent = new Student("C", "C", 817382122, 1.3);
		Student fourthStudent = new Student("D", "D", 828387473, 2.0);
		Student fifthStudent = new Student("E", "E", 828387474, 4);
		DoublyLinkedList<Student> aDLL = new DoublyLinkedList<Student>(
				new AddNormal<Student>());
		aDLL.add(secondStudent);
		aDLL.add(fifthStudent);
		aDLL.add(thirdStudent);
		aDLL.add(firstStudent);
		aDLL.add(fourthStudent);
		Iterator<Student> anIterator = aDLL.iterator();
		int count = 0;
		while (anIterator.hasNext()) {
			if (count == 0) {
				assertEquals(anIterator.next().getFirstName(), "B");
			}
			if (count == 1) {
				assertEquals(anIterator.next().getFirstName(), "E");
			}
			if (count == 2) {
				assertEquals(anIterator.next().getFirstName(), "C");
			}
			if (count == 3) {
				assertEquals(anIterator.next().getFirstName(), "A");
			}
			if (count == 4) {
				assertEquals(anIterator.next().getFirstName(), "D");
			}
			count++;
		}
	}
}
