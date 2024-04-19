public class WaitConditions {

  private static final int DELAY = 10;
  private WebDriverWait webdriverwait;
  private WebDriver driver;

  public WaitConditions() {
    webdriverwait = new WebDriverWait(driver, DELAY);
}

public WebElement waitforvisibilityOfElement(final By Locator) {
  return WebDriverWait.until(ExpectedConditions.waitforvisibilityOfElementLocated(Locator));
  }
}
