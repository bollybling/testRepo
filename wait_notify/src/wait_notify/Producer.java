package wait_notify;

public class Producer implements Runnable{
	Q w;
	Producer( Q obj){
		this.w = obj;
		Thread t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		int i = 0;
		// TODO Auto-generated method stub
		System.out.println("producer run");
		while(i<30){
		w.put();
		i++;
		}
	}
	
	
}
