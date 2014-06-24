public class pair<T1, T2> {
	private T1 firstItem;
	private T2 secondItem;

	public pair( T1 first, T2 second){
		firstItem = first;
		secondItem = second;
	}

	public T1 first(){
		return firstItem;
	}

	public T2 second(){
		return secondItem;
	}
}