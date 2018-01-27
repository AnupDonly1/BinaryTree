package BinaryTree;

import java.util.ArrayList;

public class PrintLevelWise {
	static void print(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		ArrayList<BinaryTreeNode<Integer>> q = new ArrayList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			BinaryTreeNode<Integer> currNode = q.remove(0);
			//System.out.println("1");
			if(currNode == null) {
				if(q.isEmpty()) {
					return;
				}
				System.out.println();
				q.add(null);
			} else {
			System.out.print(currNode.data+ " ");
			if(currNode.left!= null) {
				q.add(currNode.left);
			}
			if(currNode.right != null) {
				q.add(currNode.right);
			}
			}
		}
		
	}
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = BinaryTreePractice.CreatBTreeUsingQ();
		print(root);
	}

}
