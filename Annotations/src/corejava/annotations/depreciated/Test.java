package corejava.annotations.depreciated;

public class Test {
	@Deprecated
	  public void display() {
	    System.out.println("display() method of Test class");
	  }
	  public static void main(String args[]) {
	    Test obj = new Test();
	    obj.display();
	  }
}
