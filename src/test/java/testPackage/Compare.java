package testPackage;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Compare {

	@Test
	public void compare() {
	ArrayList<String> firstList=new ArrayList<String>();  
	//adds elements to the  
	firstList.add("Apple");  
	firstList.add("Pears");  
	firstList.add("Guava");  
	firstList.add("Mango");  
	   
	List<String> secondList=new ArrayList<String>();  
	//adds elements to the  
	secondList.add("Apple");  
	secondList.add("Guava");  
	secondList.add("Pears");  
	secondList.add("Mango");  
	
	AssertJUnit.assertTrue(firstList.size() == secondList.size() && firstList.containsAll(secondList) && secondList.containsAll(firstList));
	}
	
}
