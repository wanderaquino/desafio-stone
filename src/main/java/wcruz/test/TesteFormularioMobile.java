package wcruz.test;

import org.junit.Test;

import wcruz.core.BaseTestMobile;

public class TesteFormularioMobile extends BaseTestMobile {
	@Test
	public void DeveAbrirPaginaMobile() throws InterruptedException {
		Thread.sleep(5000);
		pagem.BotaoEnterIniciaFormularioButton();
	}
	
}
