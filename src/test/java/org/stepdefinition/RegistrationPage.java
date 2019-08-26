package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationPage {
	
	WebDriver driver;
	
	@Given("User Enter the {string},{string},{string},{string},{string} and Select the Gender and Hobbies")
	public void user_Enter_the_and_Select_the_Gender_and_Hobbies(String fname, String lname, String add, String email, String phone) {
	    
		System.setProperty("webdriver.chrome.driver","C:\\Temn\\Jay\\Cucumber1\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.sendKeys(fname);
		
		WebElement lastName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastName.sendKeys(lname);
		
		WebElement address=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		address.sendKeys(add);
		
		WebElement mail=driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		mail.sendKeys(email);
		
		WebElement phoneno=driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		phoneno.sendKeys(phone);
	}

	@When("User Enter the {string},{string}")
	public void user_Enter_the(String pass, String cpass) throws Exception {
		
		WebElement gen=driver.findElement(By.xpath("(//input[@ng-model='radiovalue'])[2]"));
		gen.click();
		
		WebElement hobbie=driver.findElement(By.xpath("//input[@id='checkbox2']"));
		hobbie.click();
		
		WebElement lan=driver.findElement(By.xpath("//div[@id='msdd']"));
		lan.click();
		Thread.sleep(5000);
		WebElement eng=driver.findElement(By.xpath("//a[text()='English']"));
		eng.click();
		
		
		WebElement skill1=driver.findElement(By.xpath("//label[text()='Skills']"));
		skill1.click();
		WebElement skill=driver.findElement(By.xpath("//select[@id='Skills']"));
		Select s=new Select(skill);
		s.selectByVisibleText("Engineering");
		
		WebElement country1=driver.findElement(By.xpath("//label[text()='Country*']"));
		country1.click();
		WebElement country=driver.findElement(By.xpath("//select[@id='countries']"));
		Select s1=new Select(country);
		s1.selectByVisibleText("India");
		country1.click();
		WebElement scountry=driver.findElement(By.xpath("//select[@id='countries']"));
		Select s7=new Select(scountry);
		s7.selectByVisibleText("India");
		
		WebElement dyear=driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select s2=new Select(dyear);
		s2.selectByVisibleText("1993");
		
		WebElement dmonth=driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
		Select s3=new Select(dmonth);
		s3.selectByVisibleText("April");
		
		WebElement ddate=driver.findElement(By.xpath("//select[@ng-model='daybox']"));
		Select s4=new Select(ddate);
		s4.selectByVisibleText("25");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='firstpassword']"));
		password.sendKeys(pass);
		
		WebElement confirmpassword=driver.findElement(By.xpath("//input[@id='secondpassword']"));
		confirmpassword.sendKeys(cpass);
		
		
	}

	@Then("click on the Summit button and check WebTable is in the url")
	public void click_on_the_Summit_button_and_check_WebTable_is_in_the_url() {
		
		WebElement sum=driver.findElement(By.xpath("//button[@id='submitbtn']"));
		sum.click();
		
		String url=driver.getCurrentUrl();
		boolean b=url.contains("automationtesting");
		Assert.assertTrue(b);
	   
	}

}
