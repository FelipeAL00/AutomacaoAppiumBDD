package br.com.rsinet.HUB_BDD.testeRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import br.com.rsinet.HUB_BDD.manager.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features",
		glue = {"br.com.rsinet.HUB_BDD.stepDefinition" }, 
		monochrome = true, 
		snippets = SnippetType.CAMELCASE,
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
)
public class Runner {
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
		Reporter.setSystemInfo("Selenium", "3.141.59");
		Reporter.setSystemInfo("Maven", "3.6.2");
		Reporter.setSystemInfo("Java Version", "1.8.0_151");

	}
}
