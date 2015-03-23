import java.util.Iterator;

import strategyPattern.AddOrderedByFirstName;
import student.Student;
import doublyLinkedList.DoublyLinkedList;

public class Lab {
	public static void main(String args[]) {
		Student firstStudent = new Student("A", "A", 818289362, 1.1);
		Student secondStudent = new Student("B", "B", 817382121, 3.5);
		Student thirdStudent = new Student("C", "C", 817382122, 1.3);
		Student fourthStudent = new Student("D", "D", 828387473, 2.0);
		Student fifthStudent = new Student("E", "E", 828387473, 4);
		DoublyLinkedList<Student> aDLL = new DoublyLinkedList<Student>(
				new AddOrderedByFirstName<Student>());
		aDLL.add(thirdStudent);
		aDLL.add(firstStudent);
		aDLL.add(fourthStudent);
		aDLL.add(secondStudent);
		aDLL.add(fifthStudent);
		// aDLL = new OnProbationDecorator<Student>(aDLL);
		Iterator<Student> anIterator = aDLL.iterator();
		while (anIterator.hasNext()) {
			System.out.println(anIterator.next().getFirstName());
		}
	}
}
