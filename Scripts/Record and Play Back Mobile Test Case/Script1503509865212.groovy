import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

'Start the Application'
Mobile.startApplication('.\\Data Files\\ApiDemos.apk', true)

'Tap on text "OS"'
Mobile.tap(findTestObject('Record Mobile Test Case Objects/android.widget.TextView8 - OS'), 0)

'Tap on text "SMS Messaging"'
Mobile.tap(findTestObject('Record Mobile Test Case Objects/android.widget.TextView4 - SMS Messaging'), 0)

'Enter text as "Katalo" in Recipient text box'
Mobile.setText(findTestObject('Record Mobile Test Case Objects/android.widget.EditText0'), 'katalon', 0)

'Enter text as "Mobile Automation" in Message Body text box'
Mobile.setText(findTestObject('Record Mobile Test Case Objects/android.widget.EditText1'), 'Mobile Automation', 0)

'Tap on Send Button'
Mobile.tap(findTestObject('Record Mobile Test Case Objects/android.widget.Button0 - Send'), 0)

'Close the Application'
Mobile.closeApplication()

