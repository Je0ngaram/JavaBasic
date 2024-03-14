package select;

import java.util.Scanner;

public class if01 {

	public static void main(String[] args) {
		// 세 개의 숫자를 입력
		Scanner input = new Scanner(System.in);
		System.out.println("세 개의 숫자를 입력하세요.");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		//최댓값 구하기
		int max = 10000;
		
		//a를 조사
		if (a > max) {
			max = a;
		}
		
		//b를 조사
		if (b > max) {
			max = b;
		}
		
		//c를 조사
		if (c > max) {
			max = c;
			}
		}
		
		//최댓값 출력
	}
