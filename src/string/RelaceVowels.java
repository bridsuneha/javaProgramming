package string;

import java.util.Arrays;

public class RelaceVowels {

	public static void main(String[] args) {
		String s="Name";
		char c[]=s.toCharArray();
		StringBuilder sb=new StringBuilder();
	
		for (char m:c)
		{
			if("aeiouAEIOU".indexOf(m)==-1)
			{
				sb.append(m);
			}
			else
			{
				sb.append('x');
			}
		
		}
		System.out.println(Arrays.toString(c));
	}

}
