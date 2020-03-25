package com.maven.app.StringProcessing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringProcessingTest {
	/*
 	1. empty String "" => "" - success
 	2. 1 char with A : A => "" - success
 	3. 1 char without  A : B => B - success
 	4. 4 char where first 2 are A : AACD => CD - success
 	5. 4 char where first char is A : ABCD => BCD - success
 	6. 4 char where second char is A : BACD => BCD - success
 	7.4 char with no A in first 2 characters: BBAA => BBAA - success
 	8. n chars : AABAA => BAA - success
 */

	@Test
	void testEmptyString() {
		StringProcessing object = new StringProcessing();
		String actual = object.process("");
		assertEquals("",actual);
		
	}
	@Test
	void test1CharwithA() {
		StringProcessing object = new StringProcessing();
		String actual = object.process("A");
		assertEquals("",actual);
		
	}
	@Test
	void test1CharwithoutA() {
		StringProcessing object = new StringProcessing();
		String actual = object.process("B");
		assertEquals("B",actual);
		
	}
	@Test
	void test4Charfirst2charsA() {
		StringProcessing object = new StringProcessing();
		String actual = object.process("AACD");
		assertEquals("CD",actual);
		
	}
	@Test
	void test4Charfirst1charA() {
		StringProcessing object = new StringProcessing();
		String actual = object.process("ABCD");
		assertEquals("BCD",actual);
		
	}
	@Test
	void test4CharsecondcharA() {
		StringProcessing object = new StringProcessing();
		String actual = object.process("BACD");
		assertEquals("BCD",actual);
		
	}
	@Test
	void test4CharwithoutA() {
		StringProcessing object = new StringProcessing();
		String actual = object.process("BBAA");
		assertEquals("BBAA",actual);
		
	}
	@Test
	void testNChars() {
		StringProcessing object = new StringProcessing();
		String actual = object.process("AABAA");
		assertEquals("BAA",actual);
		
	}
}
