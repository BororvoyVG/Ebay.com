package com.epam.test_automation.final_task.borovyy_vadym;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

import static com.epam.test_automation.final_task.borovyy_vadym.Configuration.HOME_PAGE;
import static com.epam.test_automation.final_task.borovyy_vadym.Configuration.SEARCH_BUTTON;
import static com.epam.test_automation.final_task.borovyy_vadym.Configuration.SEARCH_INPUT;
import static com.epam.test_automation.final_task.borovyy_vadym.Configuration.SEARCH_RESULT_LIST;
import static org.junit.Assert.assertTrue;


public class HomePage extends Settings {

  @FindBy(xpath = SEARCH_INPUT)
  public WebElement inputTextForSearching;
  @FindBy(xpath = SEARCH_BUTTON)
  public WebElement searchButton;
  @FindBy(xpath = SEARCH_RESULT_LIST)
  public List<WebElement> searchResultList;

  public void openHomePage() {
    super.driver.get(HOME_PAGE);

  }

  public void performSearch(String textForSearching) {
    driver.findElement(By.xpath(SEARCH_INPUT)).sendKeys(textForSearching);
    driver.findElement(By.xpath(SEARCH_BUTTON)).click();
  }

  public void checkSearchResult(String textForSearching) {
    List<WebElement> searchResultList =driver.findElements(By.xpath(SEARCH_RESULT_LIST));
    List<String> string = searchResultList.stream().map(WebElement::getText).collect(Collectors.toList());
    boolean isTextPresented= string.stream().anyMatch(a->a.toLowerCase().contains(textForSearching.toLowerCase()));

    assertTrue(isTextPresented);
  }

}
