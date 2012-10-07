import java.util.*;
class Q1_6 
{
	public static void main(String[] args)
	{
		int [][] a = {(1,2,3),(4,5,6),(7,8,9)};
		int n = 3;
		int temp = 0;
		for (int i = 0; i < n/2; i++)
		{
			int first = i;
			int last = n-1-i;
			for (int j =first; j < last; j++)
			{
				int top = a[first][j];
				int offset = j - i;
				a[i][j] = a[last-offset][i];
				a[last-offset][i] = a[last][last-offset];
			}
		}
	}
}
