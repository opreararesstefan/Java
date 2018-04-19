import java.util.*;
public class apple {

	public static void main(String[] args) {
		
		String[] stuff = {"babies", "watermelone", "melons", "fudge" };
		LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));
		
		thelist.add("pumpkin");
		thelist.addFirst("firstthing");
		
	//convert back to an array
		stuff = thelist.toArray(new String[thelist.size()]);
		
		for(int i =0; i<stuff.length; i++)
			System.out.printf("%s ", stuff[i]);

	}

}
