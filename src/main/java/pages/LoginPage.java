package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver; 
	 public LoginPage(WebDriver driver) {
	  this.driver = driver;
	 }
	 // Element Library
	 @FindBy(how = How.XPATH, using = "//input[@id='username']")
	 WebElement UserName;
	 @FindBy(how = How.XPATH, using = "//input[@id='password']")
	 WebElement Password;
	 @FindBy(how = How.XPATH, using = "//button[@name='login']")
	 WebElement SignInButton;
	 
	 @FindBy(how=How.LINK_TEXT, using ="Dashboard")
	 WebElement DashBoard;
	 @FindBy(how=How.LINK_TEXT,  using = "Bank & Cash")
	 WebElement BankCash;
	 @FindBy(how=How.LINK_TEXT,  using = "New Account")
	 WebElement NewAccount;
		
	 @FindBy(how = How.XPATH, using = "//*[@id=\'account\']")
	 WebElement accountTitle;
	 @FindBy(how = How.XPATH, using = "//*[@id=\'description\']")
	 WebElement description;
	 @FindBy(how = How.XPATH, using = "//*[@id=\'balance\']")
	 WebElement initialBalance;
	 @FindBy(how = How.XPATH, using = "//*[@id=\'account_number\']")
	 WebElement accountNumber;
	 @FindBy(how = How.XPATH, using = "//*[@id=\'contact_person\']")
	 WebElement contactPserson;
	 @FindBy(how = How.XPATH, using = "//*[@id=\'contact_phone\']")
	 WebElement phone;
	 @FindBy(how = How.XPATH, using = "//*[@id=\'ib_url\']")
	 WebElement internetBankingURL;
	 
	 
	 
	 
	 // Methods to interact with the elements
	 public void enterUserName(String userName) {
	  UserName.sendKeys(userName);
	 }
	 public void enterPassword(String password) {
	  Password.sendKeys(password);
	 }
	 public void clickSignInButton() {
	  SignInButton.click();
	 }
	 public String getPageTitle() {
	  return driver.getTitle();
	 }

	 
}
