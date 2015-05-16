package iis.doublelinkedlist;

public class DoubleLinkedNode<T> {
  private T data;
  protected DoubleLinkedNode<T> previous;
  protected DoubleLinkedNode<T> next;

  public DoubleLinkedNode(T data) {
    this.setData(data);
    setPrevious(null);
    setNext(null);
  }

  public DoubleLinkedNode(DoubleLinkedNode<T> prev, DoubleLinkedNode<T> next, T data) {
    setPrevious(prev);
    this.setNext(next);
    this.setData(data);
  }

  public DoubleLinkedNode<T> getNext() {
    return next;
  }

  public void setNext(DoubleLinkedNode<T> next) {
    this.next = next;
  }

  public DoubleLinkedNode<T> getPrevious() {
    return previous;
  }

  public void setPrevious(DoubleLinkedNode<T> previous) {
    this.previous = previous;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
