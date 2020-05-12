package thucHanhTuan1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class SoNguyenTo extends JFrame {
	private JTextArea ta;
	private JTextField txt1;
	private JButton btnGeneral;
	private JTextField txtText;
	private int n;
	


	public SoNguyenTo() {
		setTitle("Primes");
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

		Container cp = getContentPane();
		
		JPanel pnlNorth;
		cp.add(pnlNorth = new JPanel(),BorderLayout.NORTH);
		pnlNorth.setPreferredSize(new Dimension(0,50));
		pnlNorth.add(txtText = new JTextField(20)); 
		pnlNorth.add(btnGeneral = new JButton("General"));
		
		JPanel pnlCenter;
		cp.add(pnlCenter = new JPanel());
		
		ta = new JTextArea(10,29);
		pnlCenter.add(new JScrollPane(ta));
		//pnlCenter.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		btnGeneral.addActionListener((e) -> {
			String s = txtText.getText().trim();
			try {
				n = Integer.parseInt(s);
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(this, "Lỗi\nVui lòng nhập số!");
			}catch (Exception e2) {
				JOptionPane.showMessageDialog(this, "Lỗi\nVui lòng nhập lại!");
			}
			int num=3;
			int snt=1;
			for (int i = 2; i <= n; ) {
				for (int j = 2; j <= Math.sqrt(num); j++) {
					if(num%j==0) {
						snt=0;
						break;
					}
				}
				if(snt!=0) {
					ta.setText(num+"\n");
				snt=1;
				num++;
				}
			}
		});
	
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new SoNguyenTo());
	}
}
