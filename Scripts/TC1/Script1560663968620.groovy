import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demo.automationtesting.in/Register.html')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Full Name_form-control n'), 'srikanth')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Full Name_form-control n_1'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Full Name_form-control n_2'), 'ak')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Full Name_form-control n_3'), 'aku')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Full Name_form-control n_4'), 'akul')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Full Name_form-control n_5'), 'akula')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Full Name_form-control n_6'), 'akula')

WebUI.setText(findTestObject('Object Repository/Page_Register/textarea_Address_form-control'), 'Manyta techpark')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Email address_form-contr'), 'srikanth89@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Phone_form-control ng-un'), '986333454')

WebUI.click(findTestObject('Object Repository/Page_Register/input_Male_radiooptions'))

WebUI.click(findTestObject('Object Repository/Page_Register/input_Hobbies_checkbox1'))

WebUI.click(findTestObject('Object Repository/Page_Register/div_Languages_msdd'))

WebUI.click(findTestObject('Object Repository/Page_Register/a_Catalan'))

WebUI.click(findTestObject('Object Repository/Page_Register/div_Catalan'))

WebUI.click(findTestObject('Object Repository/Page_Register/form_Full Name'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Select Skills'), 'Analytics', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Select Country'), 'Antigua and Barbuda', 
    true)

WebUI.click(findTestObject('Object Repository/Page_Register/span_Select Country _select2-s'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_year'), '1928', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Month'), 'December', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Day'), '9', true)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_Password_firstpassword'), 'MeMo5HMoWe/WSdyuAQ0zrg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_Confirm Password_secondp'), 'MeMo5HMoWe/WSdyuAQ0zrg==')

WebUI.click(findTestObject('Object Repository/Page_Register/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Register/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Phone_form-control ng-di'), '9863334545')

WebUI.click(findTestObject('Object Repository/Page_Register/button_Submit'))

