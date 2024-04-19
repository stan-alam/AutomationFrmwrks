public class DriverManager {
  private WebDriver driver;

  @BeforeClass
  public static void setup() {
    DriverManager.chromedriver().setup();
  }
}
//todo add teardown
//todo add BaseTest class from which all tests would inherit
