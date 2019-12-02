import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import java.lang.Math;
public class Calculator 
{
	

	private JFrame frame;
	private JTextField textField;
	
	int c=0,cc=0;

	private String str,str1,str2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 452, 280);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEdit = new JLabel("Edit");
		lblEdit.setBounds(10, 0, 46, 22);
		frame.getContentPane().add(lblEdit);
		
		JLabel lblView = new JLabel("View");
		lblView.setBounds(48, 4, 46, 14);
		frame.getContentPane().add(lblView);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setBounds(104, 4, 46, 14);
		frame.getContentPane().add(lblHelp);
		
		textField = new JTextField();
		textField.setBounds(20, 33, 404, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("/");
		button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				str=textField.getText();
				textField.setText("");
				str2="div";
			}
		});
		button.setBounds(378, 87, 46, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("*");
		button_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				str=textField.getText();
				textField.setText("");
				str2="mul";
			}
		});
		button_1.setBounds(376, 121, 48, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("-");
		button_2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				str=textField.getText();
				textField.setText("");
				str2="sub";
			}
		});
		button_2.setBounds(378, 155, 46, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("+");
		button_3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				str=textField.getText();
				textField.setText("");
				str2="add";
			}
		});
		button_3.setBounds(378, 189, 46, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("9");
		button_4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(c==1)
				{
					textField.setText("");
					c=0;
				}
				textField.setText(textField.getText().concat(button_4.getText()));
			}
		});
		button_4.setBounds(323, 87, 48, 23);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(c==1)
				{
					textField.setText("");
					c=0;
				}
				textField.setText(textField.getText().concat(button_5.getText()));
			}
		});
		button_5.setBounds(323, 121, 48, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("3");
		button_6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(c==1)
				{
					textField.setText("");
					c=0;
				}
				textField.setText(textField.getText().concat(button_6.getText()));
			}
		});
		button_6.setBounds(323, 155, 48, 23);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("=");
		button_7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				c=1;
				str1=textField.getText();
				textField.setText("");
				float f=Float.parseFloat(str);
				float s=Float.parseFloat(str1);
								
				if(str2.equals("add"))
				{
					float  result=f+s;
					String Res=String.valueOf(result);
					textField.setText(Res);
				}
				if(str2.equals("sub"))
				{
					float  result=f-s;
					String Res=String.valueOf(result);
					textField.setText(Res);
				}
				if(str2.equals("mul"))
				{
					float  result=f*s;
					String Res=String.valueOf(result);
					textField.setText(Res);
				}
				if(str2.equals("div"))
				{
					float  result=f/s;
					String Res=String.valueOf(result);
					textField.setText(Res);
				}
				if(str2.equals("sqr"))
				{
					
					float result=(float)Math.pow(f,s);
					String Res=String.valueOf(result);
		
					textField.setText(Res);
				}
				if(str2.equals("percent"))
				{
					float  result=f*s/100;
					String Res=String.valueOf(result);
					textField.setText(Res);
				}
		
				//textField.setText();
			}
		});
		button_7.setBounds(323, 189, 48, 23);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				textField.setText(textField.getText().concat(button_8.getText()));
			}
		});
		button_8.setBounds(257, 87, 56, 23);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("5");
		button_9.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(c==1)
				{
					textField.setText("");
					c=0;
				}
				textField.setText(textField.getText().concat(button_9.getText()));
			}
		});
		button_9.setBounds(257, 121, 59, 23);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("2");
		button_10.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if(c==1)
				{
					textField.setText("");
					c=0;
				}
				textField.setText(textField.getText().concat(button_10.getText()));
			}
		});
		button_10.setBounds(257, 155, 59, 23);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton(".");
		button_11.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(c==1)
				{
					textField.setText("");
					c=0;
					cc=0;
					
				}
				if(cc==0)
				{
					textField.setText(textField.getText().concat(button_11.getText()));
					cc=1;
				}
				
			}
		});
		button_11.setBounds(257, 189, 60, 23);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("7");
		button_12.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(c==1)
				{
					textField.setText("");
					c=0;
				}
				textField.setText(textField.getText().concat(button_12.getText()));
			}
		});
		button_12.setBounds(195, 87, 56, 23);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("4");
		button_13.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				if(c==1)
				{
					textField.setText("");
					c=0;
				}
				textField.setText(textField.getText().concat(button_13.getText()));
			}
		});
		button_13.setBounds(195, 121, 56, 23);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("1");
		button_14.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText(textField.getText().concat(button_14.getText()));
				
			}
		});
		button_14.setBounds(193, 155, 59, 23);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("0");
		button_15.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(c==1)
				{
					textField.setText("");
					c=0;
					cc=0;
				}
				textField.setText(textField.getText().concat(button_15.getText()));
			}
		});
		button_15.setBounds(192, 189, 59, 23);
		frame.getContentPane().add(button_15);
		
		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				str=textField.getText();
				float si=(float)(Float.parseFloat(str));
				float y=(float)Math.sin((si*Math.PI)/180);
				
				String sins=String.valueOf(y);
				textField.setText(sins);
			}
		});
		btnSin.setBounds(129, 87, 56, 23);
		frame.getContentPane().add(btnSin);
		
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				str=textField.getText();
				float co=(float)(Float.parseFloat(str));
				float y=(float)Math.cos((co*Math.PI)/180);
				
				String cos=String.valueOf(y);
				textField.setText(cos);
			}
		});
		btnCos.setBounds(129, 121, 56, 23);
		frame.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				str=textField.getText();
				float ta=(float)(Float.parseFloat(str));
				float y=(float)Math.tan((ta*Math.PI)/180);
				
				String taan=String.valueOf(y);
				textField.setText(taan);
			}
		});
		btnTan.setBounds(129, 155, 56, 23);
		frame.getContentPane().add(btnTan);
		
		JButton btnSec = new JButton("sec");
		btnSec.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText(textField.getText().concat(btnSec.getText()));
			}
		});
		btnSec.setBounds(129, 189, 56, 23);
		frame.getContentPane().add(btnSec);
		
		JButton btnx = new JButton("1/X");
		btnx.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				c=1;
				str=textField.getText();
				float ex=(float)(Float.parseFloat(str));
				float d=(float)1/ex;
				String one=String.valueOf(d);
				textField.setText(one);
			}
		});
		btnx.setBounds(63, 87, 56, 23);
		frame.getContentPane().add(btnx);
		
		JButton btnExp = new JButton("Exp");
		btnExp.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				c=1;
				str=textField.getText();
				float expo=(float)(Float.parseFloat(str));
				float x=(float)Math.exp(expo);
				String xpo=String.valueOf(x);
				textField.setText(xpo);
			}
		});
		btnExp.setBounds(63, 121, 56, 23);
		frame.getContentPane().add(btnExp);
		
		JButton btnLn = new JButton("ln");
		btnLn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				c=1;
				str=textField.getText();
				float ln=(float)(Float.parseFloat(str));
				float lg=(float)Math.log(ln);
				String log=String.valueOf(lg);
				textField.setText(log);
			}
		});
		btnLn.setBounds(63, 155, 56, 23);
		frame.getContentPane().add(btnLn);
		
		JButton btnN = new JButton("n!");
		btnN.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				c=1;
				str=textField.getText();
				
				float n=(float)(Float.parseFloat(str));
				String f="1";
				float f1=(float)(Float.parseFloat(f));
				for(int i=1;i<=n;i++)
				{
					f1=f1*i;
				}
				String fact=String.valueOf(f1);
				textField.setText(fact);
			}
		});
		btnN.setBounds(63, 189, 56, 23);
		frame.getContentPane().add(btnN);
		
		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//c=1;
				str=textField.getText();
				float sqr=(float)Math.sqrt(Float.parseFloat(str));
				str1=String.valueOf(sqr);
				textField.setText(str1);
				if(c==1)
				{
					textField.setText("");
					c=0;
				}
				
			}
		});
		btnSqrt.setBounds(0, 87, 59, 23);
		frame.getContentPane().add(btnSqrt);
		
		JButton button_16 = new JButton("%");
		button_16.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				c=1;
				str=textField.getText();
				textField.setText("");
				str2="percent";
			}
		});
		button_16.setBounds(0, 121, 56, 23);
		frame.getContentPane().add(button_16);
		
		JButton btnXy = new JButton("X^y");
		btnXy.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				c=1;
				str=textField.getText();
				textField.setText("");
				str2="sqr";
			}
		});
		btnXy.setBounds(0, 155, 56, 23);
		frame.getContentPane().add(btnXy);
		
		JButton btnX = new JButton("X^2");
		btnX.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				c=1;
				str=textField.getText();
				float pow=(float)(Float.parseFloat(str));
				float p=pow*pow;
				String power=String.valueOf(p);
				textField.setText(power);
				c=1;
				//textField.setText("");
			}
		});
		btnX.setBounds(-12, 189, 68, 23);
		frame.getContentPane().add(btnX);
		
		JButton btnNewButton = new JButton("CE");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("");
			}
		});
		btnNewButton.setBounds(5, 223, 419, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
