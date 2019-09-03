package com.epam.test_automation.final_task.borovyy_vadym;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.epam.test_automation.final_task.borovyy_vadym.Configuration.PATH_TO_DRIVER;
import static com.epam.test_automation.final_task.borovyy_vadym.Configuration.SEARCH_TEXT;

public class Settings {

  protected WebDriver driver;
  public WebDriver getDriver() {
    return driver;
  }

  @BeforeTest
  public void setUpDriver() {
    System.setProperty("webdriver.chrome.driver", PATH_TO_DRIVER);
    driver = new ChromeDriver();
  }

  @Test
  public void searchText() {
    HomePage homepage = new HomePage();
    homepage.openHomePage();
    homepage.performSearch(SEARCH_TEXT);
    homepage.checkSearchResult(SEARCH_TEXT);

  }

  @AfterTest
  public void finishTest() {
    driver.quit();
  }
}
