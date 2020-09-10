package Sample;

public class Hello {

	public static void main(String[] args) {

		String s = "AHCECLWLXO";
		int j = s.length();
		System.out.println(j);
		for (int i = 1; i <=s.length(); i=i+2) {
		char c = s.charAt(i);	
		System.out.print(c);
		}
		System.out.println();
		String s1="ahceclwlxo";
		for (int i = 1; i <=s1.length(); i=i+2) {
		System.out.print(s1.toUpperCase().charAt(i));

		}

	}
}
