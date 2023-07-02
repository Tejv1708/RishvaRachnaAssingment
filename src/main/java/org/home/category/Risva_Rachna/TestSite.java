package org.home.category.Risva_Rachna;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestSite {

	WebDriver driver;

	public TestSite(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement SearchItem ;
	
	
	@FindBy(id = "nav-search-submit-button")
	private WebElement  SearchButton ;

	@FindBy( xpath = "//span[text() = \"Titan\"][@class= \"a-size-base a-color-base\"][1]" )
	private WebElement BrandName ;
	
	@FindBy(xpath = "//span[@class =\"a-size-base a-color-base\" and text() = \"25% Off or more\"]")
	private WebElement percentOff ;
	
	@FindBy(xpath = "//span[@class=\"a-size-base a-color-base\" and text() = \"Analogue\"]")
	private WebElement display ;
	
	@FindBy(xpath = "//span[@class = \"a-size-base a-color-base\" and text() = \"Leather\"]")
	private WebElement watchMaterial ;
	

	
	public void writeItemName() {
		SearchItem.sendKeys("Wrist Watches");
	}
	
	public void clickSearchButton() {
		SearchButton.click();
	}
	
	public void clickBrandName () {
		BrandName.click();
	}
	
	public void clickPercentOff() {
		percentOff.click();
	}
	
	public void clickDisplay() {
		display.click();
	}
	
	public void clickWatchMaterial(){
		watchMaterial.click();
	}
	
	public void clickSelectItem() {
		ArrayList <WebElement> list = new ArrayList<>( driver.findElements(By.xpath("//span[@class=\"a-size-base-plus a-color-base a-text-normal\"]")));
		list.get(4).click();
	}
	
}
