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
		//반복횟수 입력받기
		System.out.println("반복횟수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] month = new int[num];
		
		//반복횟수만큼 월 입력받기
		System.out.println("월을 입력하세요.");
		for(int i=0;i<num;i++) {
			month[i] = sc.nextInt();
		}
		
		//클래스 생성자
		Calendar cd = new Calendar();
		
		//결과 출력
		for(int i=0;i<num;i++) {
			System.out.printf("%d월은 %d일까지 있습니다.\n", month[i], cd.getMaxDaysOfMonth(month[i]));
		}
		sc.close();
	}

}
