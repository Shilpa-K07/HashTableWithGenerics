public class MapNode<K, V> implements NodeInf<K> {
	K key;
	V value;
	MapNode<K, V> next;
	
	public MapNode(K key, V value){
		this.key = key;
		this.value = value;
		next = null;
	}
	
	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public NodeInf<K> getNext() {
		return next;
	}

	@Override
	public void setNext(NodeInf<K> next) {
		this.next = (MapNode<K, V>) next;
	}

	@Override
	public String toString() {
		StringBuilder mapNodeString = new StringBuilder();
		mapNodeString.append("MapNode(" + "K=").append(key)
		.append(" V=").append(value).append(')');
		if(next != null )
			mapNodeString.append("->").append(next);
		return mapNodeString.toString();
	}

	public V getValue() {
		return this.value;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
}
