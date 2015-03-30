package IIS.DoubleLinkedList;

public class DoubleLinkedNode<T> {
	T data;
	DoubleLinkedNode<T> previous;
	DoubleLinkedNode<T> last;
	
	public DoubleLinkedNode (T data){
		this.data=data;
		previous=null;
		last=null;
	}
	public DoubleLinkedNode (DoubleLinkedNode<T> prev, DoubleLinkedNode<T> lst, T data){
		previous=prev;
		last=lst;
		this.data=data;
	}
}
