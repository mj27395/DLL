package iis.doublelinkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class DoubleLinkedListTest {
	private DoubleLinkedList<Integer> list;

	@Test
	public void createNodeElem() {
		int expected = 8;
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(expected);
		int actual = node.data;

		assertEquals(expected, actual);
	}

	@Test
	public void createNodePreviousNull() {
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);

		assertNull(node.previous);
	}

	@Test
	public void createNodeNextNull() {
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);

		assertNull(node.next);
	}

	@Test
	public void createTwoNodesElem() {
		DoubleLinkedNode<Integer> node1 = new DoubleLinkedNode<Integer>(5);
		DoubleLinkedNode<Integer> node2 = new DoubleLinkedNode<Integer>(3);
		int expected = 8;
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(node1,
				node2, expected);
		int actual = node.data;

		assertEquals(expected, actual);
	}

	@Test
	public void createTwoNodesPreviousNotNull() {
		DoubleLinkedNode<Integer> node1 = new DoubleLinkedNode<Integer>(5);
		DoubleLinkedNode<Integer> node2 = new DoubleLinkedNode<Integer>(3);
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(node1,
				node2, 8);

		DoubleLinkedNode<Integer> expected = node1;
		DoubleLinkedNode<Integer> actual = node.previous;

		assertEquals(expected, actual);
	}

	@Test
	public void createTwoNodesNextNotNull() {
		DoubleLinkedNode<Integer> node1 = new DoubleLinkedNode<Integer>(5);
		DoubleLinkedNode<Integer> node2 = new DoubleLinkedNode<Integer>(3);
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(node1,
				node2, 8);

		DoubleLinkedNode<Integer> expected = node2;
		DoubleLinkedNode<Integer> actual = node.next;

		assertEquals(expected, actual);
	}

	@Test
	public void createNewListWithOneElement() {
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(4);
		list = new DoubleLinkedList<Integer>(node);
		int expected = 1;
		int actual = list.listSize();

		assertEquals(expected, actual);
	}

	@Test
	public void createNewListNodeBeforeNull() {
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(4);
		list = new DoubleLinkedList<Integer>(node);
		DoubleLinkedNode<Integer> aux = list.getFirstNode();
		assertNull(aux.previous);
	}

	@Test
	public void createNewListNodeAfterNull() {
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(4);
		list = new DoubleLinkedList<Integer>(node);
		DoubleLinkedNode<Integer> aux = list.getLastNode();
		assertNull(aux.next);
	}

	@Test
	public void createNewListFirstAndLastEqual() {
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(4);
		list = new DoubleLinkedList<Integer>(node);
		DoubleLinkedNode<Integer> first = list.getLastNode();
		DoubleLinkedNode<Integer> last = list.getLastNode();
		assertEquals(first, last);
	}

	@Test
	public void createNewListMyElem() {
		int expected = 4;
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(expected);
		list = new DoubleLinkedList<Integer>(node);
		int actual = list.getFirstNode().data;

		assertEquals(expected, actual);
	}

	@Test
	public void createNewListWithTwoElement() {
		DoubleLinkedNode<Integer> first = new DoubleLinkedNode<Integer>(4);
		DoubleLinkedNode<Integer> last = new DoubleLinkedNode<Integer>(7);
		list = new DoubleLinkedList<Integer>(first, last);
		int expected = 2;
		int actual = list.listSize();

		assertEquals(expected, actual);
	}

	@Test
	public void createNewListWithTwoElementBeforeNull() {
		DoubleLinkedNode<Integer> first = new DoubleLinkedNode<Integer>(4);
		DoubleLinkedNode<Integer> last = new DoubleLinkedNode<Integer>(7);
		list = new DoubleLinkedList<Integer>(first, last);
		DoubleLinkedNode<Integer> aux = first;

		assertNull(aux.previous);
	}

	@Test
	public void createNewListWithTwoElementAfterNull() {
		DoubleLinkedNode<Integer> first = new DoubleLinkedNode<Integer>(4);
		DoubleLinkedNode<Integer> last = new DoubleLinkedNode<Integer>(7);
		list = new DoubleLinkedList<Integer>(first, last);
		DoubleLinkedNode<Integer> aux = last;

		assertNull(aux.next);
	}

	@Test
	public void createNewListWithTwoElementFirstBeforeLast() {
		DoubleLinkedNode<Integer> first = new DoubleLinkedNode<Integer>(4);
		DoubleLinkedNode<Integer> last = new DoubleLinkedNode<Integer>(7);
		list = new DoubleLinkedList<Integer>(first, last);
		DoubleLinkedNode<Integer> expected = list.getFirstNode();
		DoubleLinkedNode<Integer> actual = list.getLastNode().previous;

		assertEquals(expected, actual);
	}

	@Test
	public void createNewListWithTwoElementLastAfterFirst() {
		DoubleLinkedNode<Integer> first = new DoubleLinkedNode<Integer>(4);
		DoubleLinkedNode<Integer> last = new DoubleLinkedNode<Integer>(7);
		list = new DoubleLinkedList<Integer>(first, last);
		DoubleLinkedNode<Integer> expected = list.getLastNode();
		DoubleLinkedNode<Integer> actual = list.getFirstNode().next;

		assertEquals(expected, actual);
	}

	@Test
	public void createNewListWithTwoElementFirstElem() {
		int expected = 1;
		DoubleLinkedNode<Integer> first = new DoubleLinkedNode<Integer>(
				expected);
		DoubleLinkedNode<Integer> last = new DoubleLinkedNode<Integer>(7);
		list = new DoubleLinkedList<Integer>(first, last);
		int actual = list.getFirstNode().data;

		assertEquals(expected, actual);
	}

	@Test
	public void createNewListWithTwoElementLastElem() {
		int expected = 1;
		DoubleLinkedNode<Integer> first = new DoubleLinkedNode<Integer>(8);
		DoubleLinkedNode<Integer> last = new DoubleLinkedNode<Integer>(expected);
		list = new DoubleLinkedList<Integer>(first, last);
		int actual = list.getLastNode().data;

		assertEquals(expected, actual);
	}

	@Test
	public void getFirstNodeBeforeEmpty() {
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);
		list = new DoubleLinkedList<Integer>(node);

		assertNull(list.getFirstNode().previous);
	}

	@Test
	public void getFirstNodeNElemList() {
		int[] elem = { 3, 5, 7, 9 };
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(1);
		list = new DoubleLinkedList<Integer>(node);
		DoubleLinkedNode<Integer> aux;

		for (int i = 0; i < elem.length; i++) {
			aux = new DoubleLinkedNode<Integer>(elem[i]);
			list.insertEnd(aux);
		}

		int expected = 1;
		int actual = list.getFirstNode().data;

		assertEquals(expected, actual);
	}

	@Test
	public void getLastNodeAfterEmpty() {
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);
		list = new DoubleLinkedList<Integer>(node);

		assertNull(list.getLastNode().next);
	}

	@Test
	public void getLastNodeNElemList() {
		int[] elem = { 3, 5, 7, 9 };
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(1);
		list = new DoubleLinkedList<Integer>(node);
		DoubleLinkedNode<Integer> aux;

		for (int i = 0; i < elem.length; i++) {
			aux = new DoubleLinkedNode<Integer>(elem[i]);
			list.insertBeginning(aux);
		}

		int expected = 1;
		int actual = list.getLastNode().data;

		assertEquals(expected, actual);
	}

	@Test
	public void insertBeforeLast() {
		int expected = 6;
		DoubleLinkedNode<Integer> last = new DoubleLinkedNode<Integer>(8);
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(expected);
		list = new DoubleLinkedList<Integer>(last);
		list.insertBefore(list.getLastNode(), node);
		int actual = list.getLastNode().previous.data;

		assertEquals(expected, actual);
	}

	@Test
	public void insertBeforeLastNextNull() {

		DoubleLinkedNode<Integer> last = new DoubleLinkedNode<Integer>(8);
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(6);
		list = new DoubleLinkedList<Integer>(last);
		list.insertBefore(list.getLastNode(), node);

		assertNull(list.getLastNode().next);
	}

	@Test
	public void insertBeforeLastNextNullWithNElements() {
		int[] elem = { 1, 2, 3, 4, 5, 6 };
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);
		list = new DoubleLinkedList<Integer>(node);
		DoubleLinkedNode<Integer> nodeToInsert;

		for (int i = 0; i < elem.length; i++) {
			nodeToInsert = new DoubleLinkedNode<Integer>(elem[i]);
			list.insertBefore(list.getFirstNode(), nodeToInsert);
			;
		}

		assertNull(list.getLastNode().next);
	}

	@Test
	public void insertBeforeLastPreviousNotNullWithNElements() {
		int[] elem = { 1, 2, 3, 4, 5, 6 };
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);
		list = new DoubleLinkedList<Integer>(node);
		DoubleLinkedNode<Integer> nodeToInsert;

		for (int i = 0; i < elem.length; i++) {
			nodeToInsert = new DoubleLinkedNode<Integer>(elem[i]);
			list.insertBeginning(nodeToInsert);
		}

		assertNotNull(list.getLastNode().previous);
	}

	@Test
	public void insertBeforeFirst() {
		int expected = 6;
		DoubleLinkedNode<Integer> first = new DoubleLinkedNode<Integer>(8);
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(expected);
		list = new DoubleLinkedList<Integer>(first);
		list.insertBefore(list.getFirstNode(), node);
		int actual = list.getFirstNode().data;

		assertEquals(expected, actual);
	}

	@Test
	public void insertBeforeFirstNextNotNullWithNElements() {
		int[] elem = { 1, 2, 3, 4, 5, 6 };
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);
		list = new DoubleLinkedList<Integer>(node);
		DoubleLinkedNode<Integer> nodeToInsert;

		for (int i = 0; i < elem.length; i++) {
			nodeToInsert = new DoubleLinkedNode<Integer>(elem[i]);
			list.insertBefore(list.getFirstNode(), nodeToInsert);
		}

		assertNotNull(list.getFirstNode().next);
	}

	@Test
	public void insertBeforeFirstPreviousNullWithNElements() {
		int[] elem = { 1, 2, 3, 4, 5, 6 };
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);
		list = new DoubleLinkedList<Integer>(node);
		DoubleLinkedNode<Integer> nodeToInsert;

		for (int i = 0; i < elem.length; i++) {
			nodeToInsert = new DoubleLinkedNode<Integer>(elem[i]);
			list.insertBefore(list.getFirstNode(), nodeToInsert);
		}

		assertNull(list.getFirstNode().previous);
	}

	@Test
	public void insertAfterFirst() {
		int expected = 6;
		DoubleLinkedNode<Integer> first = new DoubleLinkedNode<Integer>(8);
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(expected);
		list = new DoubleLinkedList<Integer>(first);
		list.insertAfter(list.getFirstNode(), node);
		int actual = list.getFirstNode().next.data;

		assertEquals(expected, actual);
	}

	@Test
	public void insertAfterFirstPreviousNull() {
		DoubleLinkedNode<Integer> first = new DoubleLinkedNode<Integer>(8);
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(6);
		list = new DoubleLinkedList<Integer>(first);
		list.insertAfter(list.getFirstNode(), node);

		assertNull(list.getFirstNode().previous);
	}

	@Test
	public void insertAfterLast() {
		int expected = 6;
		DoubleLinkedNode<Integer> last = new DoubleLinkedNode<Integer>(8);
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(expected);
		list = new DoubleLinkedList<Integer>(last);
		list.insertAfter(list.getLastNode(), node);
		int actual = list.getLastNode().data;

		assertEquals(expected, actual);
	}

	@Test
	public void insertBeginningWithOneElement() {
		int expected = 6;
		DoubleLinkedNode<Integer> first = new DoubleLinkedNode<Integer>(8);
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(expected);
		list = new DoubleLinkedList<Integer>(first);
		list.insertBeginning(node);
		int actual = list.getFirstNode().data;

		assertEquals(expected, actual);
	}

	@Test
	public void insertBeginningWithOneElementNExtNotNull() {

		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);
		list = new DoubleLinkedList<Integer>(node);
		DoubleLinkedNode<Integer> nodeToInsert = new DoubleLinkedNode<Integer>(
				2);
		list.insertBeginning(nodeToInsert);

		DoubleLinkedNode<Integer> actual = list.getFirstNode().next;

		assertNotNull(actual);
	}

	@Test
	public void insertBeginningWithNElement() {
		int[] elem = { 1, 2, 3, 4, 5, 6 };
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);
		list = new DoubleLinkedList<Integer>(node);
		DoubleLinkedNode<Integer> nodeToInsert;

		for (int i = 0; i < elem.length; i++) {
			nodeToInsert = new DoubleLinkedNode<Integer>(elem[i]);
			list.insertBeginning(nodeToInsert);
		}
		int expected = 6;
		int actual = list.getFirstNode().data;

		assertEquals(expected, actual);
	}

	@Test
	public void insertBeginningWithNElementPreviousNull() {
		int[] elem = { 1, 2, 3, 4, 5, 6 };
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);
		list = new DoubleLinkedList<Integer>(node);
		DoubleLinkedNode<Integer> nodeToInsert;

		for (int i = 0; i < elem.length; i++) {
			nodeToInsert = new DoubleLinkedNode<Integer>(elem[i]);
			list.insertBeginning(nodeToInsert);
		}
		DoubleLinkedNode<Integer> actual = list.getFirstNode().previous;

		assertNull(actual);
	}

	@Test
	public void insertBeginningWithNElementNExtNotNull() {
		int[] elem = { 1, 2, 3, 4, 5, 6 };
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);
		list = new DoubleLinkedList<Integer>(node);
		DoubleLinkedNode<Integer> nodeToInsert;

		for (int i = 0; i < elem.length; i++) {
			nodeToInsert = new DoubleLinkedNode<Integer>(elem[i]);
			list.insertBeginning(nodeToInsert);
		}
		DoubleLinkedNode<Integer> actual = list.getFirstNode().next;

		assertNotNull(actual);
	}

	@Test
	public void insertBeginningWith0Element() {
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);
		list = new DoubleLinkedList<Integer>(node);
		list.remove(node);
		DoubleLinkedNode<Integer> nodeToInsert = new DoubleLinkedNode<Integer>(
				3);
		list.insertBeginning(nodeToInsert);

		int expected = 3;
		int actual = list.getFirstNode().data;

		assertEquals(expected, actual);
	}

	@Test
	public void insertBeginningWith0ElementNextNull() {
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);
		list = new DoubleLinkedList<Integer>(node);
		list.remove(node);
		DoubleLinkedNode<Integer> nodeToInsert = new DoubleLinkedNode<Integer>(
				3);
		list.insertBeginning(nodeToInsert);

		DoubleLinkedNode<Integer> actual = list.getFirstNode().next;

		assertNull(actual);
	}

	@Test
	public void insertBeginningWith0ElementPreviousNull() {
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);
		list = new DoubleLinkedList<Integer>(node);
		list.remove(node);
		DoubleLinkedNode<Integer> nodeToInsert = new DoubleLinkedNode<Integer>(
				3);
		list.insertBeginning(nodeToInsert);

		DoubleLinkedNode<Integer> actual = list.getFirstNode().previous;

		assertNull(actual);
	}

	@Test
	public void insertEndWithOneElement() {
		int expected = 6;
		DoubleLinkedNode<Integer> first = new DoubleLinkedNode<Integer>(8);
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(expected);
		list = new DoubleLinkedList<Integer>(first);
		list.insertEnd(node);
		int actual = list.getLastNode().data;

		assertEquals(expected, actual);
	}

	@Test
	public void insertEndWithOneElementNextNull() {

		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);
		list = new DoubleLinkedList<Integer>(node);
		DoubleLinkedNode<Integer> nodeToInsert = new DoubleLinkedNode<Integer>(
				2);
		list.insertEnd(nodeToInsert);

		DoubleLinkedNode<Integer> actual = list.getLastNode().next;

		assertNull(actual);
	}

	@Test
	public void insertEndtWithNElement() {
		int[] elem = { 1, 2, 3, 4, 5, 6 };
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);
		list = new DoubleLinkedList<Integer>(node);
		DoubleLinkedNode<Integer> nodeToInsert;

		for (int i = 0; i < elem.length; i++) {
			nodeToInsert = new DoubleLinkedNode<Integer>(elem[i]);
			list.insertEnd(nodeToInsert);
		}
		int expected = 6;
		int actual = list.getLastNode().data;

		assertEquals(expected, actual);
	}

	@Test
	public void insertEndWithNElementPreviousNotNull() {
		int[] elem = { 1, 2, 3, 4, 5, 6 };
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);
		list = new DoubleLinkedList<Integer>(node);
		DoubleLinkedNode<Integer> nodeToInsert;

		for (int i = 0; i < elem.length; i++) {
			nodeToInsert = new DoubleLinkedNode<Integer>(elem[i]);
			list.insertEnd(nodeToInsert);
		}
		DoubleLinkedNode<Integer> actual = list.getLastNode().previous;

		assertNotNull(actual);
	}

	@Test
	public void insertEndWithNElementNextNull() {
		int[] elem = { 1, 2, 3, 4, 5, 6 };
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);
		list = new DoubleLinkedList<Integer>(node);
		DoubleLinkedNode<Integer> nodeToInsert;

		for (int i = 0; i < elem.length; i++) {
			nodeToInsert = new DoubleLinkedNode<Integer>(elem[i]);
			list.insertEnd(nodeToInsert);
		}
		DoubleLinkedNode<Integer> actual = list.getLastNode().next;

		assertNull(actual);
	}

	@Test
	public void insertEndWith0Element() {
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);
		list = new DoubleLinkedList<Integer>(node);
		list.remove(node);
		DoubleLinkedNode<Integer> nodeToInsert = new DoubleLinkedNode<Integer>(
				3);
		list.insertEnd(nodeToInsert);

		int expected = 3;
		int actual = list.getLastNode().data;

		assertEquals(expected, actual);
	}

	@Test
	public void insertEndWith0ElementNextNull() {
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);
		list = new DoubleLinkedList<Integer>(node);
		list.remove(node);
		DoubleLinkedNode<Integer> nodeToInsert = new DoubleLinkedNode<Integer>(
				3);
		list.insertEnd(nodeToInsert);

		DoubleLinkedNode<Integer> actual = list.getLastNode().next;

		assertNull(actual);
	}

	@Test
	public void insertEndWith0ElementPreviousNull() {
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);
		list = new DoubleLinkedList<Integer>(node);
		list.remove(node);
		DoubleLinkedNode<Integer> nodeToInsert = new DoubleLinkedNode<Integer>(
				3);
		list.insertEnd(nodeToInsert);

		DoubleLinkedNode<Integer> actual = list.getLastNode().previous;

		assertNull(actual);
	}

	@Test(expected = RuntimeException.class)
	public void removeElementInNotInTheList() {
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);
		list = new DoubleLinkedList<Integer>(node);

		DoubleLinkedNode<Integer> nodeToRemove = new DoubleLinkedNode<Integer>(
				1);
		list.remove(nodeToRemove);

		fail("Aquí no debe de llegar");
	}

	@Test
	public void removeElementInInTheListNotSameSize() {
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);
		DoubleLinkedNode<Integer> aux = new DoubleLinkedNode<Integer>(3);
		list = new DoubleLinkedList<Integer>(node, aux);
		list.remove(aux);

		int expected = 1;
		int actual = list.listSize();

		assertEquals(expected, actual);
	}

	@Test
	public void listSizeWithEmptyList() {
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);
		list = new DoubleLinkedList<Integer>(node);
		list.remove(node);

		int expected = 0;
		int actual = list.listSize();

		assertEquals(expected, actual);
	}

	@Test
	public void listSizeWithOneElement() {
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);
		list = new DoubleLinkedList<Integer>(node);

		int expected = 1;
		int actual = list.listSize();

		assertEquals(expected, actual);
	}

	@Test
	public void listSizeWithNElement() {
		int[] elem = { 1, 2, 3, 4, 5, 6 };
		DoubleLinkedNode<Integer> node = new DoubleLinkedNode<Integer>(8);
		list = new DoubleLinkedList<Integer>(node);
		DoubleLinkedNode<Integer> nodeToInsert;

		for (int i = 0; i < elem.length; i++) {
			nodeToInsert = new DoubleLinkedNode<Integer>(elem[i]);
			list.insertBeginning(nodeToInsert);
		}

		int expected = 7;
		int actual = list.listSize();

		assertEquals(expected, actual);
	}
}
