package com.stc.testMay20231;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class NewTest {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=null;
	  driver=new ChromeDriver();
	  driver.get("file:///D:/Satish/05DemoApps/demo.html");
	  String strText=driver.findElement(By.xpath("//b")).getText();
	  System.out.println(strText+"------");
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	  driver.close();
  }
}
