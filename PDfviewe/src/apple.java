import java.awt.BorderLayout;
import java.io.*;
import javax.swing.*;
import com.adobe.acrobat.Viewer;

public class apple extends JPanel{

	private Viewer viewer;
	
	public apple(String fileName) throws Exception{
		this.setLayout(new BorderLayout());
		viewer = new Viewer();
		FileInputStream fis = new FileInputStream(fileName);		
		viewer.setDocumentInputStream(fis);
		this.add(viewer, BorderLayout.CENTER);
		viewer.activate();
	}




	public static void main(String[] args) throws Exception {

		String file = "Lebenslauf.pdf";
		apple t = new apple(file);
		
		JFrame f = new JFrame(file);
		f.setSize(1024,  768);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.getContentPane().add(t);

	}

}
