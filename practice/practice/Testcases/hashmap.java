package Testcases;

import java.util.Map;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class hashmap {

	@Test
	public void testHashmap() {
		Map<String, String> testData = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
		testData.put("foo", "abcd");

		System.out.println(testData.get("foo")); // FOO
		System.out.println(testData.get("FoO")); // FOO
		System.out.println(testData.get("FOO")); // FOO
	}
}
