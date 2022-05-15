package dinesh;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookingBus {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().arch32().setup();
	
	WebDriver redbus=new ChromeDriver();
	redbus.get("https:\\www.redbus.in");
	redbus.manage().window().maximize();
	WebElement book=redbus.findElement(By.id("src"));
	book.sendKeys("Pune");
	book.click();
	WebElement book1=redbus.findElement(By.id("dest"));
	book1.sendKeys("Goa");
	book1.click();
	WebElement book3=redbus.findElement(By.id("onward_cal"));
	book3.click();
	
	WebElement date=redbus.findElement
			(By.cssSelector("#rb-calendar_onward_cal > table > tbody > tr:nth-child(5) > td:nth-child(1)"));
	date.click();
	
	WebElement book5=redbus.findElement(By.cssSelector("#search > div > div.fl.search-box.clearfix > div > ul > li.selected"));
	book5.click();
	WebElement book6=redbus.findElement(By.cssSelector("#search > div > div:nth-child(3) > div > ul > li.selected"));
	book6.click();
	Thread.sleep(2000);
	WebElement search=redbus.findElement(By.cssSelector("#search_btn"));
	search.click();
	redbus.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement radio=redbus.findElement(By.cssSelector("#filter-block > div > div.details > ul.dept-time.dt-time-filter > li:nth-child(4)"));
	radio.click();
	
	//redbus.close();
	//Select bookbus=new Select(book3);
	
	
	
	

	}

}
