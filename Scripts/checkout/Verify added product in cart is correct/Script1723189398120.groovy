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

WebUI.callTestCase(findTestCase('login/success-login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('inventory-page/Backpack Add to cart Button'))

WebUI.click(findTestObject('inventory-page/Bikelight Add to Chart Button'))

WebUI.click(findTestObject('inventory-page/Jacket Add to cart Button'))

WebUI.click(findTestObject('inventory-page/Onesie Add to cart Button'))

WebUI.click(findTestObject('inventory-page/Test.allTheThings Add To Cart'))

WebUI.click(findTestObject('inventory-page/Tshirt Add to Chart Button'))

WebUI.verifyElementText(findTestObject('inventory-page/Cart Badge'), '6')

WebUI.click(findTestObject('inventory-page/Cart Link Page'))

WebUI.click(findTestObject('cart-page/checkout button'))

WebUI.setText(findTestObject('checkout/firstname input'), 'alpha')

WebUI.setText(findTestObject('checkout/lastname'), 'beta')

WebUI.setText(findTestObject('checkout/postal code'), '444111')

WebUI.click(findTestObject('checkout/continue button'))

WebUI.verifyElementVisible(findTestObject('single-product-page/backpack/backpack-title'))

WebUI.verifyElementVisible(findTestObject('single-product-page/backpack/backpack-description'))

WebUI.verifyElementVisible(findTestObject('single-product-page/backpack/backpack-price'))

WebUI.verifyElementVisible(findTestObject('single-product-page/bikelight/bikelight-title'))

WebUI.verifyElementVisible(findTestObject('single-product-page/bikelight/bikelight-title'))

WebUI.verifyElementVisible(findTestObject('single-product-page/bikelight/bikelight-description'))

WebUI.verifyElementVisible(findTestObject('single-product-page/jacket/jacket-title'))

WebUI.verifyElementVisible(findTestObject('single-product-page/jacket/jacket-title'))

WebUI.verifyElementVisible(findTestObject('single-product-page/jacket/jacket-description'))

WebUI.verifyElementVisible(findTestObject('single-product-page/jacket/jacket-price'))

WebUI.verifyElementVisible(findTestObject('single-product-page/onesie/onesie-title'))

WebUI.verifyElementVisible(findTestObject('single-product-page/onesie/onesie-description'))

WebUI.verifyElementVisible(findTestObject('single-product-page/onesie/onesie-price'))

WebUI.click(findTestObject('checkout/finish button'))

WebUI.verifyElementVisible(findTestObject('checkout/checkout complete contianer'))

WebUI.verifyElementVisible(findTestObject('checkout/checkout complete header'))

WebUI.click(findTestObject('checkout/backtohome button'))

String currentUrl = WebUI.getUrl()

WebUI.verifyMatch(currentUrl, 'https://www.saucedemo.com/inventory.html', false)

