import java.util.*;
public class apple {

	public static void main(String[] args) {

		System.out.println(max(23, 42, 1));
		System.out.println(max("apples", "tots", "chen"));

	}
	
	public static <T extends Comparable<T>> T max( T a, T b, T c) {
		T m =a;
		
		if(b.compareTo(a) > 0)
			m = b;
		if(c.compareTo(m) > 0)
			m = c;
		
		return m;
		
	}

}
