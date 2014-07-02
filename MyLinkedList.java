 public class MyLinkedList<T> implements Iterable<T>{
 	private int theSize;
	private int modCount =0;
	private Node<T> beginMarker;
	private Node<T> endMarker;

	//private nested class (static nested class is called Nested class).
	//private so Node is not visible outside MyLinkedList.
	private  class Node<T>{
		//Node constructor 
		public Node(T d, Node<T> p, Node<T> n){
			data=d; 
			prev=p; 
			next =n;
		}

		//public because it should be visible in outer class(MyLinkedList).
		public T data;
		public Node<T> prev;
		public Node<T> next;
	}

	//Linked List Constructor
	public MyLinkedList(){doclear();}
	public void clear(){
		doclear();
	}
	//Sets the header and tail, and force the size to zero.
	private void doclear(){
		beginMarker = new Node<T>(null,null,null);
		endMarker = new Node<T>(null, beginMarker, null);
		beginMarker.next=endMarker;

		theSize=0;
		modCount++;
	}

	public int size(){
		return theSize;
	}

	public boolean isEmpty(){
		return size()==0;
	}
	public boolean add(T x){
		add( size(), x);
		return true;
	}
	public void add(int idx, T x){
		addBefore(getNode(idx,0, size()),x);
	}


	private void addBefore(Node<T> p, T x){
		Node<T> newNode= new Node<T>(x,p.prev,p);
		newNode.prev.next= newNode;
		p.prev=newNode;

		theSize++;
		modCount++;
	}

	public T get(int idx){
		return getNode(idx).data;
	}
	public T set(int idx, T newVal){
		Node<T> p = getNode(idx);
		T oldVal = p.data;
		p.data = newVal;
		return oldVal;
	}
	public T remove(int idx){
		return remove(getNode(idx));
	}

	private T remove(Node<T> p){
		p.next.prev = p.prev;
		p.prev.next = p.next;
		theSize--;
		modCount++;

		return p.data;
	}
	private Node<T> getNode(int idx){
		return getNode(idx, 0, size()-1);
	}

	//if the index is less than half the size of LinkedList, we go forward, 
	//else backward search. O(N)
	private Node<T> getNode(int idx,int lower,int upper){
		Node<T> p;
		if(idx<lower || idx > upper)
			throw new IndexOutOfBoundsException();

		if(idx<size()/2){
			p=beginMarker.next;
			for(int i=0;i<idx;i++){
				p=p.next;
			}
		}
		else{
				p=endMarker;
				for(int i=size();i>idx;i--){
					p=p.prev;
				}
		}
		return p;
	}

	public java.util.Iterator<T> iterator(){
		return new LinkedListIterator();
	}
	//Non-static nested class is called--> Inner class.
	//Inner class. abstract the notion of position.
	//it provides notion of next, hasNext and remove.
	private class LinkedListIterator implements java.util.Iterator<T>{
		private Node<T> current = beginMarker.next;
		private int expectedModCount = modCount;
		private boolean okToRemove = false;

		public boolean hasNext(){
			return current != endMarker;
		}

		public T next(){
			if(modCount !=expectedModCount)
				throw new java.util.ConcurrentModificationException();
			if(!hasNext())
				throw new java.util.NoSuchElementException();

			T nextItem= current.data;
			current = current.next;
			okToRemove = true;
			return nextItem;
		}

		public void remove(){
			if(modCount != expectedModCount)
				throw new java.util.ConcurrentModificationException();
			if(!okToRemove)
				throw new IllegalStateException();

			MyLinkedList.this.remove(current.prev);
			expectedModCount++;
			okToRemove=false;
		}
	}


}