package com.musabaytechnologies.learning;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumTest {

	WebDriver driver;

	@Before
	public void setUp() {
		driver = new InternetExplorerDriver();
	}

	@After
	public void tearDown() {
		if (null != driver) {
			driver.close();
			driver.quit();
		}
	}

	@Test
	public void firstTest() {
		driver.get("http://www.musabaytechnologies.com/");
		System.out.println("Page Title: " + driver.getTitle());

	}
}
