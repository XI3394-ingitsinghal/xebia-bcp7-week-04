package corejava.simplethread1;

public class SimpleThread1 extends Thread {
	public static void main(String[] args) {
		SimpleThread1 obj = new SimpleThread1();
		Thread thread = new Thread(obj);
		thread.start();
		System.out.println("This code is outside of the thread");
	}

	public void run() {
		System.out.println("Simple thread extending Thread class");
	}

}
