package string;

import java.util.Arrays;

public class VowelReverse {

	public static void main(String[] args) {
		String s="Hello";
		char a[]=s.toCharArray();
		int m=0;
		int n=a.length-1;
		while(m<n)
		{
			if("aeiouAEIOU".indexOf(a[m])==-1)
			{
				m++;
			}
			else if("aeiouAEIOU".indexOf(a[n])==-1)
			{
				n--;
			}
			else
			{
				char temp=0;
				temp=a[m];
				a[m]=a[n];
				a[n]=temp;
				m++;
				n--;
			}
		}

		System.out.println(Arrays.toString(a));}

}
