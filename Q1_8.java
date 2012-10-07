import java.util.*;
class Q1_8
{
	public static void main(String[] args)
	{
		Scanner scan1 = new Scanner(System.in);
		String a = scan1.nextLine();
		String b = scan1.nextLine();
		isSubString(a,b);
	}
	static void isSubString(String a, String b)
	{
		boolean flag = false;	
		if (a.length() != b.length() )
			System.out.println("No");
		else 
		{
			for (int i = 0; i < a.length()-2; i++)
			{
				if ((a.substring(i,a.length())+a.substring(0,i)).equals(b))
				{
					flag = true;
					System.out.println("Yes");
				}
			}
			if (!flag)
			System.out.println("No");
		}
	}
}
