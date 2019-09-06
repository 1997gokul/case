package CaseMaven.casestudy;

import org.testng.AssertJUnit;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class execution {
	
	WebDriver driver ;
	@Given("Alex has entered into the signup page")
	public void alex_has_entered_into_the_signup_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\New folder\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
		  driver.manage().window().maximize();
		  driver.findElement(By.partialLinkText("SignUp")).click();
	}

	@Given("Alex given the username {string}")
	public void alex_given_the_username(String username) {
		driver.findElement(By.id("userName")).sendKeys(username);
	}

	@Given("Alex given the firstname {string}")
	public void alex_given_the_firstname(String firstname) {
	   driver.findElement(By.id("firstName")).sendKeys(firstname);
	}

	@Given("Alex given the lastname {string}")
	public void alex_given_the_lastname(String lname) {
		driver.findElement(By.id("lastName")).sendKeys(lname);
	}

	@Given("Alex given the pass {string}")
	public void alex_given_the_pass(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}

	@Given("Alex given the cpass {string}")
	public void alex_given_the_cpass(String cpas) {
		driver.findElement(By.id("pass_confirmation")).sendKeys(cpas);
	}

	@Given("Alex given the gender {string}")
	public void alex_given_the_gender(String gender) {
		driver.findElement(By.xpath("//input[@value='Male']")).click();
	}

	@Given("Alex given the email {string}")
	public void alex_given_the_email(String email) {
		driver.findElement(By.id("emailAddress")).sendKeys(email);
	}

	@Given("Alex given the mobile {string}")
	public void alex_given_the_mobile(String mnum) {
		driver.findElement(By.id("mobileNumber")).sendKeys(mnum);
	}

	@Given("Alex given the dob {string}")
	public void alex_given_the_dob(String dob) {
		/*driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[9]/div/div/img")).click();
		WebElement yr = driver.findElement(By.cssSelector("#ui-datepicker-div > div > div > select.ui-datepicker-year"));
		Select year = new Select(yr);
		year.selectByValue("1997");
		WebElement month=driver.findElement(By.cssSelector("#ui-datepicker-div > div > div > select.ui-datepicker-month"));
		Select s=new Select(month);
		s.selectByIndex(5);
		WebElement cal=driver.findElement(By.className("ui-datepicker-calendar"));
        cal.findElement(By.linkText("20")).click();*/
		driver.findElement(By.id("dob")).sendKeys(dob);
		
	}

	@Given("Alex given the address {string}")
	public void alex_given_the_address(String addr) {
		driver.findElement(By.id("address")).sendKeys(addr);
	}

	@Given("Alex given the squestion {string}")
	public void alex_given_the_squestion(String string) {
		WebElement search=driver.findElement(By.id("securityQuestion"));
		Select se=new Select(search);
		se.selectByVisibleText("What is your favour color?");
	}

	@Given("Alex given the answer {string}")
	public void alex_given_the_answer(String ans) {
		driver.findElement(By.id("answer")).sendKeys(ans);
		
	}

	@Given("clicked Register")
	public void clicked_Register() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
		driver.close();
	}

	/*@Given("Alex login using username and password")
	public void alex_login_using_username_and_password() {
	    driver.findElement(By.id("userName"))
	}

	@When("Alex search for headphones")
	public void alex_search_for_headphones() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("buys the selected product")
	public void buys_the_selected_product() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}*/
	
	@Given("the signup page")
	public void the_signup_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\New folder\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
		  driver.manage().window().maximize();
		  driver.findElement(By.partialLinkText("SignIn")).click();
	}
	
	@Given("the username {string}")
	public void the_username_lalitha(String sname) {
	   driver.findElement(By.id("userName")).sendKeys(sname);
	}

	@Given("the password {string}")
	public void the_password_password(String pass) {
	    driver.findElement(By.id("password")).sendKeys(pass);
	}

	@Then("click on login")
	public void click_on_login() {
	    driver.findElement(By.name("Login")).click();
	}
	
	@Then("click on searchbar and type")
	public void click_on_searchbar_and_type() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.findElement(By.id("myInput")).sendKeys("Headphone");
		//WebElement a = driver.findElement(By.xpath("//*[@id=\"myInput\"]"));
		//Actions A = new Actions(driver);
		//A.keyDown(a,Keys.SHIFT).perform();
		//A.sendKeys("H").pause(1000).sendKeys("e").pause(1000).sendKeys("a").pause(1000).sendKeys("d").pause(1000).build().perform();
		//A.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Head')]"))).click().perform();
		driver.findElement(By.cssSelector("input[value='FIND DETAILS'	]")).click();
	}
	
	@Then("click add to cart and select cart")
	public void click_add_to_cart_and_select_cart() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	    
	}

	@Then("move to payement")
	public void move_to_payement() {
		driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	    driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	    driver.close();
	}
	@Then("reduce the quantity to zero")
	public void reduce_the_quantity_to_zero() throws InterruptedException {
		//driver.findElement(By.cssSelector("#quantity_1")).clear();
		//Thread.sleep(3000);
	   //driver.findElement(By.cssSelector("#quantity_1")).sendKeys("0");
		driver.findElement(By.xpath("//*[@id=\"cart\"]/tbody/tr/td[5]/form/input[2]")).click();
	}

	@Then("check for error message")
	public void check_for_error_message() {
		 //Assert.assertNotEquals("success", "http://10.232.237.143:443/TestMeApp/removeCartItem.htm?prodId=1", driver.getCurrentUrl());
		 Assert.assertEquals(driver.getCurrentUrl(), "http://10.232.237.143:443/TestMeApp/removeCartItem.htm?prodId=1");  
		 driver.close();
	}





}
