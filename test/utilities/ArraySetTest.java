package utilities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.jupiter.api.Test;

class ArraySetTest
{
	@Test
	void testArraySetCollectionOfE()
	{
		//create new arrayset object and try testing for size
		ArraySet <Integer> test1 = new ArraySet<Integer>();
		//add strings to new test object
		test1.add(1);
		test1.add(2);
		assertEquals(2, test1.size());
		
		//try testing boolean isEmpty
		assertTrue(test1.isEmpty());
		
	}

	@Test
	void testAddE()
	{
		//adds objects to list
		ArraySet <Integer> test1 = new ArraySet<Integer>();
		test1.add(80);
		test1.add(75);
		test1.add(70);
		assertEquals(3, test1.size());
		
		//testing with empty
		ArraySet <Integer> test2 = new ArraySet<Integer>();
		assertEquals(0, test2.size());
		
		//testing with a null value
		ArraySet <Integer> test3 = new ArraySet<Integer>();
		test3.add(null);
		assertEquals(3, test3.size());
		
	}

	@Test
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
		assertEquals(2,test1.addAll(test2));
		
		//test with null values
		ArraySet <String> testA = new ArraySet<String>();
		//add values to arraylist
		testA.add(null);
		//add another set of numbers
		ArraySet <String> testB = new ArraySet<String>();
		testB.add(null); 
		//use add all to combine 
		testA.addAll(testB);
		assertEquals(2,testA.addAll(testB));
		
		//test with empty
		ArraySet <String> testEmpty = new ArraySet<String>();
		assertEquals(0,testEmpty.addAll(testEmpty));
		
	}

	@Test
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
		assertEquals(2, test2.retainAll(test1));
		
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
		test4.retainAll(test3);
		assertEquals(2, test4.retainAll(test3));
		
		//test retainAll (collection c) if values are empty
		ArraySet <String> testNull = new ArraySet<String>();
		assertNull(testNull.retainAll(testNull));

		
	}

	@Test
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
		assertEquals(2, test2.removeAll(test1));
		
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
		assertEquals(2, test4.removeAll(test3));
		
		//test retainAll (collection c) if values are empty
		ArraySet <String> testNull = new ArraySet<String>();
		assertNull(testNull.removeAll(testNull));
	}

	@Test
	void testAddAllIntCollectionOfQextendsE()
	{
		//testing for when item exists in a list 
		//create new integer items to add 
		ArraySet <Integer> test1 = new ArraySet<Integer>();
		test1.add(35);
		ArraySet <Integer> test2 = new ArraySet<Integer>();
		test2.add(80);
		//addAll to combine
		//test1.addAll(2, test2);
		assertEquals(2, test1.addAll(test2));
		
		//test with null values
		ArraySet <Integer> testA = new ArraySet<Integer>();
		//add values to arraylist
		testA.add(null);
		//add another set of numbers
		ArraySet <Integer> testB = new ArraySet<Integer>();
		testB.add(null); 
		//use add all to combine 
		testA.addAll(testB);
		assertEquals(2,testA.addAll(testB));
				
		//test with empty
		ArraySet <Integer> testEmpty = new ArraySet<Integer>();
		assertEquals(0,testEmpty.addAll(testEmpty));
	}
}
