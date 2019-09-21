package darsh.asawa.add;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdd {

	@Test
	public void test() {
		
		Addition obj= new Addition();
		assertEquals(9,obj.add(4, 5));
	}

}
