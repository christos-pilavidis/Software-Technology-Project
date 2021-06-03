package erg1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Signup extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
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
	public Signup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698, 480);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(53, 66, 190, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(53, 44, 83, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblRestaurantName = new JLabel("Restaurant Name");
		lblRestaurantName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRestaurantName.setBounds(53, 139, 130, 29);
		contentPane.add(lblRestaurantName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(53, 161, 190, 38);
		contentPane.add(textField_1);
		
		JLabel lblEmail = new JLabel("E-mail\r\n");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(53, 234, 83, 29);
		contentPane.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(53, 256, 190, 38);
		contentPane.add(textField_2);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(53, 323, 83, 29);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(53, 345, 190, 38);
		contentPane.add(passwordField);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(408, 66, 45, 38);
		contentPane.add(spinner);
		
		JLabel lblTables = new JLabel("Tables");
		lblTables.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTables.setBounds(353, 67, 60, 32);
		contentPane.add(lblTables);
		
		Button button = new Button("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(518, 373, 83, 28);
		contentPane.add(button);
		
		Button button_1 = new Button("\u03A0\u03AF\u03C3\u03C9");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(401, 373, 83, 28);
		contentPane.add(button_1);
		
		JLabel lblNewLabel_1 = new JLabel("                                                                  Welcome to Reservation+");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(0, 0, 682, 29);
		contentPane.add(lblNewLabel_1);
	}
}
