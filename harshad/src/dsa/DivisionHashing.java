package dsa;

public class DivisionHashing {
	private static final int TABLE_SIZE = 10;
	private int[] hashTable;

	public DivisionHashing() {
		hashTable = new int[TABLE_SIZE];
		for (int i = 0; i < TABLE_SIZE; i++) {
			hashTable[i] = -1;
		}
	}

	public int hash(int key) {
		return key % TABLE_SIZE;
	}

	public void insert(int key) {
		int hashValue = hash(key);

		int index = hashValue;
		while (hashTable[index] != -1) {
			index = (index + 1) % TABLE_SIZE;
		}

		hashTable[index] = key;
		System.out.println("Inserted " + key + " at index " + index);
	}

	public boolean search(int key) {
		int hashValue = hash(key);
		int index = hashValue;

		while (hashTable[index] != -1) {
			if (hashTable[index] == key) {
				return true;
			}
			index = (index + 1) % TABLE_SIZE;
		}
		return false;
	}

	public void display() {
		System.out.println("Hash Table:");
		for (int i = 0; i < TABLE_SIZE; i++) {
			if (hashTable[i] != -1) {
				System.out.println("Index " + i + ": " + hashTable[i]);
			} else {
				System.out.println("Index " + i + ": Empty");
			}
		}
	}

	public static void main(String[] args) {
		DivisionHashing hashing = new DivisionHashing();

		// Insert keys
		hashing.insert(12);
		hashing.insert(22);
		hashing.insert(32);
		hashing.insert(42);

		// Display the hash table
		hashing.display();

		// Search for a key
		System.out.println("Searching for 22: " + hashing.search(22));
		System.out.println("Searching for 99: " + hashing.search(99));
	}
}
