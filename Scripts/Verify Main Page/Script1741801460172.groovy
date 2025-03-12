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

WebUI.verifyElementPresent(findTestObject('Main Page/Brand Partner/a_Learn more'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/button_Start Reading'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/button_Start Writing'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Footer/a_Accessibility'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Footer/a_Brand Partnerships'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Footer/a_Do Not Sell My Personal Information'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Footer/a_Get the App'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Footer/a_Help'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Footer/a_Jobs'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Footer/a_Payment Policy'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Footer/a_Press'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Footer/a_Privacy'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Footer/a_Terms'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Footer/a_Try Premium'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Footer/a_Wattpad Originals'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Footer/a_Writers'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Get Discovered/h4_The Wattys'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Get Discovered/h4_Wattpad Picks'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Get Discovered/h4_Writing Contests'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/h4_Find out more about what we do for writers'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/button_Browse'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/button_Community'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/button_Log in'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/button_Sign Up'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/button_Try Premium'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/button_Write'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/img_Wattpad'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Search/svg_Icon Search'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Search/input_Search'), 0)

WebUI.closeBrowser()

