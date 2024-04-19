public interface WebDriverBrowsers {
  /**
  * create @link Webdriver instance
  * @param capabilities set of capabilities for selenium
  *
  * @return new @link Webdriver instance
  */

  WebDriver CreateDriver(DesiredCapablities capabilities);
}
