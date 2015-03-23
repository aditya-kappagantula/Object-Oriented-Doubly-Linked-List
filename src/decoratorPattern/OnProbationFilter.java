package decoratorPattern;

import java.util.Iterator;

import student.Student;

public class OnProbationFilter<E> implements Iterator<E> {
	private Iterator<E> aDLLIterator;
	private Student data;

	public OnProbationFilter(Iterator<E> aDLLIterator) {
		this.aDLLIterator = aDLLIterator;
	}

	@Override
	public boolean hasNext() {
		while (aDLLIterator.hasNext()) {
			Student aStudent = (Student) aDLLIterator.next();
			if (aStudent.isOnProbation()) {
				data = (Student) aStudent;
				return true;
			}
		}
		return false;
	}

	@Override
	public E next() {
		if (data == null) {
			hasNext();
		}
		return (E) data;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
	}
}
