package wcruz.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wcruz.core.BaseTestMobile;
import wcruz.core.DriverFactory;
import wcruz.core.DriverFactoryMobile;

public class StartPageMobile extends BaseTestMobile{
	//button general full enabled hover-effect js-intro-button
	public void BotaoEnterIniciaFormulario() {
		DriverFactoryMobile.getDriver().findElement(By.xpath("//body")).sendKeys(Keys.RETURN);
	}
	
	public void BotaoEnterIniciaFormularioButton() {
		DriverFactoryMobile.getDriver().findElement(By.xpath("//a[@class = 'button general full enabled hover-effect js-intro-button']")).click();
	}
	
	public void EsperaBotaoPaginaInicialMobile(int tempo, String xpath) {
			WebDriverWait espera = new WebDriverWait(DriverFactory.getDriver(), tempo);
			espera.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		}
	public void BotaoEnterIniciaFormularioJS() {
		WebElement element =  DriverFactoryMobile.getDriver().findElement(By.xpath("//a"));
		JavascriptExecutor executor = (JavascriptExecutor) DriverFactoryMobile.getDriver();
		executor.executeScript("arguments[0].click();", element);
	}
}
