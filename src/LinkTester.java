
public class LinkTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l1 = new LinkedList();
		
		l1.addNode(1, "dfa");
		l1.addNode(5, "adf");
		l1.addNode(6, "sjd");
		
		l1.printList();
		System.out.println("removed: " + l1.removeNode(1, true).getValue());
		System.out.println("removed: " + l1.removeNode(5, true).getValue());
//		try this again
//		System.out.println("removed: " + l1.removeNode(6, true).getValue());
		System.out.println("-".repeat(4));
		l1.printList();


	}

}
