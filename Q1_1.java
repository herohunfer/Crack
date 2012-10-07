import java.util.*;
class Q1_1
{
	public static void main(String[] args)
	{
		Scanner scan1 = new Scanner(System.in);
		String a = scan1.nextLine();
		boolean flag = true;
		/*
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (char c: a)
		{
			int b = (int)c;
			map.put()
		}
		*/
		for (int i = 0; i<a.length(); i++)
		{
			for (int n = i+1; n < a.length(); n++) 
				if (a.charAt(i) == a.charAt(n)) 
				{
					flag = false;
					break;
				}
			if (!(flag)) break;
		}
		if (flag)
		System.out.println("Yes");
		else System.out.println("No");
			
	}
}
