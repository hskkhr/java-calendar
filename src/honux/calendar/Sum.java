package honux.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		//키보드 입력 받기 
		System.out.println("두 수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//합 구하기
		System.out.printf("두 수의 합은 %d입니다", a+b);
		
		sc.close();
	}

}
