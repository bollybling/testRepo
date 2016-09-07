package wait_notify;

public class Consumer implements Runnable {
	Q w;
	Consumer(Q obj){
		this.w = obj;
		Thread t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		System.out.println("Consumer run");
		int i =0;
		// TODO Auto-generated method stub
		while(i<30){
		w.get();
		i++;
		}
	}
}
