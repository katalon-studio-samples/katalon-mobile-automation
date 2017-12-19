import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

'Launch Browser'
WebUI.openBrowser('http://demoaut.katalon.com/')

'Wait for Page Load'
WebUI.waitForPageLoad(30)

'Wait for Element Visible of Button Make Appointment'
WebUI.waitForElementVisible(findTestObject('Run Application in Mobile Browser/button_Make Appointment'), 30)

'Verify Button Make Appointment is clickable or not'
WebUI.verifyElementClickable(findTestObject('Run Application in Mobile Browser/button_Make Appointment'), FailureHandling.STOP_ON_FAILURE)

'Click on Button Make Appointment'
WebUI.click(findTestObject('Run Application in Mobile Browser/button_Make Appointment'))

'Wait for text login Header '
WebUI.waitForElementVisible(findTestObject('Run Application in Mobile Browser/text_Login Header'), 30)

'Verify text login Header is present.'
WebUI.verifyElementVisible(findTestObject('Run Application in Mobile Browser/text_Login Header'))

'Enter username as "John Doe"'
WebUI.setText(findTestObject('Run Application in Mobile Browser/txt_UserName'), 'John Doe')

'Enter password as "ThisIsNotAPassword"'
WebUI.setText(findTestObject('Run Application in Mobile Browser/txt_Password'), 'ThisIsNotAPassword')

'Click on Login Button'
WebUI.click(findTestObject('Run Application in Mobile Browser/button_Login'))

'Wait for Element Present of "Header Make Appointment"'
WebUI.waitForElementPresent(findTestObject('Run Application in Mobile Browser/text_Header Make Appointment'), 30)

'Get the Header text of Make Appointment and store in "actual_Header" variable'
actual_Header = WebUI.getText(findTestObject('Run Application in Mobile Browser/text_Header Make Appointment'))

'Verify the actual and Expected text'
WebUI.verifyMatch(actual_Header, 'Make Appointment', false)

'Close the Broswer'
WebUI.closeBrowser()

