package tuan4;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFirstGUI extends JFrame{
	private JButton btn;
	public MyFirstGUI() {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("The first GUI");
		setSize(400, 300);
		setLocationRelativeTo(null);
		
		setVisible(true);
		
		Container cp = getContentPane();
		String htmlButton = "<html><font color=\"#FF0080\"><u>Multi-line</u><br>Here</font></html>";
		cp.add(btn = new JButton(htmlButton));
	}
	public static void main(String[] args) {
	/*	SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});*/
		new MyFirstGUI().setVisible(true);
	}
}
