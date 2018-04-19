import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Foi extends JFrame{
	private JTextField tf;
	private JCheckBox boldbox;
	private JCheckBox italicbox;
	
	public Foi() {
		super("title");
		setLayout( new FlowLayout());
		
		tf = new JTextField("This is a sentece", 20);
		tf.setFont( new Font("Serif", Font.PLAIN, 14));
		add(tf);
		
		boldbox = new JCheckBox("bold");
		italicbox = new JCheckBox("italic");
		add(boldbox);
		add(italicbox);
		
		Hand handler = new Hand();
		boldbox.addItemListener(handler);
		italicbox.addItemListener(handler);
		
	}
	
	private class Hand implements ItemListener {
		public void itemStateChanged(ItemEvent event) {
			Font font = null;
			
			if(boldbox.isSelected() && italicbox.isSelected())
				font = new Font("Serif", Font.BOLD + Font.ITALIC,14);
			else if (boldbox.isSelected())
				font = new Font("das", Font.BOLD,14);
			else if (italicbox.isSelected())
				font = new Font("ital", Font.ITALIC,14);
			else 
				font = new Font("for", Font.PLAIN, 14);
			
			tf.setFont(font);
		}
		
	}
}
