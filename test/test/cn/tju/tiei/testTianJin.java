//selenuim
package cn.tju.tiei;

import org.junit.Test;

import com.thoughtworks.selenium.Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

import org.junit.After;
import org.junit.Before;

@SuppressWarnings("deprecation")
public class testTianJin{
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.baidu.com";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testTestTianJindaxue() throws Exception {
		selenium.open("/");
		selenium.click("id=kw");
		selenium.type("id=kw", "tianjindaxue");
		selenium.click("id=su");
		
		
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
