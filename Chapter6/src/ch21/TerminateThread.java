package ch21;

import java.io.IOException;

public class TerminateThread extends Thread{
	
	private boolean flag = false;
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public TerminateThread(String name) {
		super(name);
	}
	
	public void run() {
		while(!flag) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName()+" end");
	}
	
	

	public static void main(String[] args) throws IOException {
		TerminateThread th1 = new TerminateThread("A");
		TerminateThread th2 = new TerminateThread("B");
		TerminateThread th3 = new TerminateThread("C");
		
		th1.start();
		th2.start();
		th3.start();
		
		int i;
		while(true) {
			i = System.in.read();
			
			if(i=='A') {
				th1.setFlag(true);
			}
			else if(i=='B') {
				th2.setFlag(true);
			}
			else if(i=='C') {
				th3.setFlag(true);
			}
			else if(i=='M') {
				th1.setFlag(true);
				th2.setFlag(true);
				th3.setFlag(true);
				break;
			}
			
		}
		
		System.out.println("main end");

	}

}
