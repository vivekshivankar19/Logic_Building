package Tread;

public class ThreadExample{

	public static void main(String[] args) {
		System.out.println("inside main method..");
		
		new MyThread("one");
		new MyThread("two");
		new MyThread("three");
		new MyThread("four");
		
		try {
		     Thread.sleep(10000);
		} catch (InterruptedException e) {
		      System.out.println("Main thread Interrupted");
		}
		      System.out.println("Main thread exiting.");
		      
	}
}

class MyThread implements Runnable{
	
	String name = null;
	Thread t;
	
	MyThread(String thread){
		name = thread;
		t = new Thread(this, name);
		System.out.println("New Thread : "+ t);
		t.start();
	}

	@Override
	public void run() {
		
		try {
			
			for(int i = 5; i> 0 ; i--) {
				System.out.println("Name : "+ name + " "+ i);
				Thread.sleep(1000);
			}
			
		}catch(InterruptedException e) {
			System.out.println("Thread interrupted");
		}
		System.out.println("Thread Exit");
	}
	
}
