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

	public void printSampleCalendar(boolean result, int month) {
		int maxDays = 0; //초기화
		//평년
		if(result) {
			maxDays =  LEAP_MAX_DAYS[month-1];
		}
		//윤년
		else {
			maxDays =  MAX_DAYS[month-1];
		}
		
		System.out.printf("\t <<%d월>> \t\n",month);
		
		System.out.println(" SUN MON TUE WED THU FRI SAT");
		for(int i=0;i<maxDays;i++) {
			System.out.printf("%4d", (i+1));
			if((i+1) % 7 == 0) {
				System.out.println();
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
