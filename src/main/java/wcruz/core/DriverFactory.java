package wcruz.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	//Driver privado e estático - Impedir mais de uma instância
	private static WebDriver driver;
	
	//Construtor privado da classe Factory
	private DriverFactory() {}
	
	//Método para a criação da instância do driver
	public static WebDriver getDriver() {
		if(driver == null) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
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
