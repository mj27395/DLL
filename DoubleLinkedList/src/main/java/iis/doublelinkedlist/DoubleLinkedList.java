package iis.doublelinkedlist;

public class DoubleLinkedList<E> {
  private DoubleLinkedNode<E> firstNode, lastNode, node;

  private DoubleLinkedNode<E> next= node.next();
  private DoubleLinkedNode<E> previous = node.previous();
  

  public DoubleLinkedList(DoubleLinkedNode<E> node) {
    node.setNext(null);
    node.setPrevious(null);
    firstNode = node;
    lastNode = node;
  }

  public DoubleLinkedList(DoubleLinkedNode<E> first, DoubleLinkedNode<E> last) {
    firstNode = first;
    lastNode = last;
    firstNode.setPrevious(null);
    firstNode.setNext(last);
    lastNode.setPrevious(first);
    lastNode.setNext(null);
  }
  

  public void insertBefore(DoubleLinkedNode<E> node, DoubleLinkedNode<E> nodeToInsert) {
    nodeToInsert.setPrevious(node.getPrevious());
    nodeToInsert.setNext(node);

    if (node.getPrevious() == null) {
      firstNode = nodeToInsert;
    } else {
      node.getPrevious().next = nodeToInsert;
    }
    node.setPrevious(nodeToInsert);
  }

  public void insertAfter(DoubleLinkedNode<E> node, DoubleLinkedNode<E> nodeToInsert) {
    nodeToInsert.setPrevious(node);
    nodeToInsert.setNext(node.getNext());

    if (node.getNext() == null) {
      lastNode = nodeToInsert;
    } else {
      node.getNext().setPrevious(nodeToInsert);
    }

    node.setNext(nodeToInsert);
  }

  public void insertBeginning(DoubleLinkedNode<E> nodeToInsert) {
    if (firstNode == null) {
      nodeToInsert.setPrevious(null);
      nodeToInsert.setNext(null);
      firstNode = nodeToInsert;
      lastNode = nodeToInsert;
    } else {
      insertBefore(firstNode, nodeToInsert);
    }
  }

  public void insertEnd(DoubleLinkedNode<E> nodeToInsert) {
    if (lastNode == null) {
      insertBeginning(nodeToInsert);
    } else {
      insertAfter(lastNode, nodeToInsert);
    }
  }

  private boolean isNodeInTheList(DoubleLinkedNode<E> node) {
    boolean nodeIsInTheList = false;
    DoubleLinkedNode<E> n = firstNode;

    while (n != null && !nodeIsInTheList) {
      if (n == node) {
        nodeIsInTheList = true;
      }
      n = n.getNext();
    }

    return nodeIsInTheList;
  }

  private void showException(String msg) {
    throw new RuntimeException(msg);
  }

  public void remove(DoubleLinkedNode<E> node) {
    if (!isNodeInTheList(node)) {
      showException("ERROR: The node is not in the list.");
    } else {
      if (node.getPrevious() == null) {
        firstNode = node.getNext();
      } else {
        node.getPrevious().next = node.getNext();
      }

      if (node.getNext() == null) {
        lastNode = node.getPrevious();
      } else {
        node.getNext().setPrevious(node.getPrevious());
      }
    }

  }

  public void forwardsTraverse() {
    DoubleLinkedNode<E> node = firstNode;

    System.out.print("\n" + "Forwards: ");
    while (node != null) {
      showNode(node.getData());
      node = node.getNext();
    }
  }

  public void backwardsTraverse() {
    DoubleLinkedNode<E> node = lastNode;

    System.out.print("\n" + "Backwards: ");
    while (node != null) {
      showNode(node.getData());
      node = node.getPrevious();
    }
  }

  private void showNode(E nodeData) {
    System.out.print(nodeData + " ");
  }

}
