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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Page_Dashboard/link_SignIn'))

WebUI.setText(findTestObject('Page_SignIn/input_Email'), 'testrebels@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_SignIn/input_Password'), 'liSTkvaEvsRYfH+eUrfc1Q==')

WebUI.click(findTestObject('Page_SignIn/button_SignIn'))

WebUI.click(findTestObject('Object Repository/Page_MyAccount/button_MyAddresses'))

WebUI.click(findTestObject('Object Repository/Page_Addresses/button_AddNewAddress'))

WebUI.setText(findTestObject('Object Repository/Page_AddNewAddress/input_Address1'), 'Jakarta')

WebUI.setText(findTestObject('Object Repository/Page_AddNewAddress/input_City'), 'Jakarta')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_AddNewAddress/select_State'), '1', true)

WebUI.setText(findTestObject('Object Repository/Page_AddNewAddress/input_Postcode'), '1234567')

WebUI.setText(findTestObject('Object Repository/Page_AddNewAddress/input_Phone'), '08945768')

WebUI.setText(findTestObject('Object Repository/Page_AddNewAddress/input_PhoneMobile'), '984895896')

WebUI.setText(findTestObject('Object Repository/Page_AddNewAddress/input_TitleAddress'), 'My address New')

WebUI.click(findTestObject('Object Repository/Page_AddNewAddress/button_SaveAddress'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_AddNewAddress/verify_ErrorZIPCode'), 'The Zip/Postal code you\'ve entered is invalid. It must follow this format: 00000')

WebUI.closeBrowser()

