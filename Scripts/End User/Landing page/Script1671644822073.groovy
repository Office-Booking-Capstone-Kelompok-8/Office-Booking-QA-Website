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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://officezone.vercel.app/')

WebUI.click(findTestObject('Object Repository/object end user 1/Page_React App/svg_City_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/object end user 1/Page_React App/div_Kab. Kepulauan Seribu'))

WebUI.click(findTestObject('Object Repository/object end user 1/Page_React App/svg_Capacity_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/object end user 1/Page_React App/div_1 - 50 Person'))

WebUI.click(findTestObject('Object Repository/object end user 1/Page_React App/div_option 1 Month focused, 1 of 12. 12 res_5988e9'))

WebUI.click(findTestObject('Object Repository/object end user 1/Page_React App/div_2 Month'))

WebUI.setText(findTestObject('Object End/Object input date'), '22/12/2022')

WebUI.sendKeys(findTestObject('Object Repository/object end user 1/Page_React App/input_Search_date'), Keys.chord(Keys.ENTER))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://officezone.vercel.app/')

WebUI.click(findTestObject('Object Repository/Object end 1/Page_React App/button_Search'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Object end 1/Page_React App/div_Date  Duration is required'))

WebUI.click(findTestObject('Object Repository/Object end 1/Page_React App/div_City_css-1gtu0rj-indicatorContainer'))

WebUI.click(findTestObject('Object Repository/Object end 1/Page_React App/div_Kab. Kepulauan Seribu'))

WebUI.click(findTestObject('Object Repository/Object end 1/Page_React App/svg_Capacity_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/Object end 1/Page_React App/div_1 - 50 Person'))

WebUI.click(findTestObject('Object Repository/Object end 1/Page_React App/div_option 1 Month focused, 1 of 12. 12 res_5988e9'))

WebUI.click(findTestObject('Object Repository/Object end 1/Page_React App/div_1 Month'))

WebUI.click(findTestObject('Object Repository/Object end 1/Page_React App/button_Search'))

WebUI.verifyElementText(findTestObject('Object Repository/Object end 1/Page_React App/div_Date  Duration is required'), 
    '')

