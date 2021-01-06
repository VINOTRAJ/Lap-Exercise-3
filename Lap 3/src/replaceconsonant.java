/*
 * @author:VINOTH>R
 * desc:Create a method which accepts a String and replaces all the consonants in the String with the next alphabet. 
Note: Consonant refers to all alphabets excluding vowels

 */
import java.util.*;
public class replaceconsonant {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		String arr=sc.nextLine();
		String ch11=replaceConso(arr);
		System.out.println(ch11);
	}
	private static String replaceConso(String ch1)
	{
		StringBuffer obj=new StringBuffer();
		char [] ch=ch1.toCharArray();
		
		int len=ch.length;
		for(int i=0;i<len;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' ||ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' ||ch[i]=='U' )
			{
				obj.append(ch[i]);
				
			}
			else
			{
				char c=(char)(ch[i]+1);
				obj.append(c);
				
			}
		}
		return obj.toString();
             
	}

}
