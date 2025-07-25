package string;

import java.util.HashMap;

public class Frequency {

	public static void main(String[] args) {
		String s="madam";
		HashMap<Character,Integer> Frequency=new HashMap<Character,Integer>();
		char inArr[]=s.toCharArray();
		for(char a:inArr)
		{
			Frequency.put(a,Frequency.getOrDefault(a, 0)+1);
			
		}
for(char c:Frequency.keySet())
{
System.out.println(c+" "+Frequency.get(c));	
}
	}

}
