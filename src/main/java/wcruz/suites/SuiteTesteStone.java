package wcruz.suites;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import wcruz.core.DriverFactory;
import wcruz.core.DriverFactoryMobile;
import wcruz.test.TesteFormularioMobile;
import wcruz.test.TestesFormulario;

@RunWith(Suite.class)

@SuiteClasses({
	TestesFormulario.class,
	TesteFormularioMobile.class
	
})
public class SuiteTesteStone {
	@AfterClass
	public static void FinalizaTudo() {
		DriverFactory.KillDriver();
		DriverFactoryMobile.KillDriver();
	}
}
