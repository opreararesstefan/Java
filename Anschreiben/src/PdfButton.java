import java.awt.event.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;

public class PdfButton extends JFrame{
	
	//declare butons
	private JButton cv;
	private JButton zw;
	private JButton du;
	private JButton dub;
	private JButton sn;
	
	private JMenuBar menubar;
	
	private String aboutt = "Powered By Oprea Rares \n 16-April-2018 \n CodeSource can be found: ";
	private String url =  "https://github.com/opreararesstefan/opreararesstefan.github.io \n";
	private String email = "opreararesstefan@gmail.com\n";
	private String cvpath = "Lebenslauf.pdf";
	private String zwpath = "Zwischenzeugnis.pdf";
	private String dupath = "Diplom_ubersetz.pdf";
	private String dubpath = "Diplom_ubersetz1.pdf";
	
//constructor
	public PdfButton() {
		super("BestEditorEver");
		setLayout(new FlowLayout());
		
	//define buttons
		cv= new JButton("Lebenslauf");
		zw= new JButton("Zwischenzeugnis");
		du = new JButton("Diplom Ubersetz");
		dub = new JButton("Diplom ubersetz");
		menubar = new JMenuBar();
		sn = new JButton("Snake Game");
		
		cv.setPreferredSize(new Dimension(150,400));
		zw.setPreferredSize(new Dimension(150,400));
		du.setPreferredSize(new Dimension(150,400));
		dub.setPreferredSize(new Dimension(150,400));
		sn.setPreferredSize(new Dimension(600, 100));
		
//add to the screen
		add(cv);
		add(zw);
		add(du);
		add(dub);
		add(sn, BorderLayout.SOUTH);
		setJMenuBar(menubar);
		
		JMenu file = new JMenu("File");
		menubar.add(file);
		JMenuItem exit = new JMenuItem("Exit");
		file.add(exit);
		
		JMenu help = new JMenu("Help");
		menubar.add(help);
		JMenuItem about = new JMenuItem("About");
		help.add(about);

		
//push button actions	
		Handler handlercv = new Handler(cvpath);
		cv.addActionListener(handlercv);	
		
		Handler handlerzw = new Handler(zwpath);
		zw.addActionListener(handlerzw);	

		Handler handlerdu = new Handler(dupath);
		du.addActionListener(handlerdu);	
		
		Handler handlerdub = new Handler(dubpath);
		dub.addActionListener(handlerdub);	
		
		sn.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent event) {
						EventQueue.invokeLater(() -> {
				            JFrame ex = new Board();
				            ex.setVisible(true);
				        });
				}
			}
		);
		
		exit.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent event) {
						System.exit(0);
				}
			}
		);
		about.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent event) {
						JOptionPane.showMessageDialog(null, aboutt+url+email, "About", JOptionPane.INFORMATION_MESSAGE);
					
					}
				}
		);	
	}				//constructor end
	
	public class Board extends JFrame {

		//constructor  BOard
	    public Board() {
	        initUI();
	    }
	    
	    private void initUI() {
	        
	        add(new Snake());
	        
	        setResizable(false);
	        pack();
	        
	        setTitle("Snake");
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }
	}
	// ActionListener method
		private class Handler implements ActionListener{
		
			public String filepath;		
			//constructor
			public Handler(String f) {
				filepath = f;
			}	
			
			public void actionPerformed(ActionEvent event) {
					try {
						if (Desktop.isDesktopSupported()) {  
							Desktop.getDesktop().open(new File(filepath));
						}
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null,"Something goes wrong");}	
					}
		}
	}
	

