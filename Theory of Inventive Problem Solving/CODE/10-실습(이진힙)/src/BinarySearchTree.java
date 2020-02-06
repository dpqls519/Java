
//1
import java.util.LinkedList;

class BinarySearchTree {
	class BinaryTree {
		int key;
		BinaryTree left, right;

		public BinaryTree(int key) {
			this.key = key;
		}

		@Override
		public String toString() {
			return Integer.toString(key);
		}
	}

	BinaryTree root;

//	public void add(int key) {
//		root = add(root, key);
//	}

//	private BinaryTree add(BinaryTree tree, int key) {
//		if (tree == null)
//			return new BinaryTree(key);
//		if (tree.key < key)
//			tree.right = add(tree.right, key);
//		else if (tree.key > key)
//			tree.left = add(tree.left, key);
//		else; // value »ðÀÔ ½Ã else tree.value=value;
//		return tree;
//	}

	public void add(int key) {
	      BinaryTree newNode = new BinaryTree(key);
	      
	      if(root == null) { 
	         root = newNode;
	      } else {
	         BinaryTree currentNode = root;
	         BinaryTree parentNode;
	         
	         while(true) {
	            parentNode = currentNode;
	            
	            if(key < parentNode.key) {
	               currentNode = parentNode.left;
	               if(currentNode == null) {
	                  parentNode.left = newNode;
	                  return;
	               }
	            } else {
	               currentNode = parentNode.right;
	               if(currentNode == null) {
	                  parentNode.right = newNode;
	                  return;
	               }
	            }
	         }
	      }
	   }

	public BinaryTree search(int key) {
		return searchRecur(root, key);
	}

	private BinaryTree searchRecur(BinaryTree node, int key) {
		if (node == null)
			return null;
		if (node.key == key)
			return node; // 50ÀÌ¶û 30ºñ±³
		else if (node.key < key)
			return searchRecur(node.right, key);
		else
			return searchRecur(node.left, key);
//		else return null;
	}

//	public BinaryTree search(int key) {
//		BinaryTree node = root;
//		while (node != null) {
//			if (node.key == key)
//				return node;
//			if (node.key < key)
//				node = node.right;
//			else
//				node = node.left;
//		}
//		return node;
//	}

	public static String inorder(BinaryTree node) {
		if (node == null)
			return "";
		return inorder(node.left) + " " + node.key + " " + inorder(node.right);
	}

	@Override
	public String toString() {
		return levelOrder().toString();
	}

	private LinkedList<BinaryTree> levelOrder() {
		LinkedList<BinaryTree> list = new LinkedList<>();
		LinkedList<BinaryTree> queue = new LinkedList<>();
		if (root != null)
			queue.addLast(root);
		while (!queue.isEmpty()) {
			BinaryTree node = queue.removeFirst();
			list.add(node);
			if (node.left != null)
				queue.addLast(node.left);
			if (node.right != null)
				queue.addLast(node.right);
		}
		return list;
	}
}
