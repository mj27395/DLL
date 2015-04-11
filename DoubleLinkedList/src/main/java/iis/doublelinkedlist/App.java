package iis.doublelinkedlist;

public class App {
  private static final int THREE=3;
  private static final int FOUR=4;
  private static final int FIVE=5;
  private static final int SIX=6;
  
  public static void main(String[] args) {
    DoubleLinkedNode<Integer> n1 = new DoubleLinkedNode<Integer>(THREE);
    DoubleLinkedNode<Integer> n2 = new DoubleLinkedNode<Integer>(FOUR);

    DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>(n1, n2);

    list.forwardsTraverse();
    list.backwardsTraverse();

    DoubleLinkedNode<Integer> newNode1 = new DoubleLinkedNode<Integer>(FIVE);
    list.insertAfter(n2, newNode1);

    DoubleLinkedNode<Integer> newNode2 = new DoubleLinkedNode<Integer>(SIX);
    list.insertAfter(newNode1, newNode2);

    list.backwardsTraverse();
    list.forwardsTraverse();

    list.remove(newNode2);

    list.backwardsTraverse();
    list.forwardsTraverse();
  }
}
