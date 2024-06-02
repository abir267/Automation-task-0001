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

WebUI.navigateToUrl('https://akhtar.com.bd/')

WebUI.click(findTestObject('Object Repository/Page_Akhtar Furnisher/button_Sale_navbar-toggler'))

WebUI.click(findTestObject('Object Repository/Page_Akhtar Furnisher/i_I am already member_fa fa-search fs-5'))

WebUI.setText(findTestObject('Object Repository/Page_Akhtar Furnisher/input_I am already member_form-control bord_7add24'), 
    'Alaric Rocking Chair')

WebUI.sendKeys(findTestObject('Object Repository/Page_Akhtar Furnisher/input_I am already member_form-control bord_7add24'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Akhtar Furnisher/h4_Alaric Rocking Chair'))

WebUI.click(findTestObject('Page_undefined/select_Select OneMehgoni wood'))

WebUI.click(findTestObject('Page_undefined/New Test Object'))

WebUI.click(findTestObject('Page_undefined/select_Select OneSTANDRAD SIZE'))

WebUI.click(findTestObject('Page_undefined/New Test Object (1)'))

WebUI.click(findTestObject('Object Repository/Page_undefined/button_ADD TO CART'))

