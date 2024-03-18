package loop;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		int i = 1;
		int sum = 0;
		
		do {
			//숫자를 계속 입력 받으면서 더함
			sum += num;
			
		} while (i != 0);
		// 0 입력 시 멈추고 지금까지 더한 값 출력
		System.out.print("지금까지 입력한 숫자의 합은 " + sum + "입니다.");

	}

}
