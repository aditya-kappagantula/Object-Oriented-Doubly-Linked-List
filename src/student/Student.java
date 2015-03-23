package student;

public class Student {
	private String firstName;
	private String lastName;
	private int redId;
	private double gpa;
	public static double PROBATION_GPA = 2.85;

	public Student(String firstName, String lastName, int redid, double gpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.redId = redid;
		this.gpa = gpa;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstame(String firstName) {
		this.firstName = firstName;
	}

	public int getREDId() {
		return redId;
	}

	public void setREDId(int redid) {
		this.redId = redid;
	}

	public double getGPA() {
		return gpa;
	}

	public void setGPA(float gpa) {
		this.gpa = gpa;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isOnProbation() {
		return this.gpa < PROBATION_GPA;
	}
}
