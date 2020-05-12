package thucHanhTuan1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class GiaiPTbac2 extends JFrame {
	private JLabel lblA;
	private JLabel lblB;
	private JLabel lblC;
	private JLabel lblKQ;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKQ;
	private JButton btnGiai;
	private JButton btnXoarong;
	private JButton btnThoat;
	private int a;
	private int b;
	private int c;
	public GiaiPTbac2() {
		setTitle("^-^");
		setSize(700,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		Container cp = getContentPane();
		
		JLabel lblTitle;
		cp.add(lblTitle = new JLabel("GIẢI PHƯƠNG TRÌNH BẬC 2",JLabel.CENTER),BorderLayout.NORTH);		
		lblTitle.setOpaque(true);
		lblTitle.setBackground(Color.CYAN);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblTitle.setPreferredSize(new Dimension(0,80));
		
		JPanel pnlCenter;
		cp.add(pnlCenter = new JPanel());
		pnlCenter.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		pnlCenter.setLayout(new GridBagLayout());
		GridBagConstraints g = new GridBagConstraints();
		
		
		pnlCenter.add(lblA = new JLabel("Nhập a:",JLabel.RIGHT));
		pnlCenter.add(lblB = new JLabel("Nhập b:",JLabel.RIGHT));
		pnlCenter.add(lblC = new JLabel("Nhập c:",JLabel.RIGHT));
		pnlCenter.add(lblKQ = new JLabel("Kết quả:",JLabel.RIGHT));
		
		txtA = new JTextField(12);
		txtB = new JTextField(12);
		txtC = new JTextField(12);
		txtKQ = new JTextField(12);
		
		g.insets = new Insets(10, 10, 10, 10);
		g.ipadx=50;
		g.ipady=10;
		g.fill=GridBagConstraints.BOTH;
		
		pnlCenter.add(lblA, g);
		
		g.gridy=1;
		pnlCenter.add(lblB, g);
		
		g.gridy=2;
		pnlCenter.add(lblC, g);
		
		g.gridy=3;
		pnlCenter.add(lblKQ, g);
		
		g.gridy=0;
		g.ipadx=200;
		pnlCenter.add(txtA,g);
		
		g.gridy=1;
		pnlCenter.add(txtB,g);
		
		g.gridy=2;
		pnlCenter.add(txtC,g);
		
		g.gridy=3;
		pnlCenter.add(txtKQ,g);
		
		
		JPanel pnlSouth;
		cp.add(pnlSouth = new JPanel(),BorderLayout.SOUTH);
		pnlSouth.setBorder(BorderFactory.createTitledBorder("Chọn chức vụ"));
		pnlSouth.setPreferredSize(new Dimension(0, 80));
		
		pnlSouth.add(btnGiai = new JButton("Giải"));
		pnlSouth.add(btnXoarong = new JButton("Xóa rỗng"));
		pnlSouth.add(btnThoat = new JButton("Thoát"));
		
//		txtKQ.setBorder(BorderFactory.createLineBorder(Color.gray));
//		txtKQ.setFont(txtKQ.getFont().deriveFont(Font.ITALIC));
//		txtKQ.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10), BorderFactory.createLineBorder(Color.BLACK)));
		txtKQ.setBackground(Color.LIGHT_GRAY);
		btnXoarong.addActionListener((e) -> {
			txtA.setText("");
			txtB.setText("");
			txtC.setText("");
			txtKQ.setText("");
			txtA.requestFocus();
		});
		
		btnThoat.addActionListener((e) -> System.exit(1));
		
		btnGiai.addActionListener((e) -> {
			String stra = txtA.getText().trim();
			try {
				a = Integer.parseInt(stra);
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(this, "Lỗi\nVui lòng nhập số!");
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(this, "Lỗi\nVui lòng nhập lại!");
			}
			
			String strb = txtB.getText().trim();
			try {
				b = Integer.parseInt(strb);
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(this, "Lỗi\nVui lòng nhập số!");
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(this, "Lỗi\nVui lòng nhập lại!");
			}
			
			String strc = txtC.getText().trim();
			try {
				c = Integer.parseInt(strc);
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(this, "Lỗi\nVui lòng nhập số!");
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(this, "Lỗi\nVui lòng nhập lại!");
			}
			
			if(a==0) {
				if(b==0)
					txtKQ.setText("Vô nghiệm");
				else
					txtKQ.setText((-b/(2*a)+""));
			}else {
				int del = b*b-4*a*c;
				if(del>0)
					txtKQ.setText("x1= "+(-b+Math.sqrt(del))/(2*a)+"   x2= "+(-b-Math.sqrt(del)/(2*a)));
				else if(del==0)
					txtKQ.setText((-b/(2*a))+"");
				else
					txtKQ.setText("Vô nghiệm");
			}
		});
		
		
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new GiaiPTbac2());
	}
}