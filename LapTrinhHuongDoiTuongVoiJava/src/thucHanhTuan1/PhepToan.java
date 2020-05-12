package thucHanhTuan1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class PhepToan extends JFrame {
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKQ;
	private JButton btnGiai;
	private JButton btnXoa;
	private JButton btnThoat;
	private int A;
	private int B;
	private JRadioButton rdoCong;
	private JRadioButton rdoTru;
	private JRadioButton rdoNhan;
	private JRadioButton rdoChia;
	public PhepToan() {
		setTitle("^-^");
		setSize(700, 500);
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
		JLabel IblKQ = new JLabel("Kết quả:",JLabel.RIGHT);

		txtA = new JTextField(10);
		txtB = new JTextField(10);
		txtKQ = new JTextField(10);

		c.insets = new Insets(10, 10, 10, 10);
		c.ipadx=30;
		c.ipady=5;
		c.fill= GridBagConstraints.BOTH;

		pnlCenter.add(IblA,c);

		c.gridy=1;
		pnlCenter.add(IblB,c);

		c.gridy=3;
		pnlCenter.add(IblKQ,c);

		c.gridx=1;
		c.gridy=0;
		c.ipadx=200;
		pnlCenter.add(txtA,c);

		c.gridy=1;
		pnlCenter.add(txtB,c);

		c.gridy=2;
		c.ipady=25;
		JPanel pnlPheptoan;
		pnlCenter.add(pnlPheptoan = new JPanel(),c);
		pnlPheptoan.setLayout(new GridLayout(2, 2));
		pnlPheptoan.setBorder(BorderFactory.createTitledBorder("Phép toán"));
		
		pnlPheptoan.add(rdoCong = new JRadioButton("Cộng",true));
		pnlPheptoan.add(rdoTru = new JRadioButton("Trừ"));
		pnlPheptoan.add(rdoNhan = new JRadioButton("Nhân"));
		pnlPheptoan.add(rdoChia = new JRadioButton("Chia"));
		
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(rdoCong);
		btnGroup.add(rdoTru);
		btnGroup.add(rdoNhan);
		btnGroup.add(rdoChia);
		
		
		c.gridy=3;
		c.ipady=10;
		pnlCenter.add(txtKQ,c);
		
		
		JPanel pnlWest;
		cp.add(pnlWest = new JPanel(),BorderLayout.WEST);
		pnlWest.setBorder(BorderFactory.createTitledBorder("Chọn tác vụ"));
		pnlWest.setPreferredSize(new Dimension(100,0));

		pnlWest.add(btnGiai = new JButton("Giải"));
		pnlWest.add(btnXoa = new JButton("Xóa"));
		pnlWest.add(btnThoat = new JButton("Thoát"));
		
		btnGiai.setPreferredSize(btnThoat.getPreferredSize());
		btnXoa.setPreferredSize(btnThoat.getPreferredSize());
		
		JPanel pnlSouth;
		cp.add(pnlSouth = new JPanel(),BorderLayout.SOUTH);
		pnlSouth.setBackground(Color.pink);
		pnlSouth.add(new JLabel(new ImageIcon("image/logo_color.png")));
		pnlSouth.add(new JLabel(new ImageIcon("image/logo_color.png")));
		pnlSouth.add(new JLabel(new ImageIcon("image/logo_color.png")));
		
		pnlSouth.setPreferredSize(new Dimension(0,70));
		
		btnXoa.addActionListener((e) -> {
			txtA.setText("");
			txtB.setText("");
			txtKQ.setText("");
			rdoCong.setSelected(true);
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

			if(rdoCong.isSelected())
				txtKQ.setText((A+B)+"");
			else if(rdoTru.isSelected())
				txtKQ.setText((A-B)+"");
			else if(rdoNhan.isSelected())
				txtKQ.setText((A*B)+"");
			else {
				if(B==0)
					JOptionPane.showMessageDialog(this, "Nhập mẫu khác 0");
				else
					txtKQ.setText((double)(A/B)+"");
			}
	});
		
}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new PhepToan());
	}
}
