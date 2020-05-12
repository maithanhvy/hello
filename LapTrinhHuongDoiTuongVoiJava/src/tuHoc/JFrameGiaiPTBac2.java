package tuHoc;

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

public class JFrameGiaiPTBac2 extends JFrame {
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKQ;
	private JButton btnGiai;
	private JButton btnXoarong;
	private JButton btnThoat;
	private double kq=0;
	private int A;
	private int B;
	private int C;
	public JFrameGiaiPTBac2() {
		setTitle("^-^");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

		Container cp = getContentPane();

		JLabel IblTieude;
		cp.add(IblTieude = new JLabel("GIẢI PHƯƠNG TRÌNH BẬC 2",JLabel.CENTER),BorderLayout.NORTH);
		IblTieude.setOpaque(true);
		IblTieude.setBackground(Color.CYAN);
		IblTieude.setFont(new Font("Tahoma", Font.BOLD, 35));
		IblTieude.setPreferredSize(new Dimension(0,80));

		JPanel pnlCenter;
		cp.add(pnlCenter = new JPanel());
		pnlCenter.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		pnlCenter.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		JLabel IblA = new JLabel("Nhập a:",JLabel.RIGHT);
		JLabel IblB = new JLabel("Nhập b:",JLabel.RIGHT);
		JLabel IblC = new JLabel("Nhập c:",JLabel.RIGHT);
		JLabel IblKQ = new JLabel("Kết quả:",JLabel.RIGHT);

		txtA = new JTextField(15);
		txtB = new JTextField(15);
		txtC = new JTextField(15);
		txtKQ = new JTextField(15);

		c.insets = new Insets(10, 10, 10, 10);
		c.ipadx=50;
		c.ipady=10;
		c.fill= GridBagConstraints.BOTH;

		pnlCenter.add(IblA,c);

		c.gridy=1;
		pnlCenter.add(IblB,c);

		c.gridy=2;
		pnlCenter.add(IblC,c);

		c.gridy=3;
		pnlCenter.add(IblKQ,c);

		c.gridx=1;
		c.gridy=0;
		c.ipadx=400;
		pnlCenter.add(txtA,c);

		c.gridx=1;
		c.gridy=1;
		pnlCenter.add(txtB,c);

		c.gridx=1;
		c.gridy=2;
		pnlCenter.add(txtC,c);

		c.gridx=1;
		c.gridy=3;
		pnlCenter.add(txtKQ,c);

		JPanel pnlSouth;
		cp.add(pnlSouth = new JPanel(),BorderLayout.SOUTH);
		pnlSouth.setBorder(BorderFactory.createTitledBorder("Chọn tác vụ"));
		pnlSouth.setPreferredSize(new Dimension(0,70));

		pnlSouth.add(btnGiai = new JButton("Giải"));
		pnlSouth.add(btnXoarong = new JButton("Xóa rỗng"));
		pnlSouth.add(btnThoat = new JButton("Thoát"));

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
				A = Integer.parseInt(stra);
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(this, "Lỗi\nVui lòng nhập số!");
			} catch(Exception e2) {
				JOptionPane.showConfirmDialog(this, "Lỗi\nVui lòng nhập lại!");
			}

			String strb = txtB.getText().trim();
			try {
				B = Integer.parseInt(strb);
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(this, "Lỗi\nVui lòng nhập số!");
			} catch(Exception e2) {
				JOptionPane.showConfirmDialog(this, "Lỗi\nVui lòng nhập lại!");
			}

			String strc = txtC.getText().trim();
			try {
				C = Integer.parseInt(strc);
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(this, "Lỗi\nVui lòng nhập số!");
			} catch(Exception e2) {
				JOptionPane.showConfirmDialog(this, "Lỗi\nVui lòng nhập lại!");
			}
			if(A==0) {
				if(B==0) {
					txtKQ.setText("Vô nghiệm");
				}else {
					txtKQ.setText((-(C/B))+"");
				}
			}
			float del = B*B-4*A*C;
			if(del>0) {
				txtKQ.setText("x1= "+((-B+Math.sqrt(del))/(2*A))+",  x2= "+((-B-Math.sqrt(del))/(2*A)));
			}else if(del==0) {
				txtKQ.setText((-B/(2*A))+"");
			}else {
				txtKQ.setText("Vô nghiệm");
			}
			
	});
}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new JFrameGiaiPTBac2());
	}
}
