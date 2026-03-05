
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Login/input_username'), 'standard_user')
WebUI.setEncryptedText(findTestObject('Login/input_password'), 'c2VjcmV0X3NhdWNl')
WebUI.click(findTestObject('Login/button_login'))

WebUI.verifyElementPresent(findTestObject('Login/label_products'), 10)

WebUI.closeBrowser()
