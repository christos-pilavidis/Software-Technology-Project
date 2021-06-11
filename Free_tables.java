package erg1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JTable;
import java.awt.Button;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Free_tables extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Free_tables frame = new Free_tables();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Free_tables frame = new Free_tables();
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
	public Free_tables() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		Label welcome_label = new Label("Welcome to Reservation+");
		welcome_label.setAlignment(Label.CENTER);
		welcome_label.setFont(new Font("Calibri", Font.BOLD, 15));
		welcome_label.setForeground(new Color(255, 255, 255));
		welcome_label.setBackground(new Color(51, 51, 51));
		welcome_label.setBounds(-69, 0, 337, 26);
		contentPane.add(welcome_label);
		
		
		Label edit_profile = new Label("Free Table");
		edit_profile.setForeground(Color.WHITE);
		edit_profile.setFont(new Font("Calibri", Font.BOLD, 15));
		edit_profile.setBounds(815, 0, 171, 42);
		contentPane.add(edit_profile);
		
		JLabel logolbl1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Logo.png")).getImage();
		logolbl1.setIcon(new ImageIcon(img));
		logolbl1.setBounds(20, 42, 191, 64);
		contentPane.add(logolbl1);
		
		JLabel lblNewLabel = new JLabel("Free Table");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(248, 137, 110, 42);
		contentPane.add(lblNewLabel);
		
		
		
		
		
		Button button_1 = new Button("102");
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(248, 185, 70, 22);
		contentPane.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createres crt = new createres();
				crt.NewScreen();
				
			}
		});
		
		Button button_2 = new Button("103");
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(248, 213, 70, 22);
		contentPane.add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createres crt = new createres();
				crt.NewScreen();
				
			}
		});
		
		Button button_13 = new Button("104");
		button_3.setBackground(new Color(0, 204, 0));
		button_3.setBounds(248, 241, 70, 22);
		contentPane.add(button_3);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createres crt = new createres();
				crt.NewScreen();
				
			}
		});
		
		Button button_4 = new Button("105");
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(248, 269, 70, 22);
		contentPane.add(button_4);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createres crt = new createres();
				crt.NewScreen();
				
			}
		});
		
		Button button_5 = new Button("106");
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(248, 299, 70, 22);
		contentPane.add(button_5);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createres crt = new createres();
				crt.NewScreen();
				
			}
		});
		
		Button button_6 = new Button("107");
		button_6.setBackground(Color.WHITE);
		button_6.setBounds(330, 185, 70, 22);
		contentPane.add(button_6);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createres crt = new createres();
				crt.NewScreen();
				
			}
		});
		
		Button button_8 = new Button("109");
		button_8.setBackground(Color.WHITE);
		button_8.setBounds(330, 213, 70, 22);
		contentPane.add(button_8);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createres crt = new createres();
				crt.NewScreen();
				
			}
		});
		
		Button button_9 = new Button("110");
		button_9.setBackground(Color.WHITE);
		button_9.setBounds(330, 241, 70, 22);
		contentPane.add(button_9);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createres crt = new createres();
				crt.NewScreen();
				
			}
		});
		
		Button button_11 = new Button("112");
		button_11.setBackground(Color.WHITE);
		button_11.setBounds(330, 269, 70, 22);
		contentPane.add(button_11);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createres crt = new createres();
				crt.NewScreen();
				
			}
		});
		
		Button button_12 = new Button("113");
		button_12.setBackground(Color.WHITE);
		button_12.setBounds(330, 299, 70, 22);
		contentPane.add(button_12);
		
		Button button_2_1 = new Button("104");
		button_2_1.setBackground(Color.WHITE);
		button_2_1.setBounds(248, 241, 70, 22);
		contentPane.add(button_2_1);
		
		Button button_3 = new Button("Back");
		button_3.setFont(new Font("Dialog", Font.BOLD, 15));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(10, 568, 118, 42);
		contentPane.add(button_3);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createres crt = new createres();
				crt.NewScreen();
				
			}
		});
		
		Button button = new Button("101");
		button.setBackground(new Color(255, 0, 0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createres crt = new createres();
				crt.NewScreen();
				
			}
		});
		
		
		
		
		
		
		
}
}