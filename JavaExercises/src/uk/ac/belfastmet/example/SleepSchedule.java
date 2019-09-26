package uk.ac.belfastmet.example;

public class SleepSchedule {

	public static void main(String[] args) {
		
		SleepSchedule thisWeek =  new SleepSchedule();
		thisWeek.sleepIn();
		

	}
	
	public void sleepIn() {
		int day = 6;
		Boolean sleepInDay = false;
		Boolean vacationDay = false;
		switch (day) {
		  case 1:
			sleepInDay = false;
			vacationDay = false;
		    System.out.println(sleepInDay + " " + vacationDay);		  
		    break;
		  case 2:
			sleepInDay = false;
		    vacationDay = false;
		    System.out.println(sleepInDay + " " + vacationDay);  
		    break;
		  case 3:
			sleepInDay = false;
		    vacationDay = false;
		    System.out.println(sleepInDay + " " + vacationDay);
		    break;
		  case 4:
			sleepInDay = false;
			vacationDay = false;
			System.out.println(sleepInDay + " " + vacationDay);
		    break;
		  case 5:
			sleepInDay = false;
			vacationDay = false;
			System.out.println(sleepInDay + " " + vacationDay);
		    break;
		  case 6:
			sleepInDay = true;
			vacationDay = true;
			System.out.println(sleepInDay + " " + vacationDay);
		    break;
		  case 7:
		    sleepInDay = true;
			vacationDay = true;
			System.out.println(sleepInDay + " " + vacationDay);
		    break;
		    default:
		    	System.out.println("Looking forward to the weekend!!!");
		}
	}

}
