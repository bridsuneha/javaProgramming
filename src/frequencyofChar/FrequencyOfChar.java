package frequencyofChar;

public class FrequencyOfChar {

	public static void main(String[] args) {
	String s="Suneha Singh";
	//char ch='h';
	
	for(int i=0;i<s.length();i++) {
	char chi=s.charAt(i);
	int c=0;
	for(int j=0;j<s.length();j++) {
		char chj=s.charAt(j);
		if (chi==chj) 
		{
			c=c+1;
		}
				
	}
	
	System.out.println(chi+":"+c);	
	
		
	}
	
	}

}
