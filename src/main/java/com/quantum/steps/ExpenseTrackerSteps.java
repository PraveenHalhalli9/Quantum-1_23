package com.quantum.steps;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.quantum.pages.ExpenseTrackerHomePage;
import com.quantum.pages.ExpenseTrackerLoginPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@QAFTestStepProvider
public class ExpenseTrackerSteps {

	@Then("I should see expense tracker login screen")
	public void verifyExpenseTrackerLogin() {

		System.out.println(ConfigurationManager.getBundle().getString("perfecto.capabilities.tunnelId"));
		new ExpenseTrackerLoginPage().verifyExpenseTrackerLoginScreen();
	    
		/*PerfectoApplicationSteps.setSuccessSensorAuthenticationtoAppById(id);
		PerfectoApplicationSteps.setSuccessFingerprinttoAppById(id);
		PerfectoApplicationSteps.setFailSensorAuthenticationtoAppById(errorType, id);
		PerfectoApplicationSteps.setFailFingerprinttoAppById(errorType, id);*/
	}
	
	@Then("I should see expense tracker Native login screen")
	public void verifyExpenseTrackerNativeLogin() {
		new ExpenseTrackerLoginPage().verifyExpenseTrackerNativeLoginScreen();
	}
	
	@When("I enter \"(.*?)\" and \"(.*?)\" in native login screen")
	public void iEnterLoginDetilsInNativeLoginScreen(String email, String password) {
		new ExpenseTrackerLoginPage().loginNative(email, password);
	}
	
	
	@Then("I should see expense tracker home screen")
	public void iShouldSeeExpenseTrackerHomeScreen() {
		new ExpenseTrackerHomePage().verifyHomeScreen();
	}
	
	@When("I enter expense details and save")
	public void iEnterExpenseDetailsAndSave() {
		new ExpenseTrackerHomePage().enterExpenseDetails();
	}
	
	@Then("I should see error popup")
	public void iShouldSeeErrorPopup() {
		new ExpenseTrackerHomePage().verifyPopupText(); 
	}
	
	@Then("I should see success popup")
	public void iShouldSeeSuccessPopup() {
		new ExpenseTrackerHomePage().verifyPopupText(); 
	}
}
