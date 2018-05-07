package com.cheney.thinker.math;

public final class CheneyThinkerMath {
	
	/**
	 * 10 10 11 00
	 * 01 10 11 00
	 * -----&-----
	 * 00 10 11 00
	 * 
	 * 10 10 11 00
	 * 01 10 11 00
	 * -----|-----
	 * 11 10 11 00
	 * 
	 * 1000000000
	 * -- >> 4 --
	 * 0000100000
	 * 
	 * 0000100000
	 * -- << 4 --
	 * 1000000000
	 */
	
	private CheneyThinkerMath() {
		throw new UnsupportedOperationException();
	}
	
	public static int safe_add(int x, int y) {
		int lsw = (x & 0xFFFF) + (y & 0xFFFF);
		int msw = (x >> 16) + (y >> 16) + (lsw >> 16);
		return (msw << 16) | (lsw & 0xFFFF);
	}

}
