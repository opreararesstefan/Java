
public class apple {

	public static void main(String[] args) {

		String s = "Buckyrobertsbukyroberttsbuckyroberts";
		
		System.out.println(s.indexOf('k'));
		
		String a = "Bacon ";
		String b = "monster";
		
		System.out.println(a.concat(b));
		System.out.println(a.replace('B', 'F'));
		
		System.out.println(fact(5));
	}
	
	public static int fact(int n) {
		if (n<= 1)
			return 1;
		else
		return	n * fact(n-1);
		
	}

}
