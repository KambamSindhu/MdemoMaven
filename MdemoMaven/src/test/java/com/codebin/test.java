package com.codebin;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void test() {
		App obj=new App();
		int res=obj.add(1,2);
		assertEquals(res,3);
	}

	@Test
	public void test1() {
		App obj=new App();
		int res=obj.add(11,2);
		assertEquals(res,13);
	}
	@Test
	public void test2() {
		App obj=new App();
		int res=obj.add(2,2);
		assertEquals(res,4);
	}
	@Test
	public void test3() {
		App obj=new App();
		int res=obj.add(0,2);
		assertEquals(res,2);
	}


}
