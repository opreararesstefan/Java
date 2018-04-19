import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JOptionPane;


public class Gui extends JFrame{
	
	private JButton reg;
	private JButton custom;
	
	public Gui() {
		super("the title");
		setLayout(new FlowLayout());
		
		reg = new JButton("button");
		add(reg);
		
		Icon b = new ImageIcon(getClass().getResource("b.png"));
		Icon x = new ImageIcon(getClass().getResource("x.png"));
		custom = new JButton("Custom", b);
		custom.setRolloverIcon(x);
		add(custom);
		
		
		
		HandlerClass handler = new HandlerClass();
		reg.addActionListener(handler);
		custom.addActionListener(handler);
		
		dop doop= new dop();
		doop.setDefaultCloseOperation(EXIT_ON_CLOSE);
		doop.setSize(640, 480);
		doop.setVisible(true);
		
	}
	
private class HandlerClass implements ActionListener {
	
	public void actionPerformed(ActionEvent event) {
		JOptionPane.showMessageDialog(null,String.format("%s", event.getActionCommand()));
	}
}	

}
