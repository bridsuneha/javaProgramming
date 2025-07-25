package Array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
	
		int a[][]= {{100,200},{300,400},{500,600}};
		System.out.println(a[0].length);
		int s=0;
		for(int i=0;i<=a.length-1;i++) 
		{
			for(int j=0;j<=a[i].length-1;j++)
				{
				s=s+a[i][j];
				}	}
			System.out.println(s);
			
	}

}
