package BinaryTree;

public class noOfLeafNode {
	static int noLeaf(BinaryTreeNode<Integer> root, int count){

		if(root.left == null && root.right == null){
			
			return (count+1);
		}
		
		if(root.left!=null){
		   count = noLeaf(root.left,count);
		}
		if(root.right!=null){
		  count = noLeaf(root.right, count);
		}
		return count;
	}
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = BinaryTreePractice.CreatBTreeUsingQ();
		int ans  = noLeaf(root,0);
		System.out.println(ans);
	}

}
