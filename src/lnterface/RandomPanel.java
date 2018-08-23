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
	 checkInteger.setLayout(null);
	 checkRational = new JCheckBox();
	 checkRational.setLayout(null);

	 checkAll = new JCheckBox();
	 checkAll.setLayout(null);

	 checkRepeated = new JCheckBox();
	 checkRepeated.setLayout(null);

	 labelQuantity = new JLabel();
	 labelQuantity.setLayout(null);
	 labelSetupMsj = new JLabel();
	 labelSetupMsj.setLayout(null);

	 quantityTxt = new JTextField();
	 quantityTxt.setLayout(null);
	 
	 panelSetup.add(checkInteger);
	 panelSetup.add(checkRational);
	 panelSetup.add(checkAll);
	 panelSetup.add(checkRepeated);
	 panelSetup.add(labelQuantity);
	 panelSetup.add(labelSetupMsj);
	 panelSetup.add(quantityTxt);



	 
	 
	 //second panel
	 
	 panelOrder = new JPanel();
	 panelOrder.setLayout(null);
	 checkSort = new JCheckBox();
	 checkSort.setLayout(null);
	 checkSortInversely = new JCheckBox();
	 checkSortInversely.setLayout(null);
	 checkRandom = new JCheckBox();
	 checkRandom.setLayout(null);
	 
	 panelOrder.add(checkSort);
	 panelOrder.add(checkSortInversely);
	 panelOrder.add(checkRandom);


	 

	 //third panel
	 
	 panelGenerate = new JPanel();
	 panelGenerate.setLayout(null);
	 checkDisorder = new JCheckBox();
	 checkDisorder.setLayout(null);
	 labelPercentage = new JLabel();
	 labelPercentage.setLayout(null);
	 percentageTxt = new JTextField();
	 percentageTxt.setLayout(null);
	 buttonGenerate = new JButton();
	 buttonGenerate.setLayout(null);
	 
	 panelGenerate.add(checkDisorder);
	 panelGenerate.add(labelPercentage);
	 panelGenerate.add(percentageTxt);
	 panelGenerate.add(buttonGenerate);
	 
	 
	 
	 //fourth panel
	 
	 panelOutput = new JPanel();
	 panelOutput.setLayout(null);
	 buttonOutput = new JButton();
	 buttonOutput.addActionListener(this);
	 buttonOutput.setActionCommand(OUTPUT);
	 buttonOutput.setLayout(null);

	 

 panelOutput.add(buttonOutput);
	 
	 

	 
	 
 }


	


	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
