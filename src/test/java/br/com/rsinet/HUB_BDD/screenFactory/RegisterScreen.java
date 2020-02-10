package br.com.rsinet.HUB_BDD.screenFactory;

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

public class RegisterScreen {

	private AppiumDriver<MobileElement> driver;
	private WebDriverWait wait;
	private AcoesTouchActions acoes;
	
	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText")
	private MobileElement username;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private MobileElement email;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText")
	private MobileElement senha;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText")
	private MobileElement confirmacaoSenha;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText")
	private MobileElement primeiroNome;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText")
	private MobileElement ultimoNome;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private MobileElement telefone;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/linearLayoutCountry")
	private MobileElement pais;
	
	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private MobileElement estado;
	
	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText")
	private MobileElement cidade;
	
	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private MobileElement endereco;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText")
	private MobileElement cep;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/checkBoxRecieveOffers")
	private MobileElement btnReceberOfertas;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonRegister")
	private MobileElement btnRegistrar;
	
	public RegisterScreen(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
		wait = new WebDriverWait(this.driver, 10);
		acoes = new AcoesTouchActions((AndroidDriver<MobileElement>) this.driver);
	}

	public void passarNome(String texto) {
		wait.until(ExpectedConditions.visibilityOf(username));
		username.click();
		username.sendKeys(texto);
	}

	public void passarEmail(String texto) {
		wait.until(ExpectedConditions.visibilityOf(email));
		email.click();
		email.sendKeys(texto);
	}

	public void passarSenha(String texto) {
		wait.until(ExpectedConditions.visibilityOf(senha));
		senha.click();
		senha.sendKeys(texto);
	}

	public void passarConfirmacaoSenha(String texto) {
		wait.until(ExpectedConditions.visibilityOf(confirmacaoSenha));
		confirmacaoSenha.click();
		confirmacaoSenha.sendKeys(texto);
	}

	public void passarPrimeiroNome(String texto) {
		wait.until(ExpectedConditions.visibilityOf(primeiroNome));
		primeiroNome.click();
		primeiroNome.sendKeys(texto);
	}

	public void passarUltimoNome(String texto) {
		wait.until(ExpectedConditions.visibilityOf(ultimoNome));
		ultimoNome.click();
		ultimoNome.sendKeys(texto);
	}

	public void passarNumeroTelefone(String texto) {
		wait.until(ExpectedConditions.visibilityOf(telefone));
		telefone.click();
		telefone.sendKeys(texto);

		acoes.scrollTextVisivel("REGISTER");
	}

	public void passarPais(String texto){
		wait.until(ExpectedConditions.visibilityOf(pais));
		pais.click();

		acoes.scrollNameClick(texto);
	}

	public void passarEstado(String texto) {
		wait.until(ExpectedConditions.visibilityOf(estado));
		estado.click();
		estado.sendKeys(texto);
	}

	public void passarCidade(String texto) {
		wait.until(ExpectedConditions.visibilityOf(cidade));
		cidade.click();
		cidade.sendKeys(texto);
	}

	public void passarEndereco(String texto) {
		wait.until(ExpectedConditions.visibilityOf(endereco));
		endereco.click();
		endereco.sendKeys(texto);
	}

	public void passarCEP(String texto) {
		wait.until(ExpectedConditions.visibilityOf(cep));
		cep.click();
		cep.sendKeys(texto);
	}

	public void clicarCheckReceberMensagens() {
		wait.until(ExpectedConditions.visibilityOf(btnReceberOfertas));
		btnReceberOfertas.click();
	}

	public void clicarBtnRegistrar() {
		wait.until(ExpectedConditions.visibilityOf(btnRegistrar));
		btnRegistrar.click();
	}

	public boolean confirmandoSeAsSenhasEstaoErradas(String texto) {
		acoes.scrollName(texto);
		
		if(driver.getPageSource().contains(texto))
			return true;
		return false;
	}

}
