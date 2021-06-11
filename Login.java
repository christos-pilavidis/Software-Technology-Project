
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Button;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.TextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Image;

public class login extends JFrame {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public login() {
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 794, 501);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(50, 50, 50, 50));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbllogo = new JLabel("");
		lbllogo.setIcon(new ImageIcon(login.class.getResource("/Biglogo.png")));
		lbllogo.setBounds(179, 35, 473, 220);
		contentPane.add(lbllogo);
		
		JTextField txtUsername = new JTextField();
		txtUsername.setFont(new Font("Calibri", Font.PLAIN, 13));
		txtUsername.setBounds(204, 276, 138, 35);
		contentPane.add(txtUsername);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setBounds(204, 336, 138, 35);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(204, 258, 94, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(204, 321, 94, 20);
		contentPane.add(lblNewLabel_1_1);
		
		Button btnNewButton = new Button("Log in");
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 14));
		btnNewButton.setBounds(465, 276, 145, 35);
		contentPane.add(btnNewButton);
		
		Button btnRegister = new Button("Register");
		btnRegister.setFont(new Font("Calibri", Font.BOLD, 14));
		btnRegister.setBounds(465, 336, 145, 35);
		contentPane.add(btnRegister);
		
		JLabel passwordlbl = new JLabel("");
		Image img= new ImageIcon(this.getClass().getResource("/password.png")).getImage();
		passwordlbl.setIcon(new ImageIcon(img));
		passwordlbl.setBounds(179, 342, 24, 24);
		contentPane.add(passwordlbl);
		
		JLabel userlbl = new JLabel("");
		Image img1= new ImageIcon(this.getClass().getResource("/user.png")).getImage();
		userlbl.setIcon(new ImageIcon(img1));
		userlbl.setBounds(180, 281, 24, 24);
		contentPane.add(userlbl);
		
		
	}
}
