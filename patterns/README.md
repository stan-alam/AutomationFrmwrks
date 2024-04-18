## Patterns in Test Automation, not all inclusive


```java
package com.stan.automation.apps.login;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    private By signInAgain = By.cssSelector("#login");

    public boolean onPage() {
        return $(".login-content").isDisplayed();
    }

    public void setUsername(String username) {
        $("#username").setValue(username);
    }

    public void setPassword(String password) {
        $("#password").setValue(password);
    }

    public void submit() {
        $("#submit").click();
    }

    /**
     * @return true if the user logged out and the "Sign in again" button is displayed
     */
    public boolean loggedOut() {
        return $(signInAgain).isDisplayed();
    }

    public void signInAgain() {
        $(signInAgain).click();
    }

    /**
     * @return the message in the error alert, or the empty string if not present
     */
    public String getErrorMessage() {
        // SelenideElement error = $(".alert-error");
    	SelenideElement error = $(".alert.alert-danger");
        if (error.isDisplayed()) {
            return error.text();
        }
        return "";
    }
}
```


- [ ] also mind Antipatterns 