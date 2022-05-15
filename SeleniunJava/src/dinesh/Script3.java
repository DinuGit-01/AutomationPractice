package dinesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String flip1 = ".\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", flip1);

		WebDriver flip2 = new ChromeDriver();
		flip2.get("https://www.flipkart.com/");
		flip2.manage().window().maximize();
		System.out.println("get Url" + flip2.getCurrentUrl());

		System.out.println("get title" + flip2.getTitle());
		// System.out.println("get resource page"+flip2.getPageSource());
		System.out.println("size of resource page");
		List<WebElement> kart = flip2.findElements(By.cssSelector("#container > div > div._331-kn._2tvxW > div"));
		System.out.println("total size of the element" + kart.size());
		for (int i = 0; i < kart.size(); i++) {
			System.out.println(kart.get(i).getText());
		}

	}

}
