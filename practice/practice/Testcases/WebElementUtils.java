package Testcases;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class WebElementUtils {
	Map<String, String> map = new HashMap<String, String>();
	static String str = new String();
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("--> date stamp");
	}

	public void selectByVisbileText(WebElement element, String value) {
		Select select = new Select(element);
		List<WebElement> opList = select.getOptions();
		for (WebElement option : opList) {
			if (option.getText().trim().equalsIgnoreCase(value.trim())) {
				option.click();
				break;
			}
		}
	}

	public void selByVisibleTXT(WebElement element, String vaString) {
		Select select = new Select(element);
		try {
			select.selectByVisibleText(vaString);
		} catch (Exception e) {
			select.selectByIndex(0);

		}
	}

	public int compareUpdatedCheckBox(int updated, WebElement element, String value) {
		if (element.getAttribute("checked").contains("checked") && element.getAttribute("id").contains(value)) {
			return updated;
		}
		return ++updated;
	}

	public static String getkey() {
		return str;
	}

	public String appendIIN() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("ddmss");
		str = dateFormat.format(new Date());
		return str;
	}
}
