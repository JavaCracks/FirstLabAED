package lnterface;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class ManualPanel extends JPanel implements ActionListener{

	public final static String SORT= "SORT";
	
	private JButton sort;
	private JLabel manual;
	private JLabel input;
	private JTextField inputTxt;
	
	public ManualPanel() {
	setLayout(null);
	TitledBorder border = new TitledBorder("Sorting Elements");
	setBorder(border);
	
	
	    sort = new JButton();
	    sort.addActionListener(this);
	    sort.setActionCommand(SORT);
	    sort.setLayout(null);
	    sort.setBounds(210, 100, 100, 50);
	    
	    manual= new JLabel("MANUAL");
	    manual.setLayout(null);
	    
	    input= new JLabel("Input:");
	    input.setLayout(null);
	    
	    inputTxt = new JTextField();
	    inputTxt.setLayout(null);
	    
	    
	    
	     add(sort);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}






