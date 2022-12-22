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

WebUI.setText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input_Email_email'), 'admin@mail.fortyfourvisual.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/button_Log In'))

WebUI.click(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/span_Users'))

WebUI.click(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/span_Admins'))

WebUI.click(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/a_Add admin'))

WebUI.uploadFile(findTestObject('Object User/Object Add Admin 1/Object upload file'), 'C:\\Users\\ASUS\\Pictures\\Screenshots\\Screenshot (1).png')

WebUI.setText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input__email'), 'sari1@gmail.com')

WebUI.setText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input__phone'), '123456')

WebUI.setText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input__name'), 'sarii')

WebUI.setEncryptedText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input__password'), 
    'lfX3c1ElOvPrGRQrnxihgw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input__confirmPassword'), 
    'lfX3c1ElOvPrGRQrnxihgw==')

WebUI.click(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/button_Add Admin'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/div_admin created successfullyy'))

//2
WebUI.openBrowser('')

WebUI.navigateToUrl('https://officezone.vercel.app/auth')

WebUI.setText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input_Email_email'), 'admin@mail.fortyfourvisual.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/button_Log In'))

WebUI.click(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/span_Users'))

WebUI.click(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/span_Admins'))

WebUI.click(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/a_Add admin'))

WebUI.setText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input__email'), 'sari@gmail.com')

WebUI.setText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input__phone'), '123456')

WebUI.setText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input__name'), 'sarii')

WebUI.setEncryptedText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input__password'), 
    'lfX3c1ElOvPrGRQrnxihgw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input__confirmPassword'), 
    'lfX3c1ElOvPrGRQrnxihgw==')

WebUI.click(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/button_Add Admin'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/span_images is a required field'))

//2
WebUI.openBrowser('')

WebUI.navigateToUrl('https://officezone.vercel.app/auth')

WebUI.setText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input_Email_email'), 'admin@mail.fortyfourvisual.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/button_Log In'))

WebUI.click(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/span_Users'))

WebUI.click(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/span_Admins'))

WebUI.click(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/a_Add admin'))

WebUI.uploadFile(findTestObject('Object User/Object Add Admin 1/Object upload file'), 'C:\\Users\\ASUS\\Pictures\\Screenshots\\Screenshot (1).png')

WebUI.setText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input__phone'), '123456')

WebUI.setText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input__name'), 'sarii')

WebUI.setEncryptedText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input__password'), 
    'lfX3c1ElOvPrGRQrnxihgw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input__confirmPassword'), 
    'lfX3c1ElOvPrGRQrnxihgw==')

WebUI.click(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/button_Add Admin'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/span_email is a required field'))

//3
WebUI.openBrowser('')

WebUI.navigateToUrl('https://officezone.vercel.app/auth')

WebUI.setText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input_Email_email'), 'admin@mail.fortyfourvisual.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/button_Log In'))

WebUI.click(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/span_Users'))

WebUI.click(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/span_Admins'))

WebUI.click(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/a_Add admin'))

WebUI.uploadFile(findTestObject('Object User/Object Add Admin 1/Object upload file'), 'C:\\Users\\ASUS\\Pictures\\Screenshots\\Screenshot (1).png')

WebUI.setText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input__email'), 'sari@gmail.com')

WebUI.setText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input__phone'), '123456')

WebUI.setEncryptedText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input__password'), 
    'lfX3c1ElOvPrGRQrnxihgw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/input__confirmPassword'), 
    'lfX3c1ElOvPrGRQrnxihgw==')

WebUI.click(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/button_Add Admin'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Object User/Object add admin 2/Page_React App/span_name is a required field'))

