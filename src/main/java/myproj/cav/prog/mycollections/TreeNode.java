package myproj.cav.prog.mycollections;

public class TreeNode {
	
	public Object data;
	public TreeNode leftNode;
	public TreeNode rightNode;
	
	public TreeNode() {
		super();
	}

	public TreeNode(Object data) {
		super();
		this.data = data;
	}



	public Object getData() {
		return data;
	}
	
	
	public void setData(Object data) {
		this.data = data;
	}
	public TreeNode getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}
	public TreeNode getRightNode() {
		return rightNode;
	}
	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}
	
	

}
