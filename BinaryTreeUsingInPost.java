package BinaryTree;

public class BinaryTreeUsingInPost {
	static int postOrderInd;
	static BinaryTreeNode<Integer> getTree(int[] post, int[] in, int start, int end){
		if(start > end ) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(post[postOrderInd]);
		if(start == end ) {
			return root;
		}
		int index = search(in,post[postOrderInd] ,start, end);
		postOrderInd--;
		
		root.right = getTree(post,in,index+1,end);
		root.left = getTree(post,in,start,index-1);
		return root;
		
	}
	 static int search(int[] in, int j, int start, int end) {
		// TODO Auto-generated method stub
		int k=start;
		while(k<end) {
			if(in[k]== j) {
				return k;
			}
			k++;
		}
		return 0;
	}
	public static void main(String[] args) {
		int[] post = {4,5,2,6,7,3,1};
		int[] in = {4,2,5,1,6,3,7};
		postOrderInd = in.length-1;
		BinaryTreeNode<Integer> root = getTree(post,in,0,in.length-1);
		PrintLevelWise.print(root);
		//BinaryTreePractice.printTree(root);
	}

}
