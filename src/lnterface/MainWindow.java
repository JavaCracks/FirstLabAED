package lnterface;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class MainWindow extends JFrame implements ActionListener{
	
	public final static String MANUAL ="Manual";
	public final static String RANDOM ="Random";

 
	private JButton manualButton;
	private JButton randomButton;
   private ManualPanel manual; 
   private RandomPanel random; 
   private JLabel text;

	
    
	public MainWindow() {
		
		 
		 setSize(600, 400);
			setTitle("Ordenamiento De Numeros");
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		//	setLayout(new BorderLayout());
			//setLayout(new FlowLayout());
			setResizable(true);
			setLayout(null);
			
			
			 manual= new ManualPanel();
			random = new RandomPanel();
			
			 manualButton = new JButton(MANUAL);
			 manualButton.addActionListener(this);
			 manualButton.setActionCommand(MANUAL);
			 manualButton.setLayout(null);
			 manualButton.setBounds(300, 180, 100, 40);
			 
			 randomButton = new JButton(RANDOM);
			 randomButton.addActionListener(this);
			 randomButton.setActionCommand(RANDOM);
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
	
	     
	
	
	
	public static void main(String[] args) {

         MainWindow window = new MainWindow();
         window.setVisible(true);

         
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
