package uk.ac.belfastmet.example;

public class Example {
	
	private int a = 3;
	private int b = 7;
	
	public static void main(String[] args) {
//		Example example = new Example();
//		example.printConditions();
//		
//		Example example2 = new Example();
//		example2.loopConditions();
		
//		Example whileLoop = new Example();
//		whileLoop.whileConditions();
		
//		Example doWhileLoop = new Example();
//		doWhileLoop.doWhile();
		
		Example switchOne = new Example();
		switchOne.switchStatement();
		
	}
	
	public void printConditions() {
		if(a == b) {
			System.out.println("A equls B");
		} else if (a > b) {
			System.out.println("A is greater than B");
		} else {
			System.out.println("A is less than B");
		}
	}
	
	public void loopConditions() {
		for(int i = 50; i >= 0; i--) {
			if ((i % 5) == 0 && (i % 3) == 0) {
				System.out.println("Fizzbuzz");
			} else if ((i % 3) == 0) {
				System.out.println("Fizz");
			} else if ((i % 5) == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		}
		
		
	}
	
	public void whileConditions() {
		int j = 0;
		while (j < 5) {
			System.out.println(j);
			j++;
		}
	}
	
	public void doWhile() {
	int x = 3;
	do {
		System.out.println(x);
		x++;
	} while (x <= 10);	
	}
	
	public void switchStatement() {
		int day = 8;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		    default:
		    	System.out.println("Looking forward to the weekend!!!");
		}
	}

}
