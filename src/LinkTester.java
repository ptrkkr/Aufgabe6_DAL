
public class LinkTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l1 = new LinkedList();
		
		l1.addNode(1, "first");
		l1.addNode(5, "second");
		l1.addNode(6, "third");
		l1.addNode(7, "fourth");
		
		l1.printList();
//		try this again
		System.out.println("removed: " + l1.removeNode(5, true).getKey());
		System.out.println("removed: " + l1.removeNode(1, true).getKey());
		System.out.println("removed: " + l1.removeNode(6, true).getKey());
		
		System.out.println("-".repeat(4));
		l1.printList();



	}

}
