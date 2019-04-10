
public class LinkedList {

	private Node headNode = null;

//	Node saves value and reference to the next node
	static class Node {
		private String value;
		private int key;
		private Node next;
		private Node before;
		private static int counter = 0;

		Node(int key, String value) {
			this.key = key;
			this.value = value;
			next = null;
			counter++;
		}

		String getValue() {
			return this.value;
		}

		int getKey() {
			return this.key;
		}

	}

	public void addNode(int key, String value) {

		Node usingNode = new Node(key, value);

//		if headNode is null.. take our created node and set it as headNode
		if (this.headNode == null) {
			this.headNode = usingNode;
		} else {
			Node last = this.headNode;
//			else we go to the last but one and set the last.next to our new node
			while (last.before != null) {
				last.next = last;
				last = last.before;
			}
			// usingNode is now headnode
			last.before = usingNode;
			usingNode.next = last;
			this.headNode = usingNode;
		}

	}

	public void printList() {

		Node usingNode = this.headNode;

		while (usingNode != null) {
			System.out.println(usingNode.getKey() + " " + usingNode.getValue());
			usingNode = usingNode.next;
		}

	}

//	boolean remove beacause we use this mehtod to return AND 
	public Node removeNode(int key, boolean remove) {
		Node removed = null;
		Node last = this.headNode;

		while (last != null) {
			if (last.getKey() == key) {

				removed = last;
				if (remove == true) {
					if (Node.counter == 1) { // or Node.counter == 1
//						last.before.next = null;
						this.headNode = null;
						Node.counter--;
					} else if (last.before == null) {
						this.headNode = last.next;
						this.headNode.before = null;
						last = null;
						Node.counter--;
					} else if (last.next == null && last.before != null) {
						last.before.next = null;
						last = null;
						Node.counter--;
					} else {
						last.next.before = last.before;
						last.before.next = last.next;
						last = null;
						Node.counter--;
					}
				}
				break;
			}
			last = last.next;

		}

		return removed;
	}

	public boolean isEmpty() {
		return (Node.counter == 0) ? true : false;
	}

}
