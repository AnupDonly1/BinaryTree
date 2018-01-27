package BinaryTree;

public class TreeUsingInPre {
	 static int preOrderInd = 0;
		public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre,
				int[] in){
			
				// Write your code he
	      return getTree(pre, in, 0, pre.length-1);
	     
			
		}
	  static BinaryTreeNode<Integer> getTree(int[] pre, int[] in ,int start , int end){
	      if(start> end){
	        return null;
	      }
	    BinaryTreeNode<Integer> root = new BinaryTreeNode<>(pre[preOrderInd]);
	    if(start== end){
	      return root;
	    }
	    int index = search(in , pre[preOrderInd] , start ,end);
	    preOrderInd++;
	    root.left = getTree(pre, in, start,index-1);
	    root.right = getTree(pre, in, index+1, end);
	    return root;
	  }
	  static int search(int[] in,int k, int start, int end){
	     int i = start;
	    while(i>end){
	    	if(in[i] == k) {
	    		return i;
	    	}
	      i++;
	    }
	    return i;
	  }
	  public static void main(String[] args) {
		int[] in = {1,2 ,4 ,5 ,3,6 ,7};
		int[] pre = {4, 2, 5, 1, 6, 3, 7};
		BinaryTreeNode<Integer> root = getTree(pre, in, 0, 6);
		BinaryTreePractice.printTree(root);
		//PrintLevelWise.print(root);
 	}

}
