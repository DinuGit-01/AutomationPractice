package dinesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RealScenarioLocators {

	public static void main(String[] args) {

		String path1 = "E:\\Java\\eclipse-jee-photon-R\\SeleniunJava\\Executable\\msedgedriver.exe";// absolute path
		String path2 = ".\\Executable\\msedgedriver.exe";// ******relative path2
		String path3 = System.getProperty("user.dir") + "Executable\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path2);
		WebDriver locate = new EdgeDriver();
		locate.get("https://demosite.executeautomation.com");
		String locate1 = locate.getTitle();
		System.out.println("Titel is=" + locate1);
		System.out.println("titel lenth is=" + locate1.length());
		String locateUrl = locate.getCurrentUrl();
		String url1 = "https://demosite.executeautomation.com/";
		if (locateUrl.equals(url1)) {
			System.out.println(" validate the url is passed...");
		} else {
			System.out.println("url is not matched");
		}
		WebElement InputField=locate.findElement(By.name("UserName"));
		InputField.sendKeys("execution");
		WebElement Inputpass=locate.findElement(By.name("Password"));
		Inputpass.sendKeys("admin");
		//WebElement Login=locate.findElement(By.name("Login"));
		//Login.click();
		//locate.close();
		locate.findElement(By.name("Login")).click();
		
		
	}

}
