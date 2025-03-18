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

WebUI.click(findTestObject('Main Page/Navbar/button_Log in'))

WebUI.click(findTestObject('Form Sign in/span_Log in with email'))

WebUI.setText(findTestObject('Form Sign in/Login with Email/input_Email or username'), email)

WebUI.setText(findTestObject('Form Sign in/Login with Email/input_Password'), password)

WebUI.click(findTestObject('Form Sign in/Login with Email/span_Log in'))

WebUI.verifyMatch('https://www.wattpad.com/login?error=1029&nextUrl=https%3A%2F%2Fwww.wattpad.com%2Fhome', expectedURL, 
    false)

WebUI.verifyElementPresent(findTestObject('Page Login/p_Log in to Wattpad'), 0)

WebUI.verifyElementPresent(findTestObject('Page Login/div_Login failed. Invalid user ID or password'), 0)

WebUI.closeBrowser()

