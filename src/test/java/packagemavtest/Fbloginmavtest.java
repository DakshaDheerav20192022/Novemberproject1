package packagemavtest;
import org.testng.annotations.Test;

import packagemav.Siteloading;

public class  Fbloginmavtest extends Baseclass
{
	@Test
	public void testlogin()
	{
		Siteloading ob=new Siteloading(driver);
		ob.setvalues("nairrevathy09@gmail.com", "R@vgeerev@shj@y");
		ob.login();
	}
}