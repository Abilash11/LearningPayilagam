package javaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> myList = new ArrayList<String>();

		myList.add("apple");
		myList.add("Orange");
		myList.add("Grape");
		myList.add("Strawberry");
		myList.add("Grape");

		System.out.println(myList.get(2));
		System.out.println("Before Sort : " + myList);

		Collections.sort(myList);
		System.out.println("After Sort : " + myList);
		
		myList.remove("Grape");
		System.out.println("After Remove : " + myList);
				
		List<Integer> myIntegerList = new ArrayList<Integer>();
		myIntegerList.add(0);
		myIntegerList.add(30);
		myIntegerList.add(14);
		System.out.println("My Integer List" + myIntegerList);
		
		

	}

}
