import java.util.ArrayList;

public class LinkedHashMapImplementation<K, V> {
	final int numberOfBuckets;
	ArrayList<LinkedListImplementation<K>> bucketArray;
	
	public LinkedHashMapImplementation() {
		this.numberOfBuckets = 10;
		this.bucketArray = new ArrayList<>(numberOfBuckets);
		
		for(int i = 0; i < numberOfBuckets; i++) {
			this.bucketArray.add(null);
		}
	}

	private int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % numberOfBuckets;
		System.out.println("Key: "+key+" hashCode: "+hashCode+" index: "+index);
		return index;
	}
	
	public V get(K key) {
		int index = this.getBucketIndex(key);
		LinkedListImplementation<K> linkedList = this.bucketArray.get(index);
		if(linkedList == null)
			return null;
		MapNode<K, V> mapNode = (MapNode<K, V>) linkedList.search(key);
		return (mapNode == null) ? null : mapNode.getValue();
	}

	public void add(K key, V value) {
		int index = this.getBucketIndex(key);
		LinkedListImplementation<K> linkedList = this.bucketArray.get(index);
		if(linkedList == null) {
			linkedList = new LinkedListImplementation<>();
			this.bucketArray.set(index, linkedList);
		}
		MapNode<K, V> mapNode = (MapNode<K, V>) linkedList.search(key);
		if(mapNode == null) {
			mapNode = new MapNode<>(key, value);
			linkedList.append(mapNode);
		} else {
			mapNode.setValue(value);
		}
	}

	public String remove(K key) {
		int index = this.getBucketIndex(key);
		LinkedListImplementation<K> linkedList = this.bucketArray.get(index);
		if(linkedList == null)
			return null;
		MapNode<K, V> mapNode = (MapNode<K, V>) linkedList.search(key);
		V value = (mapNode == null) ? null : mapNode.getValue();
		
		if(value == null)
			return null;
		linkedList.delete(mapNode);
		return "success";
	}
	
	@Override
	public String toString() {
		return "HashMapNodes(" + bucketArray + ')';
	}
}
