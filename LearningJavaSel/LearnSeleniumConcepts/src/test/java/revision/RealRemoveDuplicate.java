package revision;

public class RealRemoveDuplicate {
	
	public static void main(String[] args) {
		
		String InputWord = "programming";
		
		StringBuilder result = new StringBuilder();
		
		for(char c : InputWord.toCharArray()) //['p], [r], [o]   // chararray maathurom
		{
			if(result.indexOf(c+ "")==-1)
			{
				result.append(c);
			}
		}
		
		System.out.println(result);
		
		
	}

}
