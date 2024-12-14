package dsa;

public class HashingWithLinearProbing {
	private int tableSize;
	private int[] table;

	public HashingWithLinearProbing(int tableSize) {
		this.tableSize = tableSize;
		table = new int[tableSize];
		for (int i = 0; i < tableSize; i++) {
			table[i] = 0;
		}
	}

	public int hash(int key) {
		return key % tableSize;
	}

	public void insert(int key) {
		int index = hash(key);

		while (table[index] != 0) {
			index = (index + 1) % tableSize;
		}

		table[index] = key;
	}

	public boolean search(int key) {
		int index = hash(key);

		while (table[index] != 0) {
			if (table[index] == key) {
				return true;
			}
			index = (index + 1) % tableSize;
		}

		return false;
	}

	public void printTable() {
		for (int i = 0; i < tableSize; i++) {
			System.out.println("Index " + i + ": " + table[i]);
		}
	}

	public static void main(String[] args) {
		HashingWithLinearProbing hashTable = new HashingWithLinearProbing(10);
		hashTable.insert(10);
		hashTable.insert(22);
		hashTable.insert(31);
		hashTable.insert(4);
		hashTable.insert(15);
		hashTable.insert(28);
		hashTable.insert(17);
		hashTable.insert(88);
		hashTable.insert(59);

		hashTable.printTable();

		System.out.println("Search for 22: " + hashTable.search(22));
		System.out.println("Search for 99: " + hashTable.search(99));
	}

}
