package dinesh;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {

	public static void main(String[] args) {

		String case1 = ".\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", case1);

		WebDriver case2 = new ChromeDriver();
		case2.get("https://www.google.com/");
		case2.manage().window().maximize();
		// String C=case2.getTitle();
		System.out.println("Title pages are=" + case2.getTitle());
		case2.findElement(By.name("q")).sendKeys("Selenium");

		List<WebElement> listphone = case2.findElements(By.xpath("ul[class='erkvQe']"));

		System.out.println("Size of the Array=" + listphone.size());
		for (int i = 0; i < listphone.size(); i++) {

			System.out.println(listphone.get(i).getText());

		}
		//case2.close();
	}
}
