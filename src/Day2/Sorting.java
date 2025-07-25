package Day2;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int a[]= {50,10,40,30,5};
		
		for(int i=0;i<a.length-1;i++)//pass
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("The elements after sorting is "+Arrays.toString(a));
	
	}

}
