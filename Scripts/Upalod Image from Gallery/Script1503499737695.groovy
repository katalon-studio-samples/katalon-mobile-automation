import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement as WebElement

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory

import io.appium.java_client.AppiumDriver as AppiumDriver

'Tap on Camera icon'
Mobile.tap(findTestObject('handle_Camera and Gallery/button_Camera Pic'), 60)
'Wait for Element Present "Choose from image gallery"'
Mobile.waitForElementPresent(findTestObject('handle_Camera and Gallery/button_Choose from image gallery'), 60)
'Tap on "Choose from image gallery"'
Mobile.tap(findTestObject('handle_Camera and Gallery/button_Choose from image gallery'), 60)
'Initializing Katalon Mobile Driver to Appium Driver'
AppiumDriver<?> driver = MobileDriverFactory.getDriver()
'Store Gallery Iamges in to list'
List<WebElement> images = driver.findElementsByXPath('//*[contains(@class,\'com.sec.samsung.gallery.glview.composeView.PositionControllerBase\')]')
'Using For Loop for Iterations'
for (int i = 1; i <= images.size(); i++) {
	'Condition is applying for When reache to 3rd Image enter in to If block'
    if (i == 3) {
		'Click on the image'
        images.get(i).click()
		'Applying Break for exit from loop'
        break
    }
}
'Wait for Element Present of Camera icon'
Mobile.waitForElementPresent(findTestObject('handle_Camera and Gallery/button_Camera Pic'), 60)

