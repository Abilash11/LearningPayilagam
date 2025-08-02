package revision;

public class ReverseASentence {
	
	public static void main(String[] args) {
		
		
		String sentence =  "Welcome to Peace";
		
		String [] Words  = sentence.split(" ");
		
		
		for (String Word: Words)
			
		{
			for(  int i = Word.length()-1; i>=0; i--)
			{
				System.out.print(Word.charAt(i));
				
			}
			
			System.out.print(" ");
			
		}
		
				 
		
	}

}
