package tuan4;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JTextFieldDemo extends JFrame {
	public JTextFieldDemo() {
		setTitle("JTextField Demo");
		setSize(300, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		Container cp = getContentPane();
		
		JPanel pnl;
		cp.add(pnl = new JPanel(), BorderLayout.NORTH);
		
	}
}
