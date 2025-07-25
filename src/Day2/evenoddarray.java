package Day2;

public class evenoddarray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int count=0;
		//int c_odd=0;
		
			System.out.println("Even numbers are ");
			for(int i=0;i<a.length;i++)
			{if(a[i]%2==0)
			{
				System.out.println(a[i]);
			count++;
			System.out.println(count);
			}}
			
			System.out.println("odd numbers are ");
			for(int i=0;i<a.length;i++)
			{if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}}
		
			
			
			
		}
		

	}


