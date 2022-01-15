package com.quantum.steps;

import java.util.List;
import java.util.Map;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.quantum.pages.GooglePage;
import com.quantum.utils.AppiumUtils;
import com.quantum.utils.DeviceUtils;
import com.quantum.utils.ReportUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@QAFTestStepProvider
public class ExpenseStepDefs {

	GooglePage googlePage = new GooglePage();

	@Given("^i Verify i am on Login Page$")
	public void I_am_on_expense_Page() throws Throwable {
	
	//	System.out.println(DeviceUtils.isText("Login", 20));
		
		//DeviceUtils.isText("Login", 20);
		//DeviceUtils.isText("Login", 20, "90");
		
		AppiumUtils.getAndroidDriver().installApp("PUBLIC:Praveen/ExpenseTracker/demo/ExpenseAppVer1.3.apk");
		DeviceUtils.startApp("io.perfecto.expense.tracker", "identifier");
	
	
	}

}
