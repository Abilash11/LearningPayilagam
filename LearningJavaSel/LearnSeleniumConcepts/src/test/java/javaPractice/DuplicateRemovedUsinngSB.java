package javaPractice;

import java.util.Scanner;

public class DuplicateRemovedUsinngSB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String word = "programming";
		
		Scanner sc = new Scanner(System.in);
		String Word =   sc.next();
		
		StringBuilder sb = new  StringBuilder(Word);

		for( int i =0; i<=sb.length()-1; i++)

		{
			
			
			for (int j = i+1; j<=sb.length()-1; j++)
			{
				char c1 = sb.charAt(i);
				char c2 = sb.charAt(j);
				
				if(c1==c2)
				{
					sb.deleteCharAt(i);
				}
				
				
			}
						
		}
		
			System.out.println(sb);
	}

}
