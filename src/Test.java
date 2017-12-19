
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
public class Test {
	WebDriver browsers;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nuru\\Desktop\\Selenium\\Browsers\\chromedriver_win32\\chromedriver.exe");
		browsers = new ChromeDriver();
	}
	@org.testng.annotations.Test
	public void register(){
		browsers.get("http://www.newtours.demoaut.com/");
		browsers.findElement(By.linkText("REGISTER")).click();
		browsers.findElement(By.name("firstName")).sendKeys("nuru");
		browsers.findElement(By.name("lastName")).sendKeys("zaman");
		browsers.findElement(By.name("phone")).sendKeys("0000000000");
		browsers.findElement(By.name("userName")).sendKeys("dhakabangla@gmail.com");
		browsers.findElement(By.name("address1")).sendKeys("dhaka Way");
		browsers.findElement(By.name("city")).sendKeys("Rangpur");
		browsers.findElement(By.name("state")).sendKeys("Dinajpur");
		browsers.findElement(By.name("postalCode")).sendKeys("54044");
		
		Select drop = new Select(browsers.findElement(By.name("country")));
	    drop.selectByVisibleText("BANGLADESH");	    
	    browsers.findElement(By.name("email")).sendKeys("nuru");
		browsers.findElement(By.name("password")).sendKeys("123456");
		browsers.findElement(By.name("confirmPassword")).sendKeys("123456");
		browsers.findElement(By.name("register")).click();
		browsers.findElement(By.linkText("SIGN-OFF")).click();
		browsers.findElement(By.name("userName")).sendKeys("nuru");
		browsers.findElement(By.name("password")).sendKeys("123456");
		browsers.findElement(By.name("login")).click();
		browsers.findElement(By.xpath("//input[@name='tripType' and @value='oneway']")).click();
		drop = new Select(browsers.findElement(By.name("passCount")));
		drop.selectByVisibleText("2");
		drop = new Select(browsers.findElement(By.name("fromPort")));
		drop.selectByVisibleText("New York");
		drop = new Select(browsers.findElement(By.name("fromMonth")));
		drop.selectByVisibleText("March");
		drop = new Select(browsers.findElement(By.name("fromDay")));
		drop.selectByVisibleText("31");
		drop = new Select(browsers.findElement(By.name("toPort")));
		drop.selectByVisibleText("Frankfurt");
		drop = new Select(browsers.findElement(By.name("toMonth")));
		drop.selectByVisibleText("February");
		drop = new Select(browsers.findElement(By.name("toDay")));
		drop.selectByVisibleText("25");
		browsers.findElement(By.xpath("//input[@name='servClass' and @value='Business']")).click();
		drop = new Select(browsers.findElement(By.name("airline")));
		drop.selectByVisibleText("Blue Skies Airlines");
		browsers.findElement(By.name("findFlights")).click();
		browsers.findElement(By.xpath("//input[@name='outFlight' and @value='Blue Skies Airlines$361$271$7:10']")).click();
		browsers.findElement(By.xpath("//input[@name='inFlight' and @value='Blue Skies Airlines$631$273$14:30']")).click();
		browsers.findElement(By.name("reserveFlights")).click();
		browsers.findElement(By.name("passFirst0")).sendKeys("Nuru");
		browsers.findElement(By.name("passLast0")).sendKeys("Zaman");
		drop = new Select(browsers.findElement(By.name("pass.0.meal")));
		drop.selectByVisibleText("Muslim");
		browsers.findElement(By.name("passFirst1")).sendKeys("Saiful");
		browsers.findElement(By.name("passLast1")).sendKeys("Rumy");		
		drop = new Select(browsers.findElement(By.name("pass.1.meal")));
		drop.selectByVisibleText("Vegetarian");
		drop = new Select(browsers.findElement(By.name("creditCard")));
		drop.selectByVisibleText("Visa");
		browsers.findElement(By.name("creditnumber")).sendKeys("77789677566");
		drop = new Select(browsers.findElement(By.name("cc_exp_dt_mn")));
		drop.selectByVisibleText("12");
		drop = new Select(browsers.findElement(By.name("cc_exp_dt_yr")));
		drop.selectByVisibleText("2010");
		browsers.findElement(By.name("cc_frst_name")).sendKeys("Nuru");
		browsers.findElement(By.name("cc_mid_name")).sendKeys("M");
		browsers.findElement(By.name("cc_last_name")).sendKeys("Zaman");
        browsers.findElement(By.name("ticketLess")).click();
        browsers.findElement(By.name("billAddress1")).clear();
        browsers.findElement(By.name("billAddress1")).sendKeys("dhaka Way");
        browsers.findElement(By.name("billCity")).clear();
		browsers.findElement(By.name("billCity")).sendKeys("Rangpur");
	    browsers.findElement(By.name("billState")).clear();
		browsers.findElement(By.name("billState")).sendKeys("Dinajpur");
		browsers.findElement(By.name("billZip")).clear();
		browsers.findElement(By.name("billZip")).sendKeys("54044");  		
	    drop =new Select(browsers.findElement(By.name("billCountry")));
	    drop.selectByVisibleText("BANGLADESH");
	    browsers.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")).click();
	    browsers.findElement(By.name("buyFlights")).click();
	    browsers.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[4]/a")).click();
	    //Back to Home
	    browsers.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[2]/a/img")).click();
	    //log out
	   // browsers.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img"));
	    //browsers.get("http://newtours.demoaut.com/mercurypurchase2.php");
	    //checkout
	    //checkin
	    //check ==
	}
}