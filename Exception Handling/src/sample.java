import java.util.*;

public class sample {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
		System.out.println(" Enter first number: ");
		int n1 = input.nextInt();
		System.out.println("Enter second number: ");
		int n2 = input.nextInt();
		int sum = n1/ n2;
		System.out.println(sum);
		}
	catch(Exception a) {
		System.out.println("you can't do that"); 
	}
}
	}
