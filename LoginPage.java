import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginPage {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(56, 39, 82, 24);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(56, 87, 71, 24);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(178, 41, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(56, 213, 287, 24);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) {
				String str="Kukku";
				String str1="kukku";
				String pwd=""+new String (password.getPassword());
				
				if(textField.getText().equals(str) && pwd.equals(str1))
					label.setText("Login Success");
				else
					label.setText("Login unsuccess");
			}
		});
		btnNewButton.setBounds(114, 149, 89, 23);
		frame.getContentPane().add(btnNewButton);		
		
		password = new JPasswordField();
		password.setBounds(178, 89, 101, 20);
		frame.getContentPane().add(password);
		
	}
}
