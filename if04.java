package select;

import java.util.Scanner;

public class if04 {

	public static void main(String[] args) {
		// 점수 입력
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = input.nextInt();
		char grade;
		
		//점수에 맞는 학점 출력
		if (score >= 90) {
			grade = 'A';
		}
		else if (score >= 80) {
			grade = 'B';
		}
		else if (score >= 70) {
			grade = 'C';
		}
		else if (score >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		//학점 출력
		System.out.println("학점 : " + grade);
	}

}
