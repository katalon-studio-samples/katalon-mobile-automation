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
Mobile.waitForElementPresent(findTestObject('API Demos Objects/Scroll to Element and Swipe Vertical/heading_API_Demos'), 45)

'Scroll to App text'
Mobile.scrollToText('App', FailureHandling.STOP_ON_FAILURE)

'Tap on App'
Mobile.tap(findTestObject('API Demos Objects/Handle Alert/text_App'), 20)

'Scroll to Alert Dialogs text'
Mobile.scrollToText('Alert Dialogs', FailureHandling.STOP_ON_FAILURE)

'Tap on Alert Dialogs'
Mobile.tap(findTestObject('API Demos Objects/Handle Alert/text_Alert Dialogs'), 30)

'Wait for Element Present of Header Alert'
Mobile.waitForElementPresent(findTestObject('API Demos Objects/Handle Alert/text_Header Alert'), 30)

'Verify Element Visible of Header Alert'
Mobile.verifyElementVisible(findTestObject('API Demos Objects/Handle Alert/text_Header Alert'), 30)

'Scroll to "OK Cancel dialog with traditional theme"'
Mobile.scrollToText('OK Cancel dialog with traditional theme', FailureHandling.STOP_ON_FAILURE)

'Tap On Button OK Cancel dialog with traditional theme'
Mobile.tap(findTestObject('API Demos Objects/Handle Alert/button_OK Cancel dialog with traditional theme'), 30)

'Wait for Element Visible of Alert Title'
Mobile.waitForElementPresent(findTestObject('API Demos Objects/Handle Alert/text_Alert Title'), 30)

'Verify the Element Visible of Alert Title'
Mobile.verifyElementVisible(findTestObject('API Demos Objects/Handle Alert/text_Alert Title'), 30)

'Get the Alert Title text and Store in to "actual_AlertText" variable'
actual_AlertText = Mobile.getText(findTestObject('API Demos Objects/Handle Alert/text_Alert Title'), 30)

'Verify the actual and Expected Alert Texts'
Mobile.verifyMatch(actual_AlertText, 'Lorem ipsum dolor sit aie consectetur adipiscing\nPlloaso mako nuto siwuf cakso dodtos anr koop.', 
    false)

'Tap on OK Button on Alert'
Mobile.tap(findTestObject('API Demos Objects/Handle Alert/button_OK'), 30)

'Close the Application'
Mobile.closeApplication()

