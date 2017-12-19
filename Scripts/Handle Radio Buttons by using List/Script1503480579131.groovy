import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.helper.MobileCommonHelper as MobileCommonHelper
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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.MobileElement as MobileElement

'Path of the Apk File Store in path variable'
def path = RunConfiguration.getProjectDir() + '/Data Files/ApiDemos.apk'

'Start the application'
Mobile.startApplication(path, false)

'Wait for element Present of Heading API Demos'
Mobile.waitForElementPresent(findTestObject('API Demos Objects/Radio Button List_Example/heading_API_Demos'), 45)

'Scroll to Views text'
Mobile.scrollToText('Views', FailureHandling.STOP_ON_FAILURE)

'Tap on Views'
Mobile.tap(findTestObject('API Demos Objects/Radio Button List_Example/text_Views'), 20)

'Scroll to Radio Group text'
Mobile.scrollToText('Radio Group', FailureHandling.STOP_ON_FAILURE)

'Tap on Radio Group'
Mobile.tap(findTestObject('API Demos Objects/Radio Button List_Example/text_Radio Group'), 30)

'Wait for Element Present of Header Radio Group'
Mobile.waitForElementPresent(findTestObject('API Demos Objects/Radio Button List_Example/text_Header Radio Group'), 30)

'Inizallinglling Appium Driver by Katalon Mobile Driver'
AppiumDriver<?> driver = MobileDriverFactory.getDriver()

'Getting all similar elements and storing in to List'
List<WebElement> elements = driver.findElementsByClassName('android.widget.RadioButton')

'Printing the Size of list elements'
println('The size of elements is ::' + elements.size())

'Here Using For each loop for iterations'
for (WebElement radio : elements) {
    'Get the text of each element in the list and store in to the "actual_Text" variable.'
    String actual_Text = radio.getText()

    'Here verifying the actual text with expected text of "Dinner" on every iteration'
    if (actual_Text.equals('Dinner')) {
        'Click on expected Element "Dinner" '
        radio.click()

        'Break the loop'
        break
    }
}

'Close the Application'
Mobile.closeApplication()

