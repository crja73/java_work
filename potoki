import java.util.Scanner;

//многопоточность

class MyThreat implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class Ciclfor {
	public static void main(String[] args) {
		Thread t = new Thread(new MyThreat());
		Thread t1 = new Thread(new MyThreat());
		Thread t2 = new Thread(new MyThreat());
		new Thread(t).start();
		new Thread(t1).start();
		new Thread(t2).start();
		t.interrupt();
		t2.interrupt();
		t3.interrupt();
	}
}
