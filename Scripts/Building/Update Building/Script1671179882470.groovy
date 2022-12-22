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

WebUI.setText(findTestObject('Object Repository/Object Building/Object Update Building 4/Page_React App/input_Email_email'), 
    'admin@mail.fortyfourvisual.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Object Building/Object Update Building 4/Page_React App/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Object Building/Object Update Building 4/Page_React App/button_Log In'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Update Building 4/Page_React App/span_Buildings'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Update Building 4/Page_React App/a_Update'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Update Building 4/Page_React App/input__buildingName'))

WebUI.setText(findTestObject('Object Repository/Object Building/Object Update Building 4/Page_React App/input__buildingName'), 
    'A')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Update Building 4/Page_React App/textarea_Address1'), 
    'A')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Update Building 4/Page_React App/input__capacity'), 
    '0')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Update Building 4/Page_React App/input_Rp_monthly'), 
    '0')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Update Building 4/Page_React App/input_Rp_annual'), 
    '0')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Update Building 4/Page_React App/textarea_Building 1A'), 
    'A')

WebUI.click(findTestObject('Object Repository/Object Building/Object Update Building 4/Page_React App/button_Save'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Object Building/Object Update Building 4/Page_React App/div_building updated successfully'))

