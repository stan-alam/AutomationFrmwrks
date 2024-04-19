# AutomationFrmwrks
## Patterns in Test Automation, not all inclusive to Java

<a>
  <img src="https://github.com/stan-alam/AutomationFrmwrks/blob/develop/patterns/images/01/javaPttrns01%20-%20page%201.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/AutomationFrmwrks/blob/develop/patterns/images/01/javaPttrns01%20-%20page%202.png" width="80%" height="80%">
</a>


```java
package com.stan.automation.apps.login;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    /**
     * @return true if the user's first time logging in and the Hamburger icon is displayed
    */
    public boolean hamburgerDisplayed() {
        return $(stanLogo).isDisplayed();
    }

    public void firstLogin() {
        $(stanLogo).click();
    
    }
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
Automation (polyglot)Framework Projects

Project objectives -> create an automation framework (from scratch) for the following languages

* C#

* Go

* Node

* Python

* Java

* JS -> React, TestCafe

## Major pitfalls to avoid

	1. If copying/pasting code or idea learned from previous project (add reference from credible source and/or credit)

	2. Do not write a C# framework in the style of Java, follow the C# .NEt idiom (do not repurpose Java into C#)

	3. Create UML, decision trees, high level diagrams

	4. Prepare an example of BDD vs TDD, reference reputable *source/literature

	5. If you're using a .PDF, purchase the hardcopy to support the author(s) (MLA reference)

	6. Cover none functional tests, e.g performance testing with artilary.io, Bees With Machine Guns

	7. Dockerize your tests

	8. Understand Feature release and how to Integration tests with unit tests and develop a pipeline within each language ecosystem (using AWS,azure pipelines etc)

	9. Have fun, like checkout github copilot


*[0]
Peer reviewed journal articles.
Edited academic books.
Articles in professional journals.
Statistical data from government websites.
Website material from professional associations (use sparingly and carefully).
