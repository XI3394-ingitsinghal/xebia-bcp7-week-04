package corejava.simplethread;

public class SimpleThread implements Runnable {

	public static void main(String[] args) {
		SimpleThread obj = new SimpleThread();
		Thread thread = new Thread(obj);
		thread.start();
		System.out.println("This code is outside of the thread");
	}

	public void run() {
		System.out.println("Simple thread using runnable interface");
	}

}
