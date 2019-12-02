import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FaranheatCelc {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FaranheatCelc window = new FaranheatCelc();
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
	public FaranheatCelc() {
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
		
		JLabel lblNewLabel = new JLabel("Degrees");
		lblNewLabel.setBounds(80, 25, 80, 23);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(170, 26, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("Result = ");
		label.setBounds(108, 95, 86, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(170, 95, 109, 14);
		frame.getContentPane().add(label_1);
		
		JButton button = new JButton("To Celsius");
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				float x=Float.parseFloat(textField.getText());
				float cel=(float)(x-273.15);
				String reslt=String.valueOf(cel);
				label_1.setText(reslt);
			}
		});
		button.setBounds(57, 152, 103, 23);
		frame.getContentPane().add(button);
		
		JButton btnToFarenheat = new JButton("To Fahrenheat");
		btnToFarenheat.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				float x=Float.parseFloat(textField.getText());
				float cel=(float)(((x-273.15)*9)/5)+32;
				String reslt=String.valueOf(cel);
				label_1.setText(reslt);
			}
		});
		btnToFarenheat.setBounds(167, 152, 124, 23);
		frame.getContentPane().add(btnToFarenheat);
		
	
	}

}
