
public class TestThreeThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable prog = new PrintMe();
		Thread thr1 = new Thread(prog);
		Thread thr2 = new Thread(prog);
		Thread thr3 = new Thread(prog);
		thr1.setName("thr1");
		thr2.setName("thr2");
		thr3.setName("thr3");
		thr1.start();
		thr2.start();
		thr3.start();
	}

}
