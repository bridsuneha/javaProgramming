package string;

import java.util.Arrays;

public class AlphabetString {

	public static void main(String[] args) {
		String input="12abc34";
		
		
		char inArr[]=input.toCharArray();
		int m=0;
		int n=inArr.length-1;
		
		/*for(int i=0;i<inArr.length;i++)
		{
			boolean status=Character.isAlphabetic(inArr[i]);
			System.out.println(status);
		}*/

	while(m<n)
	{
		if (!Character.isLetter(inArr[m]))
		{
			m++;
		}
	
		else if (!Character.isLetter(inArr[n]))
		{
			n--;
		}
		else
		{if(new String().contains('a','e','i','o','u')&&new String(inArr[n])
			char temp=0;
			temp=inArr[m];
			inArr[m]=inArr[n];
			inArr[n]=temp;
			m++;
			n--;
		}
	
	
	}
	System.out.println(Arrays.toString(inArr));
	}

}
