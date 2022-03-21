package corejava.collections.comparasions;

import java.util.Objects;

public class Student {

	public String id;
	public String name;
	public String std;

	public Student(String id, String name, String std) {
		super();
		this.id = id;
		this.name = name;
		this.std = std;

	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, std);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(std, other.std);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStd() {
		return name;
	}

	public void setStd(String std) {
		this.std = std;
	}

}
