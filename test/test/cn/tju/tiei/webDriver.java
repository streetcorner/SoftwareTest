package cn.tju.tiei;

public class webDriver {
	String chDriver = new File(new File(".").getCanonicalPath()+"\\"+"driver.chromedriver.exe").getConnection();
	System.setProperty("webdriver.chrome.driver",chDriver);
	System.setProperty("webdriver.chrome.bin","");
	WebDriver ch_driver= new ChromeDriver();
	
	ch_driver.get("https://www.baidu.com");
	ch_driver.findeElement(By.id("kw")).click();
	ch_driver.findeElement(By.id("kw")).sendKeys("天津大学");
	ch_driver.findeElement(By.id("su")).click();
	
}
