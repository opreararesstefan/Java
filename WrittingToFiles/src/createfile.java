import java.io.*;
import java.lang.*;
import java.util.*;

public class createfile {

	private Formatter x1;
	
	public void openFile() {
		
		try {
			x1= new Formatter("Chinese.txt");
		}catch (Exception e) {
			System.out.println("you have an error");
		}	
	}
	
	public void addRecords() {
		x1.format("%s%s%s", "30 ", "rares ", "oprea");
	}
	
	public void closeFile() {
		x1.close();
	}
	
	private Scanner x;
	
	public void open() {
		try {
			x= new Scanner(new File("Chinese.txt"));
		}
		catch(Exception e1) {
			System.out.println("could not find file");
		}
	}
	
	public void readFile() {
		while (x.hasNext()) {
			String a =x.next();
			String b = x.next();
			String c = x.next();
			
			System.out.printf("%s %s %s\n",a , b,c);
		}
	}
	public void closeFil() {
		x.close();
		
	}
}
  