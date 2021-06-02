import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Label;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.border.LineBorder;
import java.awt.Button;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JCalendar;

public class create_res extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					create_res frame = new create_res();
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
	public create_res() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1250, 730);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new LineBorder(new Color(153, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label welcome_label = new Label("Welcome to Reservation+");
		welcome_label.setAlignment(Label.CENTER);
		welcome_label.setFont(new Font("Calibri", Font.BOLD, 15));
		welcome_label.setForeground(new Color(204, 0, 0));
		welcome_label.setBackground(new Color(51, 51, 51));
		welcome_label.setBounds(0, 0, 351, 37);
		contentPane.add(welcome_label);
		
		TextField textTable = new TextField();
		textTable.setForeground(new Color(0, 0, 0));
		textTable.setFont(new Font("Calibri", Font.PLAIN, 15));
		textTable.setBounds(726, 111, 233, 37);
		contentPane.add(textTable);
		
		Label create_res_label = new Label("Create Reservation");
		create_res_label.setFont(new Font("Calibri", Font.BOLD, 15));
		create_res_label.setForeground(new Color(204, 0, 0));
		create_res_label.setBackground(new Color(51, 51, 51));
		create_res_label.setAlignment(Label.CENTER);
		create_res_label.setBounds(790, 0, 446, 37);
		contentPane.add(create_res_label);
		
		TextField textTable_1 = new TextField();
		textTable_1.setForeground(Color.BLACK);
		textTable_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		textTable_1.setBounds(726, 189, 233, 37);
		contentPane.add(textTable_1);
		
		TextField textTable_2 = new TextField();
		textTable_2.setForeground(Color.BLACK);
		textTable_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		textTable_2.setBounds(726, 267, 233, 37);
		contentPane.add(textTable_2);
		
		TextField textTable_3 = new TextField();
		textTable_3.setForeground(Color.BLACK);
		textTable_3.setFont(new Font("Calibri", Font.PLAIN, 15));
		textTable_3.setBounds(726, 347, 233, 37);
		contentPane.add(textTable_3);
		
		TextField textTable_4 = new TextField();
		textTable_4.setForeground(Color.BLACK);
		textTable_4.setFont(new Font("Calibri", Font.PLAIN, 15));
		textTable_4.setBounds(726, 424, 233, 37);
		contentPane.add(textTable_4);
		
		TextField textTable_5 = new TextField();
		textTable_5.setForeground(Color.BLACK);
		textTable_5.setFont(new Font("Calibri", Font.PLAIN, 15));
		textTable_5.setBounds(726, 508, 233, 87);
		contentPane.add(textTable_5);
		
		Button create_res_button = new Button("Create Reservation");
		create_res_button.setBackground(new Color(51, 51, 51));
		create_res_button.setForeground(new Color(255, 255, 255));
		create_res_button.setFont(new Font("Calibri", Font.BOLD, 13));
		create_res_button.setBounds(1001, 621, 200, 48);
		contentPane.add(create_res_button);
		
		Label label_create_res = new Label("Table:");
		label_create_res.setFont(new Font("Calibri", Font.PLAIN, 12));
		label_create_res.setForeground(new Color(255, 255, 255));
		label_create_res.setBounds(726, 84, 59, 21);
		contentPane.add(label_create_res);
		
		Label label_create_res_1 = new Label("Name:");
		label_create_res_1.setForeground(Color.WHITE);
		label_create_res_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		label_create_res_1.setBounds(726, 162, 87, 21);
		contentPane.add(label_create_res_1);
		
		Label label_create_res_2 = new Label("Number of People:");
		label_create_res_2.setForeground(Color.WHITE);
		label_create_res_2.setFont(new Font("Calibri", Font.PLAIN, 12));
		label_create_res_2.setBounds(726, 240, 132, 21);
		contentPane.add(label_create_res_2);
		
		Label label_create_res_3 = new Label("Time of Arrival:");
		label_create_res_3.setForeground(Color.WHITE);
		label_create_res_3.setFont(new Font("Calibri", Font.PLAIN, 12));
		label_create_res_3.setBounds(726, 321, 109, 21);
		contentPane.add(label_create_res_3);
		
		Label label_create_res_4 = new Label("Contact Number:");
		label_create_res_4.setForeground(Color.WHITE);
		label_create_res_4.setFont(new Font("Calibri", Font.PLAIN, 12));
		label_create_res_4.setBounds(726, 397, 132, 21);
		contentPane.add(label_create_res_4);
		
		Label label_create_res_5 = new Label("Comments:");
		label_create_res_5.setForeground(Color.WHITE);
		label_create_res_5.setFont(new Font("Calibri", Font.PLAIN, 12));
		label_create_res_5.setBounds(726, 481, 109, 21);
		contentPane.add(label_create_res_5);
		
		Button back_button = new Button("Back");
		back_button.setFont(new Font("Calibri", Font.BOLD, 13));
		back_button.setForeground(new Color(255, 255, 255));
		back_button.setBackground(new Color(51, 51, 51));
		back_button.setBounds(0, 628, 98, 41);
		contentPane.add(back_button);
		
		Label label = new Label("DATE :");
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("Calibri", Font.PLAIN, 15));
		label.setBounds(43, 127, 87, 21);
		contentPane.add(label);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(124, 127, 427, 367);
		contentPane.add(calendar);
	}
}
