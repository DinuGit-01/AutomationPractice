package dinesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {

	public static void main(String[] args) throws InterruptedException {

		String S1 = ".\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", S1);

		WebDriver S2 = new ChromeDriver();
		S2.get("https://www.gsmarena.com/");
		S2.manage().window().maximize();
		// String C=case2.getTitle();
		System.out.println("Title pages are=" + S2.getTitle());
		List<WebElement> S3 = S2.findElements(By.xpath("//*[@id=\"body\"]/aside/div[1]/ul"));
		System.out.println("please print the list size=" + S3.size());
		for (int i = 0; i < S3.size(); i++) {
			System.out.print("," + S3.get(i).getText());
		}
		System.out.println("********************Samsung models***************");

		Thread.sleep(2000);

		S2.findElement(
				By.cssSelector("#body > aside > div.brandmenu-v2.light.l-box.clearfix > ul > li:nth-child(1) > a"))
				.click();
		List<WebElement> S4 = S2.findElements(By.xpath("//*[@id=\"review-body\"]/div[1]"));
		System.out.println("Print the size of the samsung elements=" + S4.size());
		for (int i = 0; i < S4.size(); i++) {
			System.out.print(" " + S4.get(i).getText());
		}
		S2.close();
	}

}
