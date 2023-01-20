/**
* In this class, we test ArraySet based on methods from the ArraySet file and implemented methods.
*
* @author <Khushi Patel>
* @date <01/18/2023>
*/
package utilities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.jupiter.api.Test;

class ArraySetTest
{
	@Test
	//constructor testing 
	void testArraySetCollectionOfE()
	{
		//create new arrayset object and try testing for size
		ArraySet <Integer> test1 = new ArraySet<Integer>();
		//add strings to new test object
		test1.add(1);
		test1.add(2);
		test1.add(3);
		test1.add(4);
		test1.add(5);
		assertEquals(5, test1.size());
		
		//try testing boolean isEmpty
		ArraySet <Integer> test2 = new ArraySet<Integer>();
		assertTrue(test2.isEmpty());
		
	}

	@Test
	//test the add integer method 
	void testAddE()
	{
		//adds objects to list
		ArraySet <Integer> test1 = new ArraySet<Integer>();
		ArraySet <Integer> test2 = new ArraySet<Integer>();
		test1.add(80);
		test1.add(75);
		test1.add(70);
		test2.add(80);
		test2.add(75);
		test2.add(70);
		assertEquals(test1.size(), test2.size());
		
		//testing with duplicates
		ArraySet <Integer> testDupe = new ArraySet<Integer>();
		ArraySet <Integer> testDupe2 = new ArraySet<Integer>();
		testDupe.add(80);
		testDupe.add(75);
		testDupe.add(70);
		testDupe2.add(80);
		testDupe2.add(75);
		testDupe2.add(70);
		testDupe.addAll(testDupe2);
		assertEquals(testDupe.size(), testDupe.size());
		
		//testing with empty
		ArraySet <Integer> testEmpty = new ArraySet<Integer>();
		assertEquals(0, testEmpty.size());
		
		//testing with a null value
		ArraySet <Integer> testNull = new ArraySet<Integer>();
		testNull.add(null);
		assertEquals(1, testNull.size());
		
	}

	@Test
	//test the add all method 
	void testAddAllCollectionOfQextendsE()
	{
		//test to add objects to list
		ArraySet <String> test1 = new ArraySet<String>();
		//add values to arraylist
		test1.add("hello");
		//add another set of numbers
		ArraySet <String> test2 = new ArraySet<String>();
		test2.add("hi"); 
		//use add all to combine 
		test1.addAll(test2);
		assertEquals(2, test1.size());
		
		//Testing with duplicates 
		ArraySet <String> testDupe = new ArraySet<String>();
		ArraySet <String> testDupe2 = new ArraySet<String>();
		testDupe.add("hello");
		testDupe.add("hi");
		testDupe2.add("hello");
		testDupe2.add("hi");
		assertEquals(testDupe.size(), testDupe2.size());
		
		//test with empty
		ArraySet <String> testEmpty = new ArraySet<String>();
		assertEquals(0,testEmpty.size());
		
		//test with null values
		ArraySet <String> testA = new ArraySet<String>();
		//add values to arraylist
		testA.add(null);
		//add another set of numbers
		ArraySet <String> testB = new ArraySet<String>();
		testB.add(null); 
		//use add all to combine 
		testA.addAll(testB);
		assertEquals(2, testA.size());
		
		
	}
	
	@Test
	//test the add all integer method 
	void testAddAllIntCollectionOfQextendsE()
	{
		//testing for when item exists in a list 
		//create new integer items to add 
		ArraySet <Integer> test1 = new ArraySet<Integer>();
		test1.add(35);
		ArraySet <Integer> test2 = new ArraySet<Integer>();
		test2.add(80);
		//addAll to combine
		test1.addAll(test2);
		assertEquals(2, test1.size());
		
		//test with duplicates
		ArraySet <Integer> testDupe = new ArraySet<Integer>();
		ArraySet <Integer> testDupe2 = new ArraySet<Integer>();
		testDupe.add(35);
		testDupe.add(80);
		testDupe2.add(35);
		testDupe2.add(80);
		assertEquals(testDupe.size(), testDupe2.size());
		
		//test with null values
		ArraySet <Integer> testA = new ArraySet<Integer>();
		//add values to arraylist
		testA.add(null);
		//add another set of numbers
		ArraySet <Integer> testB = new ArraySet<Integer>();
		testB.add(null); 
		//use add all to combine 
		testA.addAll(testB);
		assertEquals(2,testA.size());
		
		//test with empty
		ArraySet <Integer> testEmpty = new ArraySet<Integer>();
		assertEquals(0,testEmpty.size());
	}

	@Test
	//test the remain all method 
	void testRetainAll()
	{
		//test retainAll (collection c) if values exist
		ArraySet <String> test1 = new ArraySet<String>();
		//create test strings
		test1.add("abc");
		test1.add("def");
		test1.add("ghi");
		ArraySet <String> test2 = new ArraySet<String>();
		//create test strings
		test2.add("ABC");
		test2.add("def");
		test2.add("ghi");
		//retain all matching values 
		test2.retainAll(test1);
		assertEquals(2, test2.size());
		
		//test retainAll (collection c) if values do not exist/null
		ArraySet <String> test3 = new ArraySet<String>();
		//create test strings
		test3.add("abc");
		test3.add("def");
		test3.add("ghi");		
		ArraySet <String> test4 = new ArraySet<String>();
		//create test strings
		test4.add("ABC");
		test4.add("DEF");
		test4.add("GHI");
		//retain all matching values 
		test4.retainAll(test3);
		assertEquals(0, test4.size());
		
		//test retainAll (collection c) if values are empty
		ArraySet <String> testEmpty = new ArraySet<String>();
		assertEquals(0, testEmpty.size());

		
	}

	@Test
	//test the remove all method 
	void testRemoveAll()
	{
		//test removeAll (collection c)
		ArraySet <String> test1 = new ArraySet<String>();
		//create test strings
		test1.add("abc");
		test1.add("def");
		test1.add("ghi");
		ArraySet <String> test2 = new ArraySet<String>();
		//create test strings
		test2.add("ABC");
		test2.add("def");
		test2.add("ghi");
		//remove any mismatched information
		test2.removeAll(test1);
		assertEquals(1, test2.size());
		
		//test retainAll (collection c) if values do not exist
		ArraySet <String> test3 = new ArraySet<String>();
		//create test strings
		test3.add("abc");
		test3.add("def");
		test3.add("ghi");		
		ArraySet <String> test4 = new ArraySet<String>();
		//create test strings
		test4.add("ABC");
		test4.add("DEF");
		test4.add("GHI");
		//retain all matching values 
		test4.removeAll(test3);
		assertEquals(3, test4.size());
		
		//test retainAll (collection c) if values are empty
		ArraySet <String> testNull = new ArraySet<String>();
		assertEquals(0, testNull.size());
	}

}
