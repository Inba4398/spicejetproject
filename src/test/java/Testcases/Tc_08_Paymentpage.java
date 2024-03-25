package Testcases;

import org.testng.annotations.Test;

import Base.Baseclass;
import PageObject.Add_onpage;
import PageObject.Bookingformpage;
import PageObject.Paymentpage;
import PageObject.Search_Flightpage;
import PageObject.Select_Flightpage;

public class Tc_08_Paymentpage extends Baseclass{
	
	@Test(priority=9)
	public void Paymentpage() throws Exception {
	//create an object of Login class
		Search_Flightpage fb=new Search_Flightpage(driver);
		fb.onewaytrip();
		Select_Flightpage selfp=new Select_Flightpage(driver);
		selfp.selectprice();
		selfp.contbtn();
		Thread.sleep(5000);
		Bookingformpage bp=new Bookingformpage(driver);
		bp.contactdetails();
		bp.passenger1();
		bp.passenger2();
		bp.passenger3();
		bp.infant();
		Add_onpage ap=new Add_onpage(driver);
		ap.contnbtn();
		Paymentpage pp=new Paymentpage(driver);
		Thread.sleep(2000);
	//	pp.via_UPI();
	   }
	// This page have some issue so further proceed is not working .I'm consider with mentor also told drop this page only write a code only,so i commented this process
}