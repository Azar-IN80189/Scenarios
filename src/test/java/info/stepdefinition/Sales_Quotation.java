package info.stepdefinition;

import java.awt.AWTException;

import info.base.Reusableclass;
import info.pojo.Sales_Quotation_POJO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Sales_Quotation extends Reusableclass {

	public static Sales_Quotation_POJO s;

	@Given("User need to navigate to Quotation slide")
	public void user_need_to_navigate_to_quotation_slide() {
		s=new Sales_Quotation_POJO();
		toClick(s.Salesslide);
		clickjavascript(s.Quotationslide);

	}


	@Then("User need to Approve a Quotation")
	public void user_need_to_approve_a_quotation() throws AWTException, InterruptedException {
		s=new Sales_Quotation_POJO();
		Thread.sleep(4000);
		Explicitwaitvisibility(s.NewQuotationbtn);
		clickjavascript(s.NewQuotationbtn);
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
			Explicitwait(s.Customerselect);
			clickjavascript(s.Customerselect);
			Thread.sleep(1000);
			tofill(s.Customerselect, "fflt-142");
			Explicitwaitvisibility(s.Option1select);
			clickjavascript(s.Option1select);
			Thread.sleep(1000);
			totabkey();
			Delete();
			tofill(s.QuotationDate, "06/09/2022");
			Thread.sleep(1000);
			totabkey();
			Delete();
			Thread.sleep(2000);
			tofill(s.ExpiryDate, "12/09/2022");
			totabkey();
			Thread.sleep(1000);
			tofill(s.Referencetxtbox, "Sales");
			Thread.sleep(1000);
			actionssendkeysdelete(s.CurrencyDD);
			tofill(s.CurrencyDD, "SGD - Singapore Dollar");
			toenter();
			tofill(s.Amountsare, "Tax Exclusive");
			toenter();
			tofill(s.ThemeDD, "Letter Head Template");
			toenter();
			Thread.sleep(4000);
			clickjavascript(s.Items1);
			Thread.sleep(2000);
			tofill(s.Items1text, "Item - with account");
			toenter();
			Thread.sleep(3000);
			ScrolldownElement(s.DeliveryInstructions);
			tofill(s.DeliveryInstructions, "Testdeliveryinstruction");
			ScrolldownElement(s.ApproveBtn);
			toClick(s.ApproveBtn);
			Thread.sleep(3000);
			toenter();
			Thread.sleep(1000);
			Explicitwaitvisibility(s.SendBtn);
			toClick(s.SendBtn);
			Thread.sleep(4000);
			try {
				Explicitwaitvisibility(s.Okbtnn);
				clickjavascript(s.Okbtnn);
			} finally {
				System.out.println("Popup not visible");
			}

			Thread.sleep(1000);
			Explicitwaitvisibility(s.Mailto);
			tofill(s.Mailto, "testemailquotation@mailinator.com");
			Thread.sleep(1000);
			toClick(s.Sendmeacopychkbox);
			ScrolldownElement(s.Sendmailbtn);
			clickjavascript(s.Sendmailbtn);


		}


		Thread.sleep(4000);
		Explicitwaitvisibility(s.QuotationScreen);
		clickjavascript(s.QuotationScreen);





	}

	@And("User need to Save a Quotation")
	public void user_need_to_save_a_quotation() throws InterruptedException, AWTException {
		s=new Sales_Quotation_POJO();
		torefresh();
		Thread.sleep(4000);
		Explicitwait(s.NewQuotationbtn);
		toClick(s.NewQuotationbtn);
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);

			Explicitwait(s.Customerselect);
			clickjavascript(s.Customerselect);
			Thread.sleep(1000);
			tofill(s.Customerselect, "fflt-141");
			Explicitwaitvisibility(s.Option1select);
			clickjavascript(s.Option1select);
			Thread.sleep(1000);
			totabkey();
			Delete();
			tofill(s.QuotationDate, "06/09/2022");
			Thread.sleep(1000);
			totabkey();
			Delete();
			Thread.sleep(2000);
			tofill(s.ExpiryDate, "12/09/2022");
			totabkey();
			Thread.sleep(1000);
			tofill(s.Referencetxtbox, "Sales");
			Thread.sleep(1000);
			actionssendkeysdelete(s.CurrencyDD);
			tofill(s.CurrencyDD, "SGD - Singapore Dollar");
			toenter();
			tofill(s.Amountsare, "Tax Exclusive");
			toenter();
			tofill(s.ThemeDD, "Letter Head Template");
			toenter();
			Thread.sleep(4000);
			clickjavascript(s.Items1);
			Thread.sleep(2000);
			tofill(s.Items1text, "Item - with account");
			toenter();
			Thread.sleep(3000);
			ScrolldownElement(s.DeliveryInstructions);
			tofill(s.DeliveryInstructions, "Testdeliveryinstruction");
			ScrolldownElement(s.ApproveBtn);
			toClick(s.SaveBtn);
			Thread.sleep(4000);
			toenter();
			Thread.sleep(1000);
			Explicitwaitvisibility(s.Searchboxtxt);
			Thread.sleep(1000);
			tofill(s.Searchboxtxt, "Sales");
			Thread.sleep(1000);
			toClick(s.Searchbtn);
			Thread.sleep(1000);
			clickjavascript(s.Checkallbox);
			clickjavascript(s.Clearbtn);	

			Thread.sleep(2000);
			driver.quit();
		}
	}
}


