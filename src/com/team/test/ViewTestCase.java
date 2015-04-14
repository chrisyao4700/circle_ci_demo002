package com.team.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.chris.implement.CYHelloWorldView;

public class ViewTestCase {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		CYHelloWorldView cyhwv = new CYHelloWorldView();
		cyhwv.init();
		
	}

}
