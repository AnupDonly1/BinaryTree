package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;

import linkListNode.Node;

public class ArrayOfLLbyTree {
	private static ArrayList<Node<BinaryTreeNode<Integer>>> n;
	static ArrayList<Node<BinaryTreeNode<Integer>>> fun(BinaryTreeNode<Integer> root){
		if(root == null) {
			return null;
		}
		ArrayList<BinaryTreeNode<Integer>> q = new ArrayList<>();
		ArrayList<Node<BinaryTreeNode<Integer>>> n = new ArrayList<>();
		Node<BinaryTreeNode<Integer>> head=null,tail= null;
		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			BinaryTreeNode<Integer> currNode = q.remove(0);
		//	System.out.println(" 1");
			if(currNode == null) {
				tail.next = null;
				n.add(head);
				if(q.size()==0) {
					continue;
				}
				
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
				tail = tail.next;
				if(currNode.left != null) {
				q.add(currNode.left);
				}
				if(currNode.right != null) {
				q.add(currNode.right);
				}
			}
		}
		return n;
		
	}
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = BinaryTreePractice.CreatBTreeUsingQ();
		n = fun(root);
		print(n);
	}
	private static void print(ArrayList<Node<BinaryTreeNode<Integer>>> n) {
		// TODO Auto-generated method stub
		for(int i=0; i<n.size(); i++) {
			Node<BinaryTreeNode<Integer>> head = n.get(i);
			while(head != null) {
				System.out.print(head.data.data+" ");
				head = head.next;
			}
			System.out.println();
		}
	}
	

}
