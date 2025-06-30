package javaPractice;

public class Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                                
//		int[] x = { 1, 5, 11, 28, 39, 40, 98 };
		int[] x = {1,5,11,28,39,40};
	System.out.println(Median(x));	

	}

	public static int Median(int a[]) {
		
		if(a.length%2 != 0)// odd number of elements present and median is the middle one
		{
			int result = a[(a.length/2)];
			return result;
		}
		else
		{
//			int num1 = a[(a.length/2)];
//			int num2 = a[(a.length/2)-1];
//			if(num1<num2)
//			return num1;
//			else
//				return num2;
			
			int num1 = a[(a.length/2)-1];	
			return num1;
//			
		}
			
			
			
		
				

	}
}
