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

WebUI.navigateToUrl('https://www.wattpad.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Main Page/Navbar/button_Sign Up'))

WebUI.click(findTestObject('Form Sign Up/span_Sign up with email'))

WebUI.click(findTestObject('Form Sign Up/Form Sign up with email/span_Sign up with email (sign up form)'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Form Sign Up/Form Sign up with email/Error Handle/div_Email is required'), 
    0)

WebUI.verifyElementPresent(findTestObject('Form Sign Up/Form Sign up with email/Error Handle/div_Username is required'), 
    0)

WebUI.verifyElementPresent(findTestObject('Form Sign Up/Form Sign up with email/Error Handle/div_Year is required'), 
    0)

WebUI.verifyElementPresent(findTestObject('Form Sign Up/Form Sign up with email/Error Handle/div_Password is required'), 
    0)

WebUI.verifyElementPresent(findTestObject('Form Sign Up/Form Sign up with email/Error Handle/div_Re-enter password is required'), 
    0)

WebUI.verifyElementPresent(findTestObject('Form Sign Up/Form Sign up with email/Error Handle/div_Checking this box is required'), 
    0)

WebUI.verifyElementPresent(findTestObject('Form Sign Up/Form Sign up with email/Error Handle/div_Please fix any errors to continue'), 
    0)

WebUI.closeBrowser()

