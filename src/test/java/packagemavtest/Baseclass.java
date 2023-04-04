package packagemavtest;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.annotations.BeforeClass;


	public class Baseclass {
		WebDriver driver;
		@BeforeClass
		public void setup()
		{
			driver=new EdgeDriver();
			driver.get("https://www.facebook.com/");
		}
	}

