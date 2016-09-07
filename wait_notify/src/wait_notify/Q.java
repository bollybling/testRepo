package wait_notify;

public class Q {
	int n=0;
	boolean flag=false;
	synchronized int get(){
		if(!flag){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			System.out.println("GOT: "+n);
			flag = false;
			notify();
			return n;
	}
	
	
	synchronized void put(){
		if(flag){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		n++;
			System.out.println("PUT: "+n);
			flag = true;
			
			notify();
			
		}
	}
