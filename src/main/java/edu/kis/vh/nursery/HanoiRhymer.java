package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	int totalRejected = 0;

	private int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
	if (!callCheck() && in > peekaboo())
		totalRejected++;
		else
			super.countIn(in);
	}
}
//alt + --> oraz alt + <-- sluzy do przechodzenia pomiedzy otwartymii plikami w zakladkach