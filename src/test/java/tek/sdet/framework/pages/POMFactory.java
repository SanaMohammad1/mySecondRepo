package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup {
	private RetailHomePage homePage;
	private RetailSignInPage signInPage;
	private RetailAccountPage accountPage;
	
	
	public POMFactory() {
	this.homePage = new RetailHomePage();	// cnstructor we intializeing 
	this.signInPage = new RetailSignInPage();
	this.accountPage = new RetailAccountPage();
	}//same concept aply for each obj class creating 
	
	public RetailHomePage homePage() {// return the private obj of that class
		return this.homePage;
	}
	
	public RetailSignInPage signInPage() {
		return this.signInPage;
	}
	
	public RetailAccountPage accountPage() {
		return this.accountPage;
	}

}
