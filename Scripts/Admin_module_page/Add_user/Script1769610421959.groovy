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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('AdminModule/Page_OrangeHRM/input_Username'), 'Admin')

WebUI.click(findTestObject('AdminModule/Page_OrangeHRM/input_Password'))

WebUI.setEncryptedText(findTestObject('AdminModule/Page_OrangeHRM/input_Password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('AdminModule/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('AdminModule/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('AdminModule/Page_OrangeHRM/button_Add'))

WebUI.click(findTestObject('AdminModule/Page_OrangeHRM/div_Select'))

WebUI.click(findTestObject('AdminModule/Page_OrangeHRM/span_Admin'))

WebUI.setText(findTestObject('AdminModule/Page_OrangeHRM/input_Type for hints'), 'd')

WebUI.click(findTestObject('AdminModule/Page_OrangeHRM/span_A8DCo 4Ys 010Z'))

WebUI.click(findTestObject('AdminModule/Page_OrangeHRM/div_Select_1'))

WebUI.click(findTestObject('AdminModule/Page_OrangeHRM/div_Enabled'))

WebUI.setText(findTestObject('AdminModule/Page_OrangeHRM/input_oxd-input oxd-input-active'), 'Yogesh Nale')

WebUI.click(findTestObject('AdminModule/Page_OrangeHRM/input_oxd-input oxd-input-active_1'))

WebUI.setEncryptedText(findTestObject('AdminModule/Page_OrangeHRM/input_oxd-input oxd-input-active_1'), '+GbeMmX2PC4w4z2S4X5/lw==')

WebUI.click(findTestObject('AdminModule/Page_OrangeHRM/input_oxd-input oxd-input-active_2'))

WebUI.setEncryptedText(findTestObject('AdminModule/Page_OrangeHRM/input_oxd-input oxd-input-active_2'), 'Ka1WQJ7vm2dWZ1qBpvejAQ==')

WebUI.click(findTestObject('AdminModule/Page_OrangeHRM/input_oxd-input oxd-input-focus oxd-input-err'))

WebUI.click(findTestObject('AdminModule/Page_OrangeHRM/input_oxd-input oxd-input-active_1'))

WebUI.setEncryptedText(findTestObject('AdminModule/Page_OrangeHRM/input_oxd-input oxd-input-active_1'), 'Ka1WQJ7vm2dWZ1qBpvejAQ==')

WebUI.click(findTestObject('AdminModule/Page_OrangeHRM/input_oxd-input oxd-input-focus oxd-input-err'))

WebUI.setEncryptedText(findTestObject('AdminModule/Page_OrangeHRM/input_oxd-input oxd-input-focus oxd-input-err'), 'Ka1WQJ7vm2dWZ1qBpvejAQ==')

WebUI.click(findTestObject('AdminModule/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('AdminModule/Page_OrangeHRM/i_oxd-icon bi-caret-down-fill oxd-userdropdown-i'))

WebUI.click(findTestObject('AdminModule/Page_OrangeHRM/a_Logout'))

WebUI.verifyElementPresent(findTestObject('AdminModule/Page_OrangeHRM/h5_Login'), 0)

