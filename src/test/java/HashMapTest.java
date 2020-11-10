import org.junit.Assert;
import org.junit.Test;

public class HashMapTest {
	@Test
	public void givenSentenceWhenWordsAreAddedToListShouldReturnWordFrequency() {
		String sentence = "To be or not to be";
		HashMapImplementation<String, Integer> hashMap = new HashMapImplementation<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer value = hashMap.get(word);
			if(value == null)
				value = 1;
			else
				value = value + 1;
			hashMap.add(word, value);
		}
		int frequency = hashMap.get("to");
		System.out.println(hashMap);
		Assert.assertEquals(2, frequency);
	}
	
	@Test
	public void givenSentenceWhenWordsAreAddedToListShouldPassTest() {
		String sentence = "To be or not to be";
		HashMapImplementation<String, Integer> hashMap = new HashMapImplementation<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer value = hashMap.get(word);
			if(value == null)
				value = 1;
			else
				value = value + 1;
			hashMap.add(word, value);
		}
		int frequency = hashMap.get("to");
		System.out.println(hashMap);
		Assert.assertNotEquals(3, frequency);
	}
	
	@Test
	public void givenSentenceWhenWordsAreAddedToListShouldReturnParanoidFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid but "
				+ "because they keep putting themselves deliberately into paranoid "
				+ "avoidable situations";
		LinkedHashMapImplementation<String, Integer> hashMap = new LinkedHashMapImplementation<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer value = hashMap.get(word);
			if(value == null)
				value = 1;
			else
				value = value + 1;
			hashMap.add(word, value);
		}
		System.out.println(hashMap);
		int frequency = hashMap.get("paranoid");
		Assert.assertEquals(3, frequency);
	}
	
	@Test
	public void givenSentenceWhenWordsAreAddedToListShouldPassFalseTest() {
		String sentence = "Paranoids are not paranoid because they are paranoid but "
				+ "because they keep putting themselves deliberately into paranoid "
				+ "avoidable situations";
		LinkedHashMapImplementation<String, Integer> hashMap = new LinkedHashMapImplementation<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer value = hashMap.get(word);
			if(value == null)
				value = 1;
			else
				value = value + 1;
			hashMap.add(word, value);
		}
		System.out.println(hashMap);
		int frequency = hashMap.get("paranoid");
		Assert.assertNotEquals(4, frequency);
	}
	
	//UC-3
	@Test
	public void givenSentencWordsAreAddedToListWhenRemoveAvoidableWordShouldReturnSame() {
		String sentence = "Paranoids are not paranoid because they are paranoid but "
				+ "because they keep putting themselves deliberately into paranoid "
				+ "avoidable situations";
		LinkedHashMapImplementation<String, Integer> hashMap = new LinkedHashMapImplementation<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer value = hashMap.get(word);
			if(value == null)
				value = 1;
			else
				value = value + 1;
			hashMap.add(word, value);
		}
		String value = hashMap.remove("avoidable");
		System.out.println(hashMap);
		Assert.assertEquals("success", value);
	}
	
	@Test
	public void givenSentencWordsAreAddedToListWhenRemoveAvoidableWordShouldNotReturnSame() {
		String sentence = "Paranoids are not paranoid because they are paranoid but "
				+ "because they keep putting themselves deliberately into paranoid "
				+ "avoidable situations";
		LinkedHashMapImplementation<String, Integer> hashMap = new LinkedHashMapImplementation<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer value = hashMap.get(word);
			if(value == null)
				value = 1;
			else
				value = value + 1;
			hashMap.add(word, value);
		}
		String value = hashMap.remove("avoidable");
		System.out.println(hashMap);
		Assert.assertNotEquals("not success", value);
	}
