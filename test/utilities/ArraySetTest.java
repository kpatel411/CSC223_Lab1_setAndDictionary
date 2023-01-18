package utilities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;

import org.junit.jupiter.api.Test;

class ArraySetTest
{
	@Test
	void testArraySetCollectionOfE()
	{
		//
	}

	@Test
	void testAddE()
	{
		ArraySet <Integer> test1 = new ArraySet<Integer>();
		test1.add(80);
		//assertTrue(test1.add());
		assertEquals(3, test1.size());
		
	}

	@Test
	void testAddAllCollectionOfQextendsE()
	{
		ArraySet <String> test1 = new ArraySet<String>();
		//add values to arraylist
		test1.add("hello");
		//add another set of numbers
		ArraySet <String> test2 = new ArraySet<String>();
		test2.add("hi"); 
		//use add all to combine 
		test1.addAll(test2);
		assertEquals(2,test1.addAll(test2));
		
		
	}

	@Test
	void testRetainAll()
	{
		//test retainAll (collection c)
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
	}

	@Test
	void testAddAllIntCollectionOfQextendsE()
	{
		//create new integer items to add 
		ArraySet <Integer> test1 = new ArraySet<Integer>();
		test1.add(35);
		ArraySet <Integer> test2 = new ArraySet<Integer>();
		test2.add(80);
		//addAll to combine
		test1.addAll(2, test2);
		assertEquals(2, test1.addAll(test2));
	}
}
