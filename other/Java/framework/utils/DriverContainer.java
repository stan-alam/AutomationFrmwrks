public class DriverContainter {

  private static final ThreadLocal<WebDriver> DRIVER_THREAD = new ThreadLocal <>(); //since both nUnit the one that you were using in the C# atomo project, and TestNG are multithreaded/threadsave
}

public static WebDriver getDriverThread() {
  return DRIVER_THREAD.get();
}

public static void setDriverThread(final WebDriver webDriverValue) {
  DRIVER_THREAD.set(webDriverValue);
}
