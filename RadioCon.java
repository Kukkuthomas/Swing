import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;

public class RadioCon {

	private JFrame frame;
	private JTextField txtInput;
	private JTextField txtOutput;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioCon window = new RadioCon();
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
	public RadioCon() {
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
		
		JLabel lblInput = new JLabel("Input");
		lblInput.setBounds(133, 22, 46, 14);
		frame.getContentPane().add(lblInput);
		
		txtInput = new JTextField();
		txtInput.setBounds(205, 19, 86, 20);
		frame.getContentPane().add(txtInput);
		txtInput.setColumns(10);
		
		JLabel lInputScale = new JLabel("Input Scale");
		lInputScale.setBounds(28, 76, 108, 14);
		frame.getContentPane().add(lInputScale);
		
		JLabel lblOutputScale = new JLabel("Output Scale");
		lblOutputScale.setBounds(280, 76, 108, 14);
		frame.getContentPane().add(lblOutputScale);
		
		JRadioButton rdCelcius = new JRadioButton("Celcius");
		rdCelcius.setBounds(6, 108, 109, 23);
		frame.getContentPane().add(rdCelcius);
		
		
		JRadioButton rdFah = new JRadioButton("Fahrenheit");
		rdFah.setBounds(6, 148, 109, 23);
		frame.getContentPane().add(rdFah);
		
		
		JRadioButton rdKelvin = new JRadioButton("Kelvin");
		rdKelvin.setBounds(6, 188, 109, 23);
		frame.getContentPane().add(rdKelvin);

		
		ButtonGroup group=new ButtonGroup();
		group.add(rdCelcius);
		group.add(rdFah);
		group.add(rdKelvin);
		
		
		
		JRadioButton rdCelciusO = new JRadioButton("Celcius");
		rdCelciusO.setBounds(263, 108, 109, 23);
		frame.getContentPane().add(rdCelciusO);
		
		
			
		JRadioButton rdFahO = new JRadioButton("Fahrenheit");
		rdFahO.setBounds(263, 148, 109, 23);
		frame.getContentPane().add(rdFahO);
		
		
		JRadioButton rdKelvinO = new JRadioButton("Kelvin");
		rdKelvinO.setBounds(263, 188, 109, 23);
		frame.getContentPane().add(rdKelvinO);
		
		ButtonGroup groupout=new ButtonGroup();
		groupout.add(rdCelciusO);
		groupout.add(rdFahO);
		groupout.add(rdKelvinO);
				
		
		JLabel lOutput = new JLabel("Output");
		lOutput.setBounds(127, 237, 52, 14);
		frame.getContentPane().add(lOutput);
		
		txtOutput = new JTextField();
		txtOutput.setBackground(Color.LIGHT_GRAY);
		txtOutput.setBounds(205, 234, 86, 20);
		frame.getContentPane().add(txtOutput);
		txtOutput.setColumns(10);
		
		
		rdCelcius.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
		
				if(rdCelciusO.isSelected())
				{
			
					txtOutput.setText(txtInput.getText());
				}
				if(rdFahO.isSelected())
				{
					float x=Float.parseFloat(txtInput.getText());
					float cel=(float)(x*1.8)+32;
					String reslt=String.valueOf(cel);
					txtOutput.setText(reslt);
				}
				if(rdKelvinO.isSelected())
				{
					float x=Float.parseFloat(txtInput.getText());
					float cel=(float)(x+273.15);
					String reslt=String.valueOf(cel);
					txtOutput.setText(reslt);
				}
			}
		});
		
		rdCelciusO.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(rdCelcius.isSelected())
				{
			
					txtOutput.setText(txtInput.getText());
				}
				if(rdFah.isSelected())
				{
					float x=Float.parseFloat(txtInput.getText());
					float cel=(float)((x-32)*5)/9;
					String reslt=String.valueOf(cel);
					txtOutput.setText(reslt);
				}
				if(rdKelvin.isSelected())
				{
					float x=Float.parseFloat(txtInput.getText());
					float cel=(float)(x-273.15);
					String reslt=String.valueOf(cel);
					txtOutput.setText(reslt);
				}
			}
		});
		
//FAHRENHEIT		
		
		rdFah.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
		
				if(rdCelciusO.isSelected())
				{
			
					float x=Float.parseFloat(txtInput.getText());
					float cel=(float)((x-32)*5)/9;
					String reslt=String.valueOf(cel);
					txtOutput.setText(reslt);
				}
				if(rdFahO.isSelected())
				{
					txtOutput.setText(txtInput.getText());
				}
				if(rdKelvinO.isSelected())
				{
					float x=Float.parseFloat(txtInput.getText());
					float cel=(float)((((x-32)*5)/9)+273.15);
					String reslt=String.valueOf(cel);
					txtOutput.setText(reslt);
				}
			}
		});
		
		rdFahO.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//String str=txtInput.getText();
				if(rdCelcius.isSelected())
				{
			
					float x=Float.parseFloat(txtInput.getText());
					float cel=(float)(x*1.8)+32;
					String reslt=String.valueOf(cel);
					txtOutput.setText(reslt);
				}
				if(rdFah.isSelected())
				{
					txtOutput.setText(txtInput.getText());
				}
				if(rdKelvin.isSelected())
				{
					float x=Float.parseFloat(txtInput.getText());
					float cel=(float)((((x-273.15)*9)/5)+32);
					String reslt=String.valueOf(cel);
					txtOutput.setText(reslt);
				}
			}
		});
		
		
		
		rdKelvin.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
		
				if(rdCelciusO.isSelected())
				{
			
					float x=Float.parseFloat(txtInput.getText());
					float cel=(float)(x-273.15);
					String reslt=String.valueOf(cel);
					txtOutput.setText(reslt);
				}
				if(rdFahO.isSelected())
				{
					float x=Float.parseFloat(txtInput.getText());
					float cel=(float)(((x-273.15)*9)/5)+32;
					String reslt=String.valueOf(cel);
					txtOutput.setText(reslt);
				}
				if(rdKelvinO.isSelected())
				{
					
					txtOutput.setText(txtInput.getText());
				}
			}
		});
		
		rdKelvinO.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(rdCelcius.isSelected())
				{
			
					float x=Float.parseFloat(txtInput.getText());
					float cel=(float)(x+273.15);
					String reslt=String.valueOf(cel);
					txtOutput.setText(reslt);
				}
				if(rdFah.isSelected())
				{
					float x=Float.parseFloat(txtInput.getText());
					float cel=(float)((((x-32)*5)/9)+273.15);
					String reslt=String.valueOf(cel);
					txtOutput.setText(reslt);
				}
				if(rdKelvin.isSelected())
				{
					txtOutput.setText(txtInput.getText());
				}
			}
		});
		
		
		
		
		
	}
}
