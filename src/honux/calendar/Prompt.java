package honux.calendar;

import java.util.Scanner;

public class Prompt {
	private static final String PROMPT = ">";
	
	public void runProgram() {
		//클래스 생성자
		Calendar cd = new Calendar();
		
		Scanner sc = new Scanner(System.in);
		int month = 0;
		
		while(true) {
			System.out.println("월을 입력하세요.");
			System.out.print(PROMPT); // 프롬프트 출력
			month = sc.nextInt(); // 월 입력받기
			
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
			// 정상 값 출력
			else {
				cd.printSampleCalendar(month);
			}
		}
		
		System.out.println("Bye~");
		sc.close();
	}
	

	public static void main(String[] args) {
		Prompt pt = new Prompt();
		pt.runProgram();
	}


}
