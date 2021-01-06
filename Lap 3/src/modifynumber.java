/*
 * @author:VINOTH>R
 * desc:Create a method that accepts a number and modifies it such that the each of the digit in the newly formed number is equal to the difference between two consecutive digits in the original number. The digit in the units place can be left as it is. 
Note: Take the absolute value of the difference. Ex: 6-8 = 2


 */
import java.util.Scanner;
import java.math.*;

public class modifynumber
{
	public static void main(String[] args)
	{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int out=modifyNumber(num);
System.out.println(out);
	}
	
	private static int modifyNumber(int num) 
	{
		StringBuffer obj=new StringBuffer();
	String str=Integer.toString(num);
	int diff,add=0;
	for(int i=0;i<str.length();i++)
	{
		if(str.length()<=2)
		{
			diff=str.charAt(0)-str.charAt(1);
			add=(add*10)+Math.abs(diff);
			break;
		}
		else	if(i==str.length()-1)
		{
			diff=str.charAt(0)-str.charAt(i);
			add=(add*10)+Math.abs(diff);
			break;
			//System.out.print(add);
		}
		else
			
		diff=(str.charAt(i)-(str.charAt(i+1)));
		add=(add*10)+Math.abs(diff);
	}
	return add;
	}
}
