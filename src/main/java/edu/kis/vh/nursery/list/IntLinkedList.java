package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private Node last;
	private int i;

	private void push(int i) {
		if (getLast() == null)
			setLast(new Node(i));
		else {
			getLast().setNext(new Node(i));
			getLast().getNext().setPrev(getLast());
			setLast(getLast().getNext());
		}
	}

	private boolean isEmpty() {
		return getLast() == null;
	}

	private boolean isFull() {
		return false;
	}

	private int top() {
		if (isEmpty())
			return -1;
		return getLast().getValue();
	}

	private int pop() {
		if (isEmpty())
			return -1;
		int ret = getLast().getValue();
		setLast(getLast().getPrev());
		return ret;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	public int getI() {
		return i;
	}


	public class Node {

		private int value;
		private Node prev;
		private Node next;

		public Node(int i) {
			setValue(i);
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}



}

