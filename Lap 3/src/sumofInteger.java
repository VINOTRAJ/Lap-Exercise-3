/*
 * @author:VINOTH>R
 * desc: Write a Java program that reads a line of integers and then displays each integer and the sum of all integers. (Use String Tokenizer class)?
 */

import java.util.Scanner;

public class sumofInteger {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		int add=0;
		for(int i=0;i<num;i++)
		{
			System.out.println(arr[i]);
			add=add+arr[i];
		}
		System.out.println(add);
		
	}

}
