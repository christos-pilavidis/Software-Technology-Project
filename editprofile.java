import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JLabel;
import java.awt.Button;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

public class editprofile extends JFrame {

	private JPanel contentPane;
	private JTextField txtTelephoneNumber;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					editprofile frame = new editprofile();
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
	public editprofile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1250, 730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label welcome = new Label("Welcome to reservation+");
		welcome.setFont(new Font("Calibri", Font.BOLD, 15));
		welcome.setForeground(Color.WHITE);
		welcome.setBounds(10, 10, 273, 32);
		contentPane.add(welcome);
		
		Label edit_profile = new Label("Edit profile ");
		edit_profile.setForeground(Color.WHITE);
		edit_profile.setFont(new Font("Calibri", Font.BOLD, 15));
		edit_profile.setBounds(1065, 0, 171, 42);
		contentPane.add(edit_profile);
		
		JTextArea txtrOwnersName = new JTextArea();
		txtrOwnersName.setText("Owner's name :");
		txtrOwnersName.setFont(new Font("Calibri", Font.BOLD, 15));
		txtrOwnersName.setBounds(404, 204, 364, 24);
		contentPane.add(txtrOwnersName);
		
		JTextArea txtrBusinessName = new JTextArea();
		txtrBusinessName.setFont(new Font("Calibri", Font.BOLD, 15));
		txtrBusinessName.setText("Business name :");
		txtrBusinessName.setBounds(404, 295, 364, 24);
		contentPane.add(txtrBusinessName);
		
		txtTelephoneNumber = new JTextField();
		txtTelephoneNumber.setText("Telephone number:");
		txtTelephoneNumber.setFont(new Font("Calibri", Font.BOLD, 15));
		txtTelephoneNumber.setBounds(404, 374, 364, 24);
		contentPane.add(txtTelephoneNumber);
		txtTelephoneNumber.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Calibri", Font.BOLD, 15));
		txtEmail.setText("Email :");
		txtEmail.setBounds(404, 455, 364, 24);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 22));
		btnNewButton.setBounds(1115, 650, 121, 33);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 22));
		btnNewButton_1.setBounds(10, 650, 121, 33);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Business info ");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(404, 135, 140, 24);
		contentPane.add(lblNewLabel);
	}
}
