package myproj.cav.prog.mycollections;

public class MyTree {
	
	TreeNode root = null;
	
	public void add(Object data){
		TreeNode newNode = new TreeNode(data);
		if(root == null){
			root = newNode;
		} else{
			TreeNode nextNode = root;
			TreeNode parent;
			
			while(true){
				parent = nextNode;
				int compare = data.toString().compareTo(nextNode.getData().toString());
				if(compare <= 0){
					nextNode = nextNode.getLeftNode();
					if(nextNode == null){
						parent.setLeftNode(newNode);
						return;
					}
				} else {
					nextNode = nextNode.getRightNode();
					if(nextNode == null){
						parent.setRightNode(newNode);
						return;
					}
				}
			}
		}
	}

}
