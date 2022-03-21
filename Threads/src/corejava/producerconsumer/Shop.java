package corejava.producerconsumer;

public class Shop {
	private int items;
	private boolean available = false;

	public synchronized int get() {
		while (available == false) {
			try {
				wait();
			} catch (InterruptedException ie) {
			}
		}
		available = false;
		notifyAll();
		return items;
	}

	public synchronized void put(int value) {
		while (available == true) {
			try {
				wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		items = value;
		available = true;
		notifyAll();
	}
}
