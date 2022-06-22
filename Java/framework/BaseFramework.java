public class BaseFramework {
  private static final int DELAY = 10;

  @BeforeClass
  public static void start() {
    final WebDriver driver = new ChromeDriver();
    BaseFramework.setDriverThread(driver);
    BaseFramework.getDriverThread().manage().timeouts().pageLoadTimeout(DELAY, TimeUnit.SECONDS);
    BaseFramework.getDriverThread().manage().timeouts().implicitlyWait(DELAY, TimeUnit.SECONDS);
    BaseFramework.getDriverThread().manage().timeouts().pageLoadTimeout(DELAY, TimeUnit.SECONDS);
    navigateBrowser().to(baseURL); //todo define baseURL in json file
  }
  @AfterClass
  public static void stop() {
    clearLocalStorage();
    closeBrowser();
  }
}
