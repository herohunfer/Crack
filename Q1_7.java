import java.util.*;
class Q1_7 {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		int m = 6;
		int n = 4;
		int[][] matrix = { {1,2,3,4},
				   {5,0,6,7},
				   {8,9,0,1},
				   {1,1,1,1},
				   {1,1,1,1},
				   {1,0,1,1},
				 };
		matrix = zero(matrix);
		//print
		for (int i = 0; i < m; i++ ) {
			for (int j=0; j<n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	}
	static int [][] zero(int[][] m) {
		int [] row = {0,0,0,0,0,0};
		int [] colomn = { 0, 0, 0, 0};
		for (int i = 0; i < 6; i++)
		for (int j = 0; j < 4; j++)
			if (m[i][j] == 0) {
				row[i] = 1;
				colomn[j] = 1;
			}
		for (int i = 0; i < 6; i++)
		for (int j = 0; j < 4; j++) 
			if (row[i] == 1 || colomn[j] == 1)
				m[i][j] = 0;
		return m;
	}

}
