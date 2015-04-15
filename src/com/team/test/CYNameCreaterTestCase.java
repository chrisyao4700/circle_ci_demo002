package com.team.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.chris.implement.CYNameCreater;
import com.dinesh.implement.DSNameCreater;

public class CYNameCreaterTestCase {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	//	fail("Test for fail!");

	}
	@Test
	public void testNameCreater() {
		assertEquals("Yao Yuan", CYNameCreater.getName());
		assertEquals("Yuan Yao", CYNameCreater.getName());
		
		
		
		
		
	}

}
