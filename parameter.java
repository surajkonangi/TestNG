package demo;


	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class parameter {
	@Parameters({"URL","userid","name"})
	@Test
	public void parameter1(String URL,String userid,String name) {
	System.out.println("My url is"+URL);
	System.out.println("My userid is"+userid);
	System.out.println("My name is"+name);

	}

	}

