package wcruz.core;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactoryMobile {
	//Driver privado e est�tico - Impedir mais de uma inst�ncia
	private static WebDriver driver;
	
	//Construtor privado da classe Factory
	private DriverFactoryMobile() {}
	
	//M�todo para a cria��o da inst�ncia do driver
	public static WebDriver getDriver() {
		if(driver == null) {
			Map<String, String> mobileEmulation = new HashMap<String, String>();
			mobileEmulation.put("deviceName", "iPhone 5");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
			driver = new ChromeDriver(chromeOptions);
		}
		return driver;
	}

	//M�todo para encerrar a inst�ncia do driver
	public static void KillDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}

}
}
