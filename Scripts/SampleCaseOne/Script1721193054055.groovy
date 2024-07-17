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

WebUI.navigateToUrl('https://www.flipkart.com/')

WebUI.click(findTestObject('Object Repository/FlipRecordAndPlayRepo/Page_Online Shopping Site for Mobiles, Elec_b3f752/div_Grocery'))

WebUI.click(findTestObject('Object Repository/FlipRecordAndPlayRepo/Page_Flipkart Grocery Store - Buy Groceries_f794ff/div_Select city_U7qQSI'))

WebUI.click(findTestObject('Object Repository/FlipRecordAndPlayRepo/Page_Online Shopping Site for Mobiles, Elec_b3f752/a_Women Ethnic'))

WebUI.click(findTestObject('Object Repository/FlipRecordAndPlayRepo/Page_KK,Sets,DM,Sarees - Buy KK,Sets,DM,Sar_0b24e2/a_Polka Print Bollywood Georgette Saree'))

WebUI.switchToWindowTitle('Buy Leelavati Polka Print Bollywood Georgette White Sarees Online @ Best Price In India | Flipkart.com')

WebUI.click(findTestObject('Object Repository/FlipRecordAndPlayRepo/Page_Buy Leelavati Polka Print Bollywood Ge_df46dc/span_Polka Print Bollywood Georgette Saree(White)'))

assert true

WebUI.verifyElementHasAttribute(findTestObject('Object Repository/FlipRecordAndPlayRepo/Page_Online Shopping Site for Mobiles, Elec_b3f752/a_Women Ethnic'), 
    'text', 0)

WebUI.closeBrowser()

