
public class apple {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new tuna("one"));
		Thread t2 = new Thread(new tuna("two"));
		Thread t3 = new Thread(new tuna("three"));
		
		t1.start();
		t2.start();
		t3.start();
	}

}
