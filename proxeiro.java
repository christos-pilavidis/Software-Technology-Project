package erg1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Label;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import javax.swing.JTextPane;
import java.awt.Button;

public class proxeiro extends JFrame {
	public proxeiro() {
	}

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					proxeiro frame = new proxeiro();
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
	public proxeiro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1250, 730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label WELCOME_label = new Label("welcome to reservation+");
		WELCOME_label.setForeground(Color.WHITE);
		WELCOME_label.setFont(new Font("Calibri", Font.BOLD, 15));
		WELCOME_label.setBounds(10, 10, 274, 26);
		contentPane.add(WELCOME_label);
		
		Label Support_label = new Label("Support-Help ");
		Support_label.setForeground(Color.WHITE);
		Support_label.setAlignment(Label.CENTER);
		Support_label.setFont(new Font("Calibri", Font.BOLD, 15));
		Support_label.setBounds(572, 10, 654, 26);
		contentPane.add(Support_label);
		
		JTextPane txtpnContactInfo = new JTextPane();
		txtpnContactInfo.setFont(new Font("Calibri", Font.BOLD, 14));
		txtpnContactInfo.setText("Contact info ");
		txtpnContactInfo.setBounds(227, 189, 138, 26);
		contentPane.add(txtpnContactInfo);
		
		JTextPane txtpnEmailReservationgmailcom = new JTextPane();
		txtpnEmailReservationgmailcom.setFont(new Font("Calibri", Font.BOLD, 14));
		txtpnEmailReservationgmailcom.setText("email : reservation+@gmail.com \r\ntelephone number : 2102333333");
		txtpnEmailReservationgmailcom.setBounds(227, 215, 339, 43);
		contentPane.add(txtpnEmailReservationgmailcom);
		
		JTextPane txtpnContactForm = new JTextPane();
		txtpnContactForm.setText("Contact form ");
		txtpnContactForm.setToolTipText("");
		txtpnContactForm.setFont(new Font("Calibri", Font.BOLD, 15));
		txtpnContactForm.setBounds(227, 305, 138, 26);
		contentPane.add(txtpnContactForm);
		
		JTextPane txtpnNameRestaurants = new JTextPane();
		txtpnNameRestaurants.setText("Name :\r\nrestaurant\"s name : \r\nType message : ");
		txtpnNameRestaurants.setFont(new Font("Calibri", Font.BOLD, 14));
		txtpnNameRestaurants.setBounds(227, 330, 639, 233);
		contentPane.add(txtpnNameRestaurants);
		
		Button Back_button = new Button("SEND ");
		Back_button.setFont(new Font("Calibri", Font.BOLD, 12));
		Back_button.setBounds(1141, 639, 85, 44);
		contentPane.add(Back_button);
		
		Button Send_message_button = new Button("BACK ");
		Send_message_button.setFont(new Font("Calibri", Font.BOLD, 15));
		Send_message_button.setBounds(10, 639, 85, 44);
		contentPane.add(Send_message_button);
	}
}