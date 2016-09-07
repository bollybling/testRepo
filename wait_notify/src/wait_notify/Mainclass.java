package wait_notify;

public class Mainclass {
	
	public static void main(String args[]){
		System.out.println("main");
		Q obj = new Q();
		Producer p = new Producer(obj);
		Consumer c = new Consumer(obj);
		
	}
}
