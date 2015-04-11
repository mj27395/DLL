package iis.doublelinkedlist;

public class DoubleLinkedList<E> {
  DoubleLinkedNode<E> firstNode, lastNode;

  public DoubleLinkedList(DoubleLinkedNode<E> node) {
    node.next = null;
    node.previous = null;
    firstNode = node;
    lastNode = node;
  }

  public DoubleLinkedList(DoubleLinkedNode<E> first, DoubleLinkedNode<E> last) {
    firstNode = first;
    lastNode = last;
    firstNode.previous = null;
    firstNode.next = last;
    lastNode.previous = first;
    lastNode.next = null;
  }

  public void insertBefore(DoubleLinkedNode<E> node, DoubleLinkedNode<E> nodeToInsert) {
    nodeToInsert.previous = node.previous;
    nodeToInsert.next = node;

    if (node.previous == null) {
      firstNode = nodeToInsert;
    } else {
      node.previous.next = nodeToInsert;
    }
    node.previous = nodeToInsert;
  }

  public void insertAfter(DoubleLinkedNode<E> node, DoubleLinkedNode<E> nodeToInsert) {
    nodeToInsert.previous = node;
    nodeToInsert.next = node.next;

    if (node.next == null) {
      lastNode = nodeToInsert;
    } else {
      node.next.previous = nodeToInsert;
    }

    node.next = nodeToInsert;
  }

  public void insertBeginning(DoubleLinkedNode<E> nodeToInsert) {
    if (firstNode == null) {
      nodeToInsert.previous = null;
      nodeToInsert.next = null;
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
      n = n.next;
    }

    return nodeIsInTheList;
  }

  public void remove(DoubleLinkedNode<E> node) {
    if (!isNodeInTheList(node)) {
      throw new RuntimeException("ERROR: The node is not in the list.");
    } else {
      if (node.previous == null) {
        firstNode = node.next;
      } else {
        node.previous.next = node.next;
      }

      if (node.next == null) {
        lastNode = node.previous;
      } else {
        node.next.previous = node.previous;
      }
    }

  }

  public void forwardsTraverse() {
    DoubleLinkedNode<E> node = firstNode;

    System.out.print("Forwards: ");
    while (node != null) {
      System.out.print(node.data + " ");
      node = node.next;
    }
    System.out.println("\n");
  }

  public void BackwardsTraverse() {
    DoubleLinkedNode<E> node = lastNode;

    System.out.print("Backwards: ");
    while (node != null) {
      System.out.print(node.data + " ");
      node = node.previous;
    }
    System.out.println("\n");
  }

}
