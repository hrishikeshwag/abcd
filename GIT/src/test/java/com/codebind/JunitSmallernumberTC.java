package com.codebind;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitSmallernumberTC {

	@Test
	public void test() {
		System.out.println("In test");
		SmallerNumber g = new SmallerNumber();
		assertTrue("Number 1 is smaller than 2", g.isSmaller(2,3));
	}

}
