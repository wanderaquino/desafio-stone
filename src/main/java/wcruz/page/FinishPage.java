package wcruz.page;

import org.openqa.selenium.By;

import wcruz.core.DriverFactory;

public class FinishPage {
	//Thanks for completing this typeform
	public boolean ValidaTerminoFormulario(String mensagem) {
		boolean achou;
		
		if (DriverFactory.getDriver().findElement(By.xpath("//h1[@class = 'sc-bxivhb iYGUAI' and contains (text(), '" + mensagem + "')]")) != null) {
		achou = true;
		}
		else achou = false;
		
		return achou;
		
		
	}
}
