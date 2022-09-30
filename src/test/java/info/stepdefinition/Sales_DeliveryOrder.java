package info.stepdefinition;

import java.awt.AWTException;

import info.base.Reusableclass;

import info.pojo.Sales_DeliveryOrder_POJO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Sales_DeliveryOrder extends Reusableclass{
	public static Sales_DeliveryOrder_POJO s;

	@Given("User need to navigate to Delivery order scenario")
	public void user_need_to_navigate_to_delivery_order_scenario() {
		s=new Sales_DeliveryOrder_POJO();
		clickjavascript(s.Salesslide);
		clickjavascript(s.Deliveryorderslide);
	}

	@Then("User need to Approve a Delivery order")
	public void user_need_to_approve_a_delivery_order() throws AWTException, InterruptedException {
		s=new Sales_DeliveryOrder_POJO();
		Explicitwaitvisibility(s.DeliveryOrderbtn);
		clickjavascript(s.DeliveryOrderbtn);
		Explicitwaitvisibility(s.ChooseContactDD);
		tofill(s.ChooseContactDD, "fflt-110");
		Explicitwaitvisibility(s.Option1select);
		clickjavascript(s.Option1select);
		Thread.sleep(1000);
		totabkey();
		Delete();
		tofill(s.Deliverynumbertxt, "313131331");
		Thread.sleep(1000);
		totabkey();
		Delete();
		tofill(s.Date, "06/09/2022");
		Thread.sleep(2000);
		tofill(s.ReferenceName, "Sales");
		Thread.sleep(1000);
		actionssendkeysdelete(s.CurrencyDD);
		tofill(s.CurrencyDD, "Letter Head Template");
		Thread.sleep(3000);
		clickjavascript(s.items1table);
		Thread.sleep(1000);
		tofill(s.items1tabletxt, "SM I1");
		toenter();
		Thread.sleep(3000);
		ScrolldownElement(s.ApproveBtn);
		toClick(s.ApproveBtn);
		Thread.sleep(5000);
		toenter();
		Thread.sleep(1000);
		Explicitwaitvisibility(s.SendBtn);
		clickjavascript(s.SendBtn);
		Thread.sleep(1000);
		Explicitwaitvisibility(s.Mailto);
		Thread.sleep(1000);
		tofill(s.Mailto, "testemailquotation@mailinator.com");
		Thread.sleep(1000);
		toClick(s.Sendmeacopychkbox);
		ScrolldownElement(s.Sendmailbtn);
		clickjavascript(s.Sendmailbtn);
		Thread.sleep(5000);
	}

	@And("User need to Save a Delivery order")
	public void user_need_to_save_a_delivery_order() throws InterruptedException, AWTException {
		s=new Sales_DeliveryOrder_POJO();

		ScrollupElement(s.DeliveryOrderScreen);
		Explicitwaitvisibility(s.DeliveryOrderScreen);
		clickjavascript(s.DeliveryOrderScreen);
		Explicitwaitvisibility(s.DeliveryOrderbtn);
		clickjavascript(s.DeliveryOrderbtn);
		Explicitwaitvisibility(s.ChooseContactDD);
		tofill(s.ChooseContactDD, "fflt-110");
		Explicitwaitvisibility(s.Option1select);
		clickjavascript(s.Option1select);
		Thread.sleep(1000);
		totabkey();
		Delete();
		tofill(s.Deliverynumbertxt, "4534232233");
		Thread.sleep(1000);
		totabkey();
		Delete();
		tofill(s.Date, "06/09/2022");
		Thread.sleep(2000);
		tofill(s.ReferenceName, "Sales");
		Thread.sleep(1000);
		actionssendkeysdelete(s.CurrencyDD);
		tofill(s.CurrencyDD, "Letter Head Template");
		Thread.sleep(3000);
		clickjavascript(s.items1table);
		Thread.sleep(1000);
		tofill(s.items1tabletxt, "SM I1");
		toenter();
		Thread.sleep(3000);
		ScrolldownElement(s.SaveBtn);
		toClick(s.SaveBtn);
		Thread.sleep(5000);
		toenter();
		Thread.sleep(5000);
		Explicitwaitvisibility(s.Searchboxtxt);
		clickjavascript(s.Searchboxtxt);
		Explicitwaitvisibility(s.Searchbtn);
		clickjavascript(s.Searchbtn);
		
		driver.quit();

	}
















}
