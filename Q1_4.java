import java.util.*;
class Q1_4
{
	public static void main(String[] args)
	{
		Scanner scan1 = new Scanner(System.in);
		String a = scan1.nextLine();
		String b = scan1.nextLine();
		if (a.length() != b.length())
		{
			System.out.println("No");
			System.exit(0);
		}
		HashMap<Character, Integer> map  = new HashMap<Character, Integer>();
		for (int i = 0; i < a.length(); i++)
			if (map.get(a.charAt(i)) == null)
				map.put(a.charAt(i), 1);
			else map.put(a.charAt(i), 1+map.get(a.charAt(i)).intValue());
		
		for (int i = 0; i < b.length(); i++)
			if (map.get(b.charAt(i)) == null)
				{
					System.out.println("No");
					System.exit(0);
				}
			else 
			{
				int j = map.get(b.charAt(i)).intValue()-1;
				if (j == 0) map.remove(b.charAt(i));
				else map.put(b.charAt(i), j);
			}
		
		if (map.isEmpty())
			System.out.println("Yes");
		else System.out.println("No");
	}
}
