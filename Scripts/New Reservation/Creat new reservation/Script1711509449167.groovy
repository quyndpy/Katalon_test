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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://sh-test.qcloud.asia/')

not_run: WebUI.click(findTestObject('Object Repository/Login_PMS/Page_SMART HOTEL/h5_Properties Management System'))

not_run: WebUI.switchToWindowTitle('SmartHotel')

not_run: WebUI.setText(findTestObject('Object Repository/Login_PMS/Page_SmartHotel/input_Sign In to your account_dx-texteditor-input'), 
    'test01')

not_run: WebUI.setText(findTestObject('Object Repository/Login_PMS/Page_SmartHotel/input_Sign In to your account_dx-texteditor-input_1'), 
    'apec@2023')

not_run: WebUI.click(findTestObject('Object Repository/Login_PMS/Page_SmartHotel/div_Login'))

WebUI.click(findTestObject('Object Repository/TestBooking/Page_Dashboard/Reservations'))

WebUI.click(findTestObject('Object Repository/TestBooking/Page_Dashboard/New Reservation'))

WebUI.click(findTestObject('Object Repository/TestBooking/Page_Add Reservation/Resv-last-name'))

WebUI.setText(findTestObject('Object Repository/TestBooking/Page_Add Reservation/Resv-last-name'), 'nguyên')

WebUI.click(findTestObject('Object Repository/New Reservation/Page_Add Reservation/div__dx-dropdowneditor-icon'))

WebUI.waitForAlert(3)

'Date'
WebUI.click(findTestObject('New Reservation/Page_Add Reservation/span_29'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TestBooking/Page_Add Reservation/resv-booked-room'))

WebUI.click(findTestObject('Object Repository/TestBooking/Page_Add Reservation/data-DL2 - Delux 2PN'))

WebUI.click(findTestObject('Object Repository/TestBooking/Page_Add Reservation/Resv-market-place'))

WebUI.click(findTestObject('Object Repository/TestBooking/Page_Add Reservation/data_PI - Public Indrect'))

WebUI.click(findTestObject('Object Repository/TestBooking/Page_Add Reservation/Resv-Booking-Source'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TestBooking/Page_Add Reservation/data_BC - Online B2C'))

WebUI.click(findTestObject('Object Repository/TestBooking/Page_Add Reservation/Resv-res-status'))

WebUI.click(findTestObject('Object Repository/TestBooking/Page_Add Reservation/data_Tentative'))

WebUI.click(findTestObject('Object Repository/TestBooking/Page_Add Reservation/btn_Account'))

WebUI.click(findTestObject('Object Repository/TestBooking/Page_Business Source/Account-code'))

WebUI.click(findTestObject('Object Repository/TestBooking/Page_Business Source/data_000663 - SHINHAN VIETNAM'))

WebUI.click(findTestObject('Object Repository/TestBooking/Page_Business Source/Booking_SRC_Code'))

WebUI.click(findTestObject('Object Repository/TestBooking/Page_Business Source/data_HT - Hotel'))

WebUI.click(findTestObject('Object Repository/TestBooking/Page_Business Source/Sale_Man'))

WebUI.click(findTestObject('Object Repository/TestBooking/Page_Business Source/data_Vng Hng Vn'))

WebUI.click(findTestObject('Object Repository/TestBooking/Page_Business Source/btn_Save'))

WebUI.click(findTestObject('Object Repository/TestBooking/Page_Business Source/Rate Code_dx-dropdowneditor-icon'))

WebUI.click(findTestObject('Object Repository/TestBooking/Page_Business Source/data_BAR2'))

WebUI.click(findTestObject('Object Repository/TestBooking/Page_Business Source/btn_Reserve'))

WebUI.click(findTestObject('Object Repository/TestBooking/Page_Reservation/btn_Save'))

WebUI.click(findTestObject('Object Repository/TestBooking/Page_Reservation/messes_Cp nht d liu thnh cng'))

WebUI.click(findTestObject('Object Repository/TestBooking/Page_Reservation/span_ng li'))

WebUI.closeBrowser()

