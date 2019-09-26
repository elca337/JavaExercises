package uk.ac.belfastmet.example;


public class IndexTest {

	public static void main(String[] args) {
		IndexTest stringFix = new IndexTest();
		stringFix.missingChar();

	}
	
	public void missingChar() {
		String m = "kitten";
		int n = 3;		
		StringBuilder sb = new StringBuilder();
		sb.append(m);
		sb.deleteCharAt(n);
		m = sb.toString();
		System.out.println(m);
	}


}


