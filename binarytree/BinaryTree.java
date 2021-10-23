package binarytree;

public class BinaryTree<K extends Comparable<K>> {
	private MyBinaryNode<K> root;

	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current == null)
			return new MyBinaryNode<>(key);
		int CompareResult = key.compareTo(current.key);
		if (CompareResult == 0)
			return current;
		if (CompareResult < 0) {
			current.left = addRecursively(current.left, key);
		} else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}

	public int getSize() {
		return this.getSizeRecursive(root);
	}

	private int getSizeRecursive(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
	}

	public boolean search(K key) {
		MyBinaryNode<K> node = this.searchRecursively(key);
		if (node != null)
			return true;
		return false;
	}

	private MyBinaryNode<K> searchRecursively(K key) {
		MyBinaryNode<K> node = this.root;
		while (node != null && node.key != key) {
			if (key.compareTo(node.key) < 0) {
				node = node.left;
			} else {
				node = node.right;
			}
		}
		return node;
	}
}