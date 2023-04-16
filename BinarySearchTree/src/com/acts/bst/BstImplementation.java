package com.acts.bst;

public class BstImplementation {

	Node root;
	
	public void insert(int data) {
		root= createNode(root,data);
	}
	
	public Node createNode(Node root, int data) {
		if(root==null) {
			root = new Node(data);
			return root;
		}
		else if(root.data>data) {
			root.left=createNode(root.left,data);
		}
		else if(root.data<data) {
			root.right=createNode(root.right,data);
		}
		return root;
	}
	
	public void traverse() {
		inOrder(root);
	}
	
	public void inOrder(Node root) {
		if(root==null) {
			return;
		}
		inOrder(root.left);
		System.out.println(root.data+" ");
		inOrder(root.right);
	}
	
	public void search(int data) {
		 boolean flag=searchData(root,data);
		System.out.println(flag);
	}
	
	public boolean searchData(Node root, int data) {
		if(root==null) {
			return false;
		}
		else if(root.data==data) {
			return true;
		}
		else if(root.data>data) {
			return searchData(root.left,data);
		}
		return searchData(root.right,data);
	}
	
	public void insertNew(int data) {
		root=insertData(root,data);
	}
	
	public Node insertData(Node root,int data) {
		if(root==null) {
			root=new Node(data);
			return root;
		}
		if(root.data>data) {
			root.left=insertData(root.left,data);
		}
		else if(root.data<data) {
			root.right=insertData(root.right,data);
		}
		return root;
	}
	
	public void delete(int data) {
		deleteNode(root, data);
	}
	
	public Node deleteNode(Node root, int data) {
		if(root==null)
			return null;
		if(data<root.data) 
			root.left=deleteNode(root.left,data);
		else if(data>root.data)
			root.right=deleteNode(root.right,data);
		else {
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			root.data=minValue(root.right);
			root.right= deleteNode(root.right,root.data);
		}
		return root;
	}
	
	public int minValue(Node root) {
		int minV= root.data;
		while(root!=null) {
			minV=root.left.data;
			root=root.left;
		}
		return minV;
	}
}
