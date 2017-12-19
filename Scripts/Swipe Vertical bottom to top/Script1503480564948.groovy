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

'Path of the Apk File Store in path variable'
def path = RunConfiguration.getProjectDir() + '/Data Files/ApiDemos.apk'

'Start the application'
Mobile.startApplication(path, false)

'wait for element Present'
Mobile.waitForElementPresent(findTestObject('API Demos Objects/Scroll to Element and Swipe Vertical/heading_API_Demos'), 45)

'\'Scroll to Text Views\''
Mobile.scrollToText('Views', FailureHandling.STOP_ON_FAILURE)

'\'Tap on Views\''
Mobile.tap(findTestObject('API Demos Objects/Scroll to Element and Swipe Vertical/text_Views'), 20)

'Get Device Height and Store in to device_height variable'
device_Height = Mobile.getDeviceHeight()

'Get Width Height and Store in to device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX = device_Width / 2

'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int endX = startX

'Storing the value in startY variable'
int startY = device_Height * 0.30

'Storing the value in endY variable'
int endY = device_Height * 0.70

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

'Swipe Vertical from bottom to top'
Mobile.swipe(startX, startY, endX, endY)

'Close the Application'
Mobile.closeApplication()

