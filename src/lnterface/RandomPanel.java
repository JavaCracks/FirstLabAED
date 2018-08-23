package lnterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RandomPanel extends JPanel  implements ActionListener{
	
	public final static String GENERATE = "GENERATE";
	public final static String OUTPUT = "OUTPUT";

	

	private JPanel panelSetup;
	private JPanel panelOrder;
	private JPanel panelGenerate;
	private JPanel panelOutput;
	private JCheckBox checkInteger;
	private JCheckBox checkRational;
	private JCheckBox checkAll;
	private JCheckBox checkRepeated;
	private JCheckBox checkSort;
	private JCheckBox checkSortInversely;
	private JCheckBox checkRandom;
	private JCheckBox checkDisorder;
	private JLabel labelQuantity;
	private JLabel labelSetupMsj;
	private JLabel labelPercentage;
	private JTextField  quantityTxt;
	private JTextField  percentageTxt;
	private JButton buttonGenerate;
	private JButton buttonOutput;



	
 public RandomPanel () {
	  
	 
	 //first panel
	 panelSetup = new JPanel();
	 panelSetup.setLayout(null);
	 checkInteger = new JCheckBox();
	 checkRational = new JCheckBox();
	 checkAll = new JCheckBox();
	 checkRepeated = new JCheckBox();
	 labelQuantity = new JLabel();
	 labelSetupMsj = new JLabel();
	 quantityTxt = new JTextField();
	 
	 //second panel
	 
	 panelOrder = new JPanel();
	 checkSort = new JCheckBox();
	 checkSortInversely = new JCheckBox();
	 checkRandom = new JCheckBox();

	 //third panel
	 
	 panelGenerate = new JPanel();
	 checkDisorder = new JCheckBox();
	 labelPercentage = new JLabel();
	 percentageTxt = new JTextField();
	 buttonGenerate = new JButton();
	 buttonGenerate.addActionListener(this);
	 buttonGenerate.setActionCommand(GENERATE);
	 
	 //fourth panel
	 
	 buttonOutput = new JButton();
	 buttonOutput.addActionListener(this);
	 buttonOutput.setActionCommand(OUTPUT);
	 


	 

	 
	 
 }


	


	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
