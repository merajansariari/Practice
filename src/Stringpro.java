import java.util.Arrays;
import java.util.Scanner;
public class Stringpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	String str1 = "MADAM";
		Scanner sc = new Scanner(System.in);
	//	System.out.println("Enter the String : ");
	//	String str1 = sc.next();
	//	String str2 = "";
		
	//	for(int i = str1.length()-1; i>=0; i--)
	//	{
			
	//		str2 = str2 + str1.charAt(i);
	//	}
		
	//	if(str1.equals(str2))
	//	{
	//		System.out.println("It is palindrome.");
	//	}
	//	else
	//	{
	//		System.out.println("It is not palindrome.");
	//	}
		
//		System.out.println("Enter the first String :");
//		String s1 = sc.nextLine();
		
//		System.out.println("Enter the second String :");
//		String s2 = sc.nextLine();
		
//		s1 = s1.replace(" ", "");
//		s2 = s2.replace(" ", "");
		
//		s1 = s1.toLowerCase();
//		s2 = s2.toLowerCase();
		
//		char a1[] = s1.toCharArray();
//		char a2[] = s2.toCharArray();
		
//		Arrays.sort(a1);
//		Arrays.sort(a2);
		
//		if(Arrays.equals(a1, a2))
//		{
//			System.out.println("It is an Anagram.");
	//	}
//		else
//		{
	//		System.out.println("It is not an Anagram.");
	//	}
		boolean flag=false;
		System.out.println("Enter the String:");
		String s4 = sc.nextLine();
	//	String s4 = "The Quick Brown Fox Jumps Over Lazy Dog";
		s4 = s4.replace(" ", "");
		
		s4 = s4.toLowerCase();
		
		char ch[] = s4.toCharArray();
		
		int r1[] = new int[26];
		
		for(int i=0; i<ch.length; i++)
		{
			r1[ch[i]-97]++;
		}
		for(int i=0; i <r1.length; i++ )
		{	
		if(r1[i] == 0)
		{
			System.out.println("It is not panagram.");
			flag=true;
		}
		}
		if(flag==false)
		{
			System.out.println("It is panagram.");
		}
	}
}
