package demo;


	import org.testng.annotations.Factory;

	public class factory {
	
	   @Factory
	   public Object[] factoryMethod() {
	       return new Object[] { new factoryclass(20), new factoryclass(21) };
	   }
	}

