import java.awt.*;
import javax.swing.*;

public class apple {

	public static void main(String[] args) {
		
		Peach pe = new Peach();
		JFrame f = new JFrame("title");
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pe.setBackground(Color.WHITE);
		 f.add(pe);
		 f.setSize(500, 270);
		 f.setVisible(true);
	}

}
