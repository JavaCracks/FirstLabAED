package lnterface;

import java.awt.*;
import javax.swing.*;
import model.*;


public class MainWindow extends JFrame {

	private JPanel initialPanel;
	private LogicSort logic;


	public MainWindow() {

		setLayout(new BorderLayout());
		setSize(600, 400);
		setTitle("Sorting Elements");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		logic = new LogicSort();
		
		setResizable(true);

		initialPanel = new InitialPanel(this);

		add(initialPanel);

	}

	
	public LogicSort getLogicSort() {
		
	return logic;	
		
	}
	
	/**
	 * This method is to refresh the window with the panels.
	 */
	public void refresh() {

		invalidate();
		revalidate();
		repaint();

	}

	public static void main(String[] args) {

		MainWindow window = new MainWindow();
		window.setVisible(true);
	}

}