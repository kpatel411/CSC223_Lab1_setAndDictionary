package utilities;

import static org.junit.Assert.assertEquals;

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
		ParallelArrayDictionary<String, String> testNull = new ParallelArrayDictionary<String, String>();
		testNull.put("Hello", null);
		testNull.put("Hi", "There");
		
		
		//Tests with strings
		
		//Tests when keys and values are empty
	}

	@Test
	void testPut()
	{
		ParallelArrayDictionary<String, String> test1 = new ParallelArrayDictionary<String, String>();
		test1.put("Hi", "Hello");
		assertEquals(1, test1.size());
	}

	@Test
	void testRemove()
	{
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
