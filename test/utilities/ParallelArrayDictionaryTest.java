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
