import java.util.Scanner;

//многопоточность

class MyThreat implements Runnable{
	public static boolean working = true;
	@Override
	public void run() {
		int i = 0;
		while (i < 100) {
			System.out.println(i++);		
		}
		working = false;
	}
}

class Bank{
	int money = 10000;
	Bank(){
		new Transfer().start();
		new Transfer().start();
	}
	class Transfer extends Thread{
		@Override
		public void run() {
			while (true) {
			money += 10;
			
			money -= 10;
			
			}
		}	
	}
}

public class Ciclfor {
	
	public static void main(String[] args) throws InterruptedException {
		//Thread t = new Thread(new MyThreat());
		//t.start();
		//t.join();

		//System.out.println("Finished");
		Bank bank = new Bank();
		while(true) {
			System.out.println(bank.money);
			Thread.sleep(300);
		}
	}
}
