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
		assertTrue(1, test1.size());
		
	}

	@Test
	void testAddAllCollectionOfQextendsE()
	{
		ArraySet <Collection<Integer>> test1 = new ArraySet<Collection<Integer>>();
		//add values to arraylist
		test1.add(1);
		//add another set of numbers
		ArraySet <Collection<Integer>> test2 = new ArraySet<Collection<Integer>>();
		test2.add(null); //?????
		//use add all to combine 
		test1.addAll(test2);
		
		
		
	}

	@Test
	void testRetainAll()
	{
		//test retainAll (collection c)
	}

	@Test
	void testRemoveAll()
	{
		//test removeAll (collection c)
	}

	@Test
	void testAddAllIntCollectionOfQextendsE()
	{
	}
}
