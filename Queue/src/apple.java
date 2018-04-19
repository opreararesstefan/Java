import java.util.*;

public class apple {

	public static void main(String[] args) {

		PriorityQueue<String> q = new PriorityQueue<String>();
		q.offer("First");
		q.offer("Second");
		q.offer("Third");
		
		System.out.printf("%s ", q);
		System.out.println();
		
		System.out.printf("%s ", q.peek());
		System.out.println();
		
		q.poll();
		System.out.printf("%s ", q);
		System.out.println();
		
		String[] things = {"apple", "bob", "ham", "bob", "bacon" };
		List<String> list = Arrays.asList(things);
		
		System.out.printf("%s ", list);
		System.out.println();
		
		Set<String> set = new HashSet<String>(list);
		System.out.printf("%s ", set);
	}

}
