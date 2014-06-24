public class LinkList {
	public static void main(String[] args){
		Node<String> node1 =new Node("item1");
		Node<String> node2 = new Node("item2");
		Node<String> node3 = new Node("item3");
		Node<Integer> node4 = new Node(4);

		node1.next =node2;
		node2.next=node3;
		//node3.next=node4;
		Node<String> footer = new Node("footer");
		node3.next=footer;

		Node<String> current;

		current = node1;
		while(current.next !=null){
			System.out.println((String) current.getData());
			current=current.next;
		}
	}
}