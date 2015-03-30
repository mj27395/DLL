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
}
