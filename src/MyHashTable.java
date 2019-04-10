/**
 * This class implements a hashtable with the aid of an array, which maps
 * integer keys to String values. In case a collision occurs, chaining is used
 * to created a list of <key,value> pairs that are placed at the same index in
 * the table (aka. array).
 */
public class MyHashTable {

	/**
	 * Golden ratio needed for the multipilication method
	 */
	private static final double golden_ratio = 0.6180339887;

	/**
	 * Size of the hashtable, i.e., size of the array.
	 */
	private int hash_table_size;

	// TODO: Add an array that contains elements of your data structure needed for
	// chaining
	LinkedList[] listArr;
	
	/**
	 *
	 * @param hash_table_size fixed size of the hash table
	 */
	public MyHashTable(int hash_table_size) {
		
		this.listArr = new LinkedList[hash_table_size];
	}

	/**
	 * Inserts the value based on the hash of the key into the hashtable.
	 * 
	 * @param key   the hashtable key
	 * @param value the value
	 */
	public void put(int key, String value) {
		this.listArr[hash(key)].addNode(key, value);
	}

	/**
	 * Returns the value that is stored for the given key, or null if this table
	 * contains no value for the key.
	 * 
	 * @param key
	 * @return
	 */
	public String get(int key) {
		// TODO
		return null;
	}

	/**
	 * Removes the key (and its corresponding value) from this hashtable. This
	 * method does nothing if the key is not in the hashtable.
	 * 
	 * @param key the key that needs to be removed
	 */
	public void remove(int key) {
		// TODO
	}

	/**
	 * Tests if the specified key is stored in the hashtable.
	 * 
	 * @param key possible key to test
	 * @return true if the key is contained in the hashtable; false otherwise.
	 */
	public boolean contains(int key) {
		// TODO
		return false;
	}

	/**
	 * Returns the hash value of the key based on the multiplication method.
	 * 
	 * @param key the key for which a hash should be computed
	 * @return a hash code value for this key
	 */
	private int hash(int key) {
		// TODO
		return 0;
	}

	/**
	 * Returns a string representation of this hashtable object. Each element of the
	 * array is represented by "["+i+"]:", where i is the index. Each element is
	 * then followed by the entries at that index in order, where each entry is
	 * rendered as "{" + key + ","+ value + "}". Also each array element has its own
	 * line. e.g. [0]: [1]: [2]:{12,Z}{4,X} [3]: [4]:{100,B} [5]:
	 */
	@Override
	public String toString() {
		String result = "";
		// TODO
		return result;
	}
}
