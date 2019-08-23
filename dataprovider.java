package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
@Test(dataProvider="suraj")
	public void input(String name,String id) {
		System.out.println("this test case run for 3 people");
		System.out.println(name);
		System.out.println(id);
}

	@DataProvider (name="suraj")
	public Object[][] dataProvider()
	{
		Object[][] obj=new Object[3][2];
		obj[0][0]="suraj";
		obj[1][0]="1";
		obj[0][1]="nischal";
		obj[1][1]="2";
		obj[2][0]="magesh";
		obj[2][1]="3";
		return obj;
	}
}
