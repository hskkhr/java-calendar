package honux.calendar;

import java.util.Scanner;

public class Calendar {
	// 상수 배열
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	//입력값에 해당하는 달의 최대일수 출력하는 함수
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	
	//샘플 캘린더를 출력하는 함수
	public void printSampleCalendar() {
		System.out.println("일  월  화  수  목 금  토");
		System.out.println("----------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {
		//클래스 생성자
		Calendar cd = new Calendar();
		
		//달 입력 받기
		System.out.println("달을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		//결과 출력
		System.out.printf("%d월은 %d일까지 있습니다.\n\n", month, cd.getMaxDaysOfMonth(month));
		sc.close();
		
		cd.printSampleCalendar();
	}

}
