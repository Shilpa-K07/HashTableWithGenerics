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
}
