package demo;

import org.testng.annotations.Test;

public class grouping {
 @Test(groups= {"sanity-group"})
 public void testone() {
	 System.out.println("This belongs to maven");
 }
 @Test(groups= {"sanity-group","regression-group"})
 public void testtwo() {
	 System.out.println("this belongs to testng");
 }
 @Test(groups= {"exclude-group"})
 public void testthree() {
	 System.out.println("this belongs to maven");
 }
}
