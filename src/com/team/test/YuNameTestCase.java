package com.team.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yu.implement.LYNameCreater;

public class YuNameTestCase {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("Yu Luo", LYNameCreater.getName());
		assertEquals("Luo Yu", LYNameCreater.getName());
	}

}
