package wcruz.core;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactoryMobile {
	//Driver privado e estático - Impedir mais de uma instância
	private static WebDriver driver;
	
	//Construtor privado da classe Factory
	private DriverFactoryMobile() {}
	
	//Método para a criação da instância do driver
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

	//Método para encerrar a instância do driver
	public static void KillDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}

}
}
