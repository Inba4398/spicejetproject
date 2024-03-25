package Testcases;

import org.testng.annotations.Test;
import Base.Baseclass;
import PageObject.Homepage;
import PageObject.Loginpage;

public class Tc_04_Loginpage_email extends Baseclass{
	
	@Test(priority=4)
	public void Login_using_email() throws Exception {
	//create an object of Login class
	Homepage Home=new Homepage(driver);
	Home.login();
	Thread.sleep(5000);
	Loginpage lp=new Loginpage(driver);
	lp.emaillogin("dummytesting23541@gmail.com","Testing@1234");
}

}