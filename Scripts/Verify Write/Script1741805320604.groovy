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

WebUI.waitForElementClickable(findTestObject('Main Page/Navbar/button_Write'), 0)

WebUI.click(findTestObject('Main Page/Navbar/button_Write'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Write/a_Create a new story'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Write/a_Helpful writer resources'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Write/a_My Stories'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Write/a_Wattpad programs  opportunities'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Write/a_Writing contests'), 0)

WebUI.closeBrowser()

