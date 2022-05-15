package dinesh;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Switchhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String Absolute = ".\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Absolute);

		WebDriver switches = new ChromeDriver();
		switches.get("http://www.tutorialspoint.com");

		switches.manage().window().maximize();
		WebDriverWait time = new WebDriverWait(switches, 30);
		Actions mouseclass = new Actions(switches);

		switches.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);

		switches.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);

		switches.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);

		switches.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);

		switches.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);

		switches.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);

		switches.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
		switches.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);

		switches.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
		switches.switchTo().window(Absolute);
		String homePageWinId = switches.getWindowHandle();
		System.out.println(" Unique Id for main windowe"+homePageWinId);
		Set<String> secondwid=switches.getWindowHandles();
		System.out.println(" Unique Id for second windows"+secondwid);
		secondwid.remove(homePageWinId);
		System.out.println("After remoing homeWinID, all windows ID: " + secondwid);
		Iterator<String> itr = secondwid.iterator();
		String childWinId = itr.next();
		switches.switchTo().window(childWinId);

		
		
		
	}

}
