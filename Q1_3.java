import java.util.*;
class Q1_3
{
	public static void main(String[] args)
	{
		Scanner scan1 = new Scanner(System.in);
		String a = scan1.nextLine();
		for (int i = 0; i < a.length()-1; i++)
			for (int n = i+1; n < a.length(); n++)
				if (a.charAt(i) == a.charAt(n))
				{
					if (n < a.length()-1)
					{
				 		a = a.substring(0, n) + a.substring(n+1,a.length());
						n--;
					}
					else a = a.substring(0,n);
				}
		System.out.println(a);
	}
}
