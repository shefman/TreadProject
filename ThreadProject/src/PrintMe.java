
public class PrintMe implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0 ; i<10 ; i++){
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
