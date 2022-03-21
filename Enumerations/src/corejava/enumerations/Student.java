package corejava.enumerations;

public enum Student {
	Ingit(11), Ishita(10), Kushaghra(13), Prince(9);

	private int age; // age of students

	int getage() {
		return age;
	}

	Student(int age) {
		this.age = age;
	}
}
