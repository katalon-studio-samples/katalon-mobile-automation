import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

'Path of the Apk File Store in path variable'
def path = RunConfiguration.getProjectDir() + '/Data Files/Drag and Drop.apk'

'Start the Application'
Mobile.startApplication(path, false)

'Wait for Element Present of text "Basic Usage playground"'
Mobile.waitForElementPresent(findTestObject('Handle Drag and Drop objects/text_Basic Usage playground'), 30)

'Verify Element visible of "Basic Usage playground"'
Mobile.verifyElementVisible(findTestObject('Handle Drag and Drop objects/text_Basic Usage playground'), 30)

'Tap on "Basic Usage playground"'
Mobile.tap(findTestObject('Handle Drag and Drop objects/text_Basic Usage playground'), 30)

'Wait for Element Present of "Brad Mehldau"'
Mobile.waitForElementPresent(findTestObject('Handle Drag and Drop objects/text_Brad Mehldau'), 30)

'Verify Element visible of "Brad Mehldau"'
Mobile.verifyElementVisible(findTestObject('Handle Drag and Drop objects/text_Brad Mehldau'), 30)

'Drag "Brad Mehldau" text and Drop at "Kurt Rosenwinkel" text'
Mobile.dragAndDrop(findTestObject('Handle Drag and Drop objects/text_Brad Mehldau'), findTestObject('Handle Drag and Drop objects/text_Kurt Rosenwinkel'), 
    30)

Mobile.closeApplication()

