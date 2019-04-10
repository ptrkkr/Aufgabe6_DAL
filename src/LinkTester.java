
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
		System.out.println("removed: " + l1.removeNode(7, true).getKey());

//		try {
//			System.out.println("removed: " + l1.removeNode(4, true).getKey());
//		} catch (NullPointerException e) {
//
//		}

		System.out.println("-".repeat(4));
		l1.printList();

		System.out.println(contains(7, l1));

//		int key = 5;
//		int hash_table_size = 8;
//		double golden_ratio = 0.6180339887;
//
//		System.out.println((int) Math.floor(hash_table_size * ((key * golden_ratio) % 1)));

	}

	public static boolean contains(int key, LinkedList l1) {
		try {
			if (key == l1.removeNode(key, false).getKey())
				return true;
			else
				return false;
		} catch (NullPointerException e) {
			return false;
		}
	}

}
