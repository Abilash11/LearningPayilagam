package javaPractice;

public class StringReverseAndPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String word ="TAMIL";
		
		for (int i =word.length()-1;i>=0; i--)
		{
			System.out.print(word.charAt(i));
			
		}
		System.out.println("----print directly without storing it in a variable-------");
		
		
		//code to store it in  a vaiable
		String word2 =""; 
		for (int i =word.length()-1;i>=0; i--)
		{
             
			word2 = word2+ word.charAt(i);
			
		}
		System.out.print(word2);
		System.out.print("----print it storing it in a variable-------");
		System.out.println();
		
		
		
		//palindrome
		
		if(word2.equals(word))
		{
			System.out.println("The word is a palindrome");
		}
		
		else
		{
			System.out.println("It is not a palindrome");
		}
			
		
		
		

		
		
		
		
		

	}

}
