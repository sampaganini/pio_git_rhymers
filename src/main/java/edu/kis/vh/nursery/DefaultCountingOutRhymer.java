package edu.kis.vh.nursery;

import javax.swing.plaf.synth.SynthToolTipUI;

public class DefaultCountingOutRhymer {

	private static final int NUMBERS_TOTAL = 12;
	private static final int STARTING_TOTAL = -1;
	private static final int FULL_TOTAL = 11;

	private int[] numbers = new int[NUMBERS_TOTAL];

	private int total = STARTING_TOTAL;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == STARTING_TOTAL;
	}

	public boolean isFull() {
		return total == FULL_TOTAL;
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
