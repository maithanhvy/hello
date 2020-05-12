package thucHanhTuan1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

public class DemoButton extends JFrame{
	private JLabel lbl;
	private JRadioButton rdoCenter;
	private JRadioButton rdoLeft;
	private JRadioButton rdoRight;
	public JMenu menuEdit;
	public JMenuItem menuItemCut;
	public JMenuItem menuItemCopy;
	private Component add;
	public DemoButton() {
		setTitle("^-^");
		setSize(700,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

		Container cp = getContentPane();

		JPanel pnl;
		cp.add(pnl = new JPanel());
		pnl.setLayout(new GridLayout(0,1));
		pnl.add(lbl = new JLabel("This is an example"));
		lbl.setOpaque(true);
		lbl.setFont(lbl.getFont().deriveFont(Font.ITALIC));
		lbl.setBackground(Color.blue);
		lbl.setForeground(Color.white);
		
		JCheckBox chk;
		pnl.add(chk = new JCheckBox("Italic", true));
		
		pnl.add(rdoLeft = new JRadioButton("Left", true));
		pnl.add(rdoCenter = new JRadioButton("Center"));
		pnl.add(rdoRight = new JRadioButton("Right"));
		
		ButtonGroup rdoGroup = new ButtonGroup();
		rdoGroup.add(rdoLeft);
		rdoGroup.add(rdoCenter);
		rdoGroup.add(rdoRight);
		
		chk.addItemListener((e)->{
			if(chk.isSelected())
				lbl.setFont(lbl.getFont().deriveFont(Font.ITALIC));
			else
				lbl.setFont(lbl.getFont().deriveFont(Font.PLAIN));
		});
		
		rdoLeft.addActionListener((e)->lbl.setHorizontalAlignment(JLabel.LEFT));
		rdoRight.addActionListener((e)->lbl.setHorizontalAlignment(JLabel.RIGHT));
		rdoCenter.addActionListener((e)->lbl.setHorizontalAlignment(JLabel.CENTER));
		
		//setJMenuBar(new MyMenuBar());
		//pnl.add(menuEdit = new JMenu("Edit"),BorderLayout.NORTH);
		//menuEdit.setMnemonic(KeyEvent.VK_E);
		
		//menuEdit.add(menuItemCut = new JMenuItem("Cut", new ImageIcon("image/checked.png")));
		pnl.add(new JMenuBar(menuEdit = new JMenu("Edit")));
	}

	class MyMenuBar extends JMenuBar {
		public MyMenuBar() {
			menuEdit = new JMenu("Edit");
			menuEdit.setMnemonic(KeyEvent.VK_E);
			add(menuEdit);
			
			menuEdit.add(menuItemCut = new JMenuItem("Cut", new ImageIcon("image/checked.png")));
			menuItemCut.setMnemonic(KeyEvent.VK_T);
			
			menuEdit.add(new JSeparator());
			
			menuEdit.add(menuItemCopy = new JMenuItem("Copy", new ImageIcon("image/logo_color.png")));
			menuItemCut.setMnemonic(KeyEvent.VK_C);
			
			menuItemCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
			
		}
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new DemoButton());
	}
}

