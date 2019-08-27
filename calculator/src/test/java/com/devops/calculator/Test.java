package com.devops.calculator;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {

		Calc obj=new Calc();
		assertEquals(9,obj.add(4,5));
		assertEquals(1,obj.subt(6, 5));
	}

}
