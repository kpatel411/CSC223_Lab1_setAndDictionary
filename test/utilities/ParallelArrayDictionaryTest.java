package utilities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;

class ParallelArrayDictionaryTest
{
	@Test
	void testParallelArrayDictionary()
	{
	}

	@Test
	void testGet()
	{
		//Tests when key is mapped to value
		ParallelArrayDictionary<String, String> testIsMapped = new ParallelArrayDictionary<String, String>();
		testIsMapped.put("1", "3");
		testIsMapped.put("4", "7");
		testIsMapped.put("4", "0");
		testIsMapped.put("10", "10");
		assertEquals("0", testIsMapped.get("4"));
		
		//Tests when key is not mapped to a value
		ParallelArrayDictionary<String, String> testNotMapped = new ParallelArrayDictionary<String, String>();
		testNotMapped.put("Hi", null);
		testNotMapped.put("Hello", "Yes");
		assertNull(testNotMapped.get("Hi"));
		
		//Tests when keys and values are empty
		ParallelArrayDictionary<String, String> testEmpty = new ParallelArrayDictionary<String, String>();
		assertEquals(0, testEmpty.size());
		assertNull(testEmpty.get("No"));
	}

	@Test
	void testPut()
	{
		//Tests when a value exists for a key
		ParallelArrayDictionary<String, String> testHasValue = new ParallelArrayDictionary<String, String>();
		testHasValue.put("This is", "A test");
		testHasValue.put("This is also", "a test too");
		assertEquals("A test", testHasValue.put("This is", "A test"));
		
		//Tests when a value does not exist for a key
		ParallelArrayDictionary<String, String> testDoesNotHaveValue = new ParallelArrayDictionary<String, String>();
		testDoesNotHaveValue.put("This is also a test", null);
		testDoesNotHaveValue.put("Yes", "No");
		testDoesNotHaveValue.put("Okay", "ok");
		assertNull(testDoesNotHaveValue.put("This is also a test", "Yep"));
		
		//Tests when keys and values are empty
		ParallelArrayDictionary<String, String> testEmptyPAD = new ParallelArrayDictionary<String, String>();
		assertNull(testEmptyPAD.put("Hello there", "How are you"));
	}

	@Test
	void testRemove()
	{
		//Tests
	}

	@Test
	void testPutAll()
	{
	}

	@Test
	void testClear()
	{
	}
}
