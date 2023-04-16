package com.acts.tester;

import com.acts.bst.BstImplementation;
import com.acts.bst.Node;

public class BstTester {

	public static void main(String[] args) {

		BstImplementation tree= new BstImplementation();
		tree.insert(10);
		tree.insert(5);
		tree.insert(8);
		tree.insert(4);
		tree.insert(15);
		tree.insert(20);
		tree.insert(12);
		tree.traverse();
		System.out.println("-------");
//		tree.insertNew(35);
//		tree.traverse();
//		tree.search(200);
		tree.delete(4);
		tree.delete(12);
	//	tree.delete(10);
		tree.delete(15);
		tree.traverse();
	}

}
