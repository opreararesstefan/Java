import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame {
	
	private JComboBox box;
	private JLabel pictur;
	
	private static String[] filename = {"b.png", "x.png"};
	private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])), new ImageIcon(getClass().getResource(filename[1]))};

	public Gui() {
		super("title");
		setLayout( new FlowLayout());
		
		box = new JComboBox(filename);
		
		box.addItemListener(  
				new ItemListener() { 
					public void itemStateChanged(ItemEvent event) {
						if(event.getStateChange() == ItemEvent.SELECTED)
							pictur.setIcon(pics[box.getSelectedIndex()]);
					}
				}
				);
		add(box);
		pictur = new JLabel(pics[0]);
		add(pictur);
	}

}
