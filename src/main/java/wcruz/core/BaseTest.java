package wcruz.core;

import org.junit.After;
import org.junit.Before;

import wcruz.page.AnswerPage;
import wcruz.page.FinishPage;
import wcruz.page.StartPage;

public class BaseTest {
	
	
	protected StartPage spage;
	protected AnswerPage apage;
	protected FinishPage fpage;
	
	@Before
	public void Inicializa() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		DriverFactory.getDriver().get("https://stonepayments.typeform.com/to/yl5PKW");
		spage = new StartPage();
		apage = new AnswerPage();
		fpage = new FinishPage();
	}
	
	@After
	public void Finaliza() {
		if(Propriedades.FECHAR_BROWSER) {
		DriverFactory.KillDriver();
	}
	}
	
}
