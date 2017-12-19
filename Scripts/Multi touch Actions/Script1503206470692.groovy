import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.MultiTouchAction as MultiTouchAction
import io.appium.java_client.TouchAction as TouchAction

'Path of the Apk File Store in path variable'
def path = RunConfiguration.getProjectDir() + '/Data Files/MultiTouchTester.apk'

'Start the application'
Mobile.startApplication(path, false)

'Wait for Element Visible "Touch Me"'
Mobile.waitForElementPresent(findTestObject('MultiTouchTester/text_Touch Me'), 30)

'Verify Element Visible "Touch Me"'
Mobile.verifyElementVisible(findTestObject('MultiTouchTester/text_Touch Me'), 30)

'Initializing Katalon Mobile Driver to Appium Driver'
AppiumDriver<?> driver = MobileDriverFactory.getDriver()

'Get Device Height and store in to "device_Height" variable'
device_Height = Mobile.getDeviceHeight()

'Get Device Width and store in to "device_Width" variable'
device_Width = Mobile.getDeviceWidth()

'Get X1 coordinate of touch point 1 (Top Left Side)'
int X1 = device_Width * 0.20

'Get Y1 coordinate of touch action 1 (Top Left Side)'
int Y1 = device_Height * 0.20

'Get X2 coordinate of touch point 2 (Top Right Side)'
int X2 = device_Width * 0.80

'Get Y2 coordinate of touch point 2 (Top Right Side)'
int Y2 = device_Height * 0.20

'Get X3 coordinate of touch point 3 (Bottom Left Side)'
int X3 = device_Width * 0.20

'Get Y3 coordinate of touch point 3 (Bottom Left Side)'
int Y3 = device_Height * 0.80

'Get X4 coordinate of touch point 4 (Bottom Right Side)'
int X4 = device_Width * 0.80

'Get Y4 coordinate of touch point 4 (Bottom Right Side)'
int Y4 = device_Height * 0.80

'Create object to "MultiTouchAction" class '
MultiTouchAction multiTouch = new MultiTouchAction(driver)

'Create First action Object to "TouchAction" class'
TouchAction action1 = new TouchAction(driver)

'Create Second action Object to "TouchAction" class'
TouchAction action2 = new TouchAction(driver)

'Create Third action Object to "TouchAction" class'
TouchAction action3 = new TouchAction(driver)

'Create Fourth action Object to "TouchAction" class'
TouchAction action4 = new TouchAction(driver)

'Press First action with x y coordinates wait 5 Seconds then release'
action1.press(X1, Y1).waitAction(5000).release()

'Press Second action with x y coordinates wait 5 Seconds then release'
action2.press(X2, Y2).waitAction(5000).release()

'Press Third action with x y coordinates wait 5 Seconds then release'
action3.press(X3, Y3).waitAction(5000).release()

'Press Fourth action with x y coordinates wait 5 Seconds then release'
action4.press(X4, Y4).waitAction(5000).release()

'Multi Touch Object to add Multiple touch actions as per you need'
multiTouch.add(action1).add(action2).add(action3).add(action4).perform()

'Close the Application'
Mobile.closeApplication()

