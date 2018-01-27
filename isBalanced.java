package BinaryTree;

public class isBalanced {
	static class pair{
			boolean isbalanced;
			int height;
			pair(boolean isbalanced, int height){
				this.isbalanced= isbalanced;
				this.height= height;
			}
		 }
	static pair fun(BinaryTreeNode<Integer> root){
		if(root == null) {
			pair p = new pair(true,0);
			return p;
		}
		pair a= fun(root.left);
		pair b= fun(root.right);
		boolean t = a.isbalanced && b.isbalanced;
		int h = Math.max(a.height,b.height ) +1;
		pair ans  = new pair(t,h);
		return ans;
	}
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root =BinaryTreePractice.CreatBTreeUsingQ();
	 
		pair r = fun(root);
		System.out.println(r.isbalanced+" "+r.height);
	}
	


}
