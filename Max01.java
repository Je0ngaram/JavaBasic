package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Max01 {

	public static int getmax(int a, int b, int c) {
		
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		return max;
		
	}
	public static int main(String[] args) throws IOException {
		
		System.out.println("세 개의 숫자를 입력하세요.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String inStr = br.readLine();
		StringTokenizer St = new StringTokenizer(inStr," ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		System.out.println("최댓값은 " + max + "입니다.");
		
	}

}