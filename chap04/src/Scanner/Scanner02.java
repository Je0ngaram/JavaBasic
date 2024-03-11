package Scanner;

import java.util.Scanner;

public class Scanner02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double PI = 3.14;

				System.out.println("원의 반지름을 입력하세요.( :cm)");
				int r = input.nextInt();
				System.out.println("원의 넓이는 : " + (PI * r * r) + "입니다");
			}
  }