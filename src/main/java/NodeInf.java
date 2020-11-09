public interface NodeInf<K> {
	K getKey();
	void setKey(K key);
	
	NodeInf getNext();
	void setNext(NodeInf<K> next);
}
