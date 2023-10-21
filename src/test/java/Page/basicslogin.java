package Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class basicslogin 
{
WebDriver driver;
@FindBy(xpath = "/html/body/main/div/section/div/form[1]/div[1]/input")
WebElement emailfield;

@FindBy(xpath = "//*[@id=\"customer[password]\"]")
WebElement passwordfield;

@FindBy(xpath = "//*[@id=\"customer_login\"]/button")
WebElement logininbutton;

@FindBy(xpath = "//*[@id=\"shopify-section-header\"]/section/header/div/div/div[2]/div[1]/div[1]/div[1]/input")
WebElement searchbar;

@FindBy(xpath = "/html/body/main/div/div[2]/div[6]/div[2]/div[4]/div[1]/div/div[2]/a")
WebElement shirtchoose;

@FindBy(xpath = "//*[@id=\"product_form_template--14908011249745__main7046928367697\"]/div[11]/div[1]/div/div[5]/label")
WebElement sizechoose;

@FindBy(xpath = "//*[@id=\"product_form_template--14908011249745__main7046928367697\"]/div[15]/button")
WebElement addtocart;

@FindBy(xpath = "//*[@id=\"mini-cart\"]/div/div[3]/div[2]/div/button")
WebElement checkingout;

@FindBy(xpath = "/html/body/div[2]/div/div/main/div[1]/form/div[2]/a")
WebElement returntocart;

public basicslogin(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements( driver,this);
	
}

public void setvalues(String EM,String PWD)
{
	emailfield.sendKeys(EM);
	passwordfield.sendKeys(PWD);
}

public void clicksignin()
{
	logininbutton.click();
}

public void searching(String tosearch)
{
	searchbar.sendKeys(tosearch,Keys.ENTER);
}

public void shirtclick()
{
	shirtchoose.click();
}

public void sizeandcart()
{
	sizechoose.click();
	addtocart.click();
}

public void tocheckout()
{
	checkingout.click();
}

public void toreturncart() 
{
	returntocart.click();
}


















}
