package demo;

import org.testng.annotations.Test;

public class priority {
	@Test(priority=3)
public void test1() {
	System.out.println("i am inside test1");
}
	@Test(priority=2)
public void test2() {
	System.out.println("i am inside test2");
}
	@Test(priority=-2)
public void test3() {
	System.out.println("i am inside test3");
}
}