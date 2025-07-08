package javaPractice;

import java.util.HashMap;

public class HashMap_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getcredmap();
		HashMap_Practice obj = new HashMap_Practice();
		HashMap<String, String> map=obj.getcredmap();
		
		//Get Values
		
		System.out.println("customer1: "+ map.get("customer1"));
		System.out.println("customer: "+ map.get("customer2"));
			
		//Get both Keys and Values using EntrySet
		  for(HashMap.Entry<String, String> entry : map.entrySet())
		  {
			  String Key = entry.getKey();
			  String Value = entry.getValue();
					  
			  System.out.println("Using EntrySet ");
			  System.out.println("Key :" + Key);
			  System.out.println("Value : " + Value);
		  }
		
		//Get Values using Values
		  
		  for(String Value : map.values())
		  {
			  System.out.println("Print value of the element using Value " + Value );
		  }
		  		
		// Get values using keyset
		
		  for (String Key : map.keySet())
		  {
			  
			  System.out.println("Using Key Set concept");
			  System.out.println("Key: " + Key);

			  System.out.println("Value: " + map.get(Key));
			  
			  
		  }
		  
		  
	}

	
     public HashMap<String, String> getcredmap()
	
	{
		HashMap<String,String> usermap = new HashMap<String,String>();
		usermap.put("customer1", "Ramu");
		usermap.put("customer2", "Somu:Test@123");
		
		return usermap;
	}
}
