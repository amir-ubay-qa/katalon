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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('login/success-login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('inventory-page/Backpack Add to cart Button'), 0)

WebUI.click(findTestObject('inventory-page/Backpack Add to cart Button'))

WebUI.scrollToElement(findTestObject('inventory-page/Bikelight Add to Chart Button'), 0)

WebUI.click(findTestObject('inventory-page/Bikelight Add to Chart Button'))

WebUI.scrollToElement(findTestObject('inventory-page/Jacket Add to cart Button'), 0)

WebUI.click(findTestObject('inventory-page/Jacket Add to cart Button'))

WebUI.scrollToElement(findTestObject('inventory-page/Onesie Add to cart Button'), 0)

WebUI.click(findTestObject('inventory-page/Onesie Add to cart Button'))

WebUI.scrollToElement(findTestObject('inventory-page/Test.allTheThings Add To Cart'), 0)

WebUI.click(findTestObject('inventory-page/Test.allTheThings Add To Cart'))

WebUI.scrollToElement(findTestObject('inventory-page/Tshirt Add to Chart Button'), 0)

WebUI.click(findTestObject('inventory-page/Tshirt Add to Chart Button'))

WebUI.click(findTestObject('inventory-page/Cart Link Page'))

WebUI.verifyElementText(findTestObject('inventory-page/Cart Badge'), '6')

