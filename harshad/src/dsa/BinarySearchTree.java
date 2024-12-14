package dsa;

class BinarySearchTree {
	static class Node {
		int data;
		Node left, right;

		public Node(int item) {
			data = item;
			left = right = null;
		}
	}

	Node root;

	Node insert(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}
		if (data < root.data)
			root.left = insert(root.left, data);
		else if (data > root.data)
			root.right = insert(root.right, data);
		return root;
	}

	void preorder(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preorder(root.left);
			preorder(root.right);
		}
	}

	void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}

	void postorder(Node root) {
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + " ");
		}
	}

	int findMin(Node root) {
		while (root.left != null) {
			root = root.left;
		}
		return root.data;
	}

	int findMax(Node root) {
		while (root.right != null) {
			root = root.right;
		}
		return root.data;
	}

	int countNodes(Node root) {
		if (root == null)
			return 0;
		return 1 + countNodes(root.left) + countNodes(root.right);
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.root = bst.insert(bst.root, 50);
		bst.insert(bst.root, 30);
		bst.insert(bst.root, 70);
		bst.insert(bst.root, 20);
		bst.insert(bst.root, 40);
		bst.insert(bst.root, 60);
		bst.insert(bst.root, 80);

		System.out.println("Preorder Traversal:");
		bst.preorder(bst.root);
		System.out.println();

		System.out.println("Inorder Traversal:");
		bst.inorder(bst.root);
		System.out.println();

		System.out.println("Postorder Traversal:");
		bst.postorder(bst.root);
		System.out.println();

		System.out.println("Smallest Node: " + bst.findMin(bst.root));
		System.out.println("Largest Node: " + bst.findMax(bst.root));
		System.out.println("Total Number of Nodes: " + bst.countNodes(bst.root));
	}
}
