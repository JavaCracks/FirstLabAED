package lnterface;

import java.awt.Font;
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
	
	
	    sort = new JButton(SORT);
	    sort.addActionListener(this);
	    sort.setActionCommand(SORT);
	    sort.setLayout(null);
	    sort.setBounds(240, 250, 100, 50);
	    
	    manual= new JLabel("MANUAL");
	    manual.setLayout(null);
	    manual.setFont(new Font("ARIAL", 1, 20 ));
	    manual.setBounds(240,100,100,50); 
	    
	    input= new JLabel("Input:");
	    input.setLayout(null);
	    input.setFont(new Font("ARIAL", 1, 16 ));
	    input.setBounds(120,160,80,50); 

	    
	    
	    inputTxt = new JTextField();
	    inputTxt.setLayout(null);
	    inputTxt.setBounds(200,170,250,30); 

	    
	    
	    
	     add(sort);
	     add(manual);
	     add(input);
	     add(inputTxt);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}






