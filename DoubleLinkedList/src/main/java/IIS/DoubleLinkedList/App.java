package IIS.DoubleLinkedList;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		DoubleLinkedNode<Integer> n1 = new DoubleLinkedNode<Integer>(3);
		DoubleLinkedNode<Integer> n2 = new DoubleLinkedNode<Integer>(4);

		DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>(n1, n2);

		//System.out.print("\n First traverse: \n");
		list.forwardsTraverse();
		list.BackwardsTraverse();

		DoubleLinkedNode<Integer> newNode1 = new DoubleLinkedNode<Integer>(5);
		list.insertAfter(n2, newNode1);

		DoubleLinkedNode<Integer> newNode2 = new DoubleLinkedNode<Integer>(6);
		list.insertAfter(newNode1, newNode2);

		//System.out.print("\n Second traverse: \n");
		list.BackwardsTraverse();
		list.forwardsTraverse();

		//System.out.print("\n Last traverse: \n");
		list.remove(newNode2);

		list.BackwardsTraverse();
		list.forwardsTraverse();
	}
}
