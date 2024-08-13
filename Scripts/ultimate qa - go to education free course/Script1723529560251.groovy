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
 * 1. Open browser to the URL stored in https://ultimateqa.com/
 * 2. Find menu dropdown education
 * 3. Hover menu education
 * 4. Click dropdown menu free course
 * 5. Verify page free course is opened
 * */
// Open browser to the URL stored in https://ultimateqa.com/
WebUI.openBrowser('')
WebUI.navigateToUrl('https://ultimateqa.com/')

// Find menu dropdown education
WebUI.click(findTestObject('Page_UltimateQA/span_Education'))

// Hover menu education
WebUI.moveToElement(findTestObject('Page_UltimateQA/span_Education'))

// Click dropdown menu free course
WebUI.click(findTestObject('Page_UltimateQA/a_Free Course'))

// Verify page free course is opened
WebUI.verifyElementVisible(findTestObject('Page_UltimateQA/div_Free Course Page'))