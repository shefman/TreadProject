package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTextArea;

import kumar.WorkerPool;


public abstract class GuiThreads {
	
	public static JSlider slider = new JSlider(0,15,0);
	private static JButton startButton = new JButton("Start");
	public static JTextArea output = new JTextArea("0%");
	private JProgressBar progress;
	
	public GuiThreads(){
		slider = new JSlider();
		progress = new JProgressBar();
		startButton = new JButton("Start");
		output = new JTextArea("0%");
	}
	
	private class CloseHandler extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	}
	
/*	private class StartHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			try {
				WorkerPool.workPool();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}*/


	public static void launchFrame(){
		JFrame frame = new JFrame("GUI THREADS");
		frame.setLayout(new BorderLayout());
		frame.add(slider,BorderLayout.CENTER);
		frame.add(output, BorderLayout.NORTH);
/*		startButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					WorkerPool.workPool();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});*/
//		frame.addWindowListener(new CloseHandler());


		frame.pack();
		frame.setVisible(true);

	}

}
