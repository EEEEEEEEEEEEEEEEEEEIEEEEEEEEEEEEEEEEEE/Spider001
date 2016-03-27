package com.demo.Manager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.bean.byid.ProductInformation;
import com.demo.bean.bytype.ProductInfor;
import com.demo.dao.iddao.IdInforDaoIpmMysql;
import com.thoughtworks.selenium.webdriven.commands.SelectOption;

public class ConnectManager {
	private IdInforDaoIpmMysql infor;

	private ProductInfor productInfor;
	private WebDriver webDriver;
	private TypeInforSend getProductInfor;
	private int waittime = 600;

	// private WebElement webEle;
	public ConnectManager() {
		// TODO Auto-generated constructor stub
		productInfor = new ProductInfor();
		System.setProperty("webdriver.chrome.driver",
				"E:/work/chromedriver.exe");

		webDriver = new ChromeDriver();
		
	}

	public void getWebeleByType() {
		//TypeInforSend inforSend = new TypeInforSend();

		webDriver
				.get("http://web.daycogarage.com/catalogue/zh-cn/search-model?a=1&t=1");

		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("document.getElementById('ddlTipologia').style.display='list-item';");
		js.executeScript("document.getElementById('TipologiaMobile').style.display='list-item';");

		new WebDriverWait(webDriver, waittime)
				.until(ExpectedConditions.presenceOfElementLocated(By
						.xpath("//select[@id='ddlTipologia']/option[@value='0']")));

		By by = By.xpath("//select[@id='ddlTipologia']");

		selectOptionLevel1(by, 1);

	}

	public void getWebeleByID() {

		IdInforSend inforSend = new IdInforSend();

		webDriver
				.get("http://web.daycogarage.com/catalogue/zh-cn/search-product-by-code?t=2&c=90499401&a=1");

		WebDriverWait wait = new WebDriverWait(webDriver, 10);
		wait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver d) {
				return d.findElement(By.id("ContainerInformationProducts"));
			}
		});

		WebElement webElement = webDriver.findElement(By
				.id("ContainerInformationProducts"));

		inforSend.setWebElement(webElement);

		inforSend.sendProductInfor();
	}

	public void release() {
		webDriver.close();
	}

	//车类型选择
	private void selectOptionLevel1(By by, int index) {
		int i = 0;
		try {
			JavascriptExecutor js = (JavascriptExecutor) webDriver;
			// js.executeScript("document.getElementById('ddlTipologia').style.display='list-item';");
			js.executeScript("document.getElementById('ddlMarca').style.display='list-item';");
			WebElement webElement = webDriver.findElement(by);
			//if (index == 1)
				//System.out.println(webElement.getAttribute("outerHTML"));
			Select selectType = new Select(webElement);

			List<WebElement> listweb = selectType.getOptions();


			for (i = index; i < listweb.size(); i++) {
				// js.executeScript("document.getElementById('ddlTipologia').style.display='list-item';");
				WebElement ee = listweb.get(i);
				
				WebDriverWait wait = new WebDriverWait(webDriver, 10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By
						.id("ddlTipologia")));
				//System.out.println(ee.getText());
				//productInfor.getProductType().setType(ee.getText());
				ee.click();

				// js.executeScript("document.getElementById('ddlMarca').style.display='list-item';");
				new WebDriverWait(webDriver, waittime)
						.until(ExpectedConditions.presenceOfElementLocated(By
								.xpath("//select[@id='ddlMarca']/option[@value='0']")));

				By byL2 = By.xpath("//select[@id='ddlMarca']");

				WebElement e = webDriver.findElement(By
						.xpath("//select[@id='ddlMarca']"));
				//System.out.println("ddlMarca" + i + e.getAttribute("outerHTML"));

				selectOptionLevel2(byL2, 1);

			}
		} catch (StaleElementReferenceException e) {
			selectOptionLevel1(by, i);
		}
	}

	//品牌选择
	private void selectOptionLevel2(By by, int index) {

		int i = 0;
		try {
			JavascriptExecutor js = (JavascriptExecutor) webDriver;
			// js.executeScript("document.getElementById('ddlMarca').style.display='list-item';");
			js.executeScript("document.getElementById('ddlGamma').style.display='list-item';");
			WebElement webElement = webDriver.findElement(by);
			//if (index == 1)
				//System.out.println(webElement.getAttribute("outerHTML"));
			Select selectType = new Select(webElement);
			List<WebElement> listweb = selectType.getOptions();

			for (i = index; i < listweb.size(); i++) {
				// js.executeScript("document.getElementById('ddlMarca').style.display='list-item';");

				WebElement ee = listweb.get(i);
				WebDriverWait wait = new WebDriverWait(webDriver, 10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By
						.id("ddlMarca")));
				//System.out.println(ee.getText());
				//productInfor.getProductType().setBrand(ee.getText());
				ee.click();
				// js.executeScript("document.getElementById('ddlGamma').style.display='list-item';");
				new WebDriverWait(webDriver, waittime)
						.until(ExpectedConditions.presenceOfElementLocated(By
								.xpath("//select[@id='ddlGamma']/option[@value='0']")));

				By byL3 = By.xpath("//select[@id='ddlGamma']");

				WebElement e = webDriver.findElement(By
						.xpath("//select[@id='ddlGamma']"));
				//System.out.println("ddlGamma" + i + e.getAttribute("outerHTML"));

				selectOptionLevel3(byL3, 1);
			}
		} catch (StaleElementReferenceException e) {
			selectOptionLevel2(by, i);
		}

	}

	//车型选择
	private void selectOptionLevel3(By by, int index) {

		int i = 0;
		try {
			JavascriptExecutor js = (JavascriptExecutor) webDriver;
			// js.executeScript("document.getElementById('ddlGamma').style.display='list-item';");
			js.executeScript("document.getElementById('ddlModello').style.display='list-item';");
			WebElement webElement = webDriver.findElement(by);
			//if (index == 1)
				//System.out.println(webElement.getAttribute("outerHTML"));
			Select selectType = new Select(webElement);
			List<WebElement> listweb = selectType.getOptions();

			for (i = index; i < listweb.size(); i++) {
				// js.executeScript("document.getElementById('ddlGamma').style.display='list-item';");
				WebElement ee = listweb.get(i);
				
				WebDriverWait wait = new WebDriverWait(webDriver, 10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By
						.id("ddlGamma")));
				//System.out.println(ee.getText());
				//productInfor.getProductType().setForm(ee.getText());
				ee.click();
				// js.executeScript("document.getElementById('ddlModello').style.display='list-item';");
				new WebDriverWait(webDriver, waittime)
						.until(ExpectedConditions.presenceOfElementLocated(By
								.xpath("//select[@id='ddlModello']/option[@value='0']")));

				By byL4 = By.xpath("//select[@id='ddlModello']");

				WebElement e = webDriver.findElement(By
						.xpath("//select[@id='ddlModello']"));
				//System.out.println("ddlModello" + i+ e.getAttribute("outerHTML"));
				selectOptionLevel4(byL4, 1);

			}
		} catch (StaleElementReferenceException e) {
			selectOptionLevel3(by, i);
		}

	}

	//年份选择
	private void selectOptionLevel4(By by, int index) {

		int i = 0;
		try {
			JavascriptExecutor js = (JavascriptExecutor) webDriver;
			// js.executeScript("document.getElementById('ddlModello').style.display='list-item';");
			// js.executeScript("document.getElementById('ddlModello').style.display='list-item';");
			js.executeScript("document.getElementById('ddlVersione').style.display='list-item';");
			WebElement webElement = webDriver.findElement(by);
			//if (index == 1)
				//System.out.println(webElement.getAttribute("outerHTML"));
			Select selectType = new Select(webElement);
			List<WebElement> listweb = selectType.getOptions();

			for (i = index; i < listweb.size(); i++) {
				// js.executeScript("document.getElementById('ddlModello').style.display='list-item';");

				WebElement ee = listweb.get(i);
			
				WebDriverWait wait = new WebDriverWait(webDriver, 10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By
						.id("ddlModello")));
				//System.out.println(ee.getText());
				//productInfor.getProductType().setYear(ee.getText());
				ee.click();
				// js.executeScript("document.getElementById('ddlVersione').style.display='list-item';");
				new WebDriverWait(webDriver, waittime)
						.until(ExpectedConditions.presenceOfElementLocated(By
								.xpath("//select[@id='ddlVersione']/option[@value='0']")));

				By byL5 = By.xpath("//select[@id='ddlVersione']");

				WebElement e = webDriver.findElement(By
						.xpath("//select[@id='ddlVersione']"));
				//System.out.println("ddlVersione" + i+ e.getAttribute("outerHTML"));
				selectOptionLevel5(byL5, 1);
			}
		} catch (StaleElementReferenceException e) {
			selectOptionLevel4(by, i);
		}
	}

	//版本选择
	private void selectOptionLevel5(By by, int index) {
		// ddlMotore_chosen
		int i = 0;
		try {
			JavascriptExecutor js = (JavascriptExecutor) webDriver;
			// js.executeScript("document.getElementById('ddlModello').style.display='list-item';");
			// js.executeScript("document.getElementById('ddlModello').style.display='list-item';");
			js.executeScript("document.getElementById('ddlMotore').style.display='list-item';");
			WebElement webElement = webDriver.findElement(by);
			//if (index == 1)
				//System.out.println(webElement.getAttribute("outerHTML"));
			Select selectType = new Select(webElement);
			List<WebElement> listweb = selectType.getOptions();

			for (i = index; i < listweb.size(); i++) {
				// js.executeScript("document.getElementById('ddlVersione').style.display='list-item';");
				WebElement ee = listweb.get(i);
				
				WebDriverWait wait = new WebDriverWait(webDriver, 10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By
						.id("ddlVersione")));
			//	System.out.println(ee.getText());
				//productInfor.getProductType().setVersion(ee.getText());
				ee.click();
				// js.executeScript("document.getElementById('ddlMotore').style.display='list-item';");
				new WebDriverWait(webDriver, waittime)
						.until(ExpectedConditions.presenceOfElementLocated(By
								.xpath("//select[@id='ddlMotore']/option[@value='0']")));

				By byL6 = By.xpath("//select[@id='ddlMotore']");

				WebElement e = webDriver.findElement(By
						.xpath("//select[@id='ddlMotore']"));
				//System.out.println("ddlMotore" + i+ e.getAttribute("outerHTML"));
				selectOptionLevel6(byL6, 1);
			}
		} catch (StaleElementReferenceException e) {
			selectOptionLevel5(by, i);
		}
	}

	//引擎选择
	private void selectOptionLevel6(By by, int index) {
		// ddlMotore_chosen
		int i = 0;
		try {
			JavascriptExecutor js = (JavascriptExecutor) webDriver;
			// js.executeScript("document.getElementById('ddlModello').style.display='list-item';");
			// js.executeScript("document.getElementById('ddlModello').style.display='list-item';");
			js.executeScript("document.getElementById('ddlMotore').style.display='list-item';");
			WebElement webElement = webDriver.findElement(by);
			//if (index == 1)
				//System.out.println(webElement.getAttribute("outerHTML"));
			Select selectType = new Select(webElement);
			List<WebElement> listweb = selectType.getOptions();

			for (i = index; i < listweb.size(); i++) {
				// js.executeScript("document.getElementById('ddlVersione').style.display='list-item';");
				WebElement ee = listweb.get(i);
			
				WebDriverWait wait = new WebDriverWait(webDriver, 10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By
						.id("ddlMotore")));
			//	System.out.println(ee.getText());
				//productInfor.getProductType().setEngine(ee.getText());
				ee.click();
				// js.executeScript("document.getElementById('VisibilitaRightSide').style.display='list-item';");
				new WebDriverWait(webDriver, waittime).until(ExpectedConditions
						.presenceOfElementLocated(By
								.xpath("//div[@id='VisibilitaRightSide']")));

				WebElement e = webDriver.findElement(By
						.xpath("//div[@id='VisibilitaRightSide']"));
				//System.out.println(productInfor.getProductType());
				//System.out.println(i + e.getAttribute("outerHTML"));
				getProductInfor = new TypeInforSend(productInfor);
				getProductInfor.setProductInforElement(e);
				getProductInfor.sendInfor();
				
			}
		} catch (StaleElementReferenceException e) {
			selectOptionLevel6(by, i);
		}
	}
}
