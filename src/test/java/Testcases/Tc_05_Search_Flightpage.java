package Testcases;

import org.testng.annotations.Test;

import Base.Baseclass;
import PageObject.Search_Flightpage;

public class Tc_05_Search_Flightpage extends Baseclass{
	
	
	@Test(priority=5)
	public void oneway_trip() throws Exception {
	//create an object of class

	Search_Flightpage fb=new Search_Flightpage(driver);
	fb.onewaytrip();
	
	}
	
	@Test(priority=6)
	public void round_trip() {
		//create an object of class
		Search_Flightpage fb=new Search_Flightpage(driver);
		fb.roundtrip();
	}
	
}