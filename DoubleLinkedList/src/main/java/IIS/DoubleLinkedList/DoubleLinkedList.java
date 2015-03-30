package IIS.DoubleLinkedList;

public class DoubleLinkedList<E> {
	DoubleLinkedNode<E> firstNode,lastNode;
	
	public DoubleLinkedList(DoubleLinkedNode<E> node){
		node.last=null;
		node.previous=null;
		firstNode=node;
		lastNode=node;
	}
}
