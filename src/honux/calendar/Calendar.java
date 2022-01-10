package honux.calendar;


public class Calendar {
	// 상수 배열
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	private static final int[] LEAP_MAX_DAYS = {31,29,31,30,31,30,31,31,30,31,30,31}; //윤년용
	
	
	public boolean isLeapYear(int year) {
		if(year%4==0 && (year%100!=0 || year%400==0)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int weekdayStringToInt(String weekday) {
		String wk = weekday;
		int wkInt = 0;
		
		if(wk.equals("SUN")) {
			wkInt = 0;
		}
		else if(wk.equals("MON")) {
			wkInt = 1;
		}
		else if(wk.equals("TUE")) {
			wkInt = 2;
		}
		else if(wk.equals("WED")) {
			wkInt = 3;
		}
		else if(wk.equals("THU")) {
			wkInt = 4;
		}
		else if(wk.equals("FRI")) {
			wkInt = 5;
		}
		else {
			wkInt = 6;
		}
		
		return wkInt;
	}

	public void printCalendar(boolean result, int year, int month, int weekday) {
		int maxDays = 0; //초기화
		//평년
		if(result) {
			maxDays =  LEAP_MAX_DAYS[month-1];
		}
		//윤년
		else {
			maxDays =  MAX_DAYS[month-1];
		}
		
		System.out.printf("\t <<%d년 %d월>> \t\n",year,month);
		
		System.out.println(" SUN MON TUE WED THU FRI SAT");
		for(int j=0;j<weekday;j++) {
			System.out.print("    ");
		}
		
		for(int i=0;i<maxDays;i++) {
			System.out.printf("%4d", (i+1));
			if(weekday==0) {
				if((i+1)%7 == 0) {
					System.out.println();
				}
			}
			else {
				if((i+1) % 7 == 7-weekday) {
					System.out.println();
				}
			}
		}
		
		System.out.println();
		
		
//		System.out.println("  SUN MON TUE WED THU FRI SAT");
//		System.out.println("---------------------------");
//		System.out.println("   1   2   3   4   5   6   7");
//		System.out.println("   8   9  10  11  12  13  14");
//		System.out.println("  15  16  17  18  19  20  21");
//		System.out.println("22  23  24  25  26  27  28");
	}

}
