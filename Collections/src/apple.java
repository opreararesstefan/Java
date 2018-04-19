import java.util.*;
public class apple {

	public static void main(String[] args) {
		String[] things = {"eggs", "lasers", "hats", "pie"};
		List<String> list1 = new ArrayList<String>();
		
		//add array items to list
		
		for(int i = 0; i < things.length; i++)
			list1.add(things[i]);
		
		String[] morethings = {"lassers", "hats"};
		List<String> list2 = new ArrayList<String>();
		
		for(int i = 0; i < morethings.length; i++)
			list2.add(morethings[i]);
		
		for(int i = 0; i < list1.size(); i++)
			System.out.printf("%s ",list1.get(i));
	
		editlist(list1, list2);
		System.out.println();
		
		for(int i = 0; i < list1.size(); i++)
			System.out.printf("%s ", list1.get(i));
		
		
	}

	public static void editlist(Collection<String> l1, Collection<String> l2) {
		Iterator<String> it = l1.iterator();
		
		while(it.hasNext()) {
			if(l2.contains(it.next()))
				it.remove();
		}
	}
}
