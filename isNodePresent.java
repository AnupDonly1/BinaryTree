package BinaryTree;

public class isNodePresent {
	static boolean isPresent(BinaryTreeNode<Integer > root, int x){
		if(root == null){
			return false;
		}
		if(root.data.equals(x)){
			return true;
		}
		boolean ans  = isPresent(root.left,x);
		if(ans == false){
			ans = isPresent(root.right, x);
		}
		return ans;
	}

}
