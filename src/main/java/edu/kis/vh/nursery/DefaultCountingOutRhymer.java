package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int numbersTotal = 12;
	private static final int startingTotal = -1;
	private static final int fullTotal = 11;

	private int[] numbers = new int[numbersTotal];

	private int total = startingTotal;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == startingTotal;
	}

	public boolean isFull() {
		return total == fullTotal;
	}

	protected int peekaboo() {
		if (callCheck())
			return -1;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return -1;
		return numbers[total--];
	}

	public int getTotal() {
		return total;
	}
}
