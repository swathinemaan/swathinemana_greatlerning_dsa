package com.greatlearning.bst.driver;

import com.greatlearning.model.Node;
import com.greatlearning.model.TreeConversion;

public class Driver {
	public static void main(String[] args) {
		
		Node inputInformation=new Node(50);
		inputInformation.left = new Node(30);
		inputInformation.right = new Node(60);
		inputInformation.left.left = new Node(10);
		inputInformation.right.left= new Node(55);

		TreeConversion treeConversion=new TreeConversion();
		treeConversion.bstToSkewedConversion(inputInformation, 0);
		treeConversion.printSkewedTree();
	}



}
