package Testcases;

import org.eclipse.jetty.util.log.Log;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

abstract class WebElementWrapper {
	// region Member Variables
	protected WebElement _webElement;
	// endregion Member Variables

	// region Properties
	public boolean isValid() {return _webElement != null;}
	// endregion Properties
}

class Button extends WebElementWrapper {
	// region Constructors
	public Button(WebElement buttonElement) { _webElement = buttonElement; }
	// endregion Constructors

	// region Public Methods
	/**
	 * Clicks the button
	 */
	public void click() {
		_webElement.click();

		Log.getLogger("").info("Clicked button");
	}
	// endregion Public Methods
}

class TextEdit extends WebElementWrapper {
	// region Constructors
	public TextEdit(WebElement textEditElement) { _webElement = textEditElement; }
	// endregion Constructors

	// region Public Methods
	public void type(String input) {
		_webElement.sendKeys(input);

		Log.getLogger("").info("Entered input [" + input + "] into textbox");
	}
	// endregion Public Methods
}

public class LoginScreen {
	// region Member Variables
	@FindBy(id="loginSubmit")
	private Button _loginButton;

	@FindBy(id="loginPass")
	private TextEdit _password;

	@FindBy(id="loginUser")
	private TextEdit _username;
	// endregion Member Variables

	// region Properties
	public Button getLoginButton() { return _loginButton; }
	public TextEdit getPassword() { return _password; }
	public TextEdit getUsername() { return _username; }
	// endregion Properties

	// region Constructors
	public LoginScreen() { }
	// endregion Constructors

	// region Public Methods

	/**
	 * Logs in to the application with the supplied username and password
	 * @param username Username to authenticate with
	 * @param password Password to authenticate with
	 */
	public void login(String username, String password) {
		enterLoginCredentials(username, password);

		getLoginButton().click();
	}
	// endregion Public Methods

	// region Private Methods
	/**
	 * Verifies presence of username/password fields then enters the credentials in
	 * @param username Username to enter
	 * @param password Password to enter
	 */
	private void enterLoginCredentials(String username, String password) {
		if (!getUsername().isValid() | !getPassword().isValid()) {
			Assert.fail("Could not find username or password field");
		}

		getUsername().type(username);
		getPassword().type(password);
	}
	// endregion Private Methods
}