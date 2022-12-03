// File must contain the following using statements
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.DevTools;

// We must use a version-specific set of domains
using OpenQA.Selenium.DevTools.V94.Performance;

public async Task PerformanceMetricsExample()
{
    IWebDriver driver = new ChromeDriver();
    IDevTools devTools = driver as IDevTools;
    DevToolsSession session = devTools.GetDevToolsSession();
    await session.SendCommand<EnableCommandSettings>(new EnableCommandSettings());
    var metricsResponse =
        await session.SendCommand<GetMetricsCommandSettings, GetMetricsCommandResponse>(
            new GetMetricsCommandSettings());

    driver.Navigate().GoToUrl("http://www.google.com");
    driver.Quit();

    var metrics = metricsResponse.Metrics;
    foreach (Metric metric in metrics)
    {
        Console.WriteLine("{0} = {1}", metric.Name, metric.Value);
    }
}