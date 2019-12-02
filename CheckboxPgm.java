import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.event.*;
public class CheckboxPgm {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckboxPgm window = new CheckboxPgm();
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
	public CheckboxPgm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lout = new JLabel("");
		lout.setBounds(114, 202, 191, 23);
		frame.getContentPane().add(lout);
		
		JCheckBox chkC = new JCheckBox("C++");
		chkC.setBounds(161, 57, 97, 23);
		frame.getContentPane().add(chkC);
		
		chkC.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				lout.setText("C++ "+ (e.getStateChange()==1?"Checked":"Unchecked"));
			}
		});
		
		JCheckBox chkJ = new JCheckBox("JAVA");
		chkJ.setBounds(161, 139, 97, 23);
		frame.getContentPane().add(chkJ);
		
		chkJ.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				lout.setText("JAVA "+ (e.getStateChange()==1?"Checked":"Unchecked"));
			}
		});
		
		
	}
}
