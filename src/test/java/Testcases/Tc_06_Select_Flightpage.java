package Testcases;

import org.testng.annotations.Test;
import Base.Baseclass;
import PageObject.Search_Flightpage;
import PageObject.Select_Flightpage;

public class Tc_06_Select_Flightpage extends Baseclass{
	
	@Test(priority=7)
	public void SelectFlight() throws Exception {
	//create an object of Login class
		Search_Flightpage fb=new Search_Flightpage(driver);
		fb.onewaytrip();
		Select_Flightpage selfp=new Select_Flightpage(driver);
		selfp.selectprice();
		selfp.contbtn();
		Thread.sleep(5000);
	}
}