package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	/** creating new defaultCountingOutRhymer cause we extends him **/
	private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
	/** override orginal countOut class from defaultcountingoutrhymes**/
	@Override
	public int countOut() {
		while (!callCheck())
			
		temp.countIn(super.countOut());
		
		int ret = temp.countOut();
		
		while (!temp.callCheck())
			
		countIn(temp.countOut());
		
		return ret;
	}
}
