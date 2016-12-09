package kumar;

import java.io.Serializable;

import gui.GuiThreads;

public class WorkerThread implements Runnable {

	private String command;
	private static int completed = 0;
	public static int proc;
	
	public WorkerThread(String gString){
		command = gString;
	}
	
	private void processCommand(){
		try {			
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void run() {
		// TODO Auto-generated method stub
        System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
        processCommand();
        System.out.println(Thread.currentThread().getName()+" End.");
        completed++;
        
        GuiThreads.slider.setValue(completed);
        synchronized (this) {
        	proc = Math.round(completed*100/15);
            GuiThreads.output.setText(String.valueOf(proc));
		} 
	}
	
    public String toString(){
    	return this.command;
	}

}
