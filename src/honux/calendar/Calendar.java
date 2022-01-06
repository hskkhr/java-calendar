package honux.calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		System.out.println("일  월  화  수  목 금  토");
		System.out.println("----------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");

		System.out.println("달을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int dates = 0;

		switch (month) {
		case 1:
			dates = 31;
			break;
		case 2:
			dates = 28;
			break;
		case 3:
			dates = 31;
			break;
		case 4:
			dates = 30;
			break;
		case 5:
			dates = 31;
			break;
		case 6:
			dates = 30;
			break;
		case 7:
			dates = 31;
			break;
		case 8:
			dates = 31;
			break;
		case 9:
			dates = 30;
			break;
		case 10:
			dates = 31;
			break;
		case 11:
			dates = 30;
			break;
		case 12:
			dates = 31;
			break;
		}
		
		System.out.printf("%d월은 %d일까지 있습니다.", month, dates);
		sc.close();
	}

}
