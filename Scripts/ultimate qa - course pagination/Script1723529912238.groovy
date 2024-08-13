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

/* Write a Katalon Studio test case to perform the following steps.
 * 1. Open browser to the URL stored in https://courses.ultimateqa.com/collections
 * 2. Verify pagination is visible
 * 3. Click page 2
 * 4. Verify page 2 pagination is active
 * */
// Open browser to the URL stored in https://courses.ultimateqa.com/collections
WebUI.openBrowser('')
WebUI.navigateToUrl('https://courses.ultimateqa.com/collections')

// Verify pagination is visible
WebUI.verifyElementVisible(findTestObject('Page_Pagination'), 10)

// Click page 2
WebUI.click(findTestObject('Page_2_Button'))

// Verify page 2 pagination is active
WebUI.verifyElementAttributeValue(findTestObject('Page_2_Button'), 'class', 'active', true)