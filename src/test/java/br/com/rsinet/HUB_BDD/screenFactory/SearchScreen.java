package br.com.rsinet.HUB_BDD.screenFactory;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.HUB_BDD.util.AcoesTouchActions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SearchScreen {
	private AppiumDriver<MobileElement> driver;
	private WebDriverWait wait;
	private AcoesTouchActions acoes;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewFilter")
	private MobileElement filtro;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewApply")
	private MobileElement aplicarFiltro;
	
	
	public SearchScreen(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
		wait = new WebDriverWait(this.driver, 10);
		acoes = new AcoesTouchActions(this.driver);
	}

	public void clicandoNoFiltro() {
		wait.until(ExpectedConditions.visibilityOf(filtro));
		filtro.click();
	}

	public void clicandoNoProduto(String texto) {
		acoes.scrollNameClick(texto);
	}


	public void clicandoEmAplicarFiltro() {
		wait.until(ExpectedConditions.visibilityOf(aplicarFiltro));
		aplicarFiltro.click();
	}

	public void clicandoComponenteFiltro(String texto) {
		MobileElement element;
		try {
			element =((AndroidDriver<MobileElement>) driver)
					.findElementByAndroidUIAutomator("new UiSelector().text(\"" + texto + "\")");

			wait.until(ExpectedConditions.elementToBeClickable(element));

			element.click();

		} catch (NoSuchElementException e) {
			((AndroidDriver<MobileElement>) driver).findElementByAndroidUIAutomator("new UiSelector().text(\"CANCEL\")")
			.click();
			clicandoNoFiltro();
			element = ((AndroidDriver<MobileElement>) driver)
					.findElementByAndroidUIAutomator("new UiSelector().text(\"" + texto + "\")");

			wait.until(ExpectedConditions.elementToBeClickable(element));

			element.click();

		}
	}

}
