package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class Currencies_POJO extends Reusableclass
{
	public Currencies_POJO() {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//a[contains(.,'more_horiz Organization')]")
	public WebElement Organizationslide;
	
	@FindBy(xpath = "//a[@href='/organization/currencies']")
	public WebElement Currenciesslide;
	
	@FindBy(xpath = "(//button[contains(@type,'button')])[6]")
	public WebElement AddCurrencies;
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[5]")
	public WebElement CurrenciesDD;
	
	@FindBy(xpath = "(//button[@type='button'][contains(.,'Add Currency')])[2]")
	public WebElement Addcurrenciesbtn;
	
	@FindBy(xpath = "//input[contains(@id,'search-box')]")
	public WebElement Searchboxbtn;
	
	@FindBy(xpath = "(//i[@class='fa fa-pencil t-link edit'])[1]")
	public WebElement Editicon;
	
	@FindBy(xpath = "//input[@name='ds']")
	public WebElement Startdate;
	
	@FindBy(xpath = "//input[@name='de']")
	public WebElement Enddate;
	
	@FindBy(xpath = "//button[contains(.,'Save')]")
	public WebElement Savebtn;
	
	@FindBy(xpath = "(//span[@class='ng-option-label'])[1]")
	public WebElement MouseclickDDCurrencies;
	
	
	
	
	
	
	
	
}