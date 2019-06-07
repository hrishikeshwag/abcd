package com.codebind;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitGreaternumberTC {

	@Test
	public void test() {
		GreaterNumber g = new GreaterNumber();
		assertTrue("Number 1 is greater than 2", g.isGreater(7, 4));
	}

}
