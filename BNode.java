public class BNode{
	public int data;
	public BNode left;
	public BNode right;

	public BNode(int data){
		this.data = data;
		left = null;
		right = null;

	}

	public BNode(){
		left = null;
		right=null;
	}

	int getData(){
		return data;
	}
}