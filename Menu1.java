package erg1;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Panel;
import java.awt.List;
import java.awt.Scrollbar;
import java.awt.ScrollPane;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Label;
import javax.swing.JSlider;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import java.awt.TextField;
import javax.swing.JTextField;

public class Menu1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu1 frame = new Menu1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu1() {
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 731, 463);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Button button_1 = new Button("102");
		button_1.setBackground(new Color(0, 204, 0));
		button_1.setBounds(53, 178, 70, 22);
		contentPane.add(button_1);
		
		Button button_2 = new Button("103");
		button_2.setBackground(new Color(0, 204, 0));
		button_2.setBounds(53, 247, 70, 22);
		contentPane.add(button_2);
		
		Button button_3 = new Button("104");
		button_3.setBackground(new Color(0, 204, 0));
		button_3.setBounds(168, 110, 70, 22);
		contentPane.add(button_3);
		
		Button button_4 = new Button("105");
		button_4.setBackground(new Color(0, 204, 0));
		button_4.setBounds(168, 178, 70, 22);
		contentPane.add(button_4);
		
		Button button_5 = new Button("106");
		button_5.setBackground(new Color(0, 204, 0));
		button_5.setBounds(168, 247, 70, 22);
		contentPane.add(button_5);
		
		Button button_6 = new Button("107");
		button_6.setBackground(new Color(0, 204, 0));
		button_6.setBounds(286, 110, 70, 22);
		contentPane.add(button_6);
		
		Button button_7 = new Button("108");
		button_7.setBackground(new Color(255, 0, 0));
		button_7.setBounds(286, 178, 70, 22);
		contentPane.add(button_7);
		
		Button button_8 = new Button("109");
		button_8.setBackground(new Color(0, 204, 0));
		button_8.setBounds(286, 247, 70, 22);
		contentPane.add(button_8);
		
		Button button_9 = new Button("110");
		button_9.setBackground(new Color(0, 204, 0));
		button_9.setBounds(381, 147, 70, 22);
		contentPane.add(button_9);
		
		Button button_10 = new Button("111");
		button_10.setBackground(new Color(255, 0, 0));
		button_10.setBounds(381, 214, 70, 22);
		contentPane.add(button_10);
		
		Button button_11 = new Button("112");
		button_11.setBackground(new Color(0, 204, 0));
		button_11.setBounds(476, 147, 70, 22);
		contentPane.add(button_11);
		
		Button button_12 = new Button("113");
		button_12.setBackground(new Color(0, 204, 0));
		button_12.setBounds(476, 214, 70, 22);
		contentPane.add(button_12);
		
		Button button = new Button("101");
		button.setBackground(new Color(255, 0, 0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(53, 110, 70, 22);
		contentPane.add(button);
		
		Button button_13 = new Button("Επεξεργασία κράτησης");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_13.setBounds(566, 89, 126, 22);
		contentPane.add(button_13);
		
		Button button_13_1 = new Button("New button");
		button_13_1.setBounds(622, 198, 70, 22);
		contentPane.add(button_13_1);
		
		Button button_13_2 = new Button("New button");
		button_13_2.setBounds(622, 134, 70, 22);
		contentPane.add(button_13_2);
		
		Button button_13_3 = new Button("New button");
		button_13_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_13_3.setBounds(622, 158, 70, 22);
		contentPane.add(button_13_3);
		
		Button button_13_4 = new Button("New button");
		button_13_4.setBounds(622, 178, 70, 22);
		contentPane.add(button_13_4);
		
		Button button_13_5 = new Button("New button");
		button_13_5.setBounds(622, 214, 70, 22);
		contentPane.add(button_13_5);
		
		Button button_13_6 = new Button("Δημιουργία κράτησης");
		button_13_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_13_6.setBounds(566, 68, 126, 22);
		contentPane.add(button_13_6);
		
		Button button_14 = new Button("");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_14.setBounds(669, 110, 36, 22);
		contentPane.add(button_14);
		
		TextField textField = new TextField();
		textField.setText("\u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7");
		textField.setBounds(566, 110, 102, 22);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(152, 38, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}

