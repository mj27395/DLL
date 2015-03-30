package IIS.DoubleLinkedList;

public class DoubleLinkedList<E> {
	DoubleLinkedNode<E> firstNode,lastNode;
	
	public DoubleLinkedList(DoubleLinkedNode<E> node){
		node.last=null;
		node.previous=null;
		firstNode=node;
		lastNode=node;
	}
	public DoubleLinkedList(DoubleLinkedNode<E> first, DoubleLinkedNode<E> last){
		firstNode=first;
		lastNode=last;
		firstNode.previous=null;
		firstNode.last=last;
		lastNode.previous=first;
		lastNode.last=null;
	}
}
