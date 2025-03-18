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

WebUI.click(findTestObject('Form Sign Up/button_Sign up with Google'))

WebUI.verifyElementPresent(findTestObject('Form Sign Up/Form Sign up with Google Accounts/span_Sign in'), 0)

WebUI.verifyElementPresent(findTestObject('Form Sign Up/Form Sign up with Google Accounts/span_to continue to Wattpad'), 
    0)

WebUI.setText(findTestObject('Form Sign Up/Form Sign up with Google Accounts/input_Email'), 'teguhardama75@gmail.com')

WebUI.click(findTestObject('Form Sign Up/Form Sign up with Google Accounts/span_Next'))

WebUI.verifyElementPresent(findTestObject('Form Sign Up/Form Sign up with Google Accounts/Page_Sign in - Google Accounts/span_Couldnt sign you in'), 
    0)

WebUI.closeBrowser()

