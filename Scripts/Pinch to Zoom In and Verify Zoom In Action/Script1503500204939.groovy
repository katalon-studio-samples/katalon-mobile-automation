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

'Wait for element Present of Heading API Demos'
Mobile.waitForElementPresent(findTestObject('API Demos Objects/Zoom_IN/heading_API_Demos'), 45)

'Checking the Element "Heading API Demos" is in Visible '
Mobile.verifyElementVisible(findTestObject('API Demos Objects/Zoom_IN/heading_API_Demos'), 30)

'Scroll to Views text'
Mobile.scrollToText('Views', FailureHandling.STOP_ON_FAILURE)

'Tap on Views'
Mobile.tap(findTestObject('API Demos Objects/Zoom_IN/text_Views'), 20)

'Scroll to WebView text'
Mobile.scrollToText('WebView', FailureHandling.STOP_ON_FAILURE)

'Checking the Element "WebView" is in Visible '
Mobile.verifyElementVisible(findTestObject('API Demos Objects/Zoom_IN/text_WebView'), 30)

'Tap on WebView'
Mobile.tap(findTestObject('API Demos Objects/Zoom_IN/text_WebView'), 30)

'Wait for Element Present "Hello World"'
Mobile.waitForElementPresent(findTestObject('API Demos Objects/Zoom_IN/link_Hello World'), 30)

'Checking the Element "Hello World" is in Visible '
Mobile.verifyElementVisible(findTestObject('API Demos Objects/Zoom_IN/link_Hello World'), 30)

'Get Element Height of "Hello World" Element'
ele_Height = Mobile.getElementHeight(findTestObject('API Demos Objects/Zoom_IN/link_Hello World'), 30)

'Get Element Width of "Hello World" Element'
ele_Width = Mobile.getElementWidth(findTestObject('API Demos Objects/Zoom_IN/link_Hello World'), 30)

'Pinch to Zoom In on "Hello World" Element up to 200 Offset'
Mobile.pinchToZoomInAtPosition(ele_Height, ele_Width, 200)

'Get Element Height of  Zoom In "Hello World" Element'
zoom_ele_Height = Mobile.getElementHeight(findTestObject('API Demos Objects/Zoom_IN/link_Hello World'), 30)

'Get Element Width of Zoom In "Hello World" Element'
zoom_ele_Width = Mobile.getElementWidth(findTestObject('API Demos Objects/Zoom_IN/link_Hello World'), 30)

'Verify the Element Height of Zoom In greater than normal Element height'
Mobile.verifyGreaterThan(zoom_ele_Height, ele_Height)

'Verify the Element Width of Zoom In greater than normal Element Width'
Mobile.verifyGreaterThan(zoom_ele_Width, ele_Width)

'Close the Application.'
Mobile.closeApplication()

