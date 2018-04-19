import javax.swing.JFrame;

public class apple {

	public static void main(String[] args) {
		
		Server s = new Server();
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s.startRunning();
	}

}
