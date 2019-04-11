import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Main class for testing the hashtable implementation.
 */
public class Main {

	public static StringBuilder result = new StringBuilder();

	public static void main(String[] args) {

		if (args.length != 1) {
			System.err.println("Error: Please specify an input file");
			System.exit(-1);
		}

		IOHandler ioHandler = new IOHandler();
		List<String> input = ioHandler.readInput(args[0]);
		System.out.println("Input File: " + args[0]);

		int hash_table_size = Integer.valueOf(input.get(0));

		// hashtable is initialized with the table size
		MyHashTable myHashTable = new MyHashTable(hash_table_size);

		// each line of the input is parsed via regular expressions
		for (int i = 1; i < input.size(); i++) {
			String line = input.get(i);

			// key from the input line is parsed
			int key = -1;
			Pattern digit = Pattern.compile("\\d+");
			Matcher digit_matcher = digit.matcher(line);
			while (digit_matcher.find()) {
				key = Integer.valueOf(digit_matcher.group());
			}

			// the hashtable get method is envoked
			if (line.contains("get")) {
				String value = myHashTable.get(key);
				addGetOrContainsToResult(line, value);
			}

			// the hashtable contains method is envoked
			else if (line.contains("contains")) {
				boolean contained = myHashTable.contains(key);
				addGetOrContainsToResult(line, Boolean.toString(contained));
			}

			// the hashtable remove method is envoked
			else if (line.contains("remove")) {
				myHashTable.remove(key);
				addPutOrRemoveContainsToResult(line, myHashTable);
			}

			// the hashtable put method is envoked
			else {
				// value from the input line is parsed
				String value = "";
				Pattern value_str = Pattern.compile(",(.*?)\\)");
				Matcher value_str_matcher = value_str.matcher(line);
				while (value_str_matcher.find()) {
					value = value_str_matcher.group(1);
				}
				myHashTable.put(key, value);
				addPutOrRemoveContainsToResult(line, myHashTable);
			}

		}

		// prints the results to the output file
		ioHandler.printResultToOutputFile(result.toString(), args[0]);

	}

	/**
	 * Method to help format the output of a get or contains operation
	 * 
	 * @param line  the original line of the input
	 * @param value result value of the operation
	 */
	public static void addGetOrContainsToResult(String line, String value) {
		result.append(line).append("->").append(value).append("\n\n");
	}

	/**
	 * Method to help format the output of a put or remove operation. Depends on a
	 * correct format of table.toString().
	 * 
	 * @param line  the original line of the input
	 * @param table instance of the hashtable
	 */
	public static void addPutOrRemoveContainsToResult(String line, MyHashTable table) {
		result.append(line).append("\n");
		result.append(table.toString()).append("\n");
	}
}
