/*
 * @author:VINOTH>R
 * desc:Create a class containing a method to create the mirror image of a String. The method should return the two Strings separated with a pipe(|) symbol 
 */
import java.util.Scanner;

public class mirrorImage {
	public static void main(String[] args)
	{
	
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String store=getImage(str);
		System.out.println(str+"|"+store);
	}
	private static String getImage(String str)
	{
		StringBuffer obj=new StringBuffer(str);
		obj.reverse();
		return obj.toString();
	}
	}

