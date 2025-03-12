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

WebUI.waitForElementClickable(findTestObject('Main Page/Navbar/button_Browse'), 0)

WebUI.click(findTestObject('Main Page/Navbar/button_Browse'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Browse/li_Browse'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Browse/a_Adventure'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Browse/a_Contemporary Lit'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Browse/a_Diverse Lit'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Browse/a_Editors Picks'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Browse/a_Fanfiction'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Browse/a_Fantasy'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Browse/a_Historical Fiction'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Browse/a_Horror'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Browse/a_Humor'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Browse/a_LGBTQ'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Browse/a_Mystery'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Browse/a_New Adult'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Browse/a_Non-Fiction'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Browse/a_Paranormal'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Browse/a_Poetry'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Browse/a_Romance'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Browse/a_Science Fiction'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Browse/a_Short Story'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Browse/a_Teen Fiction'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Browse/a_The Wattys'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Browse/a_Thriller'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Browse/a_Wattpad Originals'), 0)

WebUI.verifyElementPresent(findTestObject('Main Page/Navbar/Browse/a_Werewolf'), 0)

WebUI.closeBrowser()

