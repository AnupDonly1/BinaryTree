package BinaryTree;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTreePractice {
	
	  static Scanner s = new Scanner(System.in);

	static BinaryTreeNode<Integer> CreatBTreeRec(){
		  
		System.out.println("Enter data");
		int data = s.nextInt();
		if(data==-1){
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
		root.left = CreatBTreeRec();
		root.right = CreatBTreeRec();
		return root;
	}
	static BinaryTreeNode<Integer> CreatBTreeUsingQ(){
		System.out.println("enter root");
		int data = s.nextInt();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
		LinkedList<BinaryTreeNode<Integer>> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			
			BinaryTreeNode<Integer> currnode = queue.removeFirst();
			//System.out.println(currnode.data+" left");
			int L = s.nextInt();
			if(L != -1) {
				
			BinaryTreeNode<Integer> l = new BinaryTreeNode<>(L);
			currnode.left= l;
			queue.addLast(l);
			} 
			//System.out.println(currnode.data+" right");
			int R = s.nextInt();
			if(R!= -1) {
			BinaryTreeNode<Integer> r = new BinaryTreeNode<>(R);
			currnode.right = r;
			queue.addLast(r);
			}

		}
		return root;
	}
	 
	static void printTree(BinaryTreeNode<Integer> root){
		
		if(root == null){
			return ;
		}
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
	}
	static BinaryTreeNode<Integer> search(BinaryTreeNode<Integer> root, int x){
		if(root ==null){
			return root;
		}
		if(root.data.equals(x)){
			return root;
		}
		BinaryTreeNode<Integer> ans= search(root.left,x);
		if(ans == null){
		ans =search(root.right,x);
		}
		return ans;
	}
	static int max(BinaryTreeNode<Integer> root){
		if(root==null){
			return 0;
		}
		
		int smallans = max(root.left);
		int smallans2 = max(root.right);
		return Math.max(root.data, Math.max(smallans, smallans2));
	}
	static int hieght(BinaryTreeNode<Integer> root){
		return root==null?0:Math.max(hieght(root.left), hieght(root.right))+1;
	}
	static boolean isBst(BinaryTreeNode<Integer> root,int min, int max){
		if(root==null){
			return true;
		}
		if(!(root.data.compareTo(min)>0 && root.data.compareTo(max)<0)){
			return false;
		}
	return isBst(root.left,min,root.data) && isBst(root.right,root.data,max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BinaryTreeNode<Integer> root = CreatBTreeUsingQ();
      printTree(root);
    //  BinaryTreeNode<Integer> XNode = search(root,9);
    //  int hieght = hieght(root);
     // System.out.println(XNode+" "+hieght);
    //  int max = max(root); 
    //  boolean ans = isBst(root,Integer.MIN_VALUE,Integer.MAX_VALUE); 
      //BinaryTreeNode<Integer> ans  = maxDataNode.maxdata(root);
     // System.out.println(ans.data);
      
	} 

}
