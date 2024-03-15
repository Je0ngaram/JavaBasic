package chap02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double h = 60;

				System.out.println("초 단위 정수를 입력하세요 : ");
				int num = input.nextInt();
				System.out.println( (num/h) + "시간" + (num/h) + "분" + (num/h) + "초" );

	}

}
