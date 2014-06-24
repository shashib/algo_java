public class NUmberList<T> implements IList<T>{
     private T[] datastore;
     private int size;
     private int pos; 

     public NUmberList(int numElements){
     	size= numElements;
     	pos=0;
     	datastore = (T[]) new Object[size];
     }

     public void add(T elements){
     	datastore[pos] = elements; 
     	++pos;
     }

     public T get(int n){
     	return datastore[n];
     }
}
