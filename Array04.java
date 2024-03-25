package array;

public class Array04 {

	public static void main(String[] args) {
		int rows = 2, columns = 3;
		int[][] firstMatrix = { { 2, 3, 4 }, { 3, 2, 1 } };
		int[][] secondMatrix = { { 1, 2, 3 }, { -4, -2, 1 } };

		int[][] sum = new int[rows][columns];

		// 두 행렬의 합을 구하는 코드 추가
		for (int row = 0; row < rows; row++) {
			for(int col = 0; col < columns; col++) {
				sum[row][col] = firstMatrix[row][col] + secondMatrix[row][col];
			}
		}

		System.out.println("두 행렬의 합: ");

		// 구한 결과를 출력하는 코드 추가
		for (int row = 0; row < rows; row++) {
			for(int col = 0; col < columns; col++) {
				System.out.print(sum[row][col] + " ");
			}
			System.out.println();
	}
}
}