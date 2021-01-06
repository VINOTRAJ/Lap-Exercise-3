/*
 * @author:VINOTH>R
 * desc:Create a method that accepts a String and checks if it is a positive string. A string is considered 
 * a positive string, if on moving from left to right each character in the String comes after the previous characters in 
 * the Alphabetical order. For Example: ANT is a positive String (Since T comes after N and N comes after A). The method should
    return true if the entered string is positive.
 */


import java.util.*;
public class positivestring {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String val= positiveString(str);
	}
	public static String positiveString(String str)
	{
		//StringBuilder obj=new StringBuilder(str);
		char[] val1=str.toCharArray();
		Arrays.sort(val1);
		String sds=val1.toString();
		System.out.println(str);
	System.out.println(val1);
		System.out.println(sds.equals(str));
		
	return str.toString();
		
//		if(!val1.toString().equals(str.toString()))
//		{
//			System.out.println(val1+ "TRUE ! The Given String is Positive");
//		}
//		else
//		{
//			System.out.println("FALSE ! The Given String is Negative");
//		}	
	}
}
