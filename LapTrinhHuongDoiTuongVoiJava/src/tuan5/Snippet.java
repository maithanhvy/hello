package tuan5;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;

public class Snippet extends JFrame {
	private JList<Students> list;
	private DefaultListModel<Students> dm;
	private List<Students> students;

	public Snippet() {
		setTitle("^-^");
		setSize(800,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		students = FileManager.getStudents("data/dssv_nguon.txt");

		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		dm =new DefaultListModel<Students>();
		JScrollPane sc;
		cp.add(sc = new JScrollPane(list = new JList<Students>(dm)));
		
		list.setVisibleRowCount(4);
		list.setLayoutOrientation(JList.VERTICAL);
		
		students.forEach(st ->{
			dm.addElement(st);
		});
		
		sc.setPreferredSize(new Dimension(350,350));
		sc.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10), BorderFactory.createLineBorder(Color.BLACK)));
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		JLabel resultLabel;
		cp.add(resultLabel = new JLabel());
		resultLabel.setPreferredSize(new Dimension(350, 350));
		resultLabel.setBorder(BorderFactory.createLineBorder(Color.gray));
		resultLabel.setFont(resultLabel.getFont().deriveFont(Font.ITALIC));
		resultLabel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10), BorderFactory.createLineBorder(Color.BLACK)));
		resultLabel.setVerticalAlignment(JLabel.TOP);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new Snippet());
	}
}

