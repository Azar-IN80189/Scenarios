package info.stepdefinition;



import java.awt.AWTException;

import info.base.Reusableclass;
import info.pojo.Sales_Invoice_POJO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Sales_Invoice extends Reusableclass {

	public static Sales_Invoice_POJO i;

	@Given("User need to navigate to Invoice slide")
	public void user_need_to_navigate_to_invoice_slide() {
		i=new Sales_Invoice_POJO();
		clickjavascript(i.Salesslide);
		clickjavascript(i.Invoiceslide);

	}

	@Then("User need to Approve a Invoice")
	public void user_need_to_approve_a_invoice() throws AWTException, InterruptedException {
		i=new Sales_Invoice_POJO();
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);

			Explicitwaitvisibility(i.Newinvoicebtn);
			clickjavascript(i.Newinvoicebtn);
			Explicitwaitvisibility(i.ChoosecustomerDD);
			tofill(i.ChoosecustomerDD, "Test_28");
			Explicitwaitvisibility(i.Option1select);
			clickjavascript(i.Option1select);
			Thread.sleep(1000);
			totabkey();
			Delete();
			tofill(i.InvoiceDate, "14/09/2022");
			Thread.sleep(1000);
			totabkey();
			Delete();
			Thread.sleep(2000);
			tofill(i.DueDate, "19/09/2022");
			totabkey();
			Thread.sleep(1000);
			tofill(i.InvoiceNo, "KJI-9099");
			tofill(i.ReferenceDateInvoice, "Sales");
			Thread.sleep(1000);
			actionssendkeysdelete(i.CurrencyInvoiceDD);
			Thread.sleep(2000);
			tofill(i.CurrencyInvoiceDD, "SGD - Singapore Dollar");
			toenter();
			Thread.sleep(1000);
			actionssendkeysdelete(i.AmountsareDD);
			Thread.sleep(2000);
			tofill(i.AmountsareDD, "Tax Exclusive");
			Thread.sleep(1000);
			toenter();
			tofill(i.ThemeDD, "Letter Head Template");
			toenter();
			Thread.sleep(3000);
			clickjavascript(i.items1table);
			Thread.sleep(1000);
			tofill(i.items1tabletxt, "Item - with account");
			toenter();
			Thread.sleep(3000);
			ScrolldownElement(i.DeliveryInstructionstxt);
			tofill(i.DeliveryInstructionstxt, "Testdeliveryinstruction");
			ScrolldownElement(i.ApproveBtn);
			toClick(i.ApproveBtn);
			Thread.sleep(5000);
			toenter();
			Thread.sleep(5000);
			Explicitwaitvisibility(i.SendBtn);
			clickjavascript(i.SendBtn);
			Thread.sleep(1000);
			Explicitwaitvisibility(i.Mailto);
			Thread.sleep(1000);
			tofill(i.Mailto, "testemailquotation@mailinator.com");
			Thread.sleep(2000);
			ScrolldownElement(i.Sendmeacopychkbox);
			toClick(i.Sendmeacopychkbox);
			ScrolldownElement(i.Sendmailbtn);
			clickjavascript(i.Sendmailbtn);
			Thread.sleep(4000);
		}}

	@And("User need to Save a Invoice")
	public void user_need_to_save_a_invoice() throws InterruptedException, AWTException {
		i=new Sales_Invoice_POJO();
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
			Explicitwaitvisibility(i.Invoiceoption);
			clickjavascript(i.Invoiceoption);
			Explicitwaitvisibility(i.Newinvoicebtn);
			clickjavascript(i.Newinvoicebtn);
			Explicitwaitvisibility(i.ChoosecustomerDD);
			tofill(i.ChoosecustomerDD, "Test_28");
			Explicitwaitvisibility(i.Option1select);
			clickjavascript(i.Option1select);
			Thread.sleep(1000);
			totabkey();
			Delete();
			tofill(i.InvoiceDate, "14/09/2022");
			Thread.sleep(1000);
			totabkey();
			Delete();
			Thread.sleep(2000);
			tofill(i.DueDate, "19/09/2022");
			totabkey();
			Thread.sleep(1000);
			tofill(i.InvoiceNo, "INYY-1223");
			tofill(i.ReferenceDateInvoice, "Sales");
			Thread.sleep(1000);
			actionssendkeysdelete(i.CurrencyInvoiceDD);
			Thread.sleep(2000);
			tofill(i.CurrencyInvoiceDD, "SGD - Singapore Dollar");
			toenter();
			Thread.sleep(1000);
			actionssendkeysdelete(i.AmountsareDD);
			Thread.sleep(2000);
			tofill(i.AmountsareDD, "Tax Exclusive");
			Thread.sleep(1000);
			toenter();
			tofill(i.ThemeDD, "Letter Head Template");
			toenter();
			Thread.sleep(3000);
			clickjavascript(i.items1table);
			Thread.sleep(1000);
			tofill(i.items1tabletxt, "Item - with account");
			toenter();
			Thread.sleep(3000);
			ScrolldownElement(i.DeliveryInstructionstxt);
			tofill(i.DeliveryInstructionstxt, "Testdeliveryinstruction");
			ScrolldownElement(i.ApproveBtn);
			toClick(i.SaveBtn);
			Thread.sleep(5000);
			toenter();
			Thread.sleep(5000);
			Explicitwaitvisibility(i.Searchboxtxt);
			tofill(i.Searchboxtxt, "INLY-31523");
			clickjavascript(i.Searchbtn);
			Thread.sleep(5000);
			clickjavascript(i.Clearbtn);
			driver.quit();
		}


	}
}
