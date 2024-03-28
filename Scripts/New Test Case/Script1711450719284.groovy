import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.sql.Driver as Driver
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

WebUI.navigateToUrl('https://sh-test.qcloud.asia/')

WebUI.click(findTestObject('Object Repository/test/Page_SMART HOTEL/h2_PMS'))

WebUI.switchToWindowTitle('SmartHotel')

WebUI.setText(findTestObject('Object Repository/test/Page_SmartHotel/input_Sign In to your account_dx-texteditor-input'), 
    'test01')

WebUI.click(findTestObject('Object Repository/test/Page_SmartHotel/div_Sign In to your account_dx-field'))

WebUI.click(findTestObject('Object Repository/test/Page_SmartHotel/div_Sign In to your account_dx-field'))

WebUI.setEncryptedText(findTestObject('Object Repository/test/Page_SmartHotel/input_Sign In to your account_dx-texteditor-input_1'), 
    'h/qEl+emAJ1jZT1AdWMyZg==')

WebUI.click(findTestObject('Object Repository/test/Page_SmartHotel/div_Login'))

WebUI.click(findTestObject('test/Page_Dashboard/div_Reservations'))

