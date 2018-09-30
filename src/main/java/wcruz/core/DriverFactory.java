package wcruz.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	//Driver privado e est�tico - Impedir mais de uma inst�ncia
	private static WebDriver driver;
	
	//Construtor privado da classe Factory
	private DriverFactory() {}
	
	//M�todo para a cria��o da inst�ncia do driver
	public static WebDriver getDriver() {
		if(driver == null) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
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
