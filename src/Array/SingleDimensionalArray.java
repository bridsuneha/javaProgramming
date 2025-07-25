package Array;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		/*int a[]=new int[5];
		a[0]=23;
		a[1]=24;
		a[2]=25;
		a[3]=27;*/
		int a[]= {1,2,3,4,5,6,8};
		
		System.out.println(a.length);
		 /*for (int i=a.length-1;i>=0;i--)
		 {
			 System.out.println(a[i]);
		 }*/
		int se=0;
		int so=0;
		 for (int x:a)
		 {
			if (x%2==0 )
			{
				se=se+1;
			}
			else
				so=so+1;
			 }
			 System.out.println(se);
			 System.out.println(so);
			 
		 
		
		
		
		
		

	}

}
