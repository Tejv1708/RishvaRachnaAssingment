package org.home.category.Risva_Rachna;

import org.home.category.Risva_Rachna.TestSite;
import org.testng.annotations.Test;

public class BaseClass extends Configuration {

	@Test
	public void someAction() {
		try {
			TestSite makeAction = new TestSite(driver);
			makeAction.writeItemName();
			makeAction.clickSearchButton();
			makeAction.clickBrandName();
			makeAction.clickPercentOff();
			makeAction.clickDisplay();
			makeAction.clickWatchMaterial();
			makeAction.clickSelectItem();
		} catch (Exception e) {
			System.out.print(e);
		}
	}
}
