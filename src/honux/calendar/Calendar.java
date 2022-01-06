package honux.calendar;

import java.util.Scanner;

public class Calendar {
	// 상수 배열
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	//입력값에 해당하는 달의 최대일수 출력하는 함수
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}

	public static void main(String[] args) {
		
		//클래스 생성자
		Calendar cd = new Calendar();
		
		Scanner sc = new Scanner(System.in);
		int month = 0;
		
		while(true) {
			// 월 입력받기
			System.out.println("월을 입력하세요.");
			System.out.print(">");
			month = sc.nextInt();
			
			// month가 -1일때 프로그램 종료
			if((month < 1) || (month > 12)) {
				System.out.println("Have a nice day!");
				break; // 프로그램 종료
			}
			// 정상 값 출력
			else {
				System.out.printf("%d월은 %d일까지 있습니다.\n\n",month,cd.getMaxDaysOfMonth(month));
			}
		}
		sc.close();
	}

}
