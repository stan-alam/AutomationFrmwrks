public class BaseFramework {
  private static final int DELAY = 10;

  @BeforeClass
  public static void start() {
    final WebDriver driver = new ChromeDriver();
    BaseFramework.setDriverThread(driver);
    BaseClass.getDriverThread().manage().timeouts().pageLoadTimeout(DELAY, TimeUnit.SECONDS);
    BaseClass.getDriverThread().manage().timeouts().implicitlyWait(DELAY, TimeUnit.SECONDS);
    BaseClass.getDriverThread().manage().timeouts().pageLoadTimeout(DELAY, TimeUnit.SECONDS);
    navigateWebBrowser().to(baseURL); //todo define baseURL in json file
  }
  @AfterClass
  public static void stop() {
    clearLocalStorage();
    closeBrowser();
  }
}
