package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("학생 수 :");
		int numStudent = Integer.parseInt(br.readLine());
		
		System.out.println(numStudent + "명의 성적 : ");
		String inStr = br.readLine();
		
		StringTokenizer st = new StringTokenizer(inStr, " ");
		
		int[] scores = new int[numStudent];
		
		for (int i = 0; i < numStudent; i++) {
			// nextToken으로 하나의 토큰을 가져와서 정수형을 바꾼 데이터를 배열의 요소에 저장
			scores[i] = Integer.parseInt(st.nextToken());
			
		}
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		int average = sum / scores.length;
	}

}