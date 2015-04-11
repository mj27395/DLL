package IIS.DoubleLinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	DoubleLinkedNode<Integer> n1 = new DoubleLinkedNode<Integer>(3);
    	DoubleLinkedNode<Integer> n2 = new DoubleLinkedNode<Integer>(4);
    	
    	DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>(n1, n2);
    	
    	System.out.println("\nFirst traverse: \n");
    	list.forwardsTraverse();
    	list.BackwardsTraverse();
    	
    	DoubleLinkedNode<Integer> new_node_1 = new DoubleLinkedNode<Integer>(5);
    	list.insertAfter(n2, new_node_1);
    	
    	DoubleLinkedNode<Integer> new_node_2 = new DoubleLinkedNode<Integer>(6);
    	list.insertAfter(new_node_1, new_node_2);
    	
    	System.out.println("\n Second traverse: \n");
    	list.BackwardsTraverse();
    	list.forwardsTraverse();
    	
    	System.out.println("\n Last traverse: \n");
    	list.remove(new_node_2);
    	
    	list.BackwardsTraverse();
    	list.forwardsTraverse();
    }
}
