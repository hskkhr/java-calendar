package honux.calendar;


public class Calendar {
	// 상수 배열
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	//입력값에 해당하는 달의 최대일수 출력하는 함수
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	
	public void printSampleCalendar(int month) {
		System.out.printf("\t <<%d월>> \t\n",month);
		System.out.println("SUN MON TUE WED THU FRI SAT");
		System.out.println("---------------------------");
		System.out.println(" 1   2   3   4   5   6   7");
		System.out.println(" 8   9  10  11  12  13  14");
		System.out.println("15  16  17  18  19  20  21");
		System.out.println("22  23  24  25  26  27  28");
	}

}
