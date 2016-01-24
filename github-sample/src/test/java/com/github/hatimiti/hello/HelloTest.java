package com.github.hatimiti.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {

	@Test
	public void testGetHello() {
		assertEquals("Hello GitHub!!", Hello.getHello());
	}

}
