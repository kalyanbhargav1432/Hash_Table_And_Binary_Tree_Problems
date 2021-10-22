package binarytree;

import org.junit.Assert;
import org.junit.Test;

class BinaryTreeTest {

	@Test
	public void given3NumbersWhenAddedToBinaryTreeShouldReturnSizeThree() {
		BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		int size = binaryTree.getSize();
		System.out.println("size" + size);
		Assert.assertEquals(3, size);
	}

}
