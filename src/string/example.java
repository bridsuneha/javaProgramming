package string;

public class example {

	public static void main(String[] args) {
String str="Automation";
String s=str.toLowerCase();
char sArr[]=s.toCharArray();
for(int i=0;i<sArr.length;i++)
{
for(int j=i+1;j<sArr.length;j++)
{
if (sArr[i]	==sArr[j])
{
System.out.println("Duplicate found"+ ":" +sArr[i]);	
break;
}
}

}
	}

}
