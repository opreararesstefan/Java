import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class dop extends JFrame {

	private JButton as;
	private JButton qw;
	
	public dop() {
		super("title");
		setLayout( new FlowLayout());
		
		as = new JButton("Buto");
		add(as);
		
		qw = new JButton("po");
		add(qw);
		
		Han hano = new Han();
		as.addActionListener(hano);
		qw.addActionListener(hano);
		
	}
	
	private class Han implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
		}
		
	}
	
}
