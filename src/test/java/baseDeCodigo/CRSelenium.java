package baseDeCodigo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CRSelenium {

	@Test 
	public void ChromeDriverSeleniumBase () {
	System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe"); 
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://arbusta.net/");
	driver.manage().window().maximize();


	/*Este codigo es practicamente la base que se tiene que tener para poder iniciar
	con "Automation", Luego de "maximize, en la siguiente linea se colocan los:
	driver.findElement(by.id)("ID Aqui).SendKeys("Keys aqui"); (Solo por poner un ejemplo simple).
	Luego de eso practicamente el codigo es intuitivo y se va armando rapido, prestar mucha
	atenion tambien al archivo "POM.XML" ya que en ese estan las dependencias y pluging que se utilizan
	en caso de que les falte alguno, los pueden buscar desde "Maven Repository*/ 

	
	
	}
}



