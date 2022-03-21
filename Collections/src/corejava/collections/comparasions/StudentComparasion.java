package corejava.collections.comparasions;

import java.util.HashSet;

public class StudentComparasion {

	public static void main(String args[]) {

		Student student1 = new Student("Ingit", "001", "xyz");
		Student student2 = new Student("Ingit", "001", "xyz");

		System.out.println(student1.equals(student2));

		HashSet<Student> studentSet = new HashSet<Student>();
		studentSet.add(student2);
		studentSet.add(student1);

		HashSet<Student> objectSet = new HashSet<Student>();
		objectSet.add(student2);
		objectSet.add(student1);

		for (Object obj : objectSet) {
			System.out.println(obj.toString());
		}

		for (Student student : studentSet) {
			System.out
					.println("Id = " + student.getId() + " Name = " + student.getName() + " Std = " + student.getStd());
		}

	}
}
