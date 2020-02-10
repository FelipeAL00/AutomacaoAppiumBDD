package br.com.rsinet.HUB_BDD.stepDefinition;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import br.com.rsinet.HUB_BDD.picoContainer.ContextoTeste;
import cucumber.api.java.pt.Dado;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class StepParaEntrarNaHome {

	private ContextoTeste contexto;
	private AppiumDriver<MobileElement> driver;
	
	public StepParaEntrarNaHome(ContextoTeste contexto) {
		this.contexto = contexto;
	}
	
	
	
	@Dado("^que estou no menu da tela home$")
	public void queEstouNoMenuDaTelaHome() throws MalformedURLException {
		driver = contexto.getWebDriverManager().getDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Dado("^que estou na tela home$")
	public void queEstouNaTelaHome() throws Throwable {
		driver = contexto.getWebDriverManager().getDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
}
