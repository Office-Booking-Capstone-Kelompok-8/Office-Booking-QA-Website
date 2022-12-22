import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//1
WebUI.openBrowser('')

WebUI.navigateToUrl('https://officezone.vercel.app/auth')

WebUI.setText(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/input_Email_email'), 'admin@mail.fortyfourvisual.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/button_Log In'))

WebUI.click(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/span_Settings'))

WebUI.click(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/svg_Choose Bank_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/div_BNI'))

WebUI.setText(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/input__accountNumber'), '123456')

WebUI.setText(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/input__accountName'), 'Admin')

WebUI.click(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/button_Add Payment'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/div_Add Payment Successfully'))

//2
WebUI.openBrowser('')

WebUI.navigateToUrl('https://officezone.vercel.app/auth')

WebUI.setText(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/input_Email_email'), 'admin@mail.fortyfourvisual.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/button_Log In'))

WebUI.click(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/span_Settings'))

WebUI.click(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/svg_Choose Bank_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/div_BRI'))

WebUI.setText(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/input__accountNumber'), '12345')

WebUI.setText(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/input__accountName'), 'Adm ')

WebUI.click(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/button_Add Payment'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/div_Add Payment Successfully'))

//3
WebUI.openBrowser('')

WebUI.navigateToUrl('https://officezone.vercel.app/auth')

WebUI.setText(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/input_Email_email'), 'admin@mail.fortyfourvisual.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/button_Log In'))

WebUI.click(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/span_Settings'))

WebUI.click(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/svg_Choose Bank_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/Object Setting/Object Setting 2/Page_React App/div_BCA'))

WebUI.setText(findTestObject('Object Repository/Object Setting/Object Setting 2/Page_React App/input__accountNumber'), '23456')

WebUI.setText(findTestObject('Object Repository/Object Setting/Object Setting 2/Page_React App/input__accountName'), 'Adm2')

WebUI.click(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/button_Add Payment'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/div_Add Payment Successfully'))

//4
WebUI.openBrowser('')

WebUI.navigateToUrl('https://officezone.vercel.app/auth')

WebUI.setText(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/input_Email_email'), 'admin@mail.fortyfourvisual.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/button_Log In'))

WebUI.click(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/span_Settings'))

WebUI.click(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/svg_Choose Bank_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/Object Setting/Object Setting 2/Page_React App/div_Mandiri'))

WebUI.setText(findTestObject('Object Repository/Object Setting/Object Setting 2/Page_React App/input__accountNumber'), '34567')

WebUI.setText(findTestObject('Object Repository/Object Setting/Object Setting 2/Page_React App/input__accountName'), 'Adm3')

WebUI.click(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/button_Add Payment'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Object Setting/ObjectSetting1/Page_React App/div_Add Payment Successfully'))

