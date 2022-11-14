package com.greatlearning.model;

public class TreeConversion {
	private Node prevNode = null;
    private Node skewedTreeNode = null;
    
	public void bstToSkewedConversion(Node root, int order)
	{
		if(root == null) return;
		if(order > 0) bstToSkewedConversion(root.right, order);
		else bstToSkewedConversion(root.left, order);
		
		Node rightNode = root.right;
		Node leftNode = root.left;

		if(skewedTreeNode == null) skewedTreeNode = root;
		else prevNode.right = root;
		
		root.left = null;
		prevNode = root;
		
		if (order > 0) bstToSkewedConversion(leftNode, order);
		else bstToSkewedConversion(rightNode, order);
	}
	
    public void printSkewedTree()
    {
        if(skewedTreeNode == null) return;
        while(skewedTreeNode!=null)
        {
        	System.out.print(skewedTreeNode.root + " ");
        	skewedTreeNode=skewedTreeNode.right;
        }       
    }
}
