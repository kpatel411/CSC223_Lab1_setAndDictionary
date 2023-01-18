package utilities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;

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
		//Tests when a value exists for a key
		ParallelArrayDictionary<String, String> testHasValue = new ParallelArrayDictionary<String, String>();
		testHasValue.put("This is", "A test");
		testHasValue.put("This is also", "a test too");
		assertEquals(2, testHasValue.size());
		assertEquals("a test too", testHasValue.remove("This is also"));
		
		//Tests when a value does not exist for a key
		ParallelArrayDictionary<String, String> testDoesNotHaveValue = new ParallelArrayDictionary<String, String>();
		testDoesNotHaveValue.put("This is also a test", null);
		testDoesNotHaveValue.put("Yes", "No");
		testDoesNotHaveValue.put("Okay", "ok");
		assertNull(testDoesNotHaveValue.remove("This is also a test"));
		
		//Test when keys and values are empty
		ParallelArrayDictionary<String, String> testEmptyPAD = new ParallelArrayDictionary<String, String>();
		assertNull(testEmptyPAD.remove("Hi"));
		
	}

	@Test
	void testPutAll()
	{
		//Test with empty dictionary
		ArraySet<String> testEmpty1 = new ArraySet<String>();
		ArrayList<String> testEmpty2 = new ArrayList<String>();
		ParallelArrayDictionary<ArraySet<String>, ArrayList<String>> testEmpty = new ParallelArrayDictionary<ArraySet<String>, ArrayList<String>>();
		ParallelArrayDictionary<ArraySet<String>, ArrayList<String>> newTestEmpty = new ParallelArrayDictionary<ArraySet<String>, ArrayList<String>>();
		testEmpty.put(testEmpty1, testEmpty2);
		newTestEmpty.putAll(testEmpty);
		assertEquals(testEmpty.size(), newTestEmpty.size());
		
		//Test with duplicate values
		ArraySet<String> testDuplicates1 = new ArraySet<String>();
		ArrayList<String> testDuplicates2 = new ArrayList<String>();
		ParallelArrayDictionary<ArraySet<String>, ArrayList<String>> testDuplicates = new ParallelArrayDictionary<ArraySet<String>, ArrayList<String>>();
		ParallelArrayDictionary<ArraySet<String>, ArrayList<String>> newTestDuplicates = new ParallelArrayDictionary<ArraySet<String>, ArrayList<String>>();
		testDuplicates1.add("Hi There");
		testDuplicates1.add("How are you");
		testDuplicates1.add("This is a test");
		testDuplicates2.add("A");
		testDuplicates2.add("B");
		testDuplicates2.add("B");
		testDuplicates.put(testDuplicates1, testDuplicates2);
		newTestDuplicates.putAll(testDuplicates);
		assertEquals(testDuplicates.size(), newTestDuplicates.size());
		
		//Test with keys and values existing
		ArraySet<String> testHasValues1 = new ArraySet<String>();
		ArrayList<String> testHasValues2 = new ArrayList<String>();
		ParallelArrayDictionary<ArraySet<String>, ArrayList<String>> testHasValues = new ParallelArrayDictionary<ArraySet<String>, ArrayList<String>>();
		ParallelArrayDictionary<ArraySet<String>, ArrayList<String>> newTestHasValues = new ParallelArrayDictionary<ArraySet<String>, ArrayList<String>>();
		testHasValues1.add("Hi There");
		testHasValues1.add("How are you");
		testHasValues1.add("This is a test");
		testHasValues2.add("A");
		testHasValues2.add("B");
		testHasValues2.add("B");
		testHasValues.put(testHasValues1, testHasValues2);
		newTestHasValues.putAll(testHasValues);
		assertEquals(testHasValues.size(), newTestHasValues.size());
		
		//Test with null values
		ArraySet<String> testNullValues1 = new ArraySet<String>();
		ArrayList<String> testNullValues2 = new ArrayList<String>();
		ParallelArrayDictionary<ArraySet<String>, ArrayList<String>> testNullValues = new ParallelArrayDictionary<ArraySet<String>, ArrayList<String>>();
		ParallelArrayDictionary<ArraySet<String>, ArrayList<String>> newTestNullValues = new ParallelArrayDictionary<ArraySet<String>, ArrayList<String>>();
		testNullValues1.add("Hi There");
		testNullValues1.add("How are you");
		testNullValues1.add("This is a test");
		testNullValues2.add("A");
		testNullValues2.add(null);
		testNullValues2.add("B");
		testNullValues.put(testNullValues1, testNullValues2);
		newTestNullValues.putAll(testNullValues);
		assertEquals(testNullValues.size(), newTestNullValues.size());
		
	}

	@Test
	void testClear()
	{
		//Test with empty dictionary
		ArraySet<String> testEmpty1 = new ArraySet<String>();
		ArrayList<String> testEmpty2 = new ArrayList<String>();
		ParallelArrayDictionary<ArraySet<String>, ArrayList<String>> testEmpty = new ParallelArrayDictionary<ArraySet<String>, ArrayList<String>>();
		testEmpty.put(testEmpty1, testEmpty2);
		testEmpty.clear();
		assertEquals(0, testEmpty.size());
		
		//Test with null values
		ArraySet<String> testNull1 = new ArraySet<String>();
		ArrayList<String> testNull2 = new ArrayList<String>();
		ParallelArrayDictionary<ArraySet<String>, ArrayList<String>> testNull = new ParallelArrayDictionary<ArraySet<String>, ArrayList<String>>();
		testNull1.add("A");
		testNull1.add("B");
		testNull1.add("C");
		testNull2.add(null);
		testNull2.add(null);
		testNull2.add("Hi");
		testNull.put(testNull1, testNull2);
		testNull.clear();
		assertEquals(0, testNull.size());
		
		//Test with existing keys and values
		ArraySet<String> testHasKV1 = new ArraySet<String>();
		ArrayList<String> testHasKV2 = new ArrayList<String>();
		ParallelArrayDictionary<ArraySet<String>, ArrayList<String>> testHasKV = new ParallelArrayDictionary<ArraySet<String>, ArrayList<String>>();
		testHasKV1.add("A");
		testHasKV1.add("B");
		testHasKV1.add("C");
		testHasKV2.add("Hello");
		testHasKV2.add("Hey");
		testHasKV2.add("Hi");
		testHasKV.put(testHasKV1, testHasKV2);
		testHasKV.clear();
		assertEquals(0, testHasKV.size());
		
		//Test with duplicates
		ArraySet<String> testHasDuplicates1 = new ArraySet<String>();
		ArrayList<String> testHasDuplicates2 = new ArrayList<String>();
		ParallelArrayDictionary<ArraySet<String>, ArrayList<String>> testHasDuplicates = new ParallelArrayDictionary<ArraySet<String>, ArrayList<String>>();
		testHasDuplicates1.add("A");
		testHasDuplicates1.add("B");
		testHasDuplicates1.add("C");
		testHasDuplicates2.add("Hello");
		testHasDuplicates2.add("Hey");
		testHasDuplicates2.add("Hi");
		testHasDuplicates.put(testHasKV1, testHasKV2);
		testHasDuplicates.clear();
		assertEquals(0, testHasDuplicates.size());
	}
}
