package dinesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Senario1LaunchBrow {

	public static void main(String[] args) {
		String P1 = "E:\\Java\\eclipse-jee-photon-R\\SeleniunJava\\Executable\\chromedriver.exe";// absolute path
		String p2 = ".\\Executable\\chromedriver.exe"; // relative pathe p2
		String p3 = System.getProperty("user.dir") + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", p3);
		WebDriver brow1 = new ChromeDriver();
		brow1.get("https://demo.actitime.com");
		String Brow2acutal = brow1.getTitle();
		String Brow2Expected = "actiTIME";
		System.out.println("actual Actual title=" + Brow2acutal);
		System.out.println("Expected titel=" + Brow2Expected);
		if (Brow2acutal.contains(Brow2Expected)) {

			System.out.println(" validation passesd");
		} else {
			System.out.println("validation failed");
		}
		String ActualURL=brow1.getCurrentUrl();
		System.out.println("Acrual Url print"+ActualURL);
		String ExepURL= "https://demo.actitime.com/login.do";
		System.out.println("expected url"+ExepURL);
		if(ActualURL.contains(ExepURL) ){
		System.out.println("Url validation passed");
		}else {
			System.out.println("url validation is failed");
		}
		
		String source=brow1.getPageSource();
		System.out.println("lenth of HTML source code="+source.length());
 brow1.close();
	}
}
