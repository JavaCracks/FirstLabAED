package lnterface;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class RandomPanel extends JPanel implements ActionListener {

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
	private JTextField quantityTxt;
	private JTextField percentageTxt;
	private JButton buttonGenerate;
	private JButton buttonOutput;
	private JButton buttonBack;
	private JLabel range;
	private JTextField rangeTxt;
	
	private InitialPanel initialPanel;

	public RandomPanel(InitialPanel initialPanel) {

		this.initialPanel = initialPanel;
		
		setLayout(new GridLayout(4, 1));
		TitledBorder border = new TitledBorder("Setup to generate");

		buttonBack = new JButton(BACK);
		buttonBack.addActionListener(this);
		buttonBack.setActionCommand(BACK);
		buttonBack.setBounds(1, 50, 70, 30);
		// first panel
		panelSetup = new JPanel();
		panelSetup.setLayout(null);
		panelSetup.setBorder(border);

		panelSetup.setBounds(0, 0, 150, 400);
		checkInteger = new JCheckBox("Integer");
		checkInteger.setBounds(20, 20, 100, 20);
		checkInteger.setLayout(null);
		checkRational = new JCheckBox("Rational");
		checkRational.setBounds(20, 60, 100, 20);
		checkRational.setLayout(null);

		checkAll = new JCheckBox("All Differents");
		checkAll.setLayout(null);
		checkAll.setBounds(120, 20, 150, 20);

		checkRepeated = new JCheckBox("Repeated Numbers");
		checkRepeated.setLayout(null);
		checkRepeated.setBounds(120, 60, 150, 20);

		labelSetupMsj = new JLabel();
		labelSetupMsj.setLayout(null);
		labelQuantity = new JLabel("Quantity:");
		labelQuantity.setFont(new Font("Arial", 1, 16));
		labelQuantity.setLayout(null);
		labelQuantity.setBounds(310, 20, 100, 20);
		
		

		quantityTxt = new JTextField();
		quantityTxt.setLayout(null);
		quantityTxt.setBounds(400, 20, 150, 20);

		range = new JLabel("Range:");
		range.setLayout(null);
		range.setFont(new Font("Arial", 1, 16));
		range.setBounds(310,60,100,20);
		
		rangeTxt = new JTextField();
		rangeTxt.setLayout(null);
		rangeTxt.setBounds(400,60,150,20);
		
		panelSetup.add(checkInteger);
		panelSetup.add(checkRational);
		panelSetup.add(checkAll);
		panelSetup.add(checkRepeated);
		panelSetup.add(labelQuantity);
		panelSetup.add(labelSetupMsj);
		panelSetup.add(quantityTxt);
		panelSetup.add(range);
		panelSetup.add(rangeTxt);

		// second panel

		panelOrder = new JPanel();
		panelOrder.setLayout(null);
		TitledBorder border1 = new TitledBorder(" ");
		panelOrder.setBorder(border1);

		checkSort = new JCheckBox("Sorted");
		checkSort.setLayout(null);
		checkSort.setBounds(250, 40, 160, 40);
		checkSortInversely = new JCheckBox("Sorted Inversely");
		checkSortInversely.setLayout(null);
		checkSortInversely.setBounds(300, 15, 160, 40);
		checkRandom = new JCheckBox("Random Sorter");
		checkRandom.setLayout(null);
		checkRandom.setBounds(160, 15, 160, 40);

		panelOrder.add(checkSort);
		panelOrder.add(checkSortInversely);
		panelOrder.add(checkRandom);

		// third panel

		panelGenerate = new JPanel();
		panelGenerate.setLayout(null);
		TitledBorder border2 = new TitledBorder(" ");
		panelGenerate.setBorder(border2);
		checkDisorder = new JCheckBox("Disorder %");
		checkDisorder.setBounds(110, 20, 100, 20);
		checkDisorder.setLayout(null);
		labelPercentage = new JLabel("Percentage:");
		labelPercentage.setBounds(110, 60, 100, 20);
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

		// fourth panel

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
 
	    
	
	public JLabel getRange() {
		return range;
	}



	public void setRange(JLabel range) {
		this.range = range;
	}



	public JTextField getRangeTxt() {
		return rangeTxt;
	}



	public void setRangeTxt(JTextField rangeTxt) {
		this.rangeTxt = rangeTxt;
	}



	public JPanel getPanelSetup() {
		return panelSetup;
	}

	public void setPanelSetup(JPanel panelSetup) {
		this.panelSetup = panelSetup;
	}

	public JPanel getPanelOrder() {
		return panelOrder;
	}

	public void setPanelOrder(JPanel panelOrder) {
		this.panelOrder = panelOrder;
	}

	public JPanel getPanelGenerate() {
		return panelGenerate;
	}

	public void setPanelGenerate(JPanel panelGenerate) {
		this.panelGenerate = panelGenerate;
	}

	public JPanel getPanelOutput() {
		return panelOutput;
	}

	public void setPanelOutput(JPanel panelOutput) {
		this.panelOutput = panelOutput;
	}

	public JCheckBox getCheckInteger() {
		return checkInteger;
	}

	public void setCheckInteger(JCheckBox checkInteger) {
		this.checkInteger = checkInteger;
	}

	public JCheckBox getCheckRational() {
		return checkRational;
	}

	public void setCheckRational(JCheckBox checkRational) {
		this.checkRational = checkRational;
	}

		
	public JCheckBox getCheckAll() {
		return checkAll;
	}

	public void setCheckAll(JCheckBox checkAll) {
		this.checkAll = checkAll;
	}

	public JCheckBox getCheckRepeated() {
		return checkRepeated;
	}

	public void setCheckRepeated(JCheckBox checkRepeated) {
		this.checkRepeated = checkRepeated;
	}

	public JCheckBox getCheckSort() {
		return checkSort;
	}

	public void setCheckSort(JCheckBox checkSort) {
		this.checkSort = checkSort;
	}

	public JCheckBox getCheckSortInversely() {
		return checkSortInversely;
	}

	public void setCheckSortInversely(JCheckBox checkSortInversely) {
		this.checkSortInversely = checkSortInversely;
	}

	public JCheckBox getCheckRandom() {
		return checkRandom;
	}

	public void setCheckRandom(JCheckBox checkRandom) {
		this.checkRandom = checkRandom;
	}

	public JCheckBox getCheckDisorder() {
		return checkDisorder;
	}

	public void setCheckDisorder(JCheckBox checkDisorder) {
		this.checkDisorder = checkDisorder;
	}

	public JLabel getLabelQuantity() {
		return labelQuantity;
	}

	public void setLabelQuantity(JLabel labelQuantity) {
		this.labelQuantity = labelQuantity;
	}

	public JLabel getLabelSetupMsj() {
		return labelSetupMsj;
	}

	public void setLabelSetupMsj(JLabel labelSetupMsj) {
		this.labelSetupMsj = labelSetupMsj;
	}

	public JLabel getLabelPercentage() {
		return labelPercentage;
	}

	public void setLabelPercentage(JLabel labelPercentage) {
		this.labelPercentage = labelPercentage;
	}

	public JTextField getQuantityTxt() {
		return quantityTxt;
	}

	public void setQuantityTxt(JTextField quantityTxt) {
		this.quantityTxt = quantityTxt;
	}

	public JTextField getPercentageTxt() {
		return percentageTxt;
	}

	public void setPercentageTxt(JTextField percentageTxt) {
		this.percentageTxt = percentageTxt;
	}

	public JButton getButtonGenerate() {
		return buttonGenerate;
	}

	public void setButtonGenerate(JButton buttonGenerate) {
		this.buttonGenerate = buttonGenerate;
	}

	public JButton getButtonOutput() {
		return buttonOutput;
	}

	public void setButtonOutput(JButton buttonOutput) {
		this.buttonOutput = buttonOutput;
	}

	public JButton getButtonBack() {
		return buttonBack;
	}

	public void setButtonBack(JButton buttonBack) {
		this.buttonBack = buttonBack;
	}
	
	public int[] generateInteger() {
		
		boolean value = false;
		if(checkRepeated.isSelected()) {
			value=true;
		}
		int  quantityValue = Integer.parseInt(quantityTxt.getText());
		int  rangeValue = Integer.parseInt(rangeTxt.getText());

		
		return  initialPanel.getMainWindow().generateIntegerRepeated(quantityValue, value, rangeValue );
		 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals(BACK)) {
			
			initialPanel.getMainWindow().remove(this);
			initialPanel.getMainWindow().add(initialPanel);
			initialPanel.getMainWindow().refresh();
			
			
		}
		
		if(e.getActionCommand().equals(GENERATE)) {
			
		JOptionPane.showMessageDialog(null, Arrays.toString(generateInteger()));
			
		}

	}

}
