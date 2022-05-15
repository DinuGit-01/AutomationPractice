package dinesh;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RequiredDetails {

	public static void main(String[] args)  {
		String Absolute = ".\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Absolute);

		WebDriver filldetails = new ChromeDriver();
		 filldetails.get("http://demo.automationtesting.in/Register.html");
		 Actions mouseclass= new Actions( filldetails);
		 
	List	<WebElement> demo=filldetails.findElements(By.cssSelector("input[placeholder='First Name']"));
		 ((WebElement) demo).sendKeys("Dinesh");
		 
		 mouseclass.doubleClick((WebElement) demo).keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		// WebElement Demo=filldetails.findElement(By.cssSelector("input[placeholder='Last Name']"));
		
		 mouseclass.doubleClick((WebElement) demo).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	//Thread.sleep(1000);
	mouseclass.moveToElement((WebElement) demo).keyDown(Keys.TAB).sendKeys("solapur").keyUp(Keys.TAB).perform();
		 
	}

}
