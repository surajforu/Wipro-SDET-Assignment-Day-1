package Advance;

public class MyThread extends Thread{
public void run() {
	
	for (int i = 0; i < 20; i++)
		System.out.println(Thread.currentThread().getName());
}

public static void main(String args[]) throws InterruptedException {
	MyThread t0 = new MyThread();
	t0.start();
	t0.sleep(6000);
	MyThread t1 = new MyThread();
	t1.start();
	System.out.println("current priority for t1=" + t1.getPriority());
	t1.setPriority(7);
	System.out.println("after priority for t1=" + t1.getPriority());

	MyThread t3 = new MyThread();
	t3.start();
	System.out.println("t3 name =" + t3.getPriority());
	t3.setName("Max");
	System.out.println("t3 name =" + t3.getPriority());
	System.out.println("t3 name =" + t3.getName());

	MyThread t4 = new MyThread();
	t4.start();
	
}
}
