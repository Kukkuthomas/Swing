import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Bodymass {

	private JFrame frame;
	private JTextField txth;
	private JTextField txtw;
	private JTextField txtresult;
	private JTable table;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bodymass window = new Bodymass();
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
	public Bodymass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 365, 549);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(154, 205, 50));
		panel.setForeground(Color.LIGHT_GRAY);
		panel.setBounds(10, 41, 329, 258);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblHeight = new JLabel("Height(m)");
		lblHeight.setBounds(31, 51, 59, 22);
		panel.add(lblHeight);
		
		JLabel lblWeightkg = new JLabel("Weight(Kg)");
		lblWeightkg.setBounds(31, 126, 46, 14);
		panel.add(lblWeightkg);
		
		txth = new JTextField();
		txth.setBounds(134, 52, 86, 20);
		panel.add(txth);
		txth.setColumns(10);
		
		txtw = new JTextField();
		txtw.setBounds(134, 123, 86, 20);
		panel.add(txtw);
		txtw.setColumns(10);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBmi.setBounds(31, 180, 46, 14);
		panel.add(lblBmi);
		
		txtresult = new JTextField();
		txtresult.setBackground(new Color(255, 255, 0));
		txtresult.setBounds(99, 177, 86, 20);
		panel.add(txtresult);
		txtresult.setColumns(10);
		
		JLabel lresult = new JLabel("");
		lresult.setBounds(195, 180, 124, 14);
		panel.add(lresult);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String ht=txth.getText();
				String wt=txtw.getText();
				
				float h=Float.parseFloat(ht);
				float w=Float.parseFloat(wt);
				float bmi=(float)w/(h*h);
				String bm=String.valueOf(bmi);
				txtresult.setText(bm);
				
				if(bmi<18.5)
				{
					lresult.setForeground(Color.YELLOW);
					lresult.setText("Underweight");
				}
				else if(18.5>bmi && bmi<24.9)
				{
					lresult.setForeground(Color.GREEN);
					lresult.setText("Normal Weight");
				}
				else if(25<bmi && 29.9>bmi)
				{
					lresult.setForeground(Color.ORANGE);
					lresult.setText("Overweight");
				}
				else
				{
					lresult.setForeground(Color.RED);
					lresult.setText("Obese");
				}
				
			}
		});
		btnCalculate.setBounds(44, 224, 89, 23);
		panel.add(btnCalculate);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				txth.setText("");
				txtw.setText("");
				txtresult.setText("");
			}
		});
		
		btnClear.setBounds(154, 224, 66, 23);
		panel.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		btnExit.setBounds(235, 224, 59, 23);
		panel.add(btnExit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(154, 205, 50));
		panel_1.setBounds(10, 310, 329, 190);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setBackground(new Color(154, 205, 50));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Underweight", "Normal Weight", "Overweight", "    Obese"},
				{"     <18.5", "18.5 to 24.9", "25 to 29.9", "    > 30"},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 147, 309, 32);
		panel_1.add(table);
		
		JLabel lblBodyMassIndex = new JLabel("Body Mass Index");
		lblBodyMassIndex.setBackground(new Color(154, 205, 50));
		lblBodyMassIndex.setForeground(new Color(0, 0, 205));
		lblBodyMassIndex.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBodyMassIndex.setBounds(90, 11, 249, 29);
		frame.getContentPane().add(lblBodyMassIndex);
	}
}
