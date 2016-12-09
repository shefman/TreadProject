package kumar;

import gui.GuiThreads;

import java.util.concurrent.ThreadPoolExecutor;

public class MyMonitorThread implements Runnable {
	
	private ThreadPoolExecutor executor;
	private int seconds;
	private boolean run=true;
	
	public MyMonitorThread(ThreadPoolExecutor gExecutor, int delay) {
		// TODO Auto-generated constructor stub
		executor = gExecutor;
		seconds = delay;
	}

	public void shutdown(){
		run = false;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		while(run){
			System.out.println(
					String.format("[monitor] [%d/%d] Active: %d, Completed: %d, Task: %d, isShutdown: %s, isTerminated: %s",
						this.executor.getPoolSize(),
						this.executor.getCorePoolSize(),
						this.executor.getActiveCount(),
						this.executor.getCompletedTaskCount(),
						this.executor.getTaskCount(),
						this.executor.isShutdown(),
						this.executor.isTerminated()));
			GuiThreads.slider.setValue((int) this.executor.getCompletedTaskCount());
			try {
				Thread.sleep(seconds*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}


	}

}
