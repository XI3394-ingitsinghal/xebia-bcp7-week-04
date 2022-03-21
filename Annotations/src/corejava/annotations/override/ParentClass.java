package corejava.annotations.override;

public class ParentClass {

	public void display() {
		System.out.println("Parent class display() method");
	}

	public static void main(String args[]) {
		ParentClass obj = new ChildClass();
		    obj.display();
		  }

}
