import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;
import javax.swing.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class Apple extends JFrame{

	private JButton reg;
	private String path = "Lebenslauf.pdf";
	public Apple() {
		
		super("title");
		setLayout(new FlowLayout());
		
		reg = new JButton("reg");
		add(reg);
		
		Test handler = new Test(path);
		reg.addActionListener(handler);		
		}


	public class Test implements ActionListener{
		
		public String filepath;
		public Test(String f) {
			filepath = f;
		}	
		
		public void actionPerformed(ActionEvent event) {
				try{								
					if (Desktop.isDesktopSupported()) {  


						
						
						Desktop.getDesktop().open(new File(filepath));
					}
					}catch(Exception e) {
						JOptionPane.showMessageDialog(null,"Something goes wrong");}	
					}
		
	
	
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Apple go = new Apple();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setSize(600,480);
		go.setVisible(true);
		
	}


	}
