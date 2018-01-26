package BinaryTree;

public class maxDataNode {
	static BinaryTreeNode<Integer> maxdata(BinaryTreeNode<Integer> root){
		if(root == null){
			return null;
		}
		if(root.left == null && root.right == null){
			return root;
		}

		BinaryTreeNode<Integer> left = maxdata(root.left);
		BinaryTreeNode<Integer> right = maxdata(root.right);
 		if(left.data.compareTo(right.data) < 0){
			left = right;
		}
 		if(root.data.compareTo(left.data)>0) {
 			return root;
 		}
 		return left;
		
	}
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = BinaryTreePractice.CreatBTreeUsingQ();
		BinaryTreeNode<Integer> ans = maxdata(root);
		System.out.println(ans.data);
	}
   }
