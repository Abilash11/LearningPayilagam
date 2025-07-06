package javaPractice;

public class ArraySort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 8, 1, 3 };

		
		System.out.println("Before Sorting");
		for(int i =0 ; i <=a.length-1; i++)
		{
			System.out.print(a[i]+ ",");
			
		}

		sort3(a);
//		System.out.println(a[0]);
		System.out.println();
		System.out.println("After Sorting");
		for(int i =0 ; i <=a.length-1; i++)
		{
			System.out.print(a[i]+ ",");
		}

	}

	public static void sort3(int x[]) {
		int temp;

		for (int i = 0; i < x.length - 1; i++) {
			if (x[i] < x[i + 1]) {

			} else {
				temp = x[i];

				x[i] = x[i + 1];
				x[i + 1] = temp;
			}

		}

	}

}
