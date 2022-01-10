package honux.calendar;

import java.util.Scanner;

public class Prompt {
	public void runProgram() {
		//클래스 생성자
		Calendar cd = new Calendar();
		
		Scanner sc = new Scanner(System.in);
		int year = -1;
		int month =-1;
		String wk = "";
		
		while(true) {
			System.out.println("년도를 입력하세요. (exit: -1)");
			System.out.print("YEAR>");
			year = sc.nextInt();
			
			if(year==-1) {
				break;
			}
			
			System.out.println("달을 입력하세요.");
			System.out.print("MONTH>");
			month = sc.nextInt();
			
			// month가 -1일때 프로그램 종료
			if((month < 1) || (month > 12)) {
				//입력이 -1이면 입력 종료
				if(month == -1) {
					break;
				}
				else {
					System.out.println("1~12 사이의 월 입력이 아닙니다. 다시 입력해 주세요.");
					continue;
				}
			}
			
			
			System.out.println("첫번째 요일을 입력하세요. (SUN, MON, TUE, WED, THU, FRI, SAT)");
			System.out.print("WEEKDAY>");
			wk = sc.next();
			
			
			// 정상 값 출력
			cd.printCalendar(cd.isLeapYear(year),year,month, cd.weekdayStringToInt(wk));
			
		}
		
		System.out.println("Bye~");
		sc.close();
	}
	

	public static void main(String[] args) {
		Prompt pt = new Prompt();
		pt.runProgram();
	}


}
