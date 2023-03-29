package ch22;


class Bank{
	private int money = 10000;

	
	public void savaMoney(int save) {
		synchronized (this) {
			int m = getMoney();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			setMoney(m+save);
		}
	}
	
	public synchronized void minusMoney(int minus) {
		int m = getMoney();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(m-minus);
	}
	
	public synchronized int getMoney() {
		return money;
	}

	public synchronized void setMoney(int money) {
		this.money = money;
	}
	
	
}
public class SyncMain {
	public static Bank myBank = new Bank();
	
	public static void main(String[] args) {
		Park p = new Park();
		ParkWife pw = new ParkWife();
		p.start();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		pw.start();

	}

}

class Park extends Thread{
	public void run() {
		synchronized (SyncMain.myBank) {
			System.out.println("save start");
			SyncMain.myBank.savaMoney(3000);
			System.out.println("saveMoney(3000) : "+ SyncMain.myBank.getMoney());
		}
	}
}

class ParkWife extends Thread{
	public void run() {
		System.out.println("minus start");
		SyncMain.myBank.minusMoney(1000);
		System.out.println("minusMoney(1000) : " + SyncMain.myBank.getMoney());
	}
}