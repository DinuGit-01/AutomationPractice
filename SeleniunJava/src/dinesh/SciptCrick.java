package dinesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SciptCrick {

	public static void main(String[] args) {

		String cri1 = ".\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", cri1);

		WebDriver cri2 = new ChromeDriver();
		cri2.get("https://www.cricinfo.com/");
		cri2.manage().window().maximize();
		System.out.println("get Url" + cri2.getCurrentUrl());
		String C1 = cri2.getCurrentUrl();
		System.out.println("actual Url" + C1);
		String C2 = "https://www.espncricinfo.com/";
		if (C1.equals(C2)) {
			System.out.println("Ulr is valiateded as ok");
		} else {
			System.out.println("invalid Url fasle");
		}

		System.out.println("get title" + cri2.getTitle());
		List<WebElement> Crikinfo = cri2.findElements(By.cssSelector(
				"#main-container > div:nth-child(3) > div > nav > div > div > div > div.ds-flex.ds-items-center.ds-justify-between.ds-flex-1 > div:nth-child(1)"));
		System.out.println("size of he list webelements" + Crikinfo.size());
		for (int i = 0; i < Crikinfo.size(); i++) {
			System.out.println(Crikinfo.get(i).getText());
		}

		cri2.close();
	}

}
