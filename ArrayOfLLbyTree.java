package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;

import linkListNode.Node;

public class ArrayOfLLbyTree {
	static ArrayList<Node<BinaryTreeNode<Integer>>> fun(BinaryTreeNode<Integer> root){
		if(root == null) {
			return null;
		}
		ArrayList<BinaryTreeNode<Integer>> q = new ArrayList<>();
		Node<BinaryTreeNode<Integer>> head=null,tail= null;
		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			BinaryTreeNode<Integer> currNode = q.remove(0);
			if(currNode == null) {
				if(q.isEmpty()) {
					break;
				}
				ArrayList<Node<BinaryTreeNode<Integer>>> n = new ArrayList<>();
				
				n.add(head);
			 head = null;
			 tail = null;
			 q.add(null);
			} else {
				Node<BinaryTreeNode<Integer>> node = new Node<>(currNode);
				if(head == null) {
					head = node;
					tail = node;
				}
				tail.next = node;
				tail = node;
			}
		}
		
	}

}
