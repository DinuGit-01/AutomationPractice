package dinesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fb1 = "E:\\Java\\eclipse-jee-photon-R\\SeleniunJava\\Executable\\chromedriver.exe";
		String fb2 = ".\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", fb2);
		WebDriver fb3 = new ChromeDriver();
		fb3.get("https:www.facebook.com");
		fb3.manage().window().fullscreen();
		WebElement f1 = fb3.findElement(By.name("email"));
		f1.sendKeys("7773976325");
		WebElement f2 = fb3.findElement(By.id("psss"));
		f2.sendKeys("50143535");

		WebDriverWait fb4 = new WebDriverWait(fb3, 20);

	}

}
