package revision;

public class DuplicateRemoval {

	
	public static void main (String[]args) {
		
	
	
	String word1 = "programming";
	char [] DuplicateEle = word1.toCharArray();

	
	
	
	for ( int i =0 ; i<DuplicateEle.length; i++)
		
	{
		for (int j =i+1; j<DuplicateEle.length ; j++)
		{
			
			if (DuplicateEle[i] == DuplicateEle[j])
					{
				       System.out.print(DuplicateEle[i]);
					}
			
			

		}
		
		
	}
		
	}		
	
}
