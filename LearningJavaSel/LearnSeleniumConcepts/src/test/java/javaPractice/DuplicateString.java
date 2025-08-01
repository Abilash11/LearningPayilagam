package javaPractice;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String word = "programming";
		
		char [] Dupli = word.toCharArray();           // periya logic toCharArray{'p', 'r', 'o', ....'g'}
		
		
		for (int  i = 0; i<Dupli.length; i++)
			
		{
			
			for(int j =i+1; j<Dupli.length; j++)   // Abi Bhr concept
				
			{
				if( Dupli[i] == Dupli[j])

				{
						
						System.out.print(Dupli[i]);
					
						
			}
						
				
		}
			
			
				
			
					
			
			
			
		
		
		
		}
	}
		
		
		
}

