
public class apples {

	public static void main(String[] args) {

		animals[] thelist = new animals[2];
		dog d = new dog();
		fish f = new fish();
		
		thelist[0] = d;
		thelist[1] = f;
		
		for (animals x : thelist) {
			x.noise();
		}
		
		
	}

}
