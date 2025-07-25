package Array;

import java.util.Scanner;

public class ElementArray {

	public static void main(String[] args) {
		int a[]= {10,20,10,40,10};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int b=sc.nextInt();
		int count=0;
		for (int i=0;i<=4;i++)
		{
			if (b==a[i]) {
				count=count+1;}
			
			
			}
		System.out.println("the count is:"+count);

	}

}
