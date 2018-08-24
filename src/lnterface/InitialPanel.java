package lnterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class InitialPanel extends JPanel implements ActionListener {

	public final static String MANUAL = "Manual";
	public final static String RANDOM = "Random";

	private MainWindow mainWindow;
	private JButton manualButton;
	private JButton randomButton;
	private ManualPanel manual;
	private RandomPanel random;
	private JLabel text;
	


	public InitialPanel(MainWindow mainWindow) {

		this.mainWindow = mainWindow;

		setLayout(null);
		manual = new ManualPanel(this);
		random = new RandomPanel(this);

		manualButton = new JButton(MANUAL);
		manualButton.setActionCommand(MANUAL);
		manualButton.addActionListener(this);
		manualButton.setLayout(null);
		manualButton.setBounds(300, 180, 100, 40);

		randomButton = new JButton(RANDOM);
		randomButton.setActionCommand(RANDOM);
		randomButton.addActionListener(this);
		randomButton.setLayout(null);
		randomButton.setBounds(180, 180, 100, 40);
		
		



		text = new JLabel("Choose an Option");
		text.setLayout(null);
		text.setBounds(210, 100, 200, 50);
		text.setFont(new Font("Arial", 1, 20));

		add(manualButton);

		add(randomButton);

		add(text);
	
	}
     
	
	public MainWindow getMainWindow() {
		return mainWindow;
	}


	public void setMainWindow(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
	}


	public JButton getManualButton() {
		return manualButton;
	}


	public void setManualButton(JButton manualButton) {
		this.manualButton = manualButton;
	}


	public JButton getRandomButton() {
		return randomButton;
	}


	public void setRandomButton(JButton randomButton) {
		this.randomButton = randomButton;
	}


	public ManualPanel getManual() {
		return manual;
	}


	public void setManual(ManualPanel manual) {
		this.manual = manual;
	}


	public RandomPanel getRandom() {
		return random;
	}


	public void setRandom(RandomPanel random) {
		this.random = random;
	}


	public JLabel getText() {
		return text;
	}


	public void setText(JLabel text) {
		this.text = text;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String a = e.getActionCommand();

		if (a.equals(MANUAL)) {

			mainWindow.remove(this);
			mainWindow.add(manual);
			mainWindow.refresh();
		}
		if(a.equals(RANDOM)) {
			mainWindow.remove(this);
			mainWindow.add(random);
			mainWindow.refresh();
			
		}

	}

}
