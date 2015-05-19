package iis.doublelinkedlist;

public class DoubleLinkedNode<T> {
  protected T data;
  protected DoubleLinkedNode<T> previous;
  protected DoubleLinkedNode<T> next;

  public DoubleLinkedNode(T data) {
    this.data = data;
    previous = null;
    next = null;
  }

  public DoubleLinkedNode(DoubleLinkedNode<T> prev, DoubleLinkedNode<T> next, T data) {
    previous = prev;
    this.next = next;
    this.data = data;
  }
}
