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

WebUI.setText(findTestObject('Object Repository/Object Reservation/Object Update Reservation 1/Page_React App/input_Email_email'), 
    'admin@mail.fortyfourvisual.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Object Reservation/Object Update Reservation 1/Page_React App/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Object Reservation/Object Update Reservation 1/Page_React App/button_Log In'))

WebUI.click(findTestObject('Object Repository/Object Reservation/Object Update Reservation 1/Page_React App/span_Reservations'))

WebUI.click(findTestObject('Object Repository/Object Reservation/Object Update Reservation 1/Page_React App/img_Building Up 1A_img-building 4 h-4 m-2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Object Reservation/Object Update Reservation 1/Page_React App/span_Rejected'))




