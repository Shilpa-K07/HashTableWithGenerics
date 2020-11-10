public class LinkedListImplementation<K> {
	public NodeInf head;
	public NodeInf tail;

	public LinkedListImplementation() {
		this.head = null;
		this.tail = null;
	}

	public void add(NodeInf newNode) {
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}else {
			NodeInf tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	
	public void append(NodeInf newNode) {
		if(this.head == null) {
			this.head = newNode;
		}
		if(this.tail == null) {
			this.tail = newNode;
		}else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	
	public void insert(NodeInf currentNode, NodeInf newNode) {
		NodeInf tempNode = currentNode.getNext();
		currentNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	
	public NodeInf pop() {
		NodeInf tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
	
	public NodeInf popLast() {
		NodeInf tempNode = head;
		while(!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		NodeInf resultNode = tempNode.getNext();
		tempNode.setNext(null);
		return resultNode;
	}

	public NodeInf search(K key) {
		NodeInf tempNode = head;
		while(tempNode != null) {
			if(tempNode.getKey().equals(key))
				return tempNode;
			tempNode = tempNode.getNext();
		}
		return null;
	}
	
	public void delete(NodeInf node) {
		if(node.getNext() != null) {
		node.setKey(node.getNext().getKey());    
        node.setNext(node.getNext().getNext());
		} else {
			node.setKey(null);
			node.setNext(null);
		}
	}
	
	public int size() {
		int sizeCount = 0;
		NodeInf currentNode = head;
		while(currentNode != null) {
			currentNode = currentNode.getNext();
			sizeCount++;
		}
		return sizeCount;
	}
	
	public void printNodes() {
		StringBuffer nodes = new StringBuffer("Nodes are: ");
		NodeInf tempNode = head;
		while(tempNode.getNext()!= null) {
			nodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) {
				nodes.append("->");
			}
			tempNode = tempNode.getNext();
		}
		nodes.append(tempNode.getKey());
		System.out.println(nodes);
	}
	
	@Override
	public String toString() {
		return "LinkedListNodes(" + head + ')';
	}
}
