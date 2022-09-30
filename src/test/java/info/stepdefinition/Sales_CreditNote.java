package info.stepdefinition;


import java.awt.AWTException;

import info.base.Reusableclass;
import info.pojo.Sales_CreditNote_POJO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Sales_CreditNote extends Reusableclass {
	public static Sales_CreditNote_POJO c;

	@Given("User need to navigate to Credit Note slide")
	public void user_need_to_navigate_to_credit_note_slide() {
		c=new Sales_CreditNote_POJO();
		clickjavascript(c.Salesslide);
		clickjavascript(c.CreditNoteslide);


	}

	@Then("User need to Approve a Credit Note")
	public void user_need_to_approve_a_credit_note() throws InterruptedException, AWTException {
		c=new Sales_CreditNote_POJO();
		Explicitwaitvisibility(c.NewcreditNotesbtn);
		clickjavascript(c.NewcreditNotesbtn);
		Explicitwaitvisibility(c.ChooseContactDD);
		tofill(c.ChooseContactDD, "fflt-110");
		Explicitwaitvisibility(c.Option1select);
		clickjavascript(c.Option1select);
		Thread.sleep(1000);
		totabkey();
		Delete();
		tofill(c.Date, "06/09/2022");
		Thread.sleep(2000);
		tofill(c.ReferenceName, "Sales");
		Thread.sleep(1000);
		actionssendkeysdelete(c.CurrencyDD);
		tofill(c.CurrencyDD, "SGD - Singapore Dollar");
		toenter();
		Thread.sleep(1000);
		tofill(c.Amountsare, "Tax Exclusive");
		toenter();
		Thread.sleep(1000);
		tofill(c.ThemeDD, "Letter Head Template");
		toenter();
		Thread.sleep(3000);
		clickjavascript(c.items1table);
		Thread.sleep(1000);
		tofill(c.items1tabletxt, "Item - with account");
		toenter();
		Thread.sleep(3000);
		ScrolldownElement(c.ApproveBtn);
		toClick(c.ApproveBtn);
		Thread.sleep(5000);
		toenter();
		Thread.sleep(1000);
		Explicitwaitvisibility(c.SendBtn);
		toClick(c.SendBtn);
		Thread.sleep(1000);
		Explicitwaitvisibility(c.Mailto);
		Thread.sleep(1000);
		tofill(c.Mailto, "testemailquotation@mailinator.com");
		Thread.sleep(1000);
		toClick(c.Sendmeacopychkbox);
		ScrolldownElement(c.Sendmailbtn);
		clickjavascript(c.Sendmailbtn);
		

	}

	@Then("User need to Save a Credit Note")
	public void user_need_to_save_a_credit_note() throws AWTException, InterruptedException {
		c=new Sales_CreditNote_POJO();
		ScrollupElement(c.CreditNoteScreen);
		Explicitwaitvisibility(c.CreditNoteScreen);
		clickjavascript(c.CreditNoteScreen);
		Explicitwaitvisibility(c.NewcreditNotesbtn);
		clickjavascript(c.NewcreditNotesbtn);
		Explicitwaitvisibility(c.ChooseContactDD);
		tofill(c.ChooseContactDD, "fflt-110");
		Explicitwaitvisibility(c.Option1select);
		clickjavascript(c.Option1select);
		Thread.sleep(1000);
		totabkey();
		Delete();
		tofill(c.Date, "06/09/2022");
		Thread.sleep(2000);
		tofill(c.ReferenceName, "Creditnotetest");
		Thread.sleep(1000);
		actionssendkeysdelete(c.CurrencyDD);
		tofill(c.CurrencyDD, "SGD - Singapore Dollar");
		toenter();
		Thread.sleep(1000);
		tofill(c.Amountsare, "Tax Exclusive");
		toenter();
		Thread.sleep(1000);
		tofill(c.ThemeDD, "Letter Head Template");
		toenter();
		Thread.sleep(3000);
		clickjavascript(c.items1table);
		Thread.sleep(1000);
		tofill(c.items1tabletxt, "Item - with account");
		toenter();
		Thread.sleep(3000);
		ScrolldownElement(c.SaveBtn);
		toClick(c.SaveBtn);
		Thread.sleep(5000);
		toenter();
		Thread.sleep(5000);
		Explicitwaitvisibility(c.Searchboxtxt);
		tofill(c.Searchboxtxt, "Creditnotetest");
		clickjavascript(c.Searchbtn);
		Thread.sleep(5000);
		clickjavascript(c.Clearbtn);
		Thread.sleep(2000);
		driver.quit();
	}



}
