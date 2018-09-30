package wcruz.core;

import org.junit.After;
import org.junit.Before;

import wcruz.page.StartPageMobile;

public class BaseTestMobile {
	protected StartPageMobile pagem;
	
	@Before
	public void Inicializa() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		DriverFactoryMobile.getDriver().get("https://stonepayments.typeform.com/to/yl5PKW");
		pagem = new StartPageMobile();
		
	}
	
	@After
	public void Finaliza() {
		if(Propriedades.FECHAR_BROWSER) {
		DriverFactoryMobile.KillDriver();
	}
	}
}
