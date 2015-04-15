package com.team.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dinesh.implement.DSNameCreater;

public class DSNameCreaterTestCase {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("Dinesh Sathasivam",DSNameCreater.getName());
		assertEquals("Sathasivam Dinesh",DSNameCreater.getName());
	}

}
