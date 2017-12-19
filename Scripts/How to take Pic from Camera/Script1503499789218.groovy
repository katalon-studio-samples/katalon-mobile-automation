import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

'Tap on Camera icon'
Mobile.tap(findTestObject('handle_Camera and Gallery/button_Camera Pic'), 60)

'Wait for Element Present take Photo'
Mobile.waitForElementPresent(findTestObject('handle_Camera and Gallery/button_Take photo'), 60)

'Tap on take photo'
Mobile.tap(findTestObject('handle_Camera and Gallery/button_Take photo'), 60)

'Wait for Element Present camera layout'
Mobile.waitForElementPresent(findTestObject('handle_Camera and Gallery/camera_Layout'), 20)

'Tap on camera layout element'
Mobile.tapAndHold(findTestObject('handle_Camera and Gallery/camera_Layout'), 10, 20)

'Wait for Element Present Button OK'
Mobile.waitForElementPresent(findTestObject('handle_Camera and Gallery/button_OK'), 60)

'Tap on Button Ok'
Mobile.tap(findTestObject('handle_Camera and Gallery/button_OK'), 60)

