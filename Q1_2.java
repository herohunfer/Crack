import java.util.*;
class Q1_2
{
	public static void main(String[] args)
	{
		Scanner scan1 = new Scanner(System.in);
		String a = scan1.nextLine();
		String temp = "\0";
		for (int i = a.length()-1; i >= 0; i--)
			temp+=a.charAt(i);
		System.out.println(temp);
		System.out.println("string length = "+ temp.length());
	}
}
