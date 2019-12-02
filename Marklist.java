import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Marklist {

	private JFrame frame;
	private JTextField txtId;
	private JTextField txtFname;
	private JTextField txtSname;
	private JTextField txtTotal;
	private JTextField txtAvg;
	private JTextField txtRank;
	private JTextField txtMaths;
	private JTextField txtEng;
	private JTextField txtBio;
	private JTextField txtCom;
	private JTextField txtChem;
	private JTextField txtPhy;
	private JTextField txtTamil;
	private JTextField txtMala;
	private JTable table;
	private JTable table_1;
	
	String sid,sfn,ssn,code,tt,avg,rank,math,eng,bio,com,che,phy,tamil,mala;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Marklist window = new Marklist();
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
	public Marklist() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.setBounds(100, 100, 1025, 512);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 222, 179));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Student Details", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 441, 286);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lSId = new JLabel("Student ID");
		lSId.setBounds(10, 31, 59, 14);
		panel.add(lSId);
		
		JLabel lFname = new JLabel("FirstName");
		lFname.setBounds(10, 68, 59, 14);
		panel.add(lFname);
		
		JLabel lSname = new JLabel("SurName");
		lSname.setBounds(10, 108, 59, 14);
		panel.add(lSname);
		
		JLabel lCode = new JLabel("CourseCode");
		lCode.setBounds(10, 145, 78, 14);
		panel.add(lCode);
		
		JSeparator sep = new JSeparator();
		sep.setBackground(new Color(0, 0, 0));
		sep.setBounds(10, 170, 174, 8);
		panel.add(sep);
		
		JLabel lTotal = new JLabel("TotalScore");
		lTotal.setBounds(10, 189, 78, 14);
		panel.add(lTotal);
		
		JLabel lAvg = new JLabel("Average");
		lAvg.setBounds(10, 226, 59, 14);
		panel.add(lAvg);
		
		JLabel lRank = new JLabel("Ranking");
		lRank.setBounds(10, 261, 59, 14);
		panel.add(lRank);
		
		txtId = new JTextField();
		txtId.setBounds(98, 28, 86, 20);
		panel.add(txtId);
		txtId.setColumns(10);
		
		txtFname = new JTextField();
		txtFname.setBounds(98, 65, 86, 20);
		panel.add(txtFname);
		txtFname.setColumns(10);
		
		txtSname = new JTextField();
		txtSname.setBounds(98, 105, 86, 20);
		panel.add(txtSname);
		txtSname.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(98, 189, 86, 20);
		panel.add(txtTotal);
		txtTotal.setColumns(10);
		
		txtAvg = new JTextField();
		txtAvg.setBounds(98, 223, 86, 20);
		panel.add(txtAvg);
		txtAvg.setColumns(10);
		
		txtRank = new JTextField();
		txtRank.setBounds(98, 258, 86, 20);
		panel.add(txtRank);
		txtRank.setColumns(10);
		
		JComboBox comCode = new JComboBox();
		comCode.setModel(new DefaultComboBoxModel(new String[] {"--Select--","111032E", "111042C", "111052B", "111062S"}));
		comCode.setBounds(98, 142, 86, 20);
		panel.add(comCode);
		
		JLabel lMaths = new JLabel("Maths");
		lMaths.setBounds(224, 31, 59, 14);
		panel.add(lMaths);
		
		JLabel lEng = new JLabel("English");
		lEng.setBounds(224, 56, 59, 14);
		panel.add(lEng);
		
		JLabel lBio = new JLabel("Biology");
		lBio.setBounds(224, 91, 59, 14);
		panel.add(lBio);
		
		JLabel lCom = new JLabel("Computer");
		lCom.setBounds(224, 116, 59, 14);
		panel.add(lCom);
		JLabel lChem = new JLabel("Chemistry");
		lChem.setBounds(224, 159, 59, 14);
		panel.add(lChem);
		
		JLabel lPhy = new JLabel("Physics");
		lPhy.setBounds(224, 192, 59, 14);
		panel.add(lPhy);
		
		JLabel lTamil = new JLabel("Tamil");
		lTamil.setBounds(224, 226, 59, 14);
		panel.add(lTamil);
		
		JLabel lMala = new JLabel("Malayalam");
		lMala.setBounds(224, 261, 70, 14);
		panel.add(lMala);
		
		txtMaths = new JTextField();
		txtMaths.setBounds(322, 28, 86, 20);
		panel.add(txtMaths);
		txtMaths.setColumns(10);
		
		txtEng = new JTextField();
		txtEng.setBounds(322, 53, 86, 20);
		panel.add(txtEng);
		txtEng.setColumns(10);
		
		txtBio = new JTextField();
		txtBio.setBounds(322, 88, 86, 20);
		panel.add(txtBio);
		txtBio.setColumns(10);
		
		txtCom = new JTextField();
		txtCom.setBounds(322, 113, 86, 20);
		panel.add(txtCom);
		txtCom.setColumns(10);
		
		txtChem = new JTextField();
		txtChem.setBounds(322, 156, 86, 20);
		panel.add(txtChem);
		txtChem.setColumns(10);
		
		txtPhy = new JTextField();
		txtPhy.setBounds(322, 186, 86, 20);
		panel.add(txtPhy);
		txtPhy.setColumns(10);
		
		txtTamil = new JTextField();
		txtTamil.setBounds(322, 223, 86, 20);
		panel.add(txtTamil);
		txtTamil.setColumns(10);
		
		txtMala = new JTextField();
		txtMala.setBounds(322, 254, 86, 20);
		panel.add(txtMala);
		txtMala.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Student Report", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_1.setBounds(461, 11, 538, 345);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setBackground(new Color(245, 222, 179));
		txtArea.setBounds(10, 24, 518, 275);
		panel_1.add(txtArea);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				txtArea.setText("");
			}
		});
		btnClear.setBackground(new Color(169, 169, 169));
		btnClear.setForeground(new Color(0, 0, 255));
		btnClear.setFont(new Font("Aharoni", Font.BOLD | Font.ITALIC, 17));
		btnClear.setBounds(228, 311, 89, 23);
		panel_1.add(btnClear);
		
		table_1 = new JTable();
		table_1.setBackground(new Color(245, 222, 179));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student ID", "Course Name", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Total Score", "Average", "Ranking"},
			},
			new String[] {
				"Student ID", "Course Name", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Total score", "Average", "Ranking"
			}
		));
		table_1.setBounds(10, 361, 989, 63);
		frame.getContentPane().add(table_1);
		
		JButton btnAddReport = new JButton("Add Report");
		btnAddReport.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				sid=txtId.getText();
			
				sfn=txtFname.getText();
				ssn=txtSname.getText();
				
				code=(String) comCode.getSelectedItem();
				
				math=txtMaths.getText();				
				float mat=(float)Float.parseFloat(math);
				
				eng=txtEng.getText();
				float en=(float)Float.parseFloat(eng);
				
				bio=txtBio.getText();
				float bi=(float)Float.parseFloat(bio);
				
				com=txtCom.getText();
				float co=(float)Float.parseFloat(com);
				
				che=txtChem.getText();
				float ch=(float)Float.parseFloat(che);
				
				phy=txtPhy.getText();
				float ph=(float)Float.parseFloat(phy);
				
				tamil=txtTamil.getText();
				float ta=(float)Float.parseFloat(tamil);
				
				mala=txtMala.getText();
				float mal=(float)Float.parseFloat(mala);
			
				float Total=mat+en+bi+co+ch+ph+ta+mal;
				String TotalSc=String.valueOf(Total);
				txtTotal.setText(TotalSc);
				
				float Avrge=(float)Total/8;
				String Average=String.valueOf(Avrge);
				txtAvg.setText(Average);

				String sRank;
				if(Total>=750 && Total<=800)
					sRank="1";
				else if(Total>=700 && Total<=750)
					sRank="2";
				else if(Total>=650 && Total<=700)
					sRank="3";
				else if(Total>=600 && Total<=650)
					sRank="4";
				else if(Total>=550 && Total<=600)
					sRank="5";
				else if(Total>=450 && Total<=550)
					sRank="6";
				else if(Total>=350 && Total<=450)
					sRank="7";
				else
					sRank="FAIL";
				txtRank.setText(sRank);
				
				String[] r= {sid,code,math,eng,bio,com,che,phy,tamil,mala,TotalSc,Average,sRank};
				DefaultTableModel model=(DefaultTableModel) table_1.getModel();
				model.addRow(r);
			}
		});
		btnAddReport.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddReport.setForeground(new Color(0, 100, 0));
		btnAddReport.setBounds(158, 440, 106, 23);
		frame.getContentPane().add(btnAddReport);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBackground(new Color(173, 216, 230));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int r=table_1.getSelectedRow();
				DefaultTableModel model=(DefaultTableModel) table_1.getModel();
				model.removeRow(r);
			}
		});
		btnDelete.setForeground(new Color(220, 20, 60));
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDelete.setBounds(313, 440, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.setForeground(new Color(199, 21, 133));
		btnExit.setBounds(594, 440, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				txtId.setText("");
				txtFname.setText("");
				txtSname.setText("");
				comCode.setSelectedIndex(0);
				txtTotal.setText("");
				txtAvg.setText("");
				txtRank.setText("");
				txtMaths.setText("");
				txtEng.setText("");
				txtBio.setText("");
				txtCom.setText("");
				txtChem.setText("");
				txtPhy.setText("");
				txtTamil.setText("");
				txtMala.setText("");
				txtArea.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReset.setForeground(new Color(0, 0, 128));
		btnReset.setBounds(728, 440, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnShowReport = new JButton("Show Report");
		btnShowReport.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
			
				
				txtArea.append("Student Record\n"
				+ "Student Name :\t\t"+sfn+" "+ssn+"\n"
				+ "======================================\n"
				+ "Math:\t\t" + txtMaths.getText()
				+ "\nEnglish:\t\t" + txtEng.getText()
				+ "\nBiology:\t\t" + txtBio.getText()
				+ "\nComputer:\t\t" + txtCom.getText()
				+ "\nChemistry:\t\t" + txtChem.getText()
				+ "\nPysics:\t\t" + txtPhy.getText()
				+ "\nTamil:\t\t" + txtTamil.getText()
				+ "\nMalayalam:\t\t" + txtMala.getText()
				+"\n======================================"
				+ "\nTotal SCore:\t\t" + txtTotal.getText()
				+ "\nAverage:\t\t" + txtAvg.getText()
				+ "\nRanking:\t\t" + txtRank.getText() + "\n"
				);
			}
		});
		btnShowReport.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnShowReport.setForeground(new Color(0, 0, 255));
		btnShowReport.setBounds(443, 440, 106, 23);
		frame.getContentPane().add(btnShowReport);
		
	
	}
}
