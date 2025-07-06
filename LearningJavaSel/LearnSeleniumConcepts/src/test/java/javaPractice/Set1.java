package javaPractice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> myset = new HashSet <String>();
		
		myset.add("Hey");
		myset.add("Ram");
		myset.add("Hey");
		myset.add("U can");
		myset.add("do it");
		List<String>SetToList = new ArrayList < String>(myset);
	    Collections.sort(SetToList);
	    System.out.println("Sorting a Set by passing it into a LIST : "+ SetToList);
	    
		
		System.out.println(" Example for HashSet: "+ myset);
		
		
		
		Set<String> mysetTree = new TreeSet <String>();
		mysetTree.add("Hey");
		mysetTree.add("Uam");
		mysetTree.add("Hey");
		mysetTree.add("U can");
		mysetTree.add("do it");
		
		System.out.println(" Example for TreeSet: "+ mysetTree);
		
		
		Set<String> mysetLinkedHasHSet = new LinkedHashSet <String>();
		mysetLinkedHasHSet.add("Hey");
		mysetLinkedHasHSet.add("Ram");
		mysetLinkedHasHSet.add("Hey");
		mysetLinkedHasHSet.add("U can");
		mysetLinkedHasHSet.add("do it");
		
		System.out.println(" Example for LinkedHashSet: "+ mysetLinkedHasHSet);
		
		

				
				
	}

}
