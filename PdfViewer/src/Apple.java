import java.awt.event.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;


public class Apple extends JFrame{
	
	//declare butons
	private JButton cv;
	private JButton zw;
	private JButton du;
	private JButton dub;
	private JMenuBar menubar;
	private String aboutt = "Powered By Oprea Rares \n 16-April-2018 \n CodeSource can be found: ";
	private String url =  "https://github.com/opreararesstefan/opreararesstefan.github.io \n";
	private String email = "opreararesstefan@gmail.com\n";
	
//constructor
	public Apple() {
		super("BestEditorEver");
		setLayout(new FlowLayout());
		
	//define buttons
		cv= new JButton("Lebenslauf");
		zw= new JButton("Zwischenzeugnis");
		du = new JButton("Diplom Ubersetz");
		dub = new JButton("Diplom ubersetz");
		menubar = new JMenuBar();
		
		cv.setPreferredSize(new Dimension(150,500));
		zw.setPreferredSize(new Dimension(150,500));
		du.setPreferredSize(new Dimension(150,500));
		dub.setPreferredSize(new Dimension(150,500));
		
		add(cv);
		add(zw);
		add(du);
		add(dub);
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
		cv.addActionListener(
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent event) {	 
					try{								
						 if (Desktop.isDesktopSupported()) {
					         // File in user working directory, System.getProperty("user.dir");
					          File file = new File("Lebenslauf.pdf");
					           if (!file.exists()) {
					              // In JAR
					                InputStream inputStream = ClassLoader.getSystemClassLoader()
						                                    .getResourceAsStream("Lebenslauf.pdf");
					              // Copy file
					               OutputStream outputStream = new FileOutputStream("Lebenslauf.pdf");
					                byte[] buffer = new byte[1024];
					                int length;
					                while ((length = inputStream.read(buffer)) > 0) {
					                    outputStream.write(buffer, 0, length);
					                }
					                outputStream.close();
					                inputStream.close();
					            }
					           // Open file
					           Desktop.getDesktop().open(file);
					       }
					}catch(Exception e) {
						JOptionPane.showMessageDialog(null,"Something goes wrong");}
				}
			}
		);
		
		zw.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent event) {
						try{								
							 if (Desktop.isDesktopSupported()) {
						         // File in user working directory, System.getProperty("user.dir");
						          File file = new File("Zwischenzeugnis.pdf");
						           if (!file.exists()) {
						              // In JAR
						                InputStream inputStream = ClassLoader.getSystemClassLoader()
							                                    .getResourceAsStream("Zwischenzeugnis.pdf");
						              // Copy file
						               OutputStream outputStream = new FileOutputStream("Zwischenzeugnis.pdf");
						                byte[] buffer = new byte[1024];
						                int length;
						                while ((length = inputStream.read(buffer)) > 0) {
						                    outputStream.write(buffer, 0, length);
						                }
						                outputStream.close();
						                inputStream.close();
						            }
						           // Open file
						           Desktop.getDesktop().open(file);
						       }
						}catch(Exception e) {
							JOptionPane.showMessageDialog(null,"Something goes wrong");}
					}
					}
		);
		
		du.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent event) {
						try{								
							 if (Desktop.isDesktopSupported()) {
						         // File in user working directory, System.getProperty("user.dir");
						          File file = new File("Diplom_ubersetz.pdf");
						           if (!file.exists()) {
						              // In JAR
						                InputStream inputStream = ClassLoader.getSystemClassLoader()
							                                    .getResourceAsStream("Diplom_ubersetz.pdf");
						              // Copy file
						               OutputStream outputStream = new FileOutputStream("Diplom_ubersetz.pdf");
						                byte[] buffer = new byte[1024];
						                int length;
						                while ((length = inputStream.read(buffer)) > 0) {
						                    outputStream.write(buffer, 0, length);
						                }
						                outputStream.close();
						                inputStream.close();
						            }
						           // Open file
						           Desktop.getDesktop().open(file);
						       }
						}catch(Exception e) {
							JOptionPane.showMessageDialog(null,"Something goes wrong");}		
					}
					}
		);
		dub.addActionListener(
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent event) {
					try{								
						 if (Desktop.isDesktopSupported()) {
					         // File in user working directory, System.getProperty("user.dir");
					          File file = new File("Diplom_ubersetz1.pdf");
					           if (!file.exists()) {
					              // In JAR
					                InputStream inputStream = ClassLoader.getSystemClassLoader()
						                                    .getResourceAsStream("Diplom_ubersetz1.pdf");
					              // Copy file
					               OutputStream outputStream = new FileOutputStream("Diplom_ubersetz1.pdf");
					                byte[] buffer = new byte[1024];
					                int length;
					                while ((length = inputStream.read(buffer)) > 0) {
					                    outputStream.write(buffer, 0, length);
					                }
					                outputStream.close();
					                inputStream.close();
					            }
					           // Open file
					           Desktop.getDesktop().open(file);
					       }
					}catch(Exception e) {
						JOptionPane.showMessageDialog(null,"Something goes wrong");}	
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
	}
}
