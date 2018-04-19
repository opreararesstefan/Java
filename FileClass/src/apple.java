import java.io.File;
import java.util.*;
public class apple {

	public static void main(String[] args) {
		
		File x1 = new File("C:\\test.txt");
		
		if(x1.exists())
			System.out.println(x1.getName()+"exists");
		else
			System.out.println("this thing doesnt exist");
	
	final Formatter x;
	
	try {
		x = new Formatter("Fred.txt");
		System.out.println("you created a fuke");
	}
	catch(Exception e) {
		System.out.println("you got a error");
	}
	
	}

}
