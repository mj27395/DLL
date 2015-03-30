package IIS.DoubleLinkedList;

public class DoubleLinkedList<E> {
	DoubleLinkedNode<E> firstNode,lastNode;
	
	public DoubleLinkedList(DoubleLinkedNode<E> node){
		node.next=null;
		node.previous=null;
		firstNode=node;
		lastNode=node;
	}
	public DoubleLinkedList(DoubleLinkedNode<E> first, DoubleLinkedNode<E> last){
		firstNode=first;
		lastNode=last;
		firstNode.previous=null;
		firstNode.next=last;
		lastNode.previous=first;
		lastNode.next=null;
	}
	public void insertBefore(DoubleLinkedNode<E> node, DoubleLinkedNode<E> nodeToInsert){
		nodeToInsert.previous=node.previous;
		nodeToInsert.next=node;
		
		if(node.previous==null){
			firstNode=nodeToInsert;
		}else{
			node.previous.next=nodeToInsert;
		}
		node.previous=nodeToInsert;
	}
	public void insertAfter(DoubleLinkedNode<E> node, DoubleLinkedNode<E> nodeToInsert){
		nodeToInsert.previous=node;
		nodeToInsert.next=node.next;
		
		if(node.next == null){
			lastNode = nodeToInsert;
		}else{
			node.next.previous = nodeToInsert;
		}
		
		node.next = nodeToInsert;
	}
}
