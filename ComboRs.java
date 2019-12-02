import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;

public class ComboRs {

	private JFrame frame;
	private JTextField txtAmt;
	private JTextField txtCnrt;
	
	float input=0;
    float result=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboRs window = new ComboRs();
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
	public ComboRs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 348);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblConversion = new JLabel("CONVERSION");
		lblConversion.setBounds(170, 11, 123, 30);
		frame.getContentPane().add(lblConversion);
		
//		@SuppressWa.rnings("rawtypes")
		JComboBox convertFrom = new JComboBox();
		convertFrom.setModel(new DefaultComboBoxModel(new String[] {"DOLLAR", "INR", "Philippine Peso", "Japan Yen"}));
		convertFrom.setBounds(238, 60, 97, 20);
		frame.getContentPane().add(convertFrom);
		
		txtAmt = new JTextField();
		txtAmt.setBounds(238, 96, 97, 20);
		frame.getContentPane().add(txtAmt);
		txtAmt.setColumns(10);
		
		
		JComboBox convertTo = new JComboBox();
		convertTo.setModel(new DefaultComboBoxModel(new String[] {"DOLLAR", "INR", "Philippine Peso", "Japan Yen"}));
		convertTo.setBounds(238, 134, 97, 20);
		frame.getContentPane().add(convertTo);
		
		txtCnrt = new JTextField();
		txtCnrt.setBounds(238, 224, 97, 20);
		frame.getContentPane().add(txtCnrt);
		txtCnrt.setColumns(10);
		
		JButton btCon = new JButton("Convert");
		btCon.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
			input = Float.parseFloat(txtAmt.getText());
			
			
			//Dollar//	 
			 if(convertFrom.getSelectedItem()=="DOLLAR")
		        {
				 if(convertTo.getSelectedItem()=="DOLLAR")
			        {
			            result = (input);
			            txtCnrt.setText("$ "+result);
			        }
			        else if(convertTo.getSelectedItem()=="INR")
			        {
			            result = (input * 71.78f);
			            txtCnrt.setText(""+result);
			        }
			        else if(convertTo.getSelectedItem()=="Philippine Peso")
			        {
			            result = (input * 43.8f);
			            txtCnrt.setText(""+result);
			        }
			        else
			        {
			            result = (input * 76.7f);
			            txtCnrt.setText(""+result);
			        }

		
		        }
		     
		//Rupee//	
			 
		if(convertFrom.getSelectedItem()=="INR")
		 {
			 if(convertTo.getSelectedItem()=="DOLLAR")
		        {
		            result = (input * 0.014f);
		            txtCnrt.setText("$ "+result);
		        }
			 else if(convertTo.getSelectedItem()=="INR")
		        {
				 result = (input);
				 String str=String.valueOf(result);
		            txtCnrt.setText(str);
		        }
		        else if(convertTo.getSelectedItem()=="Philippine Peso")
		        {
		            result = (input * 0.71f);
		            txtCnrt.setText(""+result);
		        }
		        else
		        {
		            result = (input * 1.51f);
		            txtCnrt.setText(""+result);
		        }

		        }
			 
			 
			 //Philippine Peso//
		
		if(convertFrom.getSelectedItem()=="Philippine Peso")
		 {	 
			 if(convertTo.getSelectedItem()=="US Dollar")
		        {
		            result = (input * 0.0228f);
		            txtCnrt.setText("$ "+result);
		        }
		        else if(convertTo.getSelectedItem()=="Indian Rupee")
		        {
		            result = (input*1.41f);
		            txtCnrt.setText(""+result);
		        }
		        else if(convertTo.getSelectedItem()=="Philippine Peso")
		        {
		            result = (input);
		            txtCnrt.setText(""+result);
		        }
		        else
		        {
		            result = (input * 1.75f);
		            txtCnrt.setText(""+result);
		        }

			}	
		
		//Japan Yen//
		
		if(convertFrom.getSelectedItem()=="Japan Yen")
		 {
			if(convertTo.getSelectedItem()=="US Dollar")
	        {
	            result = (input * 0.013f);
	            txtCnrt.setText(""+result);
	        }
	        else if(convertTo.getSelectedItem()=="Indian Rupee")
	        {
	            result = (input * 0.66f);
	            txtCnrt.setText(""+result);
	        }
	        else if(convertTo.getSelectedItem()=="Philippine Peso")
	        {
	            result = (input * 0.571f);
	            txtCnrt.setText(""+result);
	        }
	        else 
	        {
	            result = (input);
	            txtCnrt.setText(""+result);
	        }
	  
		 }

	}
			
});
		/*btCon.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Object selectedItem=convertFrom.getSelectedItem();
				String ss=(selectedItem.toString());
				txtAmt.setText(ss);
				
				Object selectedItem1=convertTo.getSelectedItem();
				String sec=(selectedItem1.toString());
				txtCnrt.setText(sec);
				
				float amt=Float.parseFloat(txtAmt.getText());
				 
			}
		});*/
		btCon.setBounds(177, 176, 80, 23);
		frame.getContentPane().add(btCon);
		
		
		JLabel lblInput = new JLabel("Input");
		lblInput.setBounds(109, 63, 46, 14);
		frame.getContentPane().add(lblInput);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setBounds(109, 99, 46, 14);
		frame.getContentPane().add(lblAmount);
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setBounds(109, 137, 46, 14);
		frame.getContentPane().add(lblOutput);
		
		JButton btExit = new JButton("EXIT");
		btExit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				System.exit(0);
			}
		});
		btExit.setBounds(170, 276, 72, 23);
		frame.getContentPane().add(btExit);
		
		JLabel lblTotalAmountConvert = new JLabel("Total amount convert to");
		lblTotalAmountConvert.setBounds(10, 230, 167, 14);
		frame.getContentPane().add(lblTotalAmountConvert);
		
		
		
	}
}
