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

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input_Email_email'), 
    'admin@mail.fortyfourvisual.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/button_Log In'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/span_Buildings'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/a_Add building'))

WebUI.uploadFile(findTestObject('Object Building/Object Add Building 1/Page_React App/Object upload file'), 'D:\\MBKM\\Office Booking\\office1.jpg')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input__buildingName'), 
    'Test meeting room')

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_option Kab. Kepulauan Seribu focused, 1_e05a75'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_Kab. Kepulauan Seribu'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_Select One_css-ackcql'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_Kepulauan Seribu Selatan'))

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/textarea_Jl.Testing'), 
    'Jl.Testing')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input__capacity'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input__fasilitas'), 
    'tv')

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_Icon'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/img'))

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input__fasilitas_1'), 
    '2 tv')

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/button_Add Facility'))

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input_Rp_monthly'), 
    '12000000')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input_Rp_annual'), 
    '200000000')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/textarea_test'), 'test')

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/button_Save'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_building created successfully'))

//2
WebUI.openBrowser('')

WebUI.navigateToUrl('https://officezone.vercel.app/auth')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input_Email_email'), 
    'admin@mail.fortyfourvisual.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/button_Log In'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/span_Buildings'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/a_Add building'))

WebUI.uploadFile(findTestObject('Object Building/Object Add Building 1/Page_React App/Object upload file'), 'D:\\MBKM\\Office Booking\\office1.jpg')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input__buildingName'), 
    'Test meeting room')

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_option Kab. Kepulauan Seribu focused, 1_e05a75'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_Kab. Kepulauan Seribu'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_Select One_css-ackcql'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_Kepulauan Seribu Selatan'))

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/textarea_Jl.Testing'), 
    'Jl.Testing')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input__capacity'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input__fasilitas'), 
    'tv')

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_Icon'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/img'))

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input__fasilitas_1'), 
    '2 tv')

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/button_Add Facility'))

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input_Rp_monthly'), 
    '12000000')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input_Rp_annual'), 
    '200000000')

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/button_Save'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Object Building/Object Add Building 2/Page_React App/span_description is a required field'))

//3
WebUI.openBrowser('')

WebUI.navigateToUrl('https://officezone.vercel.app/auth')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input_Email_email'), 
    'admin@mail.fortyfourvisual.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/button_Log In'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/span_Buildings'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/a_Add building'))

WebUI.uploadFile(findTestObject('Object Building/Object Add Building 1/Page_React App/Object upload file'), 'D:\\MBKM\\Office Booking\\office1.jpg')

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_option Kab. Kepulauan Seribu focused, 1_e05a75'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_Kab. Kepulauan Seribu'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_Select One_css-ackcql'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_Kepulauan Seribu Selatan'))

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/textarea_Jl.Testing'), 
    'Jl.Testing')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input__capacity'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input__fasilitas'), 
    'tv')

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_Icon'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/img'))

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input__fasilitas_1'), 
    '2 tv')

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/button_Add Facility'))

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input_Rp_monthly'), 
    '12000000')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input_Rp_annual'), 
    '200000000')

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/button_Save'))

WebUI.verifyElementClickable(findTestObject('Object Building/Object Add Building 2/Page_React App/span_name is a required field'))

//4
WebUI.openBrowser('')

WebUI.navigateToUrl('https://officezone.vercel.app/auth')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input_Email_email'), 
    'admin@mail.fortyfourvisual.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/button_Log In'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/span_Buildings'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/a_Add building'))

WebUI.uploadFile(findTestObject('Object Building/Object Add Building 1/Page_React App/Object upload file'), 'D:\\MBKM\\Office Booking\\office1.jpg')

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_option Kab. Kepulauan Seribu focused, 1_e05a75'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_Kab. Kepulauan Seribu'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_Select One_css-ackcql'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_Kepulauan Seribu Selatan'))

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input__capacity'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input__fasilitas'), 
    'tv')

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_Icon'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/img'))

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input__fasilitas_1'), 
    '2 tv')

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/button_Add Facility'))

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input_Rp_monthly'), 
    '12000000')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input_Rp_annual'), 
    '200000000')

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/button_Save'))

WebUI.verifyElementClickable(findTestObject('Object Building/Object Add Building 2/Page_React App/span_address is a required field'))

//5
WebUI.openBrowser('')

WebUI.navigateToUrl('https://officezone.vercel.app/auth')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input_Email_email'), 
    'admin@mail.fortyfourvisual.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/button_Log In'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/span_Buildings'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/a_Add building'))

WebUI.uploadFile(findTestObject('Object Building/Object Add Building 1/Page_React App/Object upload file'), 'D:\\MBKM\\Office Booking\\office1.jpg')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input__buildingName'), 
    'Test meeting room')

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_option Kab. Kepulauan Seribu focused, 1_e05a75'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_Kab. Kepulauan Seribu'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_Select One_css-ackcql'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_Kepulauan Seribu Selatan'))

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/textarea_Jl.Testing'), 
    'Jl.Testing')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input__fasilitas'), 
    'tv')

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/div_Icon'))

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/img'))

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input__fasilitas_1'), 
    '2 tv')

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/button_Add Facility'))

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input_Rp_monthly'), 
    '12000000')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/input_Rp_annual'), 
    '200000000')

WebUI.setText(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/textarea_test'), 'test')

WebUI.click(findTestObject('Object Repository/Object Building/Object Add Building 1/Page_React App/button_Save'))

WebUI.verifyElementClickable(findTestObject('Object Building/Object Add Building 2/Page_React App/span_capacity is a required field'))

