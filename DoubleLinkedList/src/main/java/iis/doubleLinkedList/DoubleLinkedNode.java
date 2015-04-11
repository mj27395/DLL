package iis.doubleLinkedList;

public class DoubleLinkedNode<T> {
  T data;
  DoubleLinkedNode<T> previous;
  DoubleLinkedNode<T> next;

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

  public DoubleLinkedNode<T> previous() {
    return previous;
  }

  public DoubleLinkedNode<T> next() {
    return next;
  }
}
