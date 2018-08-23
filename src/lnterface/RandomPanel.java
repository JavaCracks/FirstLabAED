package lnterface;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class RandomPanel extends JPanel  implements ActionListener{
	
	public final static String GENERATE = "GENERATE";
	public final static String OUTPUT = "OUTPUT";
	public final static String BACK = "BACK";

	

	

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
	private JButton buttonBack;

	


	
 public RandomPanel () {
	  
	 
	 
	 setLayout(new GridLayout(4,1));
	 TitledBorder border = new TitledBorder("Setup to generate");
		
	 buttonBack = new JButton(BACK);
	 buttonBack.addActionListener(this);
	 buttonBack.setActionCommand(BACK);
	 buttonBack.setBounds(1, 50, 70, 30);
	 //first panel
	 panelSetup = new JPanel();
	 panelSetup.setLayout(null);
		panelSetup.setBorder(border);

	 panelSetup.setBounds(0,0,150,400);
	 checkInteger = new JCheckBox("Integer");
	 checkInteger.setBounds(20,20,100,20);
	 checkInteger.setLayout(null);
	 checkRational = new JCheckBox("Rational");
	 checkRational.setBounds(20, 60, 100,20);
	 checkRational.setLayout(null);

	 checkAll = new JCheckBox("All Diferents");
	 checkAll.setLayout(null);
	 checkAll.setBounds(120, 20, 150, 20);


	 checkRepeated = new JCheckBox("Repeated Numbers");
	 checkRepeated.setLayout(null);
	 checkRepeated.setBounds(120, 60, 150, 20);

	 labelQuantity = new JLabel("Quantity:");
	 labelQuantity.setFont(new Font("Arial", 1, 16));
	 labelQuantity.setLayout(null);
	 labelQuantity.setBounds(310,40,100,20);
	 labelSetupMsj = new JLabel();
	 labelSetupMsj.setLayout(null);

	 quantityTxt = new JTextField();
	 quantityTxt.setLayout(null);
	 quantityTxt.setBounds(400,40,150,20);

	 
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
	 TitledBorder border1 = new TitledBorder(" ");
      panelOrder.setBorder(border1);
	 
	 checkSort = new JCheckBox("Sorted");
	 checkSort.setLayout(null);
	 checkSort.setBounds(250, 50,160,40);
	 checkSortInversely = new JCheckBox("Sorted Inversely");
	 checkSortInversely.setLayout(null);
	 checkSortInversely.setBounds(300, 15, 160, 40);
	 checkRandom = new JCheckBox("Random Sorter");
	 checkRandom.setLayout(null);
	 checkRandom.setBounds(160,15,160,40);
	 
	 
	 panelOrder.add(checkSort);
	 panelOrder.add(checkSortInversely);
	 panelOrder.add(checkRandom);


	 
	 

	 //third panel
	 
	 panelGenerate = new JPanel();
	 panelGenerate.setLayout(null);
	 TitledBorder border2 = new TitledBorder(" ");
     panelGenerate.setBorder(border2);
	 checkDisorder = new JCheckBox("Disorder %");
	 checkDisorder.setBounds(110,20,100,20);
	 checkDisorder.setLayout(null);
	 labelPercentage = new JLabel("Percentage:");
	 labelPercentage.setBounds(110,60,100,20);
	 labelPercentage.setLayout(null);
	 percentageTxt = new JTextField();
	 percentageTxt.setLayout(null);
	 percentageTxt.setBounds(190, 60, 100, 20);
	 buttonGenerate = new JButton(GENERATE);
	 buttonGenerate.addActionListener(this);
	 buttonGenerate.setActionCommand(GENERATE);
	 buttonGenerate.setLayout(null);
	 buttonGenerate.setBounds(350, 30, 100, 40);
	 panelGenerate.add(checkDisorder);
	 panelGenerate.add(labelPercentage);
	 panelGenerate.add(percentageTxt);
	 panelGenerate.add(buttonGenerate);
	 
	 
	 
	 //fourth panel
	 
	 panelOutput = new JPanel();
	 panelOutput.setLayout(null);
	 buttonOutput = new JButton(OUTPUT);
	 buttonOutput.addActionListener(this);
	 buttonOutput.setActionCommand(OUTPUT);
	 buttonOutput.setLayout(null);
	 buttonOutput.setBounds(240, 30, 100, 40);

	 

 panelOutput.add(buttonOutput);
 panelOutput.add(buttonBack);

 
	 
	 

	 
     add(panelSetup);
     add(panelOrder);
     add(panelGenerate);
     add(panelOutput);

	 
 }


	


	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
