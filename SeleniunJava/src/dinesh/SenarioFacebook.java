package dinesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SenarioFacebook {

	public static void main(String[] args) {

		String face1 = ".\\Executable\\chromedriver.exe";
		String face2 = System.getProperty("user.dir") + "\\Executable\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", face2);
		WebDriver book1 = new ChromeDriver();
		String B1 = book1.getTitle();
		book1.get("https://www.facebook.com");
		String B2 = book1.getTitle();
		System.out.println(" Get the actual title=" + B2);
		String B3 = "facebook";
		System.out.println("Expected title=" + B3);
		if (B2.contains(B3)) {
			System.out.println("title validation passed!!");

		} else {
			System.out.println("title validation failed.....");

		}
		book1.close();

	}

}
