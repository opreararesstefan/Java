import java.util.*;

public class apple {

	public static void main(String[] args) {

		String[] crap = {"apples", "lemons", "geese", "youtube" };
		
		List<String> l1 = Arrays.asList(crap);
		
		Collections.sort(l1);
		System.out.printf("%s ", l1);
		
		Collections.sort(l1, Collections.reverseOrder());
		System.out.printf("%s ", l1);
		
		//create an array and convert to list
		Character[] ray = {'p', 'w', 'n' };
		List<Character> l = Arrays.asList(ray);
		System.out.println("List is: ");
		output(l);
	
		//reverse and print out the list
		Collections.reverse(l);
		System.out.println("After reverse: ");
		output(l);
		
		//create a new array and a new list
		Character[] newRay = new Character[3];
		List<Character> listCopy = Arrays.asList(newRay);
		
		//copy contents of list into listcopy
		Collections.copy(listCopy, l);
		System.out.println("Copy of list: ");
		output(listCopy);
		
		ArrayList<Character> lc = new ArrayList<Character>();
		Collections.addAll(lc, ray);
		System.out.println("The addAll method: ");
		output(lc);
		
		System.out.println(Collections.frequency(lc, 'n'));
		
		boolean tof = Collections.disjoint(lc, l);
		System.out.println(tof);
		
		if(tof)
			System.out.println("these list do not have anything in common");
		else
			System.out.println("these list are have something in common");
		
		//fill Collections with crap
		Collections.fill(l, 'X');
		System.out.println("After filling the list: ");
		output(l);		
	
	}
	
	//output method
	private static void output(List<Character> thelist ) {
		for(int i =0; i<thelist.size();i++)
			System.out.printf("%s ", thelist.get(i));
	System.out.println();
	}
	

}
