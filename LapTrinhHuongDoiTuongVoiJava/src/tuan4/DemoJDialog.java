package tuan4;

import javax.swing.JDialog;

public class DemoJDialog extends JDialog {
	public DemoJDialog() {
		setTitle("My first dialog");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);	
		setSize(300, 200);
		setModal(true);
		this.setAlwaysOnTop(true);
	}
	public static void main(String[] args) {
		new DemoJDialog().setVisible(true);
	}

}
