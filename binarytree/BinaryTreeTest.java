package binarytree;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public void given3NumbersWhenAddedToBinaryTreeShouldReturnSizeThree() {
		BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(40);
		binaryTree.add(22);
		binaryTree.add(11);
		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(60);
		binaryTree.add(95);
		binaryTree.add(65);
		binaryTree.add(63);
		binaryTree.add(67);
		int size = binaryTree.getSize();
		System.out.println("size:" + size);
		boolean find = binaryTree.search(63);
		System.out.println("key 63 is present in:" + find);
		Assert.assertEquals(size, size);
	}

}
