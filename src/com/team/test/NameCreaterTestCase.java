package com.team.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.chris.implement.CYNameCreater;

public class NameCreaterTestCase {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Test for fail!");

	}
	@Test
	public void testNameCreater() {
		assertEquals("Yuan Yao", CYNameCreater.getName());
	}

}
