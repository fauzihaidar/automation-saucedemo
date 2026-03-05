
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Login/input_username'), 'wrong_user')
WebUI.setText(findTestObject('Login/input_password'), 'wrong_password')
WebUI.click(findTestObject('Login/button_login'))

WebUI.verifyElementPresent(findTestObject('Login/error_message'), 10)

WebUI.closeBrowser()
