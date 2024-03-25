package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Baseclass;
import PageObject.Homepage;

public class Tc_01_Navigate_to_Homepage extends Baseclass{
		
		@Test(priority=1)
		
		public void Homepgae_verify() throws Exception {
			//create an object of Login class
			Homepage Home=new Homepage(driver);
			String actTitle = Home.SpicejetPageTitle(getPageTitle());
			String expTitle="SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
			Assert.assertEquals(actTitle, expTitle);
						
			
		}

		
}