import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame{
	private String detailes;
	private JLabel statusbar;
	
	public Gui() {
		super("titel");
		
		statusbar = new JLabel("this is defa");
		add(statusbar, BorderLayout.SOUTH);
		addMouseListener(new Mouseclass());
	}
	
	private class Mouseclass extends MouseAdapter{
		
		public void mouseClicker(MouseEvent event) {
			detailes =  String.format("You clicked %d",event.getClickCount());
			
			if(event.isMetaDown())
				detailes += "with right mouse button";
			else if(event.isAltDown())
				detailes += "with center mouse button";
			else 
				detailes += "withaout left mouse";
				
			statusbar.setText(detailes);
		}
		
	}

}
