package loop;

import java.util.Scanner;

public class For06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		
		System.out.println("[ 구구단 " + num + "단 ]");

		for (int i = 1; i <= 9; i++) {
			//2단부터 9단까지의 구구단 모두 출력
			System.out.println(num + " x " + i + " = " + (num * i));
			
		}
	}

}
