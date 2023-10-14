// Java program to sort the elements in descending order
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class buffer
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		//bubble Sort
		int n=sc.nextInt();
		int arr[]=new int[n];
		int temp;
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		for(int j=0;j<n-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
			temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			} 
		}
		}
		for(int j=0;j<n;j++)
		System.out.print(arr[j]+" "); 
	}
}

