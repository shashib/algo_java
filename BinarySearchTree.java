public class BinarySearchTree {
	public BNode root;

	public BinarySearchTree(){
		root = null;
	}

	public void insert ( int data){
		//System.out.println("Inserting" + data );
		BNode newNode = new BNode();
		newNode.data = data;
		if(root==null){
			root= newNode;
		}else{
			BNode current = root;
			BNode parent;
			while(true){
				parent = current;
				//System.out.println("Inserting " + data + " and current is " + current.data);
				if(data< current.data){
					//System.out.println("Inserting in left" + data );
					current=current.left;
					if(current==null){
						parent.left=newNode;
						break;
					}
				}else
				{
						//System.out.println("Inserting in right" + data );
						current=current.right;
						if(current==null){
							parent.right=newNode;
							break;
						}
				}
			}
		}
		//System.out.println("Insertion Finised");
	}
	public void inOrder(){
		inOrder(root);
	}

	public void inOrder(BNode n){
		if(n!=null){
			inOrder(n.left);
			System.out.println(n.getData());
			inOrder(n.right);
		}
	}

	public void preOrder(){
		preOrder(root);
	}

	public void preOrder(BNode n){
		if(n!=null){
			System.out.println(n.getData());
			preOrder(n.left);
			preOrder(n.right);
		}
	}

	public int min(){
		return min(root);
	}
	public int min(BNode n){
		if(n.left!=null){
			return min(n.left);
		}else{
			return(n.getData());
		}
	}

	public int max(){
		return max(root);
	}
	public int max(BNode n){
		if(n.right!=null){
			//System.out.println("Max is " + n.data);
		  return max(n.right);

		}else{
			//System.out.println("Max is " + n.data);
			return(n.getData());
		}
	}
}
