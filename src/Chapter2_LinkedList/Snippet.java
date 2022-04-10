package Chapter2_LinkedList;

class LinkedListPrac {

public static void main(String[] args) {
	
}

	public int length(Node current) {
		if (current == null) { // base case
			return 0;
		}
		return 1 + length(current.next());
	}
}

