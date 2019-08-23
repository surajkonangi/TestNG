package demo;


	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class calcitestcases {
	calci cal;

	@BeforeClass
	public void beforetest() {
	System.out.println("Before class");
	cal = new calci();
	}

	@AfterClass
	public void test() {
	System.out.println("After class");

	}

	@Test
	public void add() {
	Assert.assertEquals(cal.add(10, 20), 30.0);

	}

	@Test

	public void sub() {
	Assert.assertEquals(cal.sub(10, 6), 4.0);
	}

	@Test

	public void mul() {
	Assert.assertEquals(cal.mul(10, 6), 60.0);
	}

	@Test
	public void div() {
	Assert.assertEquals(cal.div(10, 6), 1.0);
	}

	}


