package dinesh;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NamePriceMobile {

	public static void main(String[] args) throws InterruptedException {
		String Absolute = ".\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Absolute);

		WebDriver Price = new ChromeDriver();
		Price.get("https://www.meesho.com");
		Price.manage().window().maximize();
		Price.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<WebElement> options = Price.findElements(By.xpath(
				"//*[@id=\"__next\"]/div[2]"));
		System.out.println("size of the maenu options=" + options.size());
		
		Actions mouse = new Actions(Price);
		
		
		for(int i=0;i<options.size();i++) {
			WebElement pointerover=options.get(i);
			System.out.println("listing=" +options.get(i).getText());
			mouse.moveToElement(pointerover).build().perform();
			Thread.sleep(3000);
		}
		
	}
		static void mouseHovercords(Actions mouse ,List<WebElement> options ) throws InterruptedException {
			for(int i=0;i<options.size();i++) {
				WebElement option=options.get(i);
				mouse.moveToElement(option).perform();
				Thread.sleep(1000);
		

			}
			
		}
			

	
			
	

}
