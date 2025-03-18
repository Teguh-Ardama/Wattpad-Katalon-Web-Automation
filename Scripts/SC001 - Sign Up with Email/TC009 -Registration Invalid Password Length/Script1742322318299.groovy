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

WebUI.setText(findTestObject('Form Sign Up/Form Sign up with email/input_E-mail'), email)

WebUI.setText(findTestObject('Form Sign Up/Form Sign up with email/input_Username'), username)

WebUI.selectOptionByValue(findTestObject('Form Sign Up/Form Sign up with email/select_Month'), month, false)

WebUI.selectOptionByValue(findTestObject('Form Sign Up/Form Sign up with email/select_Day'), day, false)

WebUI.selectOptionByValue(findTestObject('Form Sign Up/Form Sign up with email/select_Year'), year, false)

WebUI.selectOptionByLabel(findTestObject('Form Sign Up/Form Sign up with email/select_Pronouns (optional)'), pronouns, false)

WebUI.setText(findTestObject('Form Sign Up/Form Sign up with email/input_Password'), password)

WebUI.setText(findTestObject('Form Sign Up/Form Sign up with email/input_Re-enter Password'), confirmPassword)

WebUI.verifyElementPresent(findTestObject('Form Sign Up/Form Sign up with email/Error Handle/div_Your password must be at 6-20 characters long'), 
    0)

WebUI.click(findTestObject('Form Sign Up/Form Sign up with email/span_Yes, Id like to receive marketing emails from Wattpad. (optional)'))

WebUI.click(findTestObject('Form Sign Up/Form Sign up with email/span_Yes, I have read and agree to Wattpads Terms of Service and Privacy Policy'))

WebUI.click(findTestObject('Form Sign Up/Form Sign up with email/span_Sign up with email (sign up form)'))

WebUI.delay(2)

WebUI.closeBrowser()

