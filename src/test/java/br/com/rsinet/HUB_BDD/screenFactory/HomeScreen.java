package br.com.rsinet.HUB_BDD.screenFactory;

import java.time.Duration;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.HUB_BDD.util.AcoesTouchActions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomeScreen {
	
	private AppiumDriver<MobileElement> driver;
	private WebDriverWait wait;
	private AcoesTouchActions acoes;
	

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private MobileElement userLogado;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private MobileElement acessoMenu;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/linearLayoutLogin")
	private MobileElement login;
	
	@FindBy(how = How.ID, using = "android:id/button2")
	private MobileElement deslogar;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewSingUpToday")
	private MobileElement criarConta;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/editTextSearch")
	private MobileElement pesquisarLupa;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewSearch")
	private MobileElement clickParaPesquisarPelaLupa;
	
	
	
	public HomeScreen(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
		wait = new WebDriverWait(this.driver, 10);
		acoes =  new AcoesTouchActions(this.driver);
	}
	
	public String getUserLogado() {
		wait.until(ExpectedConditions.visibilityOf(userLogado));
		return userLogado.getText();
	}

	public void clickMenu() {
		wait.pollingEvery(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(acessoMenu));
		acessoMenu.click();
	}
	
	public void clickLogin() {
		wait.until(ExpectedConditions.elementToBeClickable(login));
		if(getUserLogado().equals("LOGIN")) {
			login.click();
		}else {
			login.click();
			deslogar.click();
			clickMenu();
			login.click();
		}
		
	}
	
	public void clickCriarConta() {
		wait.until(ExpectedConditions.elementToBeClickable(criarConta));
		criarConta.click();
	}
	
	public void clickProdutosHome(String texto) {
		acoes.scrollNameClick(texto);
	}
	
	public void pesquisarProdutoLupa(String texto) {
		wait.until(ExpectedConditions.visibilityOf(pesquisarLupa));
		pesquisarLupa.click();
		pesquisarLupa.sendKeys(texto);	
	}
	
	public void clicandoParaPesquisar() {
		clickParaPesquisarPelaLupa.click();
	}
}
