package select;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		System.out.println("D");
		System.out.println("F");
		System.out.println("등급을 입력하세요 : ");
		
		Scanner input = new Scanner(System.in);
		String score = input.next();
		
		switch (score) {
		  case "A":
			  System.out.println("아주 열심히 하셨군요!");
			  break;
		  case "B":
			  System.out.println("아주 열심히 하셨군요!");
			  break;
		  case "C":
			  System.out.println("남들만큼 하셨네요!");
			  break;
		  case "D":
			  System.out.println("조금 더 노력이 필요합니다!");
			  break;
		  case "F":
			  System.out.println("교수실로 찾아오세요!");
			  
		}

	}

}
	