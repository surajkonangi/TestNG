package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertion {
@Test
	public void test1() {
		Assert.assertEquals(12,13);
		System.out.println("yes it is happening");
	}
}
