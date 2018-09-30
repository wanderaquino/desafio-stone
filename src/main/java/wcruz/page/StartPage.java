package wcruz.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wcruz.core.DriverFactory;

public class StartPage {
	
	public void EsperaInicialPorXpath(int tempo, String xpath) {
		WebDriverWait espera = new WebDriverWait(DriverFactory.getDriver(), tempo);
		espera.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	
	public void ClicaBotaoXpath(String xpath) {
		DriverFactory.getDriver().findElement(By.xpath(xpath)).click();
	}

}
