package javaPractice;


public class ArraysMean_FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//int [] x= new int[3];
		
		int [] x = {10,20,30};
		//double result =Mean(10,20,30);
		System.out.println(Mean(x));
		
	}
	
	public static double Mean(int y[])
	{
		double mean;
		
//		mean = (y[0]+ y[2])/2.0; 
		mean = (y[0]+ y[y.length-1])/2.0; 
		return mean;
		
	}

}
