import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
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

'Path of the Swipe List View Demo APK File Store in path variable'
def path = RunConfiguration.getProjectDir() + '/Data Files/SwipeListView Demo.apk'

'Start the application'
Mobile.startApplication(path, false)

'Wait for Element Present of Checkbox Dont Show this message again.\\r\\nif element present return true otherwise false.'
alert_Status = Mobile.waitForElementPresent(findTestObject('Swipe Horizontal Objects/checkbox_Dont show this message again'), 
    20)

'checking the if statment based on element present of alert check box'
if (alert_Status == true) {
    'Tap on check box'
    Mobile.tap(findTestObject('Swipe Horizontal Objects/checkbox_Dont show this message again'), 30)

    'Tap on Ok'
    Mobile.tap(findTestObject('Swipe Horizontal Objects/button_Ok'), 30)
}

'Wait for element Present of Heading API Demos'
Mobile.waitForElementPresent(findTestObject('Swipe Horizontal Objects/header_text SwipeListView Demo'), 45)

'Get Device Height and Store in to device_height variable'
device_Height = Mobile.getDeviceHeight()

'Get Width Height and Store in to device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Storing the value in startY variable by dividing device height by 2 Because Y coordinates are constant'
int startY = device_Height / 2

'Here startY and endY values are equal for Horizontal Swiping for that assigning startX value to endX'
int endY = startY

'Storing the value in startX variable'
int startX = device_Width * 0.30

'Storing the value in endX variable'
int endX = device_Width * 0.70

'Here Y constant for Swipe Horizontal Left to Right'
Mobile.swipe(startX, startY, endX, endY)

'Close the Application'
Mobile.closeApplication()

