package lnterface;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.TextField;
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

public class ManualPanel extends JPanel implements ActionListener {

	public final static String SORT = "SORT";
	public final static String BACK = "BACK";

	private JButton sort;
	private JLabel manual;
	private JLabel input;
	private JTextField inputTxt;
	private JButton buttonBack;
	private JCheckBox checkInteger;
	private JCheckBox checkRational;
	private InitialPanel initialPanel;

	public ManualPanel(InitialPanel initialPanel) {

		this.initialPanel = initialPanel;

		setLayout(null);
		TitledBorder border = new TitledBorder("Sorting Elements");
		setBorder(border);

		buttonBack = new JButton(BACK);
		buttonBack.addActionListener(this);
		buttonBack.setActionCommand(BACK);
		buttonBack.setBounds(1, 310, 70, 30);
		sort = new JButton(SORT);
		sort.addActionListener(this);
		sort.setActionCommand(SORT);
		sort.setLayout(null);
		sort.setBounds(240, 250, 100, 50);

		manual = new JLabel("MANUAL");
		manual.setLayout(null);
		manual.setFont(new Font("ARIAL", 1, 20));
		manual.setBounds(250, 100, 100, 50);

		input = new JLabel("Input:");
		input.setLayout(null);
		input.setFont(new Font("ARIAL", 1, 16));
		input.setBounds(120, 160, 80, 50);

		inputTxt = new JTextField();
		inputTxt.setLayout(null);
		inputTxt.setBounds(200, 170, 250, 30);
		inputTxt.setToolTipText("Ingresa tus elementos y los separas por comas ---> , <---");
		
		
		checkInteger = new JCheckBox("Integer");
		checkInteger.setLayout(null);
		checkInteger.setBounds(320, 210, 100, 40);
		checkRational = new JCheckBox("Rational");
		checkRational.setLayout(null);
		checkRational.setBounds(200, 210, 100, 40);

		add(sort);
		add(manual);
		add(input);
		add(inputTxt);
		add(buttonBack);

		add(checkInteger);
		add(checkRational);
	}

	public MainWindow getMainWindow() {

		return initialPanel.getMainWindow();

	}

	public JButton getSort() {
		return sort;
	}

	public void setSort(JButton sort) {
		this.sort = sort;
	}

	public JLabel getManual() {
		return manual;
	}

	public void setManual(JLabel manual) {
		this.manual = manual;
	}

	public JLabel getInput() {
		return input;
	}

	public void setInput(JLabel input) {
		this.input = input;
	}

	public JTextField getInputTxt() {
		return inputTxt;
	}

	public void setInputTxt(JTextField inputTxt) {
		this.inputTxt = inputTxt;
	}

	public JButton getButtonBack() {
		return buttonBack;
	}

	public void setButtonBack(JButton buttonBack) {
		this.buttonBack = buttonBack;
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

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals(SORT)) {

			if (checkRational.isSelected()) {

				double[] array = getMainWindow().getLogicSort().getAnArrayOfRationals(inputTxt.getText().split(","));

				if (array.length > 10000000) {
					getMainWindow().getLogicSort().quickSortDouble(array, 0, array.length - 1);
					
					JOptionPane.showMessageDialog(null, Arrays.toString(array), "You Array was Sorted", 0);
				} else {
					getMainWindow().getLogicSort().mergeSortDouble(array, array.length);
					JOptionPane.showMessageDialog(null, Arrays.toString(array), "You Array was Sorted", 0);

				}
			}

			if (checkInteger.isSelected()) {

				int[] array = getMainWindow().getLogicSort().getAnArrayOfIntegers(inputTxt.getText().split(","));

				JOptionPane.showMessageDialog(null, Arrays.toString(getMainWindow().getLogicSort().countingSort(array)),
						"You Array was Sorted", 0);
				;

			}

		}
		
		
		if(e.getActionCommand().equals(BACK)) {
			
			getMainWindow().remove(this);
			getMainWindow().add(initialPanel);
			getMainWindow().refresh();
			
		}

	}

}
