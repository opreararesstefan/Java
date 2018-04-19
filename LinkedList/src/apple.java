import java.util.*;
public class apple {

	public static void main(String[] args) {
		
		String[] things = {"apples", "noobs", "pownge", "bacon", "goats" };
		List<String> list1 =new LinkedList<String>();
		for(int i =0; i<things.length; i++)
			list1.add(things[i]);
		
		String[] things2 = {"sausage", "bacon", "goats", "harrypotter" };
		List<String> list2 = new LinkedList<String>();
		for(int i =0; i<things2.length;i++)
			list2.add(things2[i]);
		
		list1.addAll(list2);
		list2 = null;
		
		printMe(list1);
		removeStuff(list1, 2,5);
		printMe(list1);
		reverseMe(list1);
		
	}

	//printMe method
	private static void printMe(List<String> l) {
		for(int i=0; i<l.size(); i++){
			System.out.printf("%s ", l.get(i));
		}	
			System.out.println();
		
	}
	
	//removeStuff method
		private static void removeStuff( List<String> l, int from, int to) {
			l.subList(from, to).clear();
		}
		
	//reverseMe method
		private static void reverseMe(List<String> l) {
			ListIterator<String> bobby = l.listIterator(l.size());
			while(bobby.hasPrevious())
				System.out.printf("%s ", bobby.previous());
		}
	
}
