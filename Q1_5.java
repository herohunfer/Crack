import java.util.*;
class Q1_5
{
	public static void main(String[] args)
	{
		String a = "  a  b c d";
		for (int i = 0; i < a.length(); i++)
		{
			if (a.charAt(i) == ' ')
			{
				if (i == a.length()-1) a = a.substring(0,i)+"%20";
				else
					a = a.substring(0, i) + "%20" + a.substring(i+1, a.length());
			}
		}
		System.out.println(a);
	}
}
