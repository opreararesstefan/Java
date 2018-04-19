import java.util.Random;

public class tuna implements Runnable{
	String name;
	Random r = new Random();
	int time;
	
	public tuna(String s) {
		name = s;
		time = r.nextInt(999);
	}
	
	public void run() {
		try {
			System.out.printf("%s is sleeping for %d\n", name, time);
			Thread.sleep(time);
			System.out.printf("%s is done\n", name);
		}catch(Exception e) {}
	}

}
